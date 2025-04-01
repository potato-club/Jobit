package potato.jobit.error.exception;

import potato.jobit.error.ErrorCode;

public class BadRequestException extends BusinessException {

  public BadRequestException(String message, ErrorCode errorCode) {
    super(message, errorCode);
  }
}
