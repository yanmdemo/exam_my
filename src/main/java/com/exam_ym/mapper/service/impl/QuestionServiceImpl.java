package com.exam_ym.mapper.service.impl;

import com.exam_ym.mapper.entity.Question;
import com.exam_ym.mapper.dao.QuestionDao;
import com.exam_ym.mapper.entity.QuestionDTO;
import com.exam_ym.mapper.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Question)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 17:31:56
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
    @Resource
    private QuestionDao questionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    @Override
    public Question queryById(Integer qid) {
        return this.questionDao.queryById(qid);
    }

    @Override
    public List<Question> selectAll() {
        return questionDao.selectAll();
    }

    @Override
    public List<QuestionDTO> selectAlls() {
        return questionDao.selectAlls();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Question> queryAllByLimit(int offset, int limit) {
        return this.questionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    @Override
    public Question insert(Question question) {
        this.questionDao.insert(question);
        return question;
    }

    /**
     * 修改数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    @Override
    public Question update(Question question) {
        this.questionDao.update(question);
        return this.queryById(question.getQid());
    }

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer qid) {
        return this.questionDao.deleteById(qid) > 0;
    }
}