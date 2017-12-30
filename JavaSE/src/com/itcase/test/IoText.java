package com.itcase.test;

import java.io.File;

public class IoText {
	public static void main(String[] args){
		File file=new File("file/1.txt");
		System.out.println(file+"   "
		+file.getAbsolutePath()+"  "
		+file.getParent().isEmpty());
	}
}
