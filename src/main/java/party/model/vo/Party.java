package party.model.vo;

import java.io.Serializable;
import java.sql.Date;

//(vo, dto, do, entity, bean) 반드시 직렬화
//모든 필드 private
//to String 오버라이딩
public class Party implements Serializable{

	private static final long serialVersionUID = -6359098139311809216L;
	private int paNum;//파티 아이디
	private int meNum;//파티장 아이디
	private Date paTime;//모임 시간
	private int paTotalAmount;//총금액
	private int paDeposit;//거치금
	private int paPerAmount;//1인당금액
	
	private String paTitle;//게시글 제목
	private String paCon;//게시글 내용
	private Date paEnroll;//게시글 등록날짜
	private Date paModDate;//게시글 수정날짜
	private Date paDelDate;//게시글 삭제날짜
	
	private String paAct;//파티 활성화 여부
	private int paViews;//조회수
	private int paLike;//좋아요수
	private int paComCount;//댓글수
	private String paGenderSet;//권한 설정
	private String paLocation;//위치정보
	private int paTotalNum;//파티원 인원수
	private String paGenderLimit;//성별 제한
	private int phNum;//사진테이블 번호
	private int catNum;//분류
	
	public Party() {}

	public Party(int paNum, int meNum, Date paTime, int paTotalAmount, int paDeposit, int paPerAmount, String paTitle,
			String paCon, Date paEnroll, Date paModDate, Date paDelDate, String paAct, int paViews, int paLike,
			int paComCount, String paGenderSet, String paLocation, int paTotalNum, String paGenderLimit, int phNum,
			int catNum) {
		super();
		this.paNum = paNum;
		this.meNum = meNum;
		this.paTime = paTime;
		this.paTotalAmount = paTotalAmount;
		this.paDeposit = paDeposit;
		this.paPerAmount = paPerAmount;
		this.paTitle = paTitle;
		this.paCon = paCon;
		this.paEnroll = paEnroll;
		this.paModDate = paModDate;
		this.paDelDate = paDelDate;
		this.paAct = paAct;
		this.paViews = paViews;
		this.paLike = paLike;
		this.paComCount = paComCount;
		this.paGenderSet = paGenderSet;
		this.paLocation = paLocation;
		this.paTotalNum = paTotalNum;
		this.paGenderLimit = paGenderLimit;
		this.phNum = phNum;
		this.catNum = catNum;
	}

	public int getPaNum() {
		return paNum;
	}

	public void setPaNum(int paNum) {
		this.paNum = paNum;
	}

	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	public Date getPaTime() {
		return paTime;
	}

	public void setPaTime(Date paTime) {
		this.paTime = paTime;
	}

	public int getPaTotalAmount() {
		return paTotalAmount;
	}

	public void setPaTotalAmount(int paTotalAmount) {
		this.paTotalAmount = paTotalAmount;
	}

	public int getPaDeposit() {
		return paDeposit;
	}

	public void setPaDeposit(int paDeposit) {
		this.paDeposit = paDeposit;
	}

	public int getPaPerAmount() {
		return paPerAmount;
	}

	public void setPaPerAmount(int paPerAmount) {
		this.paPerAmount = paPerAmount;
	}

	public String getPaTitle() {
		return paTitle;
	}

	public void setPaTitle(String paTitle) {
		this.paTitle = paTitle;
	}

	public String getPaCon() {
		return paCon;
	}

	public void setPaCon(String paCon) {
		this.paCon = paCon;
	}

	public Date getPaEnroll() {
		return paEnroll;
	}

	public void setPaEnroll(Date paEnroll) {
		this.paEnroll = paEnroll;
	}

	public Date getPaModDate() {
		return paModDate;
	}

	public void setPaModDate(Date paModDate) {
		this.paModDate = paModDate;
	}

	public Date getPaDelDate() {
		return paDelDate;
	}

	public void setPaDelDate(Date paDelDate) {
		this.paDelDate = paDelDate;
	}

	public String getPaAct() {
		return paAct;
	}

	public void setPaAct(String paAct) {
		this.paAct = paAct;
	}

	public int getPaViews() {
		return paViews;
	}

	public void setPaViews(int paViews) {
		this.paViews = paViews;
	}

	public int getPaLike() {
		return paLike;
	}

	public void setPaLike(int paLike) {
		this.paLike = paLike;
	}

	public int getPaComCount() {
		return paComCount;
	}

	public void setPaComCount(int paComCount) {
		this.paComCount = paComCount;
	}

	public String getPaGenderSet() {
		return paGenderSet;
	}

	public void setPaGenderSet(String paGenderSet) {
		this.paGenderSet = paGenderSet;
	}

	public String getPaLocation() {
		return paLocation;
	}

	public void setPaLocation(String paLocation) {
		this.paLocation = paLocation;
	}

	public int getPaTotalNum() {
		return paTotalNum;
	}

	public void setPaTotalNum(int paTotalNum) {
		this.paTotalNum = paTotalNum;
	}

	public String getPaGenderLimit() {
		return paGenderLimit;
	}

	public void setPaGenderLimit(String paGenderLimit) {
		this.paGenderLimit = paGenderLimit;
	}

	public int getPhNum() {
		return phNum;
	}

	public void setPhNum(int phNum) {
		this.phNum = phNum;
	}

	public int getCatNum() {
		return catNum;
	}

	public void setCatNum(int catNum) {
		this.catNum = catNum;
	}

	@Override
	public String toString() {
		return "Party [paNum=" + paNum + ", meNum=" + meNum + ", paTime=" + paTime + ", paTotalAmount=" + paTotalAmount
				+ ", paDeposit=" + paDeposit + ", paPerAmount=" + paPerAmount + ", paTitle=" + paTitle + ", paCon="
				+ paCon + ", paEnroll=" + paEnroll + ", paModDate=" + paModDate + ", paDelDate=" + paDelDate
				+ ", paAct=" + paAct + ", paViews=" + paViews + ", paLike=" + paLike + ", paComCount=" + paComCount
				+ ", paGenderSet=" + paGenderSet + ", paLocation=" + paLocation + ", paTotalNum=" + paTotalNum
				+ ", paGenderLimit=" + paGenderLimit + ", phNum=" + phNum + ", catNum=" + catNum + "]";
	}
	
	
}
