package in.example.dto;


import lombok.Data;

@Data
public class ResumeRequest {

    private String candidateName;
    private String resumeText;
    private String jobDescription;
}