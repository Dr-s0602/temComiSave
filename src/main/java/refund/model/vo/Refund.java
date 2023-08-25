package refund.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Refund implements Serializable{
	
	private static final long serialVersionUID = 1442977424595010540L;
	private int meNum;
	private int paNum;
	private int pmNum;
	private int rfNum;
	private int rfAmount;
	private String rfStatus;
	private Date rfReDate;
	private Date rfDate;
	private String rfAcVer;
	private String rfPhVer;
	
	public Refund() {}
	
	public Refund(int meNum, int paNum, int pmNum, int rfNum, int rfAmount, String rfStatus, Date rfReDate, Date rfDate,
			String rfAcVer, String rfPhVer) {
		super();
		this.meNum = meNum;
		this.paNum = paNum;
		this.pmNum = pmNum;
		this.rfNum = rfNum;
		this.rfAmount = rfAmount;
		this.rfStatus = rfStatus;
		this.rfReDate = rfReDate;
		this.rfDate = rfDate;
		this.rfAcVer = rfAcVer;
		this.rfPhVer = rfPhVer;
	}

	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	public int getPaNum() {
		return paNum;
	}

	public void setPaNum(int paNum) {
		this.paNum = paNum;
	}

	public int getPmNum() {
		return pmNum;
	}

	public void setPmNum(int pmNum) {
		this.pmNum = pmNum;
	}

	public int getRfNum() {
		return rfNum;
	}

	public void setRfNum(int rfNum) {
		this.rfNum = rfNum;
	}

	public int getRfAmount() {
		return rfAmount;
	}

	public void setRfAmount(int rfAmount) {
		this.rfAmount = rfAmount;
	}

	public String getRfStatus() {
		return rfStatus;
	}

	public void setRfStatus(String rfStatus) {
		this.rfStatus = rfStatus;
	}

	public Date getRfReDate() {
		return rfReDate;
	}

	public void setRfReDate(Date rfReDate) {
		this.rfReDate = rfReDate;
	}

	public Date getRfDate() {
		return rfDate;
	}

	public void setRfDate(Date rfDate) {
		this.rfDate = rfDate;
	}

	public String getRfAcVer() {
		return rfAcVer;
	}

	public void setRfAcVer(String rfAcVer) {
		this.rfAcVer = rfAcVer;
	}

	public String getRfPhVer() {
		return rfPhVer;
	}

	public void setRfPhVer(String rfPhVer) {
		this.rfPhVer = rfPhVer;
	}

	@Override
	public String toString() {
		return "Refund [meNum=" + meNum + ", paNum=" + paNum + ", pmNum=" + pmNum + ", rfNum=" + rfNum + ", rfAmount="
				+ rfAmount + ", rfStatus=" + rfStatus + ", rfReDate=" + rfReDate + ", rfDate=" + rfDate + ", rfAcVer="
				+ rfAcVer + ", rfPhVer=" + rfPhVer + "]";
	}
	
	
	
	
}
