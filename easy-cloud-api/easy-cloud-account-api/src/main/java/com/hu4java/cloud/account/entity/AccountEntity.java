package com.hu4java.cloud.account.entity;

import com.hu4java.cloud.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 账号类
 * @author hu4java
 */
@Getter
@Setter
public class AccountEntity extends BaseEntity {
    private static final long serialVersionUID = -471881447608308006L;

    private String account;

    private String mobile;

    private String email;

    private String password;

    private String name;
}
