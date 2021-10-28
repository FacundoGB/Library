package com.Excercise1.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Excercise1.app.Entity.PublisherEntity;

@Repository
public interface PublisherRepo extends JpaRepository<PublisherEntity, String>{

}
