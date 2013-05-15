package com.sirma.itt.javacourse.inputoutput;

import java.io.IOException;

public class RunDataClass {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DataClass writer = new DataClass();
		String path = "X:/WORK/JAVA/Sirma/hello.txt";
		UserDefinedObject obj = new UserDefinedObject("HELLO");
		writer.saveObject(path, obj);
		System.out.println(writer.getObject(path));
	}
}
