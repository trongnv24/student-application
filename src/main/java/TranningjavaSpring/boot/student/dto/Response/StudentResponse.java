package TranningjavaSpring.boot.student.dto.Response;

import TranningjavaSpring.boot.student.dto.Request.StudentRequest;

public class StudentResponse extends StudentRequest {

    private String id ;

    public StudentResponse() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentCode='" + getStudentCode() + '\'' +
                ", hometown='" + getHometown() + '\'' +
                '}';
    }
}
