import java.util.Calendar;

class Publication {
    private String content;
    private PublicationType type;
    private List<Publication> related;
    private Calendar postDate;
    private User owner;

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
}
