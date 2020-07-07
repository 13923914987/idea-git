package com.itheima.dao;

import com.itheima.entity.Account;

import java.util.List;

public interface AccountDao {
    void save(Account account);
    void update(Account account);
    void delete(Integer id);

    List<Account> findAll();
    Account findById(Integer id);
}