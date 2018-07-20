package model;

public class RirekiBean {
	private int rirekiid;
	private int touhyouid;
	private String touhyouname;
	private int a;
	private int b;

	public RirekiBean() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public RirekiBean(int rirekiid, int touhyouid,String touhyouname, int a, int b) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.rirekiid=rirekiid;
		this.touhyouid=touhyouid;
		this.touhyouname=touhyouname;
		this.a=a;
		this.b=b;
	}
	public int getRirekiid() {
		return rirekiid;
	}
	public void setRirekiid(int rirekiid) {
		this.rirekiid = rirekiid;
	}
	public int getTouhyouid() {
		return touhyouid;
	}
	public void setTouhyouid(int touhyouid) {
		this.touhyouid = touhyouid;
	}
	public String getTouhyouname() {
		return touhyouname;
	}
	public void setTouhyouname(String touhyouname) {
		this.touhyouname = touhyouname;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}



}
