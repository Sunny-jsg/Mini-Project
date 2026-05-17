package in.ait.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import in.ait.entity.Users;
import in.ait.repo.USerRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private USerRepo userRepo;

	@Override
	public void saveUser(Users user) {

		userRepo.save(user);
	}

}
