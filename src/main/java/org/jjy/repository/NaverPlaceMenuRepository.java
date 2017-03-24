package org.jjy.repository;

import org.jjy.entity.NaverPlaceMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaverPlaceMenuRepository  extends JpaRepository<NaverPlaceMenuEntity, Integer>{}
