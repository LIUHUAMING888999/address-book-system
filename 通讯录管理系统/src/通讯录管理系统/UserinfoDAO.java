package 通讯录管理系统;

import java.sql.SQLException;
import java.util.List;
import java.util.LinkedList;

public interface UserinfoDAO {
    
	public List<Userinfo> findAllUserinfo() throws SQLException ;
	public void addUserinfo(Userinfo user) throws SQLException;
	public void delUserinfoByPid(long id) throws SQLException;
	public List<Userinfo> findUserinfoByName(String name) throws SQLException;
	public  List<Userinfo> findUserinfoByTelphone(String telphone) throws SQLException;
	public void updateUserinfo(Userinfo user) throws SQLException ;
}