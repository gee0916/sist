package kr.co.sist.vo;

import java.util.Arrays;

/**
 * Web Parameter를 받기위한 VO
 * @author user
 * 
 */
public class MemberVO {
	
private String id, pass, name, birth, phone, tel1, email1, Email2, gender, loc, zipcode, addr1, addr2;
private String[] lang;

public MemberVO() {
	super();
}
public MemberVO(String id, String pass, String name, String birth, String phone, String tel1, String email1,
		String Email2, String gender, String loc, String zipcode, String addr1, String addr2, String[] lang) {
	super();
	this.id = id;
	this.pass = pass;
	this.name = name;
	this.birth = birth;
	this.phone = phone;
	this.tel1 = tel1;
	this.email1 = email1;
	this.Email2 = Email2;
	this.gender = gender;
	this.loc = loc;
	this.zipcode = zipcode;
	this.addr1 = addr1;
	this.addr2 = addr2;
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
public String getEmail1() {
	return email1;
}
public void setEmail1(String email1) {
	this.email1 = email1;
}
public String getEmail2() {
	return Email2;
}
public void setEmail2(String Email2) {
	this.Email2 = Email2;
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
public String[] getLang() {
	return lang;
}
public void setLang(String[] lang) {
	this.lang = lang;
}
@Override
public String toString() {
	return "MemberVO [id=" + id + ", pass=" + pass + ", name=" + name + ", birth=" + birth + ", phone=" + phone
			+ ", tel1=" + tel1 + ", email1=" + email1 + ", Email2=" + Email2 + ", gender=" + gender + ", loc=" + loc
			+ ", zipcode=" + zipcode + ", addr1=" + addr1 + ", addr2=" + addr2 + ", lang=" + Arrays.toString(lang)
			+ "]";
}


}
