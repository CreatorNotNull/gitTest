package cn.vbox.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadHandleServelet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("upload.jsp").forward(request, response);
		// 得到上传文件的保存目录，将上传文件存放于WEB-INF目录下，不允许外界访问
		String savePath = this.getServletContext().getRealPath(
				"/WEB-INF/upload");
		File uploadPath  = new File(savePath);
		// 若目录不存在则创建目录
		// exists()：判断是否存在，isDirectory()是检查一个对象是否是文件夹
		if (!uploadPath .exists() && !uploadPath .isDirectory()) {
			System.out.println(savePath + "目录不存在，需要创建");
			// 创建目录
			uploadPath .mkdir();
		}
		
		// 上传时生成的临时文件保存目录
		String tempPath = this.getServletContext().getRealPath("/WEB-INF/temp");
		File tmpFile = new File(tempPath);
		if (!tmpFile.exists()) {
			// 创建临时目录
			tmpFile.mkdir();
		}
		
		// 消息提示
		String message = "";
		try {
			// 1.创建一个DiskFileItemFactory工厂
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// 设置工厂缓冲区大小，当上传文件超过缓冲区大小时，生成一个临时文件存放的指定的临时目录
			factory.setSizeThreshold(1024 * 100);
			//设置临时保存目录
			factory.setRepository(tmpFile);
			
			// 2.创建一个文件上传解析器
			ServletFileUpload upload = new ServletFileUpload(factory);
			//监听文件上传进度
			upload.setProgressListener(new ProgressListener() {
				@Override
				public void update(long pBytesRead, long pContentLength, int arg2) {
					System.out.println("文件大小为："+pContentLength+",当前已处理："+pBytesRead);
				}
			});
			// 解决上传文件名的乱码
			upload.setHeaderEncoding("UTF-8");
			
			//3.判断提交的数据是否是上传表单的数据
			if (!ServletFileUpload.isMultipartContent(request)) {
				//按传统方式获取的数据
				return;
			}
			//设置单个文件大小的最大值
			upload.setFileSizeMax(1024*1024);
			//设置文件总量的最大值
			upload.setSizeMax(1024*1024*10);
			
			//4.使用ServletFileUpload解析器解析上传数据 解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
			List<FileItem> list = upload.parseRequest(request);
			for (FileItem item : list) {
				//如果fileitem中封装的是普通输入项的数据
				if (item.isFormField()) {
					String name = item.getFieldName();
					String value = item.getString();
					System.out.println(name+":"+value);
				}else {
					String filename = item.getName();
					if (filename == null || filename.trim().equals("")) {
						continue;
					}
					// 处理获取到的上传文件的文件名的路径部分，只保留文件名部分
					filename = filename.substring(filename.lastIndexOf("\\") + 1);
					// 得到上传文件的扩展名
					String fileExtName = filename.substring(filename.lastIndexOf(".") + 1);
					// 如果需要限制上传的文件类型，那么可以通过文件的扩展名来判断上传的文件类型是否合法
					System.out.println("上传的文件的扩展名是：" + fileExtName);
					//获取item中的上传文件的输入流
					InputStream in = item.getInputStream();
					// 为防止文件覆盖的现象发生，要为上传文件产生一个唯一的文件名
					String saveFilename = UUID.randomUUID().toString()+"_"+filename;
					// 得到文件的保存目录
					// 创建一个文件输出流
					FileOutputStream out = new FileOutputStream(savePath+"\\"+saveFilename);
					byte buffer[] = new byte[1024];
					int len = 0;
					while ((len=in.read(buffer))>0) {
						out.write(buffer, 0, len);
					}
					// 关闭输入流
					in.close();
					// 关闭输出流
					out.close();
					//删除处理文件上传时生成的临时文件
                    item.delete();
					message="success";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			message="faile";
		}
		
		response.getWriter().print(message);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
