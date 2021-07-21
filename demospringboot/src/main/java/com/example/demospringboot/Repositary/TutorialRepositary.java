package com.example.demospringboot.Repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demospringboot.Model.Tutorial;

@Repository
public interface TutorialRepositary extends CrudRepository<Tutorial,Long> {
	

}
