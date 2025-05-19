package EcosoftProyecto.Ecosoft.repository;


import EcosoftProyecto.Ecosoft.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}