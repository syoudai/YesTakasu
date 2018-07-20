package dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import model.RirekiBean;

public class RirekidDao extends DaoBase{
	DataSource ds =null;
	public RirekiBean UpdateCountA(int touhyouid) {
		//A or Bの投票にカウントする
		RirekiBean RirekiBean=null;
		try {
			super.DbOpen();
			String sql = "UPDATE RirekiData SET A=A+1 WHERE touhyouid=?";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,touhyouid);
			rsno =stmt.executeUpdate();
		}catch(Exception e){
			RirekiBean =null;
		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("errorfuckyou");
			}
		}
			return RirekiBean;
		}
	public RirekiBean UpdateCountB(int touhyouid) {
		RirekiBean RirekiBean=null;
		try {
			super.DbOpen();
			String sql = "UPDATE RirekiData SET B=B+1 WHERE touhyouid=?";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,touhyouid);
			rsno =stmt.executeUpdate();
		}catch(Exception e){
			RirekiBean =null;
		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("errorfuckyou");
			}
	}
		return RirekiBean;
	}
	public RirekiBean InsertRireki(int lastid,String tname) {
		//
		RirekiBean rirekiBean=null;

		try {
			super.DbOpen();


			String sql = "INSERT INTO RirekiData(rirekiId,touhyouid,touhyouname) VALUES (null,?,?)";
			stmt =con.prepareStatement(sql);

			stmt.setInt(1,lastid);
			stmt.setString(2,tname);


			rsno =stmt.executeUpdate();

	}catch(Exception e){
		rirekiBean =null;
		e.printStackTrace();
	}finally {
		try {
			super.DbClose();
		}catch(Exception e) {
			System.out.println("error");
		}
	}
		return rirekiBean;
		}
	public ArrayList<RirekiBean> getCount() {
		//ユーザの情報を取得
	ArrayList<RirekiBean>votecount= new ArrayList<RirekiBean>();


	try {
		super.DbOpen();
		String sql = "select * from RirekiData ";
		stmt =con.prepareStatement(sql);
		rs =stmt.executeQuery();
		while(rs.next()) {
			int rirekiid =rs.getInt("rirekiId");
			int touhyouid =rs.getInt("touhyouid");
			String touhyouname=rs.getString("touhyouname");
			int a=rs.getInt("A");
			int b=rs.getInt("B");

		RirekiBean rirekiBean=new RirekiBean(rirekiid,touhyouid,touhyouname,a,b);

		votecount.add(rirekiBean);
		System.out.println("なんやねんlast2");
		}
}catch(Exception e){

}finally {
	try {
		super.DbClose();
	}catch(Exception e) {
		System.out.println("error");
	}
}
	return votecount;
	}
	public RirekiBean getRirekidata(int id) {
		//ユーザの情報を取得
		RirekiBean rirekiBean=null;

		try {
			super.DbOpen();
			String sql = "select * from RirekiData WHERE touhyouid=? ";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,id);
			rs =stmt.executeQuery();
			while(rs.next()) {
				int rid =rs.getInt("rirekiId");
				int tid =rs.getInt("touhyouid");
				String tname =rs.getString("touhyouname");
				int ta=rs.getInt("A");
				int tb=rs.getInt("B");

				rirekiBean=new RirekiBean(rid,tid,tname,ta,tb);
			}
		}catch(Exception e){

		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("error");
			}
		}
		return rirekiBean;
	}

}
