package potato.jobit.error.exception;

import potato.jobit.error.ErrorCode;

public class UnAuthorizedException extends BusinessException {

  public UnAuthorizedException(String message, ErrorCode errorCode) {
    super(message, errorCode);
  }
}
