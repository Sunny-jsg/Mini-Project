package in.example.service;

import in.example.dto.ResumeRequest;
import in.example.entity.ResumeData;

public interface ResumeService {
	public ResumeData processResume(ResumeRequest request);
	 

}
