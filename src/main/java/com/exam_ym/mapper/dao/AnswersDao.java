package com.exam_ym.mapper.dao;

import com.exam_ym.mapper.entity.Answers;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Answers)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-25 17:31:52
 */
public interface AnswersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Answers queryById(Integer aid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Answers> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param answers 实例对象
     * @return 对象列表
     */
    List<Answers> queryAll(Answers answers);

    /**
     * 新增数据
     *
     * @param answers 实例对象
     * @return 影响行数
     */
    int insert(Answers answers);

    /**
     * 修改数据
     *
     * @param answers 实例对象
     * @return 影响行数
     */
    int update(Answers answers);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 影响行数
     */
    int deleteById(Integer aid);

}