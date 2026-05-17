package in.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.entity.ResumeData;
@Repository
public interface ResumeRepository extends  JpaRepository<ResumeData, Long> {

}
