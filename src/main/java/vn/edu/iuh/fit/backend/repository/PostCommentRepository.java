package vn.edu.iuh.fit.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.model.PostComment;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}