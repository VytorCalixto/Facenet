import java.util.ArrayList;

class Person extends User {
    private List<Relation> relations;
    private List<Group> groups;

    public Person() {
        relations = new ArrayList<Relation>();
        groups = new ArrayList<Group>();
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addRelation(Relation r) {
        relations.add(r);
    }

    public void joinGroup(Group g) {
        groups.add(g);
    }

    public void leaveGroup(Group g) {
        groups.remove(g);
    }
}
