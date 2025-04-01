package potato.jobit.error.exception;

import potato.jobit.error.ErrorCode;

public class NotFoundException extends BusinessException {

  public NotFoundException(String message, ErrorCode errorCode) {
    super(message, errorCode);
  }
}
