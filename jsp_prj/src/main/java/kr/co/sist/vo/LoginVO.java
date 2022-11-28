package kr.co.sist.vo;

/**
 * @author user
 */
public class LoginVO {

	private String id, password, os;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", password=" + password + ", os=" + os + "]";
	}
	
}
