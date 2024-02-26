package TranningjavaSpring.boot.student.exception;

import lombok.Getter;

@Getter
public enum StudentServiceError  {
    STUDENT_NOT_FOUND(404, "id không tồn tại");
    private final int errorCode;
    private final String errorMessage;

    StudentServiceError(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
