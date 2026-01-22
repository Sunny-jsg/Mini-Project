package in.example.notification.model;

public class TextMessage implements Message {
	  private final String content;
	  public TextMessage(String content) { this.content = content; }
	  public String getContent() { return content; }
	}
