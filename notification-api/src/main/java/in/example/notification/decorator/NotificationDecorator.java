package in.example.notification.decorator;

import in.example.notification.model.Message;

public abstract class NotificationDecorator implements Message {
	  protected final Message message;
	  protected NotificationDecorator(Message message) { this.message = message; }
	  @Override public String getContent() { return message.getContent(); }
	}
