package com.onesoft.day15_collectionHasMap;

public class PersonalDetails3 {
	private String name;
	private int age;
	private String gender;
	private long adharno;
	private long mobno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public PersonalDetails3(String name, int age, String gender, long adharno, long mobno) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adharno = adharno;
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "PersonalDetails [name=" + name + ", age=" + age + ", gender=" + gender + ", adharno=" + adharno
				+ ", mobno=" + mobno + "]";
	}

}
