package com.example.springbootsuperheroes.superheroes.antiHero.repository;

import com.example.springbootsuperheroes.superheroes.antiHero.entity.AntiHeroEntity;
import org.springframework.data.repository.CrudRepository;


public interface AntiHeroRepository extends CrudRepository<AntiHeroEntity, Long> {
}
