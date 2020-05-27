package com.exam_ym.mapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @ClassName QuestionDTO
 * @Description: TODO
 * @Author YanM
 * @Date 2020/5/25
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class QuestionDTO {

    private static final long serialVersionUID = -37868357038449779L;

    //问题
    private String question;
    //问题的答案序号
    private Integer correctanswer;

    //一对多需要添加的字段(主页xml中的写法)
    private List<Answers> answers;

}
