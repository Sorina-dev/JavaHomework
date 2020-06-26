package com.syntax.javahomework;

public class Phone {

	String model;
	String color;
	double physSize;
	double physicalSize;
	double rearCameraMp;
	double frontCameraMp;

	void receiveAndMakeCalls() {
		System.out.println(model + " can receive and make calls");
	}

	void takePicturesVideos() {
		System.out.println(model + " can take pictures and record videos");
	}

	void storePicAndVideos() {
		System.out.println(model + " can store pictures and videos");
	}

	void accessNet() {
		System.out.println(model + " can access net");
	}

	public static void main(String[] args) {

		Phone ph1 = new Phone();

		ph1.model = "Iphone 7 Plus";
		ph1.color = "red";
		ph1.physSize = 5.5;
		ph1.physicalSize = 14.0;
		ph1.rearCameraMp = 12;
		ph1.frontCameraMp = 7;

		ph1.receiveAndMakeCalls();
		ph1.receiveAndMakeCalls();
		ph1.storePicAndVideos();
		ph1.accessNet();

		System.out.println("***********************************");

		Phone ph2 = new Phone();

		ph2.model = "Samsung Galaxy S8+";
		ph2.color = "black";
		ph2.physSize = 6.2;
		ph2.physicalSize = 15.7;
		ph2.rearCameraMp = 12;
		ph2.frontCameraMp = 8;

		ph2.receiveAndMakeCalls();
		ph2.receiveAndMakeCalls();
		ph2.storePicAndVideos();
		ph2.accessNet();

		System.out.println("***********************************");

		Phone ph3 = new Phone();

		ph3.model = "Nokia Lumia 1080";
		ph2.color = "blue";
		ph3.physSize = 4.5;
		ph3.physicalSize = 11.0;
		ph3.rearCameraMp = 41;
		ph3.frontCameraMp = 1.2;

		ph3.receiveAndMakeCalls();
		ph3.receiveAndMakeCalls();
		ph3.storePicAndVideos();
		ph3.accessNet();

	}

}
