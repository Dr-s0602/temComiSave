package partyCh.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class PartyCh implements Serializable {
	
	private static final long serialVersionUID = -1243068995581588204L;
	
	private int chatNum;
	private int paNum;
	private int meNum;
	private String chatCom;
	private Date chatDate;
	
	public PartyCh() {
		
	}

	public PartyCh(int chatNum, int paNum, int meNum, String chatCom, Date chatDate) {
		super();
		this.chatNum = chatNum;
		this.paNum = paNum;
		this.meNum = meNum;
		this.chatCom = chatCom;
		this.chatDate = chatDate;
	}

	public int getChatNum() {
		return chatNum;
	}

	public void setChatNum(int chatNum) {
		this.chatNum = chatNum;
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

	public String getChatCom() {
		return chatCom;
	}

	public void setChatCom(String chatCom) {
		this.chatCom = chatCom;
	}

	public Date getChatDate() {
		return chatDate;
	}

	public void setChatDate(Date chatDate) {
		this.chatDate = chatDate;
	}

	@Override
	public String toString() {
		return "PartyCh [chatNum=" + chatNum + ", paNum=" + paNum + ", meNum=" + meNum + ", chatCom=" + chatCom
				+ ", chatDate=" + chatDate + "]";
	}
	
	
}
