package com.whats.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.WhatsApp.Message;

public class Driver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("E:\\KodeWala Academy\\Serialization\\message.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Message message = (Message) ois.readObject();
		
		System.out.println("deserialize - " + message.getMessage() + "\nUSer ID : " + message.getUserID());
		// won't print the transient data. instead it will give null
	}
}
