package com.hu4java.cloud.base.service.impl;

import com.hu4java.cloud.base.mapper.BaseMapper;
import com.hu4java.cloud.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 业务实现
 * @author hu4java
 */
public class AbstractServiceImpl<T, M extends BaseMapper<T>> implements BaseService<T> {

    @Autowired
    protected M mapper;

    @Override
    public void save(T entity) {
        mapper.insert(entity);
    }

    @Override
    public T getById(Long id) {
        return mapper.selectById(id);
    }
}
