package com.vinay.programmer.repo;

import org.springframework.data.repository.CrudRepository;

import com.vinay.programmer.entity.Programmer;

public interface ProgrammerRepo extends CrudRepository<Programmer, Integer> {


}
