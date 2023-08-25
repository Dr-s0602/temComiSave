package qnaCo.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class QnaCo implements Serializable{
	
	private static final long serialVersionUID = 5495941434363383582L;
	private int qaComNum;
	private int qaNum;
	private int qaComMemNum;
	private int qaComParent;
	private int qaComDepth;
	private String qaComTitle;
	private String qaComCon;
	private int qaComViews;
	private int qaComCount;
	private Date qaComEnroll;
	private Date qaComModDate;
	private Date qaComDelDate;
	
	public QnaCo() {}

	public QnaCo(int qaComNum, int qaNum, int qaComMemNum, int qaComParent, int qaComDepth, String qaComTitle,
			String qaComCon, int qaComViews, int qaComCount, Date qaComEnroll, Date qaComModDate, Date qaComDelDate) {
		super();
		this.qaComNum = qaComNum;
		this.qaNum = qaNum;
		this.qaComMemNum = qaComMemNum;
		this.qaComParent = qaComParent;
		this.qaComDepth = qaComDepth;
		this.qaComTitle = qaComTitle;
		this.qaComCon = qaComCon;
		this.qaComViews = qaComViews;
		this.qaComCount = qaComCount;
		this.qaComEnroll = qaComEnroll;
		this.qaComModDate = qaComModDate;
		this.qaComDelDate = qaComDelDate;
	}

	public int getQaComNum() {
		return qaComNum;
	}

	public void setQaComNum(int qaComNum) {
		this.qaComNum = qaComNum;
	}

	public int getQaNum() {
		return qaNum;
	}

	public void setQaNum(int qaNum) {
		this.qaNum = qaNum;
	}

	public int getQaComMemNum() {
		return qaComMemNum;
	}

	public void setQaComMemNum(int qaComMemNum) {
		this.qaComMemNum = qaComMemNum;
	}

	public int getQaComParent() {
		return qaComParent;
	}

	public void setQaComParent(int qaComParent) {
		this.qaComParent = qaComParent;
	}

	public int getQaComDepth() {
		return qaComDepth;
	}

	public void setQaComDepth(int qaComDepth) {
		this.qaComDepth = qaComDepth;
	}

	public String getQaComTitle() {
		return qaComTitle;
	}

	public void setQaComTitle(String qaComTitle) {
		this.qaComTitle = qaComTitle;
	}

	public String getQaComCon() {
		return qaComCon;
	}

	public void setQaComCon(String qaComCon) {
		this.qaComCon = qaComCon;
	}

	public int getQaComViews() {
		return qaComViews;
	}

	public void setQaComViews(int qaComViews) {
		this.qaComViews = qaComViews;
	}

	public int getQaComCount() {
		return qaComCount;
	}

	public void setQaComCount(int qaComCount) {
		this.qaComCount = qaComCount;
	}

	public Date getQaComEnroll() {
		return qaComEnroll;
	}

	public void setQaComEnroll(Date qaComEnroll) {
		this.qaComEnroll = qaComEnroll;
	}

	public Date getQaComModDate() {
		return qaComModDate;
	}

	public void setQaComModDate(Date qaComModDate) {
		this.qaComModDate = qaComModDate;
	}

	public Date getQaComDelDate() {
		return qaComDelDate;
	}
	
	public void setQaComDelDate(Date qaComDelDate) {
		this.qaComDelDate = qaComDelDate;
	}
	
}
