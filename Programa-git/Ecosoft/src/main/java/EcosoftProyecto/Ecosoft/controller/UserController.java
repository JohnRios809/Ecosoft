package EcosoftProyecto.Ecosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import EcosoftProyecto.Ecosoft.model.users;
import EcosoftProyecto.Ecosoft.service.Users_Service;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private Users_Service userService;
	
	@PostMapping("/nuevo")

	public users newUser(@RequestBody users user) {
		return this.userService.newUser(user);
		
	}
	@GetMapping("/mostrar")
	public Iterable<users> getAll() {
		return userService.getIterable();
	}
	
	@PostMapping("/modificar")
	public users modifyUsers (@RequestBody users user) {
		return this.userService.modifyUsers(user);
		
	}
	@PostMapping("/id/{id}")
	public Boolean deleteUser(@PathVariable("id")Long id) {
		return this.userService.deleteUser(id);
	}
	
}
