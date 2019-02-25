package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	
	String message;
	String topic;
	
	public PublishMsg(String message, String usr, String topic) {
		super(MessageType.PUBLISH, usr);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getTopic(){
		return topic;
	}
	@Override
	public String toString() {
		return "PublishMsg [message=" + message + "]";
	}
	
	
}
