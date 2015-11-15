package com.juvenxu.mvnbook.account.persist;

/**
 * Created by zhujie on 15/11/14.
 */
public class AccountPersistException extends Exception {
    public AccountPersistException() {
    }

    public AccountPersistException(String message) {
        super(message);
    }

    public AccountPersistException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountPersistException(Throwable cause) {
        super(cause);
    }
}
