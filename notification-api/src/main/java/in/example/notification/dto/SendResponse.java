package in.example.notification.dto;

import lombok.Data;

@Data
public class SendResponse {
	private String channel;
	  private String finalMessage;
	  private String strategy;
	  private String status;

}
