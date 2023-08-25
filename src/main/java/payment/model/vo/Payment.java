package payment.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Payment implements Serializable{
	
	private static final long serialVersionUID = -935307733719231255L;
	
	private int pmNum;
	private int meNum;
	private int paNum;
	private String pmHost;
	private String pmMethod;
	private int pmAmount;
	private int pmCredits;
	private int pmTotalAmount;
	private String pmDeposit;
	private Date pmDate;
	private String pmAcVer;
	private String pmPhVer;
	private String pmEasyPay;
	
	public Payment() {}

	public Payment(int pmNum, int meNum, int paNum, String pmHost, String pmMethod, int pmAmount, int pmCredits,
			int pmTotalAmount, String pmDeposit, Date pmDate, String pmAcVer, String pmPhVer, String pmEasyPay) {
		super();
		this.pmNum = pmNum;
		this.meNum = meNum;
		this.paNum = paNum;
		this.pmHost = pmHost;
		this.pmMethod = pmMethod;
		this.pmAmount = pmAmount;
		this.pmCredits = pmCredits;
		this.pmTotalAmount = pmTotalAmount;
		this.pmDeposit = pmDeposit;
		this.pmDate = pmDate;
		this.pmAcVer = pmAcVer;
		this.pmPhVer = pmPhVer;
		this.pmEasyPay = pmEasyPay;
	}
	
	public int getPmNum() {
		return pmNum;
	}

	public void setPmNum(int pmNum) {
		this.pmNum = pmNum;
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

	public String getPmHost() {
		return pmHost;
	}

	public void setPmHost(String pmHost) {
		this.pmHost = pmHost;
	}

	public String getPmMethod() {
		return pmMethod;
	}

	public void setPmMethod(String pmMethod) {
		this.pmMethod = pmMethod;
	}

	public int getPmAmount() {
		return pmAmount;
	}

	public void setPmAmount(int pmAmount) {
		this.pmAmount = pmAmount;
	}

	public int getPmCredits() {
		return pmCredits;
	}

	public void setPmCredits(int pmCredits) {
		this.pmCredits = pmCredits;
	}

	public int getPmTotalAmount() {
		return pmTotalAmount;
	}

	public void setPmTotalAmount(int pmTotalAmount) {
		this.pmTotalAmount = pmTotalAmount;
	}

	public String getPmDeposit() {
		return pmDeposit;
	}

	public void setPmDeposit(String pmDeposit) {
		this.pmDeposit = pmDeposit;
	}

	public Date getPmDate() {
		return pmDate;
	}

	public void setPmDate(Date pmDate) {
		this.pmDate = pmDate;
	}

	public String getPmAcVer() {
		return pmAcVer;
	}

	public void setPmAcVer(String pmAcVer) {
		this.pmAcVer = pmAcVer;
	}

	public String getPmPhVer() {
		return pmPhVer;
	}

	public void setPmPhVer(String pmPhVer) {
		this.pmPhVer = pmPhVer;
	}

	public String getPmEasyPay() {
		return pmEasyPay;
	}

	public void setPmEasyPay(String pmEasyPay) {
		this.pmEasyPay = pmEasyPay;
	}
	
	@Override
	public String toString() {
		return "Payment [pmNum=" + pmNum + ", meNum=" + meNum + ", paNum=" + paNum + ", pmHost=" + pmHost
				+ ", pmMethod=" + pmMethod + ", pmAmount=" + pmAmount + ", pmCredits=" + pmCredits + ", pmTotalAmount="
				+ pmTotalAmount + ", pmDeposit=" + pmDeposit + ", pmDate=" + pmDate + ", pmAcVer=" + pmAcVer
				+ ", pmPhVer=" + pmPhVer + ", pmEasyPay=" + pmEasyPay + "]";
	}
	
	
}
