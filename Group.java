import java.util.List;
import java.util.ArrayList;

class Group extends User {
    private List<Person> members;

    public Group() {
        super();
        members = new ArrayList<Person>();
    }

    public Group(String name, String login) {
        super();
        members = new ArrayList<Person>();
        this.name = name;
        this.login = login;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void addMember(Person p) {
        members.add(p);
        this.addObserver(p.timeline);
    }

    public void removeMember(Person p) {
        members.remove(p);
        this.deleteObserver(p.timeline);
    }
}
