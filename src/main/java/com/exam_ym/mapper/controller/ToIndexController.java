package com.exam_ym.mapper.controller;

import com.exam_ym.mapper.entity.Question;
import com.exam_ym.mapper.entity.QuestionDTO;
import com.exam_ym.mapper.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ToIndexController
 * @Description: TODO
 * @Author YanM
 * @Date 2020/5/25
 * @Version V1.0
 */
@RestController
public class ToIndexController {

    @Resource
    private QuestionService questionService;

    @GetMapping("index")
    public Map<String,List<Question>> toIndex(){

        Map<String,List<Question>> map=new HashMap<>();

        List<Question> questions = questionService.selectAll();

        map.put("questions",questions);
        System.out.println(questions);

        return map;
    }
}
