package cn.jbit.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ҳ��װ��
 * 
 * @author william
 * 
 * @param <T>
 */
public class Page<T> {

	/**
	 * ��ǰҳ��
	 */
	private Integer pageNum;
	/**
	 * ÿҳ��ʾ��С
	 */
	private Integer pageSize;
	/**
	 * ��ҳ��
	 */
	private Long totalPage;
	/**
	 * �ܼ�¼��
	 */
	private Long totalRecords;
	/**
	 * ��ҳ��Ľ����
	 */
	private List<T> resultList = new ArrayList<T>();

	public Page() {
		super();
	}

	public Page(Integer pageNum, Integer pageSize, Long totalRecords,
			List<T> resultList) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalRecords = totalRecords;
		this.resultList = resultList;
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

	public Long getTotalPage() {
		if (this.totalRecords % this.pageSize == 0) {
			this.totalPage = this.totalPage / this.pageSize;
		} else {
			this.totalPage = this.totalPage / this.pageSize + 1;
		}
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public Long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

}
