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
import java.awt.event.ActionEvent;

public class addDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nameTxt;
	private JTextField telphoneTxt;
	private JTextField phoneTxt;
	private JTextField addressTxt;
	private JTextField emailTxt;
	private JTextField qqTxt;
	private JTextField weiChatTxt;
	private JTextField weiboTxt;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			addDialog dialog = new addDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public addDialog() {
		this.setTitle("添加对话框");
		setBounds(100, 100, 634, 486);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("姓名：");
		label.setBounds(27, 22, 54, 15);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("电话：");
		label_1.setBounds(27, 67, 54, 15);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("手机：");
		label_2.setBounds(27, 110, 54, 15);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("地址：");
		label_3.setBounds(27, 155, 54, 15);
		contentPanel.add(label_3);
		
		JLabel lblEmail = new JLabel("email：");
		lblEmail.setBounds(27, 197, 54, 15);
		contentPanel.add(lblEmail);
		
		JLabel lblQq = new JLabel("qq:");
		lblQq.setBounds(27, 252, 54, 15);
		contentPanel.add(lblQq);
		
		JLabel label_4 = new JLabel("微信：");
		label_4.setBounds(27, 295, 54, 15);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("微博：");
		label_5.setBounds(27, 338, 54, 15);
		contentPanel.add(label_5);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(72, 19, 177, 21);
		contentPanel.add(nameTxt);
		nameTxt.setColumns(30);
		
		telphoneTxt = new JTextField();
		telphoneTxt.setBounds(72, 64, 177, 21);
		contentPanel.add(telphoneTxt);
		telphoneTxt.setColumns(10);
		
		phoneTxt = new JTextField();
		phoneTxt.setBounds(72, 107, 177, 21);
		contentPanel.add(phoneTxt);
		phoneTxt.setColumns(10);
		
		addressTxt = new JTextField();
		addressTxt.setBounds(72, 152, 461, 21);
		contentPanel.add(addressTxt);
		addressTxt.setColumns(10);
		
		emailTxt = new JTextField();
		emailTxt.setBounds(72, 194, 466, 21);
		contentPanel.add(emailTxt);
		emailTxt.setColumns(10);
		
		qqTxt = new JTextField();
		qqTxt.setBounds(72, 249, 233, 21);
		contentPanel.add(qqTxt);
		qqTxt.setColumns(10);
		
		weiChatTxt = new JTextField();
		weiChatTxt.setBounds(70, 292, 235, 21);
		contentPanel.add(weiChatTxt);
		weiChatTxt.setColumns(10);
		
		weiboTxt = new JTextField();
		weiboTxt.setBounds(72, 335, 233, 21);
		contentPanel.add(weiboTxt);
		weiboTxt.setColumns(10);
		{
			JButton okButton = new JButton("添加");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = nameTxt.getText();
					String telphone = telphoneTxt.getText();
					String phone = phoneTxt.getText();
					String address = addressTxt.getText();
					String email = emailTxt.getText();
					String qq = qqTxt.getText();
					String weiChat = weiChatTxt.getText();
					String weibo = weiboTxt.getText();
					UserinfoDaoImpl userinfodaoimpl = new UserinfoDaoImpl();
					Userinfo user = new Userinfo(name,telphone,phone,address,email,qq,weiChat,weibo);
					try {
						userinfodaoimpl.addUserinfo(user);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 
				}
			});
			okButton.setBounds(127, 381, 86, 23);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("重置");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                 
			    nameTxt.setText(null);
			    telphoneTxt.setText(null);
			    phoneTxt.setText(null);
			    addressTxt.setText(null);
			    emailTxt.setText(null);
			    qqTxt.setText(null);
			    weiChatTxt.setText(null);
			    weiboTxt.setText(null);
					
					
					
				}
			});
			cancelButton.setBounds(264, 381, 86, 23);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
	}
}
