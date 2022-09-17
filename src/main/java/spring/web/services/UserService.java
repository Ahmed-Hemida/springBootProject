package spring.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import spring.web.models.User;
import spring.web.repositories.UserRepository;

import java.util.Collection;
import java.util.List;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	private final UserRepository repository;
	BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public List<User> findAll() {

        return (List<User>) repository.findAll();
    }
	
	public User insert(String name ,String userName ,String password ) {
		User user =new User(name , userName ,bCryptPasswordEncoder.encode(password));
		return repository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return repository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
	}


}
