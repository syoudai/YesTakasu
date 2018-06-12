package dao;

import javax.sql.DataSource;

import model.KUserBean;

public class KUserDao extends DaoBase {



	DataSource ds =null;

	public KUserBean getKMember(int kid,String kpass) {
		//ユーザの情報を取得
		KUserBean kuserBean=null;

	try {
		super.DbOpen();
		String sql = "select * from KannriUser where kid=? and kpass=?";
		stmt =con.prepareStatement(sql);
		stmt.setInt(1,kid);
		System.out.println(kid+"kid");
		stmt.setString(2,kpass);
		System.out.println(kpass+"kpss");
		rs =stmt.executeQuery();
		rs.next();
		kuserBean=new KUserBean(rs.getInt("kid"),rs.getString("kname"),rs.getString("kPass"));
}catch(Exception e){
	kuserBean =null;
}finally {
	try {
		super.DbClose();
	}catch(Exception e) {
		System.out.println("error");
	}
}
	return kuserBean;
	}




	}