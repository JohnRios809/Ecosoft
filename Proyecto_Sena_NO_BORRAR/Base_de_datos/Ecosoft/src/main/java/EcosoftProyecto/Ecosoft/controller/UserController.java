package EcosoftProyecto.Ecosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EcosoftProyecto.Ecosoft.model.Users;
import EcosoftProyecto.Ecosoft.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/nuevo")
	public Users NewUser(@RequestBody Users User) {
		return this.userService.NewUser(User);
		
	}
	
	@GetMapping("/mostrar")
	public Iterable<Users> getAll(){
		return userService.getAll();
	}
	
	@PostMapping("/modificar")
	public Users ModifyUser(@RequestBody Users User) {
		return this.userService.ModifyUser(User);
	}
	
	@PostMapping(value="/{id}")
	public Boolean deleteUser(@PathVariable(value="id") Long id) {
		return this.userService.DeleteUser(id);
	}
}