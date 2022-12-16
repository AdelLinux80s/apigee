package com.surgerywaitinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surgerywaitinglist.entity.WaitingList;

public interface WaitingListRepository extends JpaRepository<WaitingList, Long>{

}
