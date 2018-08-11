package 通讯录管理系统;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class queryByNameDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nameTxt;
	private JTable table;
	private JRadioButton radioButton;
	public queryByNameDialog() {
		this.setTitle("添加对话框");
		setBounds(100, 100, 980, 486);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("姓名：");
		label.setBounds(27, 22, 54, 15);
		contentPanel.add(label);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(72, 19, 177, 21);
		contentPanel.add(nameTxt);
		nameTxt.setColumns(30);
		{
			JButton okButton = new JButton("查询");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserinfoDaoImpl userinfodaoimpl = new UserinfoDaoImpl();					
					String name = nameTxt.getText(); 
					List<Userinfo> list;
					try {
						if(radioButton.isSelected())
							list = userinfodaoimpl.findAllUserinfo();
						else
						    list = userinfodaoimpl.findUserinfoByName(name);
						String[] columnNames = { "姓名","电话","手机","地址","email","qq号","微信","微博"};
						int count = list.size();
						String data[][] = new String[count][8];
						for (int i = 0 ;i<list.size();i++)
						{
							Userinfo user = list.get(i);
//							data[i][0] = user.getId().toString();
							data[i][0] = user.getName();
							data[i][1] = user.getTelephone();
							data[i][2] = user.getPhone();
							data[i][3] = user.getAddress();
							data[i][4] = user.getEmail();
							data[i][5] = user.getQq();
							data[i][6] = user.getWeichat();
							data[i][7] = user.getWeibo();
						}
						
						table = new JTable(data,columnNames); 
						JScrollPane scrollPane = new JScrollPane(table);
						scrollPane.setBounds(10, 71, getContentPane().getWidth()-20,  getContentPane().getHeight()-80);
						contentPanel.add(scrollPane);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
			});
			okButton.setBounds(419, 18, 86, 23);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("重置");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                 
			    nameTxt.setText(null); 
					
					
				}
			});
			cancelButton.setBounds(515, 18, 86, 23);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		
		radioButton = new JRadioButton("查找全部");
		radioButton.setBounds(270, 18, 101, 23);
		contentPanel.add(radioButton);
		
	
		
		 
	}
}
