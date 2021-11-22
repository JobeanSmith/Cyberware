package com.spring.henallux.cyberware.dataAccess.repository;

import com.spring.henallux.cyberware.dataAccess.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {}