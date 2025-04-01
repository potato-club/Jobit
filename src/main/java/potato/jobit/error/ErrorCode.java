package potato.jobit.error;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ErrorCode {
    BAD_REQUEST_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "400 Bad Request"),
    PARAMETER_VALID_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "잘못된 파라미터 값"),
    UNAUTHORIZED_EXCEPTION(HttpStatus.UNAUTHORIZED, "401", "UnAuthorized User"),
    FORBIDDEN_EXCEPTION(HttpStatus.FORBIDDEN, "403", "403 Forbidden"),
    NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "404", "404 Not Found"),
    INTERNAL_SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "500", "500 Server Error"),
    SMS_SENDER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "500", "500 SMS Sender Error"),
    DUPLICATE_PHONE_NUMBER_EXCEPTION(HttpStatus.CONFLICT, "409", "이미 가입된 번호입니다."),
    SMS_VERIFICATION_FAILED_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "인증번호가 일치하지 않습니다."),
    SMS_CODE_EXPIRED_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "인증번호가 만료되었습니다."),
    INVALID_CODE_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "유효하지 않은 코드입니다."),
    DUPLICATE_NICKNAME_EXCEPTION(HttpStatus.BAD_REQUEST, "409", "이미 사용중인 닉네임입니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
