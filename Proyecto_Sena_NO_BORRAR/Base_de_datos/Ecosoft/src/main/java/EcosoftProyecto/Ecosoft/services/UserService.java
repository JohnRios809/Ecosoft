package EcosoftProyecto.Ecosoft.services;

import EcosoftProyecto.Ecosoft.model.Users;

public interface UserService {
    Users NewUser (Users NewUser);
    Iterable<Users> getAll();
    Users ModifyUser (Users User);
    Boolean DeleteUser (long idUser);
}
