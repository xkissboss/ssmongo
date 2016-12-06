package com.xkb.util;

import java.util.List;

/**
 * @Description: 分页信息
 * @author 作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月30日 上午10:22:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class Page {

	private int pageSize = 10;

	private int pageNum = 1;

	private long total;

	private List<?> result;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize < 1) return;
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		if (pageNum < 1) return;
		this.pageNum = pageNum;
	}

	public long getPageCount() {
		return (total - 1) / this.pageSize + 1;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getResult() {
		return result;
	}

	public void setResult(List<?> result) {
		this.result = result;
	}
	
}
