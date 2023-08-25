package common;

public class Paging implements java.io.Serializable{
	private static final long serialVersionUID = 1685524177480754034L;

    private int startRow;    // 페이지에 출력할 시작행
    private int endRow;      // 페이지에 출력할 마지막행
    private int listCount;   // 총 목록 갯수
    private int limit;       // 한 페이지에 출력할 목록 갯수
    private int currentPage; // 출력할 현제 페이지
    private int maxPage;     // 총 페이지 수
    private int startPage;   // 페이지 그룹의 시작값
    private int endPage;     // 페이지 그룹의 끝값
    
    
	public Paging(int listCount, int currentPage, int limit){
        this.listCount = listCount;
        this.currentPage = currentPage;
        this.limit = limit;
    }

    // 페이지 계산 함수
    public void calcuator(){
        // 총 페이지 수 : 목록의 총 갯수가 21개 인 경우는 
		// 한 페이지에 출력할 목록이 10개인 경우이면 총 페이지 수는 3임
		// 목록 1개도 한 페이지 차지함

		//int maxPage = (int)((double)listCount / limit + 0.9);
        this.maxPage = (listCount/limit) + 1;

		// 뷰 페이지 출력에 사용할 페이지 그룹의 시작 값 지정
		// 페이지 그룹의 페이지 숫자를 10개씩 출력 한다면, 
		// 현제 페이지가 3이면 페이지 그룹은 1페이지부터 10페이지가 됨
		// 현제 페이지가 25페이지이면, 페이지 그룹은 21페이지부터 30페이지가 됨
		
		//int startPage = (((int)((double)currentPage / limit  + 0.9)) - 1) * limit;
		this.startPage = ((currentPage / limit) * limit) + 1;
		//System.out.println("startPage : "+startPage);
						//listCount 2 currentPage 1  limit 10 ;
		this.endPage = startPage + limit - 1;
		//System.out.println("endPage : "+endPage);

		// 총 페이지 수와 페이지 그룹의 마지막 숫자 조정
		if(maxPage < endPage){
			endPage = maxPage;
		}

        // 요청한 페이지의 출력될 목록의 행번호를 계산 
		// 한 페이지에 출력할 목록 갯수가 10개인 경우에는 3페이지가 요청되었다면 행 번호는 21~31 행임
		this.startRow = (currentPage - 1) * limit + 1;
		this.endRow = startRow + limit - 1;
    }

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Paging [startRow=" + startRow + ", endRow=" + endRow + ", listCount=" + listCount + ", limit=" + limit
				+ ", currentPage=" + currentPage + ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage="
				+ endPage + "]";
	}
    


}
