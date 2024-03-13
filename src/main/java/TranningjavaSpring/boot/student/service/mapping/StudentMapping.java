package TranningjavaSpring.boot.student.service.mapping;

import TranningjavaSpring.boot.student.dto.Request.CourseRequest;
import TranningjavaSpring.boot.student.dto.Request.StudentRequest;
import TranningjavaSpring.boot.student.dto.Response.CourseResponse;
import TranningjavaSpring.boot.student.dto.Response.StudentResponse;
import TranningjavaSpring.boot.student.entity.CourseEntity;
import TranningjavaSpring.boot.student.entity.StudentEntity;

public class StudentMapping {

    public static StudentEntity convertDtoToEntity(StudentRequest dto){
        StudentEntity entity = new StudentEntity();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setStudentCode(dto.getStudentCode());
        entity.setHometown(dto.getHometown());
        return entity;
    }
    public static StudentResponse convertEntityToStudentResponse(StudentEntity entity){
        StudentResponse dto = new StudentResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        dto.setHometown(entity.getHometown());
        dto.setStudentCode(entity.getStudentCode());
        return dto;
    }
    public static CourseEntity convertDtoToCourseEntity(CourseRequest dto){
        CourseEntity entity = new CourseEntity();
        entity.setTitle(dto.getTitle());
        return entity;
    }
    public static CourseResponse covertCourseEntityToCourseResponse(CourseEntity entity){
        CourseResponse dto = new CourseResponse();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        return dto;
    }
}
