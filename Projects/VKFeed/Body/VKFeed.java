package Body;

import java.util.List;

public class VKFeed {
    List<Post> posts;
    List<Recomends> recomends;

    public VKFeed(List<Post> posts, List<Recomends> recomends) {
        this.posts = posts;
        this.recomends = recomends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Recomends> getRecomends() {
        return recomends;
    }
}
