package in.example.service;

import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.output.Response;

import org.springframework.stereotype.Service;

@Service
public class AIResumeService {

	private final OllamaChatModel model;

	public AIResumeService() {

		this.model = OllamaChatModel.builder().baseUrl("http://localhost:11434").modelName("tinyllama").build();
	}

	public String analyzeResume(String resume, String jobDescription) {

		String prompt = """
				Analyze this resume against job description.

				Resume:
				%s

				Job Description:
				%s

				Give:
				1. ATS Score
				2. Missing Skills
				3. Suggestions
				""".formatted(resume, jobDescription);

		return model.generate(prompt);
	}
}