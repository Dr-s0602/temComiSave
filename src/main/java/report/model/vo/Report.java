package report.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Report implements Serializable {
	
	private int reNum;
	private int meNum;
	private String reCategory;
	private int reTableNum;
	private String reCon;
	private int reAttNum;
	private Date reAttTime;
	private int reAdminNum;
	private Date reProceTime;
	
	public Report() {}

	public Report(int reNum, int meNum, String reCategory, int reTableNum, String reCon, int reAttNum, Date reAttTime,
			int reAdminNum, Date reProceTime) {
		super();
		this.reNum = reNum;
		this.meNum = meNum;
		this.reCategory = reCategory;
		this.reTableNum = reTableNum;
		this.reCon = reCon;
		this.reAttNum = reAttNum;
		this.reAttTime = reAttTime;
		this.reAdminNum = reAdminNum;
		this.reProceTime = reProceTime;
	}

	public int getReNum() {
		return reNum;
	}

	public void setReNum(int reNum) {
		this.reNum = reNum;
	}

	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	public String getReCategory() {
		return reCategory;
	}

	public void setReCategory(String reCategory) {
		this.reCategory = reCategory;
	}

	public int getReTableNum() {
		return reTableNum;
	}

	public void setReTableNum(int reTableNum) {
		this.reTableNum = reTableNum;
	}

	public String getReCon() {
		return reCon;
	}

	public void setReCon(String reCon) {
		this.reCon = reCon;
	}

	public int getReAttNum() {
		return reAttNum;
	}

	public void setReAttNum(int reAttNum) {
		this.reAttNum = reAttNum;
	}

	public Date getReAttTime() {
		return reAttTime;
	}

	public void setReAttTime(Date reAttTime) {
		this.reAttTime = reAttTime;
	}

	public int getReAdminNum() {
		return reAdminNum;
	}

	public void setReAdminNum(int reAdminNum) {
		this.reAdminNum = reAdminNum;
	}

	public Date getReProceTime() {
		return reProceTime;
	}

	public void setReProceTime(Date reProceTime) {
		this.reProceTime = reProceTime;
	}

	@Override
	public String toString() {
		return "Report [reNum=" + reNum + ", meNum=" + meNum + ", reCategory=" + reCategory + ", reTableNum="
				+ reTableNum + ", reCon=" + reCon + ", reAttNum=" + reAttNum + ", reAttTime=" + reAttTime
				+ ", reAdminNum=" + reAdminNum + ", reProceTime=" + reProceTime + "]";
	}
	
	
}
