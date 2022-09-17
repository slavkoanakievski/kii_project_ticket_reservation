package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.patnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface patnikRepository extends JpaRepository<patnik, String> {
    @Override
    Optional<patnik> findById(String s);

    @Override
    List<patnik> findAll();

    @Override
    <S extends patnik> S save(S entity);

}
