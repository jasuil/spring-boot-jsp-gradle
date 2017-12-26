package demo.domain;

public class pageVO {

	private int perPage;//단위 페이지 당 보여줄 목록 수
	private int totalPage;//전체 페이지 갯수
	private int totalRowcount;
	private int currentPage;//현재 읽고 있는 페이지
	private int countUnitPages;//단위 페이지 수
	private int unitPage;//페이지 묶음의 단위
	private int currentUnitPageRage;//현재있는 묶음페이지
	private int currentLastUnitPage;//현재 속하는 묶음 페이지의 끝
	private int firstUnitYn;//맨 첫 페이지 이동 유무 0-무 1-유
	private int lastUnitYn;//가장 마지막 페이지 이동 유무
	private int nextYn;//다음 페이지 묶음 이동 유무
	private int prevYn;//이전 페잊 묶음 이동 유무
	
	pageVO(){
		this.perPage = 10;
		this.currentPage = 1;
		this.countUnitPages = 1;
		this.prevYn=0;
		this.nextYn=0;
		this.lastUnitYn=0;
		this.firstUnitYn=0;
	}
	
	pageVO(int perPage, int totalRowcount){
		this.totalPage = (int)Math.floor(totalRowcount/perPage);		
	}
	
	pageVO(int currentPage, int perPage, int totalRowcount){
		this.totalPage = (int)Math.floor(totalRowcount/perPage);
		
	}

	public int getTotalRowcount() {
		return totalRowcount;
	}

	public void setTotalRowcount(int totalRowcount) {
		this.totalRowcount = totalRowcount;
	}

	public int getUnitPage() {
		return unitPage;
	}

	public void setUnitPage(int unitPage) {
		this.unitPage = unitPage;
	}

	public int getCurrentUnitPageRage() {
		return currentUnitPageRage;
	}

	public void setCurrentUnitPageRage(int currentUnitPageRage) {
		this.currentUnitPageRage = currentUnitPageRage;
	}

	public int getCurrentLastUnitPage() {
		return currentLastUnitPage;
	}

	public void setCurrentLastUnitPage(int currentLastUnitPage) {
		this.currentLastUnitPage = currentLastUnitPage;
	}

	public int getFirstUnitYn() {
		return firstUnitYn;
	}

	public void setFirstUnitYn(int firstUnitYn) {
		this.firstUnitYn = firstUnitYn;
	}

	public int getLastUnitYn() {
		return lastUnitYn;
	}

	public void setLastUnitYn(int lastUnitYn) {
		this.lastUnitYn = lastUnitYn;
	}

	public int getNextYn() {
		return nextYn;
	}

	public void setNextYn(int nextYn) {
		this.nextYn = nextYn;
	}

	public int getPrevYn() {
		return prevYn;
	}

	public void setPrevYn(int prevYn) {
		this.prevYn = prevYn;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		if(perPage < 0) {
			perPage=10;  
		}else{
			this.perPage = perPage;
		}		
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		if(currentPage < 0) {
			currentPage=1;  
		}else{
			this.currentPage = currentPage;
		}				
	}

	public int getCountUnitPages() {
		return countUnitPages;
	}

	public void setCountUnitPages(int countUnitPages) {
		if(countUnitPages < 0) {
			countUnitPages=1;  
		}else{
			this.countUnitPages = countUnitPages;
		}					
	}

	@Override
	public String toString() {
		return "pageVO [perPage=" + perPage + ", totalPage=" + totalPage + ", currentPage=" + currentPage
				+ ", countUnitPages=" + countUnitPages + ", getPerPage()=" + getPerPage() + ", getTotalPage()="
				+ getTotalPage() + ", getCurrentPage()=" + getCurrentPage() + ", getCountUnitPages()="
				+ getCountUnitPages() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}	
	
}
