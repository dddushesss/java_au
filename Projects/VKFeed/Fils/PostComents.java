package Fils;

public class PostComents {
    String avatarLink;
    String ProfileName;
    String ProfileLink;
    String comentBody;
    int Likes;
    int ComentId;
    int ComentReplyId;

    public PostComents(String avatarLink, String profileName, String profileLink, String comentBody, int likes, int comentId, int comentReplyId) {
        this.avatarLink = avatarLink;
        ProfileName = profileName;
        ProfileLink = profileLink;
        this.comentBody = comentBody;
        Likes = likes;
        ComentId = comentId;
        ComentReplyId = comentReplyId;
    }
}
