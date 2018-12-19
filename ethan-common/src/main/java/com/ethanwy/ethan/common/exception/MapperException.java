package com.ethanwy.ethan.common.exception;

/**
 * Mapper异常
 *
 * @author Ethan
 * @date 2018/12/19
 */
public class MapperException extends EthanException {

    private static final long serialVersionUID = -7915493738122253940L;

    public MapperException() {
        super();
    }

    public MapperException(String message) {
        super(message);
    }

    public MapperException(Throwable cause) {
        super(cause);
    }

    public MapperException(String message, Throwable cause) {
        super(message, cause);
    }
}
