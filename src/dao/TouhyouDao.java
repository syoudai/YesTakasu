package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import model.TouhyouBean;

public class TouhyouDao extends DaoBase {




	DataSource ds =null;

	public Integer InsertTouhyou(String tname,String tdata,String A,String B) {
		//
		TouhyouBean touhyouBean=null;
		Integer lastid=null;

		try {
			super.DbOpen();
			String sql = "INSERT INTO TouhyouData VALUES (null,?,?,?,?)";
			stmt =con.prepareStatement(sql);

			stmt.setString(1,tname);
			stmt.setString(2,tdata);
			stmt.setString(3,A);
			stmt.setString(4,B);

			rsno =stmt.executeUpdate();

			PreparedStatement stmt2 = null;
			ResultSet rs2=null;

			stmt2 = con.prepareStatement("select last_insert_id() as lastId from TouhyouData");
			 rs2 = stmt2.executeQuery();
			 while(rs2.next()){
		        	lastid = rs2.getInt("lastId");
		        }

		}catch(Exception e){
			touhyouBean =null;
			e.printStackTrace();
		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("error");
			}
		}
		return lastid;
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


	public TouhyouBean DeleteTouhyou(int id) {
		//ユーザー削除するためのSQLメソッド
		TouhyouBean touhyouBean=null;

		try {
			super.DbOpen();
			System.out.println("飛べてる1？");
			String sql = "DELETE FROM TouhyouData WHERE touhyouid=?  ";
			System.out.println("飛べてる2？");
			stmt =con.prepareStatement(sql);
			System.out.println("飛べてる3？");
			stmt.setInt(1,id);
			System.out.println("飛べてる4？");
			rsno =stmt.executeUpdate();
			System.out.println("飛べてる5？");

		}catch(Exception e){
			touhyouBean =null;
			e.printStackTrace();
		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("error");
			}
		}
		return touhyouBean;
	}

	public TouhyouBean UpdateTouhyou(String name,String Data,String A, String B,int touhyouid) {
		//ユーザー更新するためのSQLメソッド
		TouhyouBean touhyouBean=null;

		try {
			super.DbOpen();
			String sql = "UPDATE TouhyouData SET  touhyouname=?,touhyouData=?, A=?,B=? WHERE touhyouid=?";
			stmt =con.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.setString(2,Data);
			stmt.setString(3,A);
			stmt.setString(4,B);
			stmt.setInt(5,touhyouid);
			System.out.println("touhyouid"+touhyouid);
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


	public TouhyouBean getTouhyoudata(int id) {
		//ユーザの情報を取得
		TouhyouBean touhyouBean=null;

		try {
			super.DbOpen();
			String sql = "select * from TouhyouData WHERE touhyouid=? ";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,id);
			rs =stmt.executeQuery();
			while(rs.next()) {
				int tid =rs.getInt("touhyouid");
				String tname =rs.getString("touhyouname");
				String tdata=rs.getString("touhyouData");
				String ta=rs.getString("A");
				String tb=rs.getString("B");

				touhyouBean=new TouhyouBean(tid,tname,tdata,ta,tb);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("error");
			}
		}
		return touhyouBean;
	}
}


