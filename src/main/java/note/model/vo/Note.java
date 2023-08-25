package note.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Note implements Serializable {
	
	private static final long serialVersionUID = -2138342777947806459L;
	private int meNum;
	private String noCon;
	private Date noSenTime;
	private String noCh;
	private int meNumSen;
	
	public Note() {}

	public Note(int meNum, String noCon, Date noSenTime, String noCh, int meNumSen) {
		super();
		this.meNum = meNum;
		this.noCon = noCon;
		this.noSenTime = noSenTime;
		this.noCh = noCh;
		this.meNumSen = meNumSen;
	}

	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	public String getNoCon() {
		return noCon;
	}

	public void setNoCon(String noCon) {
		this.noCon = noCon;
	}

	public Date getNoSenTime() {
		return noSenTime;
	}

	public void setNoSenTime(Date noSenTime) {
		this.noSenTime = noSenTime;
	}

	public String getNoCh() {
		return noCh;
	}

	public void setNoCh(String noCh) {
		this.noCh = noCh;
	}

	public int getMeNumSen() {
		return meNumSen;
	}

	public void setMeNumSen(int meNumSen) {
		this.meNumSen = meNumSen;
	}

	@Override
	public String toString() {
		return "Message [meNum=" + meNum + ", noCon=" + noCon + ", noSenTime=" + noSenTime + ", noCh=" + noCh
				+ ", meNumSen=" + meNumSen + "]";
	}
	
}
