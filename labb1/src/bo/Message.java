package bo;

public class Message {

	private String message;
	private User fromUser;
	private User toUser;

	public Message(String message, User fromUser, User toUser) {
		this.message = message;
		this.fromUser = fromUser;
		this.toUser = toUser;

	}

	public String getMessage() {
		return message;
	}

	public User getFrom() {
		return fromUser;
	}
	
	public User getTo(){
		return toUser;
	}

}
