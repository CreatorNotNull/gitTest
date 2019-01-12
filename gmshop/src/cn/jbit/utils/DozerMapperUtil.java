package cn.jbit.utils;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class DozerMapperUtil {

	private static DozerBeanMapper mapper = new DozerBeanMapper();
	static {
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("cn/jbit/dto/CategoryDTOMapper.xml");
		myMappingFiles.add("cn/jbit/dto/ImageDTOMapper.xml");
		myMappingFiles.add("cn/jbit/dto/OrderDetailDTOMapper.xml");
		myMappingFiles.add("cn/jbit/dto/OrderDTOMapper.xml");
		myMappingFiles.add("cn/jbit/dto/ProductDTOMapper.xml");
		myMappingFiles.add("cn/jbit/dto/UserDTOMapper.xml");
		mapper.setMappingFiles(myMappingFiles);
	}

	public static DozerBeanMapper getMapper() {
		return mapper;
	}
}
