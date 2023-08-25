package member.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable {
	
	private static final long serialVersionUID = 3741979501782067108L;
	
	private int meNum;
	private String meName;
	private String meId;
	private String mePwd;
	private int meCPwd;
	private String meCer;
	private String meLoginType;
	private String meEmail;
	private String mePhone;
	private String meAdd;
	private String meGender;
	private Date meBDay;
	private Date meEnroll;
	private Date meModDate;
	private String meAka;
	private int meLike;
	private String mePhotoAdd;
	private String meAdmin;
	private String meBan;
	private int mePoint;
	private int catNum;
	
	public Member() {}
	
	public Member(int meNum, String meName, String meId, String mePwd, int meCPwd, String meCer, String meLoginType,
			String meEmail, String mePhone, String meAdd, String meGender, Date meBDay, Date meEnroll, Date meModDate,
			String meAka, int meLike, String mePhotoAdd, String meAdmin, String meBan, int mePoint, int catNum) {
		super();
		this.meNum = meNum;
		this.meName = meName;
		this.meId = meId;
		this.mePwd = mePwd;
		this.meCPwd = meCPwd;
		this.meCer = meCer;
		this.meLoginType = meLoginType;
		this.meEmail = meEmail;
		this.mePhone = mePhone;
		this.meAdd = meAdd;
		this.meGender = meGender;
		this.meBDay = meBDay;
		this.meEnroll = meEnroll;
		this.meModDate = meModDate;
		this.meAka = meAka;
		this.meLike = meLike;
		this.mePhotoAdd = mePhotoAdd;
		this.meAdmin = meAdmin;
		this.meBan = meBan;
		this.mePoint = mePoint;
		this.catNum = catNum;
	}



	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	public String getMeName() {
		return meName;
	}

	public void setMeName(String meName) {
		this.meName = meName;
	}

	public String getMeId() {
		return meId;
	}

	public void setMeId(String meId) {
		this.meId = meId;
	}

	public String getMePwd() {
		return mePwd;
	}

	public void setMePwd(String mePwd) {
		this.mePwd = mePwd;
	}

	public int getMeCPwd() {
		return meCPwd;
	}

	public void setMeCPwd(int meCPwd) {
		this.meCPwd = meCPwd;
	}

	public String getMeCer() {
		return meCer;
	}

	public void setMeCer(String meCer) {
		this.meCer = meCer;
	}

	public String getMeLoginType() {
		return meLoginType;
	}

	public void setMeLoginType(String meLoginType) {
		this.meLoginType = meLoginType;
	}

	public String getMeEmail() {
		return meEmail;
	}

	public void setMeEmail(String meEmail) {
		this.meEmail = meEmail;
	}

	public String getMePhone() {
		return mePhone;
	}

	public void setMePhone(String mePhone) {
		this.mePhone = mePhone;
	}

	public String getMeAdd() {
		return meAdd;
	}

	public void setMeAdd(String meAdd) {
		this.meAdd = meAdd;
	}

	public String getMeGender() {
		return meGender;
	}

	public void setMeGender(String meGender) {
		this.meGender = meGender;
	}

	public Date getMeBDay() {
		return meBDay;
	}

	public void setMeBDay(Date meBDay) {
		this.meBDay = meBDay;
	}

	public Date getMeEnroll() {
		return meEnroll;
	}

	public void setMeEnroll(Date meEnroll) {
		this.meEnroll = meEnroll;
	}

	public Date getMeModDate() {
		return meModDate;
	}

	public void setMeModDate(Date meModDate) {
		this.meModDate = meModDate;
	}

	public String getMeAka() {
		return meAka;
	}

	public void setMeAka(String meAka) {
		this.meAka = meAka;
	}

	public int getMeLike() {
		return meLike;
	}

	public void setMeLike(int meLike) {
		this.meLike = meLike;
	}

	public String getMePhotoAdd() {
		return mePhotoAdd;
	}

	public void setMePhotoAdd(String mePhotoAdd) {
		this.mePhotoAdd = mePhotoAdd;
	}

	public String getMeAdmin() {
		return meAdmin;
	}

	public void setMeAdmin(String meAdmin) {
		this.meAdmin = meAdmin;
	}

	public String getMeBan() {
		return meBan;
	}

	public void setMeBan(String meBan) {
		this.meBan = meBan;
	}

	public int getMePoint() {
		return mePoint;
	}

	public void setMePoint(int mePoint) {
		this.mePoint = mePoint;
	}

	public int getCatNum() {
		return catNum;
	}

	public void setCatNum(int catNum) {
		this.catNum = catNum;
	}

	@Override
	public String toString() {
		return "Member [meNum=" + meNum + ", meName=" + meName + ", meId=" + meId + ", mePwd=" + mePwd + ", meCPwd="
				+ meCPwd + ", meCer=" + meCer + ", meLoginType=" + meLoginType + ", meEmail=" + meEmail + ", mePhone="
				+ mePhone + ", meAdd=" + meAdd + ", meGender=" + meGender + ", meBDay=" + meBDay + ", meEnroll="
				+ meEnroll + ", meModDate=" + meModDate + ", meAka=" + meAka + ", meLike=" + meLike + ", mePhotoAdd="
				+ mePhotoAdd + ", meAdmin=" + meAdmin + ", meBan=" + meBan + ", mePoint=" + mePoint + ", catNum="
				+ catNum + "]";
	}

	
}
