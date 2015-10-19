package com.juvenxu.mvnbook.account.email;

/**
 * Created by zhujie on 15/10/17.
 */
public interface AccountEmailService {
    void sendMail(String to, String subject, String htmlText) throws AccountEmailException;
}
