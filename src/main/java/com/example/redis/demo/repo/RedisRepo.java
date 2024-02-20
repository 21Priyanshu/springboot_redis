package com.example.redis.demo.repo;

import org.springframework.stereotype.Repository;
import com.example.redis.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RedisRepo extends CrudRepository<Student, String> {

}
