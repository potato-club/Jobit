package potato.jobit.error;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ErrorEntity {

    private final String errorCode;
    private final String errorMessage;

    @Builder
    public ErrorEntity(HttpStatus httpStatus, String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
