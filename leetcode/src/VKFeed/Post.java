package VKFeed;

import java.util.List;

public class Post {
    String PublicName;
    String PublicLink;
    String PostBodyText;
    List<Insertion> insertions;
    int LikesCount;
    int ComentsCount;
    int RepostsCount;
    List<PostComents> coments;

    public Post(String publicName, String publicLink, String postBodyText, List<Insertion> insertions, int likesCount, int comentsCount, int repostsCount, List<PostComents> coments) {
        PublicName = publicName;
        PublicLink = publicLink;
        PostBodyText = postBodyText;
        this.insertions = insertions;
        LikesCount = likesCount;
        ComentsCount = comentsCount;
        RepostsCount = repostsCount;
        this.coments = coments;
    }
}
