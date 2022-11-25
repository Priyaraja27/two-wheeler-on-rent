package com.example.feedback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.feedback.entites.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, String> {

}