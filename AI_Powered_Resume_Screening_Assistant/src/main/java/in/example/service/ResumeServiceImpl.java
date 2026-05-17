package in.example.service;

import org.springframework.stereotype.Service;

import in.example.dto.ResumeRequest;
import in.example.entity.ResumeData;
import in.example.repository.ResumeRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ResumeServiceImpl implements ResumeService {
	
	private final AIResumeService aiResumeService;
	private final ResumeRepository resumeRepository;

	@Override
	public ResumeData processResume(ResumeRequest request) {
		 String feedback = aiResumeService.analyzeResume(
	                request.getResumeText(),
	                request.getJobDescription()
	        );

	        ResumeData data = new ResumeData();

	        data.setCandidateName(request.getCandidateName());
	        data.setResumeText(request.getResumeText());
	        data.setJobDescription(request.getJobDescription());
	        data.setAiFeedback(feedback);

	        data.setAtsScore(extractScore(feedback));

	        return resumeRepository.save(data);
	    }

	private Double extractScore(String feedback) {

	    try {

	        String numbers = feedback.replaceAll("[^0-9]", " ")
	                                 .trim();

	        String[] arr = numbers.split("\\s+");

	        for(String s : arr){

	            int score = Integer.parseInt(s);

	            if(score >= 1 && score <= 100){
	                return (double) score;
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return 75.0;
	}
	    }


	


