package com.ethanwy.ethan.common.base;

import java.util.List;

/**
 * 通用Mapper
 *
 * @author Ethan
 * @date 2018/12/18
 */
public interface BaseMapper<E extends AbstractEntity> {

    /**
     * 新增
     *
     * @param record 记录
     * @return
     */
    int insertRecord(E record);

    /**
     * 批量新增
     *
     * @param records 记录
     * @return
     */
    int insertRecords(List<E> records);

    /**
     * 删除
     *
     * @param id 主键
     * @return
     */
    int deleteById(Long id);


    /**
     * 批量删除
     *
     * @param ids 主键列表
     * @return
     */
    int deleteByIds(List<Long> ids);

    /**
     * 更新
     *
     * @param record 记录
     * @return
     */
    int updateRecord(E record);

    /**
     * 批量更新
     *
     * @param records 记录
     * @return
     */
    int updateRecords(List<E> records);

    /**
     * 查找所有
     *
     * @return
     */
    List<E> selectAll();

    /**
     * 根据主键查找
     *
     * @param id 主键
     * @return
     */
    E selectById(Long id);

    /**
     * 根据属性查找符合记录
     *
     * @param record 记录
     * @return
     */
    List<E> selectByAttribute(E record);

}
