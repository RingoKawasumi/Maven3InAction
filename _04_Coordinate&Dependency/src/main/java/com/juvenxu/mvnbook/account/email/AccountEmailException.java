package com.juvenxu.mvnbook.account.email;

/**
 * Created by zhujie on 15/10/17.
 */
public class AccountEmailException extends Exception {
    public AccountEmailException() {
    }

    public AccountEmailException(String message) {
        super(message);
    }

    public AccountEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountEmailException(Throwable cause) {
        super(cause);
    }
}
