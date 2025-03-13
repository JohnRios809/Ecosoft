package EcosoftProyecto.Ecosoft.service;

import EcosoftProyecto.Ecosoft.model.users;

public interface Users_Service {
	users newUser (users newUser);
	Iterable<users> getIterable();
	users modifyUsers (users user);
	Boolean deleteUser (Long email);

}
