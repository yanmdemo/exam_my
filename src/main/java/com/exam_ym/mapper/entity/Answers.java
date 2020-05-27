package com.exam_ym.mapper.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (Answers)实体类
 *
 * @author makejava
 * @since 2020-05-25 17:31:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Answers implements Serializable {
    private static final long serialVersionUID = 343962058006018745L;

    //选项id
    private Integer aid;
    //选项的信息
    private String answer;
    //方便用于排序的添加字段
    private Integer sortnum;
    /**
    * 0,删除;1,正常
    */
    private Integer status;
    //外键
    private Integer qid;
}