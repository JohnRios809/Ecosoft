package EcosoftProyecto.Ecosoft.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EcosoftProyecto.Ecosoft.model.users;
import EcosoftProyecto.Ecosoft.repository.UserRepository;

@Service
public class Users_ServiceImpl implements Users_Service {
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public users newUser(users newUser) {
		// TODO Auto-generated method stub
		return userRepository.save(newUser);
	}

	@Override
	public Iterable<users> getIterable() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	@Override
	public users modifyUsers(users user) {
		// TODO Auto-generated method stub
		Optional<users> userFound = this.userRepository.findById(user.getId_user());

		if (userFound.isPresent()) {
			users existingUser  = userFound.get();
			existingUser.setNom_user(user.getNom_user());
			existingUser.setApellido(user.getApellido());
			existingUser.setEmail(user.getEmail());
			return this.newUser(existingUser);
		
						
		}
		return null;
	}

	@Override
	public Boolean deleteUser(Long id) {
		this.userRepository.deleteById(id);
		
		return true;
		// TODO Auto-generated method stub	
	}
	
}
			
	
	
	
	


