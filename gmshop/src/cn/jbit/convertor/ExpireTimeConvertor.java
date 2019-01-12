package cn.jbit.convertor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class ExpireTimeConvertor extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map map, String[] value, Class clazz) {
		String dateStr = value[0];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
				
	}

	/**
	 * ����ȥд����Ϊ���ڵ�ognl���ʽ��ʵ�ֿ����У�������
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
