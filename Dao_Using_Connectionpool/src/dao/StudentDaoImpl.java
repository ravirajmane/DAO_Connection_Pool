package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;


public class StudentDaoImpl implements StudentDao {
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	
	
	@Override
	public int save(int id, String name, String email, String address)
			throws SQLException {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into student007 values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, address);
		int  i=ps.executeUpdate();
		con.close();
		return i;
	}

	@Override
	public int delete(int id) throws SQLException {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement("delete student007 where id=?");
			ps.setInt(1, id);
			int i=ps.executeUpdate();
		con.close();
		return i;
	}

}
