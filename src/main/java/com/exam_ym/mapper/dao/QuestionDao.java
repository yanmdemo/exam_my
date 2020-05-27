package com.exam_ym.mapper.dao;

import com.exam_ym.mapper.entity.Question;
import com.exam_ym.mapper.entity.QuestionDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * (Question)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-25 17:31:56
 */
public interface QuestionDao {

    List<Question> selectAll();

    List<QuestionDTO> selectAlls();

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    Question queryById(Integer qid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Question> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param question 实例对象
     * @return 对象列表
     */
    List<Question> queryAll(Question question);

    /**
     * 新增数据
     *
     * @param question 实例对象
     * @return 影响行数
     */
    int insert(Question question);

    /**
     * 修改数据
     *
     * @param question 实例对象
     * @return 影响行数
     */
    int update(Question question);

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 影响行数
     */
    int deleteById(Integer qid);

}