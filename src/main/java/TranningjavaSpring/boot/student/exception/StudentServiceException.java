package TranningjavaSpring.boot.student.exception;

import lombok.Getter;

@Getter
public abstract class StudentServiceException extends RuntimeException{

    private final StudentServiceError studentServiceError;

    private static final long serialVersionUTD = 1L;

   public StudentServiceException(StudentServiceError studentServiceError) {
        super();
        this.studentServiceError = studentServiceError;
    }

    public StudentServiceError getStudentServiceError(){
        return studentServiceError;
    }
}
