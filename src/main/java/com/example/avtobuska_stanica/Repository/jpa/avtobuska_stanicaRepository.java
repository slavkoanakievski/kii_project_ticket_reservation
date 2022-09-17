package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.avtobuska_stanica;
import com.example.avtobuska_stanica.Model.ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface avtobuska_stanicaRepository extends JpaRepository<avtobuska_stanica, Integer> {

    @Query("SELECT a FROM avtobuska_stanica a WHERE a.id_stanica = :id_stanica")
    public avtobuska_stanica findById_stanica(@Param("id_stanica") Integer id_stanica);
}
