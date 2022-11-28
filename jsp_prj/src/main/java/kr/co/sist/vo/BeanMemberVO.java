package kr.co.sist.vo;

import java.util.Arrays;

/**
 * Web Parameter를 받기 위한 VO
 * @author user
 *
 */
public class BeanMemberVO {
	
	private String id, pass, name, birth, phone, tel1, telFlag, email1, email2, emailFlag, gender, loc, ipAddr,
					zipcode, addr1, addr2;

	private int age; 
	private String[] lang;
	
	public BeanMemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanMemberVO(String id, String pass, String name, String birth, String phone, String tel1, String telFlag,
			String email1, String email2, String emailFlag, String gender, String loc, String ipAddr, String zipcode,
			String addr1, String addr2, int age, String[] lang) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.tel1 = tel1;
		this.telFlag = telFlag;
		this.email1 = email1;
		this.email2 = email2;
		this.emailFlag = emailFlag;
		this.gender = gender;
		this.loc = loc;
		this.ipAddr = ipAddr;
		this.zipcode = zipcode;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.age = age;
		this.lang = lang;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTelFlag() {
		return telFlag;
	}

	public void setTelFlag(String telFlag) {
		this.telFlag = telFlag;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmailFlag() {
		return emailFlag;
	}

	public void setEmailFlag(String emailFlag) {
		this.emailFlag = emailFlag;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getLang() {
		return lang;
	}

	public void setLang(String[] lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "BeanMemberVO [id=" + id + ", pass=" + pass + ", name=" + name + ", birth=" + birth + ", phone=" + phone
				+ ", tel1=" + tel1 + ", telFlag=" + telFlag + ", email1=" + email1 + ", email2=" + email2
				+ ", emailFlag=" + emailFlag + ", gender=" + gender + ", loc=" + loc + ", ipAddr=" + ipAddr
				+ ", zipcode=" + zipcode + ", addr1=" + addr1 + ", addr2=" + addr2 + ", age=" + age + ", lang="
				+ Arrays.toString(lang) + "]";
	}


	
}