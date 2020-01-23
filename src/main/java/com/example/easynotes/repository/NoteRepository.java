package com.example.easynotes.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	
}
