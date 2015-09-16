package question.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import question.dao.IquestionRepository;
import question.entities.Question;

import java.util.List;

/**
 * Created by frederic on 15/09/15.
 */
@RestController
public class QuestionsController {

    @Autowired
    private IquestionRepository questionRepository;

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/find")
    public String getquestion (){
        Question question=new Question();
        return question.toString();
    }

    @RequestMapping("/findall")
    public List<Question> getquestions (){
        return questionRepository.findAll();
    }

    @RequestMapping("/save")
    public Question setQuestion (Question question){
        question.setIdquestion(2);
        questionRepository.save(question);
        return question;
    }
}
