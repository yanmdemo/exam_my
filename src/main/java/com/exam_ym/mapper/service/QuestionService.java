package com.exam_ym.mapper.service;

import com.exam_ym.mapper.entity.Question;
import com.exam_ym.mapper.entity.QuestionDTO;

import java.util.List;

/**
 * (Question)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 17:31:56
 */
public interface QuestionService {

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    Question queryById(Integer qid);

    List<Question> selectAll();

        List<QuestionDTO> selectAlls();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Question> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    Question insert(Question question);

    /**
     * 修改数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    Question update(Question question);

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer qid);

}