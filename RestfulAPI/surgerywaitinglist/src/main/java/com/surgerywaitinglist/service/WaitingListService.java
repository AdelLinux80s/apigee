package com.surgerywaitinglist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surgerywaitinglist.entity.WaitingList;
import com.surgerywaitinglist.exception.WaitingListNotFoundException;
import com.surgerywaitinglist.repository.WaitingListRepository;

@Service
public class WaitingListService {

	@Autowired
	private WaitingListRepository waitingListRepo;

	public List<WaitingList> waitinglistGetAll() {
		
		return waitingListRepo.findAll();
	}

	public WaitingList waitingListGetOne(Long waitingListId) {
		return waitingListRepo.findById(waitingListId).orElseThrow(() -> new WaitingListNotFoundException(waitingListId));
	}

	public WaitingList waitingListAddOne(WaitingList waitingList) {
		return waitingListRepo.save(waitingList);
	}

	public WaitingList waitingListPutOne(WaitingList waitingList) {
		return waitingListRepo.save(waitingList);
	}

	

	public WaitingList waitingListDeleteOne(Long waitingListId) {
		
		WaitingList waitingList = waitingListRepo.findById(waitingListId).orElseThrow(() -> new WaitingListNotFoundException(waitingListId));
		waitingListRepo.delete(waitingList);
		return waitingList;
	}
	
	
}
