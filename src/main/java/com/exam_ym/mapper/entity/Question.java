package com.exam_ym.mapper.entity;

import java.io.Serializable;
import java.util.List;
import java.util.ListResourceBundle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (Question)实体类
 *
 * @author makejava
 * @since 2020-05-25 17:31:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Question implements Serializable {
    private static final long serialVersionUID = -37868357038449779L;
    
    private Integer qid;
    //问题
    private String question;
    //问题的答案序号
    private Integer correctanswer;
    /**
     * 0,表示删除,1.表示可用
     */
    private Integer status;
    //方便排序
    private Integer sortnum;

    //一对多需要添加的字段(主页xml中的写法)
    private List<Answers> answers;
}