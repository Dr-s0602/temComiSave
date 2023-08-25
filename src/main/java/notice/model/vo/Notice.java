package notice.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Notice implements Serializable{
	
	private static final long serialVersionUID = 27095495939752283L;
	private int noNum;
	private int meNum;
	private String noTitle;
	private String noCon;
	private Date noEnroll;
	private Date noModDate;
	private Date noDelDate;
	private int noViews;
	private int noComCount;
	private int noPhotoNum;
	
	public Notice() {}
	
	public Notice(int noNum, int meNum, String noTitle, String noCon, Date noEnroll, Date noModDate, Date noDelDate,
			int noViews, int noComCount, int noPhotoNum) {
		super();
		this.noNum = noNum;
		this.meNum = meNum;
		this.noTitle = noTitle;
		this.noCon = noCon;
		this.noEnroll = noEnroll;
		this.noModDate = noModDate;
		this.noDelDate = noDelDate;
		this.noViews = noViews;
		this.noComCount = noComCount;
		this.noPhotoNum = noPhotoNum;
	}

	public int getNoNum() {
		return noNum;
	}

	public void setNoNum(int noNum) {
		this.noNum = noNum;
	}

	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	public String getNoTitle() {
		return noTitle;
	}

	public void setNoTitle(String noTitle) {
		this.noTitle = noTitle;
	}

	public String getNoCon() {
		return noCon;
	}

	public void setNoCon(String noCon) {
		this.noCon = noCon;
	}

	public Date getNoEnroll() {
		return noEnroll;
	}

	public void setNoEnroll(Date noEnroll) {
		this.noEnroll = noEnroll;
	}

	public Date getNoModDate() {
		return noModDate;
	}

	public void setNoModDate(Date noModDate) {
		this.noModDate = noModDate;
	}

	public Date getNoDelDate() {
		return noDelDate;
	}

	public void setNoDelDate(Date noDelDate) {
		this.noDelDate = noDelDate;
	}

	public int getNoViews() {
		return noViews;
	}

	public void setNoViews(int noViews) {
		this.noViews = noViews;
	}

	public int getNoComCount() {
		return noComCount;
	}

	public void setNoComCount(int noComCount) {
		this.noComCount = noComCount;
	}

	public int getNoPhotoNum() {
		return noPhotoNum;
	}

	public void setNoPhotoNum(int noPhotoNum) {
		this.noPhotoNum = noPhotoNum;
	}

	@Override
	public String toString() {
		return "Notice [noNum=" + noNum + ", meNum=" + meNum + ", noTitle=" + noTitle + ", noCon=" + noCon
				+ ", noEnroll=" + noEnroll + ", noModDate=" + noModDate + ", noDelDate=" + noDelDate + ", noViews="
				+ noViews + ", noComCount=" + noComCount + ", noPhotoNum=" + noPhotoNum + "]";
	}
	
	
	
}
