package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.entity.Account;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Account account) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(Integer id) {
        return null;
    }
}
