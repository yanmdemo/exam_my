package com.exam_ym.mapper.service.impl;

import com.exam_ym.mapper.entity.Answers;
import com.exam_ym.mapper.dao.AnswersDao;
import com.exam_ym.mapper.service.AnswersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Answers)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 17:31:53
 */
@Service("answersService")
public class AnswersServiceImpl implements AnswersService {
    @Resource
    private AnswersDao answersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    @Override
    public Answers queryById(Integer aid) {
        return this.answersDao.queryById(aid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Answers> queryAllByLimit(int offset, int limit) {
        return this.answersDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param answers 实例对象
     * @return 实例对象
     */
    @Override
    public Answers insert(Answers answers) {
        this.answersDao.insert(answers);
        return answers;
    }

    /**
     * 修改数据
     *
     * @param answers 实例对象
     * @return 实例对象
     */
    @Override
    public Answers update(Answers answers) {
        this.answersDao.update(answers);
        return this.queryById(answers.getAid());
    }

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer aid) {
        return this.answersDao.deleteById(aid) > 0;
    }
}