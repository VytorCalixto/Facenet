import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

class Publication {
    private String content;
    private PublicationType type;
    private List<Publication> related;
    private Calendar postDate;
    private User owner;

    public Publication() {
        related = new ArrayList<Publication>();
        postDate = Calendar.getInstance();
    }

    public Publication(PublicationType type, User owner, String content) {
        related = new ArrayList<Publication>();
        postDate = Calendar.getInstance();
        this.type = type;
        this.owner = owner;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public PublicationType getType() {
        return type;
    }

    public List<Publication> getRelated() {
        return related;
    }

    public Calendar getPostDate() {
        return postDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(PublicationType type) {
        this.type = type;
    }

    public void addRelated(Publication r) {
        related.add(r);
    }

    public void setPostDate(Calendar postDate) {
        this.postDate = postDate;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int countLikes() {
        int likes = 0;
        for(Publication p : related) {
            if(p.type == PublicationType.LIKE) {
                ++likes;
            }
        }
        return likes;
    }

    public int countDislikes() {
        int dislikes = 0;
        for(Publication p : related) {
            if(p.type == PublicationType.DISLIKE) {
                ++dislikes;
            }
        }
        return dislikes;
    }
}
