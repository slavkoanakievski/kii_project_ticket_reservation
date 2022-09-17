package com.example.avtobuska_stanica.Service;

import com.example.avtobuska_stanica.Model.patnik;

import java.util.List;
import java.util.Optional;

public interface patnikService {

    Optional<patnik> findById(String s);

    List<patnik> findAll();

    <S extends patnik> S save(S entity);

}
