package vn.edu.iuh.fit.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String firstName;
    @Column(length = 50)
    private String middleName;
    @Column(length = 50)
    private String lastName;
    @Column(length = 15)
    private String mobile;
    @Column(length = 50)
    private String email;
    @Column(length = 64, nullable = false)
    private String passwordHash;

    private Instant registeredAt;
    private Instant lastLogin;
    @Lob
    private String intro;
    @Column(columnDefinition = "text")
    private String profile;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "user")
    private Set<PostComment> comments;
    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "author")
    private Set<Post> posts;


    public void addPostComment(PostComment postComment) {
        if (this.comments == null) {
            this.comments = new HashSet<>();
        }
        this.comments.add(postComment);
        postComment.setUser(this);
    }

    public void addPost(Post post) {
        if (this.posts == null) {
            this.posts = new HashSet<>();
        }
        this.posts.add(post);
        post.setAuthor(this);
    }

}
