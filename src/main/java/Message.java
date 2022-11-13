import java.util.Date;

public class Message {
    private Long ID;
    private User postedBy;
    private String body;
    private Date postedOn;
    public Message(Long ID, User postedBy, String body, Date postedOn) {
        this.ID = ID;
        this.postedBy = postedBy;
        this.body = body;
        this.postedOn = postedOn;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }
}
