package com.ustglobal.objectclass;

public class Test1 {
	public static void main(String[] args) {
		PenDrive p = new PenDrive();
		USBPort.connect(p);
		
		Mouse m = new Mouse();
		USBPort.connect(m);
	}

}
