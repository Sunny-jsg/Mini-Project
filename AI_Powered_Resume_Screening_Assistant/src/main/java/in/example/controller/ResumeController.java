package in.example.controller;


import org.springframework.web.bind.annotation.*;

import in.example.dto.ResumeRequest;
import in.example.entity.ResumeData;
import in.example.service.ResumeService;

@RestController
@RequestMapping("/api/resume")
@CrossOrigin("*")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("/analyze")
    public ResumeData analyzeResume(@RequestBody ResumeRequest request) {

        return resumeService.processResume(request);
    }
}