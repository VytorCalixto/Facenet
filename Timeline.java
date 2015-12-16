import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;

class Timeline implements Observer {
    private List<Publication> publications;

    @override
    public void update(Observable subject, Object arg1) {
        return;
    }

    public void like(Publication p) {
        return;
    }

    public void dislike(Publication p) {
        return;
    }

    public void comment(Publication p, String comment) {
        return;
    }

    public void post(String post) {
        return;
    }
}
