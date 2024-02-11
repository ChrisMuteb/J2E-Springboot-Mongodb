package com.example.mongospringtut.repository;

import com.example.mongospringtut.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    // by extending MongoRepository you have access to these babies: <S extends T> S insert(S entity);
    //
    //    <S extends T> List<S> insert(Iterable<S> entities);
    //
    //    <S extends T> List<S> findAll(Example<S> example);
    //
    //    <S extends T> List<S> findAll(Example<S> example, Sort sort);
}
