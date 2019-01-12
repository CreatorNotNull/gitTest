package cn.jbit.action;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.hibernate.Session;

import cn.jbit.dto.ImageDTO;
import cn.jbit.dto.ProductDTO;
import cn.jbit.dto.ProductQueryDTO;
import cn.jbit.service.IProductService;
import cn.jbit.service.ProductServiceImpl;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 产品Action
 * 
 * @author william
 * 
 */
public class ProductAction extends ActionSupport implements RequestAware {

	private IProductService productService = new ProductServiceImpl();

	private ProductDTO productDTO = new ProductDTO();

	private ProductQueryDTO productQueryDTO = new ProductQueryDTO();

	private File[] images;

	private String[] imagesFileName;

	private Map<String, Object> requestMap;
	
	private Integer pageNum=1;
	private Integer pageSize=5;
	

	/**
	 * 添加商品
	 * 
	 * @return
	 */
	public String addProduct() {
		Session session = HibernateUtil.getSession();
		try {
			String path = ServletActionContext.getServletContext().getRealPath(
					"/upload");
			if (null != images) {
				Set<ImageDTO> imageDTOs = new HashSet<ImageDTO>();
				for (int i = 0; i < images.length; i++) {
					File descFile = new File(path + "/" + imagesFileName[i]);
					FileUtils.copyFile(images[i], descFile);
					ImageDTO imageDTO = new ImageDTO();
					imageDTO.setUrl(imagesFileName[i]);
					imageDTOs.add(imageDTO);
				}
				productDTO.setImagesDTO(imageDTOs);
			}
			this.productService.addProduct(productDTO);
			return Action.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return Action.ERROR;
		} finally {
			HibernateUtil.closeSession();
		}
	}

	/**
	 * 查看商品明细
	 * 
	 * @return
	 */
	public String showProduceDetailById() {
		Session session = HibernateUtil.getSession();
		try {
			ProductDTO productDTO = this.productService
					.showProductById(productQueryDTO.getId());
			productDTO.setViewNum(productDTO.getViewNum() + 1);
			requestMap.put("productDetailDTO", productDTO);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		} finally {
			HibernateUtil.closeSession();
		}
	}
	
	/**
	 * 根据商品类别显示商品信息
	 * @return
	 */
	public String showProductByCategory(){
		Session session = HibernateUtil.getSession();
		try{
			Page<ProductDTO> pageResult = this.productService.showProductByCategory(productQueryDTO, pageNum, pageSize);
			List<ProductDTO> resultList = pageResult.getResultList();
			this.requestMap.put("productByCategoryList", resultList);
			return SUCCESS;
		}catch(Exception ex){
			ex.printStackTrace();
			return ERROR;
		}finally{
			HibernateUtil.closeSession();
		}
	}

	public File[] getImages() {
		return images;
	}

	public void setImages(File[] images) {
		this.images = images;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public ProductDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}

	public ProductQueryDTO getProductQueryDTO() {
		return productQueryDTO;
	}

	public void setProductQueryDTO(ProductQueryDTO productQueryDTO) {
		this.productQueryDTO = productQueryDTO;
	}

	public String[] getImagesFileName() {
		return imagesFileName;
	}

	public void setImagesFileName(String[] imagesFileName) {
		this.imagesFileName = imagesFileName;
	}

	@Override
	public void setRequest(Map<String, Object> requestMap) {
		this.requestMap = requestMap;
	}

}
