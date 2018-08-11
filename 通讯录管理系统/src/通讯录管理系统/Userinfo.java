package 通讯录管理系统;

public class Userinfo {

	private Long id;

	private String name;

	private String telephone;

	private String phone;

	private String address;

	private String email;

	private String qq;

	private String weichat;

	private String weibo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public Userinfo()
	{
		
	}

	public Userinfo(String name, String telephone, String phone, String address, String email, String qq,
			String weichat, String weibo) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.qq = qq;
		this.weichat = weichat;
		this.weibo = weibo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeichat() {
		return weichat;
	}

	public void setWeichat(String weichat) {
		this.weichat = weichat;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}
}