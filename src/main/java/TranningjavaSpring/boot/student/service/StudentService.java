package TranningjavaSpring.boot.student.service;

import TranningjavaSpring.boot.student.dto.Request.CourseRequest;
import TranningjavaSpring.boot.student.dto.Request.StudentRequest;
import TranningjavaSpring.boot.student.dto.Response.CourseResponse;
import TranningjavaSpring.boot.student.dto.Response.StudentResponse;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    StudentResponse getById(String id);

    StudentResponse update(StudentRequest request, String id);

    void deleteById(String id);
    CourseResponse create(CourseRequest request);
    CourseResponse update(CourseRequest request, String id);
}
