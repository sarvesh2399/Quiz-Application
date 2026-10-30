package com.ssp.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssp.quizapp.Question;
import com.ssp.quizapp.dao.QuestionDao;

@Service 
public class QuestionService {

    @Autowired 
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();    
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Success";

    }

    public String deleteById(int id) {
        questionDao.deleteById(id);
        return "Deleted";

    }
  
}
