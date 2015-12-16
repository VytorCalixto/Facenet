import java.util.Observable;
import java.util.Calendar;
import java.util.ArrayList;

abstract class User extends Observable {
    protected String name;
    protected String login;
    protected Calendar createdAt;
    protected List<Publication> publications;
    protected Timeline timeline;

    public User() {
        this.createdAt = Calendar.getInstance();
        publications = new ArrayList<Publication>();
    }

    @Override
    public void update(Observable subject, Object arg1) {
        return;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void addPublication(Publication p) {
        publications.add(p);
    }
}
