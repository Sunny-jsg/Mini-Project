package in.example.notification.decorator;

import java.time.Instant;

import in.example.notification.model.Message;

public class TimestampedMessage extends NotificationDecorator {
	  public TimestampedMessage(Message message) { super(message); }
	  @Override public String getContent() { return "[" + Instant.now() + "] " + message.getContent(); }
	}