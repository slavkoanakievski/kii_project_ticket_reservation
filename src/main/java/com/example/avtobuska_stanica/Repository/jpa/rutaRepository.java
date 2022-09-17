package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface rutaRepository extends JpaRepository<ruta, Integer > {

    @Query("SELECT a FROM ruta a WHERE a.id_ruta = :id_ruta")
    public ruta findById_ruta(@Param("id_ruta") Integer id_ruta);



}
