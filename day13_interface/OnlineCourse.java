
package com.onesoft.day13_interface;

public class OnlineCourse implements Course {
	public String courseTrainername(String name) {
	return name;
	
	}
	public int coursehours(int noOfhours) {
	return noOfhours;	
	}
	public boolean courseOnline(boolean isonline) {
		return isonline;
	}
	
	public String courseLink(String useLink) {
		return useLink;
	}
	public String courseFee(String courseName )
	{
		if(courseName=="JAVA") {
			return "fee is 20k";
		}
		else if(courseName=="SQL") {
		return "fee is 15k";
	}
		else if(courseName=="PYTHON") {
			return "fee is 18k";
		}
		else {
			return "Not available";
		}
	
	}

}
