package TranningjavaSpring.boot.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.UUID;

@Table(name = "student")
@Entity
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private int age;
    private String studentCode;
    private String hometown;
    @PrePersist
    public void init() {
        this.id = Objects.isNull(this.id) ? UUID.randomUUID().toString() : this.id;
    }
    public StudentEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", studentCode='" + studentCode + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
