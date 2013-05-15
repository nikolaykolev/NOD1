package com.sirma.itt.javacourse.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataClass {

	public void saveObject(String path, UserDefinedObject o) throws IOException {
		File file = new File(path);
		FileOutputStream fileOut = new FileOutputStream(file, true);
		if (file.exists()) {
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(o);
		} else {
			throw new FileNotFoundException();
		}
	}

	public UserDefinedObject getObject(String path) throws IOException, ClassNotFoundException {
		File file = new File(path);
		FileInputStream fileIn = new FileInputStream(file);
		UserDefinedObject userObj = null;
		if (file.exists()) {
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			userObj = (UserDefinedObject) objIn.readObject();
		} else {
			throw new FileNotFoundException();
		}
		return userObj;
	}
}
