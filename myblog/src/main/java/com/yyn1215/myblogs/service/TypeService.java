package com.yyn1215.myblogs.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yyn1215.myblogs.entity.Type;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
public interface TypeService extends IService<Type> {

    //新增保存分类
    int saveType(Type type);

    //根据id查询分类
    Type getType(Long id);

    //查询所有分类
    List<Type> getAllType();

    //根据分类名称查询分类
    Type getTypeByName(String name);

    //编辑修改分类
    int updateType(Type type);

    //删除分类
    void deleteType(Long id);


}
