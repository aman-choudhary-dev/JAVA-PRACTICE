package com.WhatsApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization  {
	public void serializeMessage(Message message) throws IOException
	{
		/**
		 * Whenever we are writing object we use OUTPUT and when we are reading it we use INPUTSTREAM
		 */
		FileOutputStream fos = new FileOutputStream("message.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(message); //writing
		oos.close(); // close the connection
	}
}
