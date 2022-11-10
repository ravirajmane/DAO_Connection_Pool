package dao;

import java.sql.SQLException;

public interface StudentDao {
	public int save(int id,String name,String email,String address)throws SQLException;
	public int delete(int id)throws SQLException;

}
