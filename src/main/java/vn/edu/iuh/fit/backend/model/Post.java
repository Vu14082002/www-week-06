package vn.edu.iuh.fit.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "authorId", nullable = false)
    private User author;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "parentId")
    private Post parent;

    @Column(length = 75, nullable = false)
    private String title;

    @Column(length = 100)
    private String metaTitle;

    @Column(columnDefinition = "tinyText")
    private String summary;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean published;

    @Column(name = "create_at", nullable = false)
    private Instant createAt;

    private Instant publishedAt;

    private Instant updateAt;

    @Column(columnDefinition = "TEXT")
    private String content;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private Set<PostComment> postCommentSets;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.REFRESH}, mappedBy = "parent")
    private Set<Post> posts;

    public Post(User author, String title, String mediaTitle, String summary, Boolean published, Instant createAt, String content) {
        this.author = author;
        this.title = title;
        this.metaTitle = mediaTitle;
        this.summary = summary;
        this.published = published;
        this.createAt = createAt;
        this.content = content;
    }

    public void addPostCommentSets(PostComment postComment) {
        if (this.postCommentSets == null) {
            this.postCommentSets = new HashSet<>();
        }
        this.postCommentSets.add(postComment);
        postComment.setPost(this);
    }

    public void addPost(Post post) {
        if (this.posts == null) {
            this.posts = new HashSet<>();
        }
        this.posts.add(post);
        post.setParent(this);
    }
}
