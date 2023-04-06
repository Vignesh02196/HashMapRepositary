package com.onesoft.day16_collectionStream;

public class Student {
	
	private String name;
	private int rollno;
	private char section;
	private int avg;
	private boolean isPreset;
	private String bloodGroup;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public boolean isPreset() {
		return isPreset;
	}
	public void setPreset(boolean isPreset) {
		this.isPreset = isPreset;
	}
	public Student(String name, int rollno, char section, int avg, boolean isPreset, String bloodGroup) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.section = section;
		this.avg = avg;
		this.isPreset = isPreset;
		this.bloodGroup = bloodGroup;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", section=" + section + ", avg=" + avg + ", isPreset="
				+ isPreset + ", bloodGroup=" + bloodGroup + "]";
	}

}
