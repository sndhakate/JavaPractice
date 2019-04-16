package jdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
	public static void main(String as [] ) {
		int sid = Integer.parseInt(as [0]);
			String sn= as[1];
			String em=as[2];
			
			long ph = Long.parseLong(as[3]);
			String ci =as[4];
			double fee = Double.parseDouble(as [5]);
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			
			try {
				con = DBUtil.getOracleConnection();
				st= con.createStatement();
				String sql = null;
				System.out.println(sql);
				int x = st.executeUpdate(sql);
				if(x==1) {
					System.out.println("record is inserted :");
				}else {
					System.out.println("Record is not inserted");
				}
				String sql2 = "select *from b46 student";
				rs = st.executeQuery(sql);
				while (rs.next()) {
					sid = rs.getInt(1);
					sn = rs.getString(2);
					em = rs.getString(3);
					ph = rs.getLong(4);
					ci = rs.getString(5);
					fee = rs.getDouble(6);
					System.out.println("");
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				DBUtil.cleanup(con, st, rs);
				
			}			
		
	}

}
