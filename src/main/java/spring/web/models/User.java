package spring.web.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.apache.catalina.startup.UserDatabase;

@Entity
@Table(name = "Users")
public class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;

	private String UserName;

	private String Password;
	
	public User() {
		
	}
	public User( String name, String userName, String password) {
		
		this.name = name;
		this.UserName = userName;
		this.Password = password;
	}
	public User(Long id, String name, String userName, String password) {
		
		this.id = id;
		this.name = name;
		this.UserName = userName;
		this.Password = password;
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Password);
	}

	

}
