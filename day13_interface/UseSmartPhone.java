package com.onesoft.day13_interface;

public class UseSmartPhone {
	public static void main(String args[]) {
		SmartPhone s= new SmartPhone();
		s.brand("MOTO");
		s.videocall(true);
		s.voicecall(false);
		s.connectivity(false);
		s.Camerafunction("doubletapping");
	}

}
