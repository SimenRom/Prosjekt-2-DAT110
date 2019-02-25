package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	
	String topic;
	
	public CreateTopicMsg (String topic, String user) {
		super(MessageType.CREATETOPIC, user);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "CreateTopicMsg [topic=" + topic + "]";
	}
	
}
