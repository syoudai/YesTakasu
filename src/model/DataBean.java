package model;

public class DataBean {
	int Idnumber;
	String Userid;
	String Pass;
	String Umail;

	public DataBean() {

	}
	public DataBean(int idnumber, String userid, String pass, String umail) {
		super();
		Idnumber=idnumber;
		Userid = userid;
		Pass = pass;
		Umail = umail;
	}
	public DataBean(int idnumber,String pass) {
		Idnumber=idnumber;
		Pass=pass;

	}



	public String getUserid() {
		return Userid;
	}
	public void setUserId(String userid) {
		Userid = userid;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getUmail() {
		return Umail;
	}
	public void setUmail(String umail) {
		Umail = umail;
	}
	public int getIdnumber() {
		return Idnumber;
	}
	public void setIdnumber(int idnumber) {
		Idnumber = idnumber;
	}


}
