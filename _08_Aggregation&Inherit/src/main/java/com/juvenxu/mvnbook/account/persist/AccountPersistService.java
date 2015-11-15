package com.juvenxu.mvnbook.account.persist;

/**
 * Created by zhujie on 15/11/14.
 */
public interface AccountPersistService {
    Account createAccount(Account account) throws AccountPersistException;

    Account readAccount(String id) throws AccountPersistException;

    Account updateAccount(Account account) throws AccountPersistException;

    void deleteAccount(Account account) throws AccountPersistException;
}
