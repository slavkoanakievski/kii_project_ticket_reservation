package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.Composite_Keys.profit_spored_mesec_i_godina_composite_key;
import com.example.avtobuska_stanica.Model.Views.profit_spored_mesec_i_godina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface profit_spored_mesec_i_godina_Repository  extends JpaRepository<profit_spored_mesec_i_godina,
        profit_spored_mesec_i_godina_composite_key>
{
    @Override
    List<profit_spored_mesec_i_godina> findAll();
}
