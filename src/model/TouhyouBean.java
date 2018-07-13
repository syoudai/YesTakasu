package model;

public class TouhyouBean {
	int touhyouid;
	String touhyouname;
	String touhyouData;
	String touhyouA;
	String touhyouB;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TouhyouBean(int touhyouid, String touhyouname, String touhyouData,String touhyouA,String touhyouB) {
		super();
		this.touhyouid = touhyouid;
		this.touhyouname = touhyouname;
		this.touhyouData = touhyouData;
		this.touhyouA=touhyouA;
		this.touhyouB=touhyouB;


	}
	public TouhyouBean(int touhyouid, String touhyouname, String touhyouData,String touhyouA,String touhyouB,String name) {
		super();
		this.touhyouid = touhyouid;
		this.touhyouname = touhyouname;
		this.touhyouData = touhyouData;
		this.touhyouA=touhyouA;
		this.touhyouB=touhyouB;
		this.name=name;
	}

	public TouhyouBean(){

	}
	public TouhyouBean(int touhyouid) {


	}
	public TouhyouBean(int touhyouid,String touhyouname) {


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
	public String getTouhyouData() {
		return touhyouData;
	}
	public void setTouhyouData(String touhyouData) {
		this.touhyouData = touhyouData;
	}
	public String getTouhyouA() {
		return touhyouA;
	}
	public void setTouhyouA(String touhyouA) {
		this.touhyouA = touhyouA;
	}
	public String getTouhyouB() {
		return touhyouB;
	}
	public void setTouhyouB(String touhyouB) {
		this.touhyouB = touhyouB;
	}


}
