package TranningjavaSpring.boot.student.service.mapping;

import TranningjavaSpring.boot.student.dto.Request.StudentRequest;
import TranningjavaSpring.boot.student.dto.Response.StudentResponse;
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
}
