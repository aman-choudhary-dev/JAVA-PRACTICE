package com.WhatsApp;

import java.io.Serializable;

/**
 * Serialization - Process of Writing object into byte stream so that it can be transfered
 *				   over the network , store to database or write the file system
 *
 * Implementing Serializable to class give permission to be serialize 
 */
public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	private String messageId;
	private String message;
	private transient String userID; // data with 'transient ' are skipped while writing object use it for imp
	public Message(String messageId, String message , String userID) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.userID = userID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
