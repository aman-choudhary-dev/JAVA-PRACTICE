package com.WhatsApp;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {
		MessageSerialization messageSerialization = new MessageSerialization();
		Message message = new Message("MSG!", "Raat ko ana" , "ADA12");
		messageSerialization.serializeMessage(message); // it will create an file by serializing the message
		// we can deserialize it using that file to read the message
	}
}
