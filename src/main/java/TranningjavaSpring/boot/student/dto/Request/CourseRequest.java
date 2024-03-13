package TranningjavaSpring.boot.student.dto.Request;

public class CourseRequest {
    private String title;

    public CourseRequest() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CourseRequest{" +
                "title='" + title + '\'' +
                '}';
    }
}
