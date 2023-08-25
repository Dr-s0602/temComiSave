package photo.model.vo;

import java.io.Serializable;

public class Photo implements Serializable{
	
	private static final long serialVersionUID = -2553833925550923005L;
	private int photonum;
	private String photo1;
	private String photo2;
	private String photo3;
	private String photo4;
	private String photo5;
	
	public Photo() {}
	
	public Photo(int photonum, String photo1, String photo2, String photo3, String photo4, String photo5) {
		super();
		this.photonum = photonum;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
		this.photo4 = photo4;
		this.photo5 = photo5;
	}

	public int getPhotonum() {
		return photonum;
	}

	public void setPhotonum(int photonum) {
		this.photonum = photonum;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public String getPhoto3() {
		return photo3;
	}

	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}

	public String getPhoto4() {
		return photo4;
	}

	public void setPhoto4(String photo4) {
		this.photo4 = photo4;
	}

	public String getPhoto5() {
		return photo5;
	}

	public void setPhoto5(String photo5) {
		this.photo5 = photo5;
	}

	@Override
	public String toString() {
		return "Photo [photonum=" + photonum + ", photo1=" + photo1 + ", photo2=" + photo2 + ", photo3=" + photo3
				+ ", photo4=" + photo4 + ", photo5=" + photo5 + "]";
	}
	
}
