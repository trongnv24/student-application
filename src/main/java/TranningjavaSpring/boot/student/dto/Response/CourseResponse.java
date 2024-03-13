package TranningjavaSpring.boot.student.dto.Response;

public class CourseResponse {
    private String id;
    private String title;

    public CourseResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CourseResponse{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
