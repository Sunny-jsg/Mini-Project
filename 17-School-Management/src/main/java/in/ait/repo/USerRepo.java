package in.ait.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ait.entity.Users;

public interface USerRepo extends JpaRepository<Users, Long> {
	Users findByEmail(String email);

}
