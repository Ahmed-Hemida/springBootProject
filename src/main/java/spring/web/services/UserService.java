package spring.web.services;

import org.springframework.stereotype.Service;

import spring.web.models.User;
import spring.web.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
	private final UserRepository repository;

	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public List<User> findAll() {

        return (List<User>) repository.findAll();
    }
	
	public User insert(String name ,String userName ,String password ) {
		User user =new User(name , userName , password);
		return repository.save(user);
	}
}
