import java.util.Calendar;

class Relation {
    private short affinity;
    private RelationType type;
    private Calendar startDate;
    private Calendar endDate;

    public Relation() {
        startDate = Calendar.getInstance();
    }

    public short getAffinity() {
        return affinity;
    }

    public RelationType getType() {
        return type;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setAffinity(short affinity) {
        this.affinity = affinity;
    }

    public void setType(RelationType type) {
        this.type = type;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }
}
