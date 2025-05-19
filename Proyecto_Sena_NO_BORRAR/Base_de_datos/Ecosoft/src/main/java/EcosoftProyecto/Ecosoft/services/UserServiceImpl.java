package EcosoftProyecto.Ecosoft.services;

import EcosoftProyecto.Ecosoft.model.Users;
import EcosoftProyecto.Ecosoft.repository.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository usersRepository;

    @Override
    public Users NewUser(Users newUser) {
        return usersRepository.save(newUser);
    }

    @Override
    public Iterable<Users> getAll() {
        return this.usersRepository.findAll();
    }

    @Override
    public Users ModifyUser(Users User) {
    	
    	Optional<Users> userFound=this.usersRepository.findById(User.getIdUser());
    	if(userFound.get()!=null) {
    		userFound.get().setUsername(User.getUsername());
    		userFound.get().setLastName(User.getLastName());
    		userFound.get().setEmail(User.getEmail());
    		return this.NewUser(userFound.get());
    	}
    	
        return null;
    }

    @Override
    public Boolean DeleteUser(long IdUser) {
        this.usersRepository.deleteById(IdUser);
        return true;
    }
}
