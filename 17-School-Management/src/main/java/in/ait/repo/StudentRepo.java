package in.ait.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ait.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
