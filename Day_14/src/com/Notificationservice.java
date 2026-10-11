package com;

public class Notificationservice {
	public void sendNotification(String type) {
		if (type.equalsIgnoreCase("sms")) {
			sendSms();
		} else {
			sendWhatsapp();
		}
	}

	private void sendWhatsapp() {
		// TODO Auto-generated method stub
		System.out.println("sending message on Whatsapp");
	}

	private void sendSms() {
		System.out.println("Sending SMS");
	}
}
