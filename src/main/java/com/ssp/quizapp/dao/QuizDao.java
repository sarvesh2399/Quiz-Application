package com.ssp.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssp.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
