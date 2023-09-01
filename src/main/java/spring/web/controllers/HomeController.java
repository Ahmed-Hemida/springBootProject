package spring.web.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.web.models.User;
import spring.web.services.UserService;

@RestController
public class HomeController {
	 private final UserService userService;
	 
	public HomeController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/home")
	public String home () {
		return "hello world";
	}
	@GetMapping("/login")
	public String login () {
		return "/login";
	}
	@GetMapping("/logout")
	public String logout () {
		return "/logout";
	}
	@GetMapping("/create/user")
//	public String CtreateUser(@RequestParam String name,@RequestParam String username,@RequestParam String password) {
	public Object CtreateUser(@RequestParam Map<String,String> Params) {	
		Object user = this.userService.insert(Params.get("name"), Params.get("username"),Params.get("password"));
		return user;
	}
	
	@GetMapping("/all/user")
	public List<User> getAllUser () {
		return this.userService.findAll();
		 
	}
	

}
