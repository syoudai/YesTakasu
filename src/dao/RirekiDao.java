package dao;

import javax.sql.DataSource;

import model.TouhyouBean;

public class RirekiDao {
	public class TouhyouDao extends DaoBase {



		DataSource ds =null;


		public TouhyouBean UpdateRireki(String name,String Data,String A, String B,int touhyouid) {
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
	}
}
