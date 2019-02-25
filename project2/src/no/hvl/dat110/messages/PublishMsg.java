package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	
	String message;
	public PublishMsg(String message, String usr) {
		super(MessageType.PUBLISH, usr);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "PublishMsg [message=" + message + "]";
	}
	
	
}
