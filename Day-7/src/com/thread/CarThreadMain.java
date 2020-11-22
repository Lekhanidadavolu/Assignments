package com.thread;

public class CarThreadMain 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarThread ct=new CarThread();
		ct.start();
		//ct.sleep(10);
		CarThread2 ct2=new CarThread2();
		ct2.start();
		CarThread3 ct3=new CarThread3();
		ct3.start();
		CarThread4 ct4=new CarThread4();
		ct4.start();
		CarThread5 ct5=new CarThread5();
		ct5.start();
		CarThread6 ct6=new CarThread6();
		ct6.start();
		
	}

}
