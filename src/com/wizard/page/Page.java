package com.wizard.page;

import java.util.List;

public class Page {
	private List<?> data;
	private int currentPage;
	private int totalPage;
	private int allRow;
	private int pageSize;
	private boolean isFirstPage;
	private boolean isLastPage;
	private boolean hasNextPage;
	private boolean hasPrePage;
	
	
	public Page(int allRow) {
		super();
		this.allRow = allRow;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage() {
		this.totalPage = (allRow%pageSize)==0?(allRow/pageSize):(allRow/pageSize+1);
	}

	public int getAllRow() {
		return allRow;
	}

	public void setAllRow() {
		this.allRow = data.size();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public boolean isFirstPage() {
		if(currentPage == 1)
			return true;
		else 
			return false;
	}

//	public void setFirstPage(boolean isFirstPage) {
//		this.isFirstPage = isFirstPage;
//	}

	public boolean isLastPage() {
		if(currentPage == totalPage)
			return true;
		else 
			return false;
	}

//	public void setLastPage(boolean isLastPage) {
//		this.isLastPage = isLastPage;
//	}

	public boolean isHasNextPage() {
		if(currentPage == totalPage)
			return false;
		else 
			return true;
	}

//	public void setHasNextPage(boolean hasNextPage) {
//		this.hasNextPage = hasNextPage;
//	}

	public boolean isHasPrePage() {
		if(currentPage == 1)
			return false;
		else 
			return true;
	}

	@Override
	public String toString() {
		return "Page [data=" + data + ", currentPage=" + currentPage
				+ ", totalPage=" + totalPage + ", allRow=" + allRow
				+ ", pageSize=" + pageSize + ", isFirstPage=" + isFirstPage
				+ ", isLastPage=" + isLastPage + ", hasNextPage=" + hasNextPage
				+ ", hasPrePage=" + hasPrePage + "]";
	}

//	public void setHasPrePage(boolean hasPrePage) {
//		this.hasPrePage = hasPrePage;
//	}
	
	
	
}
