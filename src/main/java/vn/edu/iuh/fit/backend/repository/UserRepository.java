package vn.edu.iuh.fit.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

}