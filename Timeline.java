import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Timeline implements Observer {
    private List<Publication> publications;
    private User user;

    public Timeline() {
        publications = new ArrayList<Publication>();
    }

    public Timeline(User user) {
        publications = new ArrayList<Publication>();
        this.user = user;
    }

    public void update(Observable subject, Object arg1) {
        if(subject instanceof User) {
            User u = (User) subject;
            for(Publication p: u.getPublications()) {
                if(!publications.contains(p)) {
                    publications.add(p);
                }
            }
            printTimeline();
        }
    }

    public void printTimeline() {
        System.out.println(" --- Timeline de " + user.getName() + " --- ");
        List<Publication> reverse = new ArrayList<Publication>(publications);
        Collections.reverse(reverse);
        for (Publication p : reverse) {
            System.out.println("------------------------------------------------------");
            if(p.getType() == PublicationType.PENSAMENTO) {
                System.out.println(p.getOwner().getName() + " disse: ");
                System.out.println(p.countLikes() + " curtiram. " + p.countDislikes() + " não curtiram.");
                System.out.println(p.getContent());
                for(Publication related : p.getRelated()) {
                    if(related.getType() == PublicationType.COMENTARIO) {
                        System.out.println("\t" + related.getOwner().getName() + " comentou: " + related.getContent());
                    }
                }
            } else {
                System.out.println(p.getOwner().getName() + " " + p.getContent());

            }
            System.out.println("------------------------------------------------------");
        }
        System.out.println("\n\n");
    }

    public void like(Publication p) {
        p.addRelated(new Publication(PublicationType.LIKE, user, null));
        user.addPublication(new Publication(PublicationType.LIKE, user, "curtiu uma publicação de " + p.getOwner().getName()));
    }

    public void dislike(Publication p) {
        p.addRelated(new Publication(PublicationType.DISLIKE, user, null));
        user.addPublication(new Publication(PublicationType.DISLIKE, user, "não curtiu uma publicação de " + p.getOwner().getName()));
    }

    public void comment(Publication p, String comment) {
        p.addRelated(new Publication(PublicationType.COMENTARIO, user, comment));
        user.addPublication(new Publication(PublicationType.COMENTARIO, user, "comentou uma publicação de " + p.getOwner().getName()));
    }

    public void post(String post) {
        Publication p = new Publication(PublicationType.PENSAMENTO, user, post);
        user.addPublication(p);
        if(!publications.contains(p)) {
            publications.add(p);
        }
    }

    public void post(Publication p) {
        user.addPublication(p);
        if(!publications.contains(p)) {
            publications.add(p);
        }
    }
}
