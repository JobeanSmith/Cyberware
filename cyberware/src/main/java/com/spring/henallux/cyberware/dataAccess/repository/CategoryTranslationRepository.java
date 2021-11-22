package com.spring.henallux.cyberware.dataAccess.repository;

import com.spring.henallux.cyberware.dataAccess.entity.CategoryTranslationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTranslationRepository extends JpaRepository<CategoryTranslationEntity, Integer> {}