package TranningjavaSpring.boot.student.exception;

public class StudentNotFoundException extends StudentServiceException{

    public StudentNotFoundException(){
        super(StudentServiceError.STUDENT_NOT_FOUND);
    }

}
