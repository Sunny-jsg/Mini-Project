package in.example.notification.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class SendRequest {
	@NotBlank private String type;      // EMAIL | SMS | PUSH
	  @NotBlank private String message;
	  private String strategy = "IMMEDIATE"; // IMMEDIATE | DELAYED
	  private boolean encrypt;
	  private boolean timestamp;

}
