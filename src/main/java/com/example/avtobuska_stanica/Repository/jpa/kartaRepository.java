package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.karta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kartaRepository extends JpaRepository<karta, Integer> {
    @Override
    <S extends karta> S save(S entity);
}
