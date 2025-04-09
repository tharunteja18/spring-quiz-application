package com.nerchuko.quizapp.Controller;


import com.nerchuko.quizapp.Model.Question;
import com.nerchuko.quizapp.Model.Quiz;
import com.nerchuko.quizapp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }


    @GetMapping("category/{cate}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("cate") String category)
    {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("addQuestion")
    public String addQuestion(@RequestBody Question question)
    {
        return questionService.addQuestion(question);
    }

}
