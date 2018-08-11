package 通讯录管理系统;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class UserinfoDaoImpl implements UserinfoDAO {

	private DBManager DBM;

	UserinfoDaoImpl() {
		try {
			DBM = DBManager.getInstance("mysql", "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Userinfo> findAllUserinfo() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from userinfo";
		List<Userinfo> list = new LinkedList<Userinfo>();
		ResultSet rs = DBM.executeQuery(sql);

		while (rs.next()) {
			Userinfo user = new Userinfo();
			user.setId(rs.getLong("id"));
			user.setName(rs.getString("name"));
			user.setTelephone(rs.getString("telphone"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setEmail(rs.getString("email"));
			user.setQq(rs.getString("qq"));
			user.setWeichat(rs.getString("weiChat"));
			user.setWeibo(rs.getString("weibo"));
			list.add(user);
		}
		return list;
	}

	@Override
	public void addUserinfo(Userinfo user) throws SQLException {
		// TODO Auto-generated method stub
		String name = user.getName();
		String telphone = user.getTelephone();
		String phone = user.getPhone();
		String address = user.getAddress();
		String email = user.getEmail();
		String qq = user.getQq();
		String weiChat = user.getWeichat();
		String weibo = user.getWeibo();
		String sql = "insert into userinfo (name,telphone,phone,address,email,qq,weiChat,weibo) values('" + name + "','"
				+ telphone + "','" + phone + "','" + address + "','" + email + "','" + qq + "','" + weiChat + "','"
				+ weibo + "')";
		System.out.println(sql);
		int result = DBM.executeUpdate(sql);
		if (result > 0) {
			JOptionPane.showMessageDialog(null, "插入成功！", "提示信息", JOptionPane.OK_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "插入失败！", "提示信息", JOptionPane.WARNING_MESSAGE);
		}

	}

	@Override
	public void delUserinfoByPid(long id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from userinfo where id=" + id;
		int result = DBM.executeUpdate(sql);
		if (result > 0) {
			JOptionPane.showMessageDialog(null, "删除成功！", "提示信息", JOptionPane.OK_OPTION);

		} else {
			JOptionPane.showMessageDialog(null, "删除失败！", "提示信息", JOptionPane.WARNING_MESSAGE);
		}

	}

	@Override
	public List<Userinfo> findUserinfoByName(String name) throws SQLException {

		String sql = "select * from userinfo where name   LIKE '%" + name + "%'";
		List<Userinfo> list = new LinkedList<Userinfo>();
		ResultSet rs = DBM.executeQuery(sql);

		while (rs.next()) {
			Userinfo user = new Userinfo();
			user.setId(rs.getLong("id"));
			user.setName(rs.getString("name"));
			user.setTelephone(rs.getString("telphone"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setEmail(rs.getString("email"));
			user.setQq(rs.getString("qq"));
			user.setWeichat(rs.getString("weiChat"));
			user.setWeibo(rs.getString("weibo"));
			list.add(user);
			// System.out.println(user.getId()+":"+user.getName()+":"+
			// user.getTelephone()+":"+ user.getPhone()+":"+user.getAddress()+":"+
			// user.getEmail()+":"+user.getQq()+":"+user.getWeibo()+":"+
			// user.getWeichat());
		}
		return list;

	}

	@Override
	public List<Userinfo> findUserinfoByTelphone(String telphone) throws SQLException {
		String sql = "select * from userinfo where telphone='" + telphone + "'or phone='" + telphone+"'";
		List<Userinfo> list = new LinkedList<Userinfo>();
		ResultSet rs = DBM.executeQuery(sql);

		while (rs.next()) {
			Userinfo user = new Userinfo();
			user.setId(rs.getLong("id"));
			user.setName(rs.getString("name"));
			user.setTelephone(rs.getString("telphone"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setEmail(rs.getString("email"));
			user.setQq(rs.getString("qq"));
			user.setWeichat(rs.getString("weiChat"));
			user.setWeibo(rs.getString("weibo"));
			list.add(user);
		}
		return list;
	}

	@Override
	public void updateUserinfo(Userinfo user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE USERINFO SET name = '" + user.getName() + "',telphone='" + user.getTelephone()
				+ "',phone='" + user.getPhone() + "',address='" + user.getAddress() + "',email='" + user.getEmail()
				+ "',qq='" + user.getQq() + "',weiChat='" + user.getWeichat() + "',weibo='" + user.getWeibo()
				+ "' where id=" + user.getId().longValue();
		// System.out.println(sql);

		int result = DBM.executeUpdate(sql);
		if (result > 0) {
			JOptionPane.showMessageDialog(null, "更新成功！", "提示信息", JOptionPane.OK_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "更新失败！", "提示信息", JOptionPane.WARNING_MESSAGE);
		}
	}

}
