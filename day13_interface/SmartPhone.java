package com.onesoft.day13_interface;

public class SmartPhone implements Phone {
	public void brand(String b) {
	System.out.println(b);	
	}
	public void videocall(boolean isVideocall) {
		System.out.println(isVideocall);	
	}
	public void voicecall(boolean isVoicecall)
	{
		System.out.println(isVoicecall);
	}
	public void connectivity(boolean isConnectivity)
	{
		System.out.println(isConnectivity);
	}
	public void Camerafunction(String tapping) {
		
      switch(tapping)
      {
      case"Singletapping" :System.out.println("taking picture");break;
      case"doubletapping" :System.out.println("Zooming");break;
      case"continuestapping" :System.out.println("Continues shots");break;
      default:System.out.println("invalid data");break;
      }
	}

}
