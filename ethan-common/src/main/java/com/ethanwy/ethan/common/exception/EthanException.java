package com.ethanwy.ethan.common.exception;

/**
 * Ethan异常
 *
 * @author Ethan
 * @date 2018/12/19
 */
public class EthanException extends RuntimeException {

    private static final long serialVersionUID = 599182460328477115L;

    public EthanException() {
        super();
    }

    public EthanException(String message) {
        super(message);
    }

    public EthanException(Throwable cause) {
        super(cause);
    }

    public EthanException(String message, Throwable cause) {
        super(message, cause);
    }
}
