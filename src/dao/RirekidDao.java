package dao;

import javax.sql.DataSource;

import model.TouhyouBean;

public class RirekidDao extends DaoBase{
	DataSource ds =null;
	public TouhyouBean UpdateCountA(int id) {
		//A or Bの投票にカウントする
		TouhyouBean touhyuBean=null;
		try {
			super.DbOpen();
			String sql = "UPDATE Touhyoudata SET A=A+1 WHERE touhyouid=?";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,id);
			rsno =stmt.executeUpdate();
		}catch(Exception e){
			touhyuBean =null;
		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("errorfuckyou");
			}
		}
			return touhyuBean;
		}
	public TouhyouBean UpdateCountB(int id) {
		TouhyouBean touhyuBean=null;
		try {
			super.DbOpen();
			String sql = "UPDATE Touhyoudata SET B=B+1 WHERE touhyouid=?";
			stmt =con.prepareStatement(sql);
			stmt.setInt(1,id);
			rsno =stmt.executeUpdate();
		}catch(Exception e){
			touhyuBean =null;
		}finally {
			try {
				super.DbClose();
			}catch(Exception e) {
				System.out.println("errorfuckyou");
			}
	}
		return touhyuBean;
	}
}
