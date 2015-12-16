import java.util.ArrayList;

class Group extends User {
    private List<Person> members;

    public Group() {
        members = ArrayList<Person> members;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void addMember(Person p) {
        members.add(p);
    }

    public void removeMember(Person p) {
        members.remove(p);
    }
}
