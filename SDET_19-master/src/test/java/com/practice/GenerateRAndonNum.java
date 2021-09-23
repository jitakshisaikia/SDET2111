package com.practice;

import java.util.Random;

public class GenerateRAndonNum {

	public static void main(String[] args) 
	{
		Random r=new Random();
		int ran=r.nextInt(1000);
		System.out.println(ran);

	}

}
