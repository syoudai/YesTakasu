package dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import model.TouhyouBean;

public class TouhyouDao extends DaoBase {



	DataSource ds =null;

	public TouhyouBean InsertTouhyou(int tnumber, String tname,String tdata,String A,String B) {
		//
		TouhyouBean touhyouBean=null;

		try {
			super.DbOpen();
			String sql = "INSERT INTO TouhyouData VALUES (?,?,?,?,?)";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,tnumber);
			stmt.setString(2,tname);
			stmt.setString(3,tdata);
			stmt.setString(4,A);
			stmt.setString(5,B);
			rsno =stmt.executeUpdate();

	}catch(Exception e){
		touhyouBean =null;
	}finally {
		try {
			super.DbClose();
		}catch(Exception e) {
			System.out.println("error");
		}
	}
		return touhyouBean;
		}
	public ArrayList<TouhyouBean> getTouhyou() {
		//ユーザの情報を取得
	ArrayList<TouhyouBean>tlist= new ArrayList<TouhyouBean>();


	try {
		super.DbOpen();
		String sql = "select * from TouhyouData ";
		stmt =con.prepareStatement(sql);
		rs =stmt.executeQuery();
		while(rs.next()) {
			int tid =rs.getInt("touhyouid");
			String tname =rs.getString("touhyouname");
			String tdata=rs.getString("touhyouData");
			String ta=rs.getString("A");
			String tb=rs.getString("B");

		TouhyouBean touhyouBean=new TouhyouBean(tid,tname,tdata,ta,tb);

		tlist.add(touhyouBean);
		System.out.println("なんやねんlast");
		}
}catch(Exception e){

}finally {
	try {
		super.DbClose();
	}catch(Exception e) {
		System.out.println("error");
	}
}
	return tlist;
	}



	}