package vn.edu.iuh.fit.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}