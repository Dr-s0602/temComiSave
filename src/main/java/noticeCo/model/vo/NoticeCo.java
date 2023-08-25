package noticeCo.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class NoticeCo implements Serializable {
	
	private static final long serialVersionUID = -4782224526221757369L;
	private int noComNum;
	private int noNum;
	private int noComMeNum;
	private int noComParent;
	private int noComDepth;
	private String noComCon;
	private Date noComEnroll;
	private Date noComModDate;
	private Date noComDelDate;
	private int noComViews;
	private int noComCount;
	
	public NoticeCo() {}
	
	public NoticeCo(int noComNum, int noNum, int noComMeNum, int noComParent, int noComDepth, String noComCon,
			Date noComEnroll, Date noComModDate, Date noComDelDate, int noComViews, int noComCount) {
		super();
		this.noComNum = noComNum;
		this.noNum = noNum;
		this.noComMeNum = noComMeNum;
		this.noComParent = noComParent;
		this.noComDepth = noComDepth;
		this.noComCon = noComCon;
		this.noComEnroll = noComEnroll;
		this.noComModDate = noComModDate;
		this.noComDelDate = noComDelDate;
		this.noComViews = noComViews;
		this.noComCount = noComCount;
	}

	public int getNoComNum() {
		return noComNum;
	}

	public void setNoComNum(int noComNum) {
		this.noComNum = noComNum;
	}

	public int getNoNum() {
		return noNum;
	}

	public void setNoNum(int noNum) {
		this.noNum = noNum;
	}

	public int getNoComMeNum() {
		return noComMeNum;
	}

	public void setNoComMeNum(int noComMeNum) {
		this.noComMeNum = noComMeNum;
	}

	public int getNoComParent() {
		return noComParent;
	}

	public void setNoComParent(int noComParent) {
		this.noComParent = noComParent;
	}

	public int getNoComDepth() {
		return noComDepth;
	}

	public void setNoComDepth(int noComDepth) {
		this.noComDepth = noComDepth;
	}

	public String getNoComCon() {
		return noComCon;
	}

	public void setNoComCon(String noComCon) {
		this.noComCon = noComCon;
	}

	public Date getNoComEnroll() {
		return noComEnroll;
	}

	public void setNoComEnroll(Date noComEnroll) {
		this.noComEnroll = noComEnroll;
	}

	public Date getNoComModDate() {
		return noComModDate;
	}

	public void setNoComModDate(Date noComModDate) {
		this.noComModDate = noComModDate;
	}

	public Date getNoComDelDate() {
		return noComDelDate;
	}

	public void setNoComDelDate(Date noComDelDate) {
		this.noComDelDate = noComDelDate;
	}

	public int getNoComViews() {
		return noComViews;
	}

	public void setNoComViews(int noComViews) {
		this.noComViews = noComViews;
	}

	public int getNoComCount() {
		return noComCount;
	}

	public void setNoComCount(int noComCount) {
		this.noComCount = noComCount;
	}

	@Override
	public String toString() {
		return "NoticeCo [noComNum=" + noComNum + ", noNum=" + noNum + ", noComMeNum=" + noComMeNum + ", noComParent="
				+ noComParent + ", noComDepth=" + noComDepth + ", noComCon=" + noComCon + ", noComEnroll=" + noComEnroll
				+ ", noComModDate=" + noComModDate + ", noComDelDate=" + noComDelDate + ", noComViews=" + noComViews
				+ ", noComCount=" + noComCount + "]";
	}
	
	
	
}
