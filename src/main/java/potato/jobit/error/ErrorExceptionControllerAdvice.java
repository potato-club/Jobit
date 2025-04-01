package potato.jobit.error;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import potato.jobit.error.exception.BadRequestException;
import potato.jobit.error.exception.NotFoundException;
import potato.jobit.error.exception.UnAuthorizedException;

@RequiredArgsConstructor
@RestControllerAdvice
public class ErrorExceptionControllerAdvice {

  @ExceptionHandler({BadRequestException.class})
  public ResponseEntity<ErrorEntity> exceptionHandler(final BadRequestException e) {
    return ResponseEntity.status(e.getErrorCode().getStatus())
        .body(
            ErrorEntity.builder()
                .errorCode(e.getErrorCode().getCode())
                .errorMessage(e.getMessage())
                .build());
  }

  @ExceptionHandler({UnAuthorizedException.class})
  public ResponseEntity<ErrorEntity> exceptionHandler(final UnAuthorizedException e) {
    return ResponseEntity.status(e.getErrorCode().getStatus())
        .body(
            ErrorEntity.builder()
                .errorCode(e.getErrorCode().getCode())
                .errorMessage(e.getMessage())
                .build());
  }

  @ExceptionHandler({NotFoundException.class})
  public ResponseEntity<ErrorEntity> exceptionHandler(final NotFoundException e) {
    return ResponseEntity.status(e.getErrorCode().getStatus())
        .body(
            ErrorEntity.builder()
                .errorCode(e.getErrorCode().getCode())
                .errorMessage(e.getMessage())
                .build());
  }
  
}
