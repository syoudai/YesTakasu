package model;

public class KUserBean {
	private int kid;
	private String kname;
	private String kpass;
	public KUserBean(int kid, String kname, String kpass) {
		super();
		this.kid = kid;
		this.kname = kname;
		this.kpass = kpass;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getKpass() {
		return kpass;
	}
	public void setKpass(String kpass) {
		this.kpass = kpass;
	}
	public KUserBean() {

	}

}
