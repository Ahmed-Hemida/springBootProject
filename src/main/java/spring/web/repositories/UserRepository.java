package spring.web.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.web.models.User;

@Repository

public interface  UserRepository extends JpaRepository<User, Long> {
	public Optional< User > findByUsername(String username);

}
