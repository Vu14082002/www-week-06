package vn.edu.iuh.fit.backend.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.model.User;
import vn.edu.iuh.fit.backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository dao;

    public Optional<User> findById(Long id) {
        return dao.findById(id);
    }

    public List<User> findALl() {
        return dao.findAll();
    }
    public User save(User user){
        return dao.save(user);
    }
    public void update(User user){
        dao.update()
    }

}
