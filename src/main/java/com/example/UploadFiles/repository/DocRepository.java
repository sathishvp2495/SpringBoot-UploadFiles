package com.example.UploadFiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UploadFiles.model.Doc;

public interface DocRepository  extends JpaRepository<Doc,Integer>{

}
