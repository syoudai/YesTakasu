package dao;

import javax.sql.DataSource;

import model.DataBean;

public class UserDao extends DaoBase {



	DataSource ds =null;

	public DataBean getMember(int id,String pass) {
		//ユーザの情報を取得
		DataBean dataBean=null;

	try {
		super.DbOpen();
		String sql = "select * from UserData where idnumber=? and Pass=?";
		stmt =con.prepareStatement(sql);
		stmt.setInt(1,id);
		stmt.setString(2,pass);
		rs =stmt.executeQuery();
		rs.next();
		dataBean=new DataBean(rs.getInt("idnumber"),rs.getString("Userid"),rs.getString("Pass"),rs.getString("Umail"));
}catch(Exception e){
	dataBean =null;
}finally {
	try {
		super.DbClose();
	}catch(Exception e) {
		System.out.println("error");
	}
}
	return dataBean;
	}


	public DataBean InsertMember(int idnumber, String userid,String pass,String mail) {
		//
		DataBean dataBean=null;

		try {
			super.DbOpen();
			String sql = "INSERT INTO UserData VALUES (?,?,?,?)";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,idnumber);
			stmt.setString(2,userid);
			stmt.setString(3,pass);
			stmt.setString(4,mail);
			rsno =stmt.executeUpdate();


	}catch(Exception e){
		dataBean =null;
	}finally {
		try {
			super.DbClose();
		}catch(Exception e) {
			System.out.println("error");
		}
	}
		return dataBean;
		}

	public DataBean UpdateMember(String userid1,String pass1,String mail1,int id) {
		//ユーザー更新するためのSQLメソッド
		DataBean dataBean=null;

		try {
			super.DbOpen();
			String sql = "UPDATE UserData SET Userid=?, Pass=?,Umail=? WHERE idnumber=?";
			stmt =con.prepareStatement(sql);
			System.out.println(userid1);
			stmt.setString(1,userid1);
			System.out.println(pass1);
			stmt.setString(2,pass1);
			System.out.println(mail1);
			stmt.setString(3,mail1);
			stmt.setInt(4,id);
			rsno =stmt.executeUpdate();

	}catch(Exception e){
		dataBean =null;
	}finally {
		try {
			super.DbClose();
		}catch(Exception e) {
			System.out.println("error");
		}
	}
		return dataBean;
		}


	}