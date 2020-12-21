package com.yyn1215.myblogs.service.impl;


import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyn1215.myblogs.Exception.NotFoundException;
import com.yyn1215.myblogs.entity.Type;
import com.yyn1215.myblogs.mapper.TypeMapper;
import com.yyn1215.myblogs.service.TypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

    @Override
    public int saveType(Type type) {
        type.setId(IdWorker.get32UUID());
        Boolean result = save(type);
        return result ? 1 : 0;
    }

    @Override
    public Type getType(String id) {
        QueryWrapper<Type> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Type::getId, id);

        Type type = getOne(queryWrapper, Boolean.TRUE);
        if (ObjectUtil.isNull(type)) {
            throw new NotFoundException("type no found！");
        }
        return type;
    }

    @Override
    public List<Type> getAllType() {
        QueryWrapper<Type> queryWrapper = new QueryWrapper<>();
        List<Type> types = list(queryWrapper);
        return types;
    }

    @Override
    public Type getTypeByName(String name,Boolean throwEx) {
        QueryWrapper<Type> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Type::getName, name);

        Type type = getOne(queryWrapper, Boolean.TRUE);
        if (throwEx && ObjectUtil.isNull(type)) {
            throw new NotFoundException("type no found！");
        }
        return type;

    }

    @Override
    public int updateType(Type type) {
        Boolean result = updateById(type);
        return result ? 1 : 0;
    }

    @Override
    public void deleteType(Long id) {
        removeById(id);
    }
}
