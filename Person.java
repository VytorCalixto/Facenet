import java.util.ArrayList;
import java.util.List;

class Person extends User {
    private List<Relation> relations;
    private List<Group> groups;

    public Person() {
        super();
        relations = new ArrayList<Relation>();
        groups = new ArrayList<Group>();
    }

    public Person(String name, String login) {
        super();
        relations = new ArrayList<Relation>();
        groups = new ArrayList<Group>();
        this.name = name;
        this.login = login;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addRelation(Relation r) {
        relations.add(r);
        r.getUser().addObserver(this.timeline);
    }

    public void removeRelation(Relation r) {
        relations.remove(r);
        r.getUser().deleteObserver(this.timeline);
    }

    public void joinGroup(Group g) {
        groups.add(g);
        g.addMember(this);
    }

    public void leaveGroup(Group g) {
        groups.remove(g);
        g.removeMember(this);
    }
}
