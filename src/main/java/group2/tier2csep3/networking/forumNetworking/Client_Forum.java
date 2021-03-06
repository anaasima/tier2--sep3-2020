package group2.tier2csep3.networking.forumNetworking;

import group2.tier2csep3.model.forum.comments.Comment;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.report.Report;
import group2.tier2csep3.model.rating.RatingBuild;
import group2.tier2csep3.model.rating.RatingComponent;
import group2.tier2csep3.model.rating.RatingPost;

import java.util.List;

public interface Client_Forum {
    List<Post> getAllPosts();

    void addPost(Post post);

    void giveRating(RatingPost ratingPost);

    void addComment(Comment comment);

    void savePost(Post post, int id);

    void deletePost(int id);

    void report(Report report);

    void deleteReport(int id);

    List<Report> getAllReports();

    List<RatingPost> getAllPostRatings(int id);

    void editPost(Post post);

    List<Post> getPostByUserId(int userId);

    List<Post> getSavedPosts(int userId);
}
