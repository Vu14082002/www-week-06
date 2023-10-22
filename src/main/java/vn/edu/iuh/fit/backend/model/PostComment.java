package vn.edu.iuh.fit.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "post_comment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "postId")
    private Post post;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "parentId")
    private PostComment parent;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "userId")
    private User user;
    @Column(length = 100)
    private String title;
    @Lob
    private Boolean published;
    private Instant publishedAt;
    private Instant createAt;
    @Column(columnDefinition = "text")
    private String content;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent")
    private Set<PostComment> postCommentSets;


    public void addPostCommentSets(PostComment postComment) {
        if (this.postCommentSets == null) {
            this.postCommentSets = new HashSet<>();
        }
        this.postCommentSets.add(postComment);
        postComment.setParent(this);
    }
}
