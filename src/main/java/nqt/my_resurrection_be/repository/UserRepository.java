package nqt.my_resurrection_be.repository;

import nqt.my_resurrection_be.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

