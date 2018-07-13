package dao;

import javax.sql.DataSource;

import model.RirekiBean;

public class RirekidDao extends DaoBase{
	DataSource ds =null;
	public RirekiBean UpdateCountA(int touhyouid) {
		//A or Bの投票にカウントする
		RirekiBean RirekiBean=null;
		try {
			super.DbOpen();
			String sql = "UPDATE Touhyoudata SET A=A+1 WHERE touhyouid=?";
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
			String sql = "UPDATE Rirekidata SET B=B+1 WHERE touhyouid=?";
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
}
