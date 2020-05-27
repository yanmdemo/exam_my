package com.exam_ym.mapper.service;

import com.exam_ym.mapper.entity.Answers;
import java.util.List;

/**
 * (Answers)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 17:31:53
 */
public interface AnswersService {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Answers queryById(Integer aid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Answers> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param answers 实例对象
     * @return 实例对象
     */
    Answers insert(Answers answers);

    /**
     * 修改数据
     *
     * @param answers 实例对象
     * @return 实例对象
     */
    Answers update(Answers answers);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer aid);

}