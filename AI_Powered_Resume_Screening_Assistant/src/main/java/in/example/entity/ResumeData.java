package in.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String candidateName;

    @Column(length = 5000)
    private String resumeText;

    @Column(length = 5000)
    private String jobDescription;

    private Double atsScore;

    @Column(length = 5000)
    private String aiFeedback;
}