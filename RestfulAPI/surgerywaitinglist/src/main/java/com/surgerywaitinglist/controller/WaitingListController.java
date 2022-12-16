package com.surgerywaitinglist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surgerywaitinglist.entity.WaitingList;
import com.surgerywaitinglist.service.WaitingListService;


@RestController
public class WaitingListController {

	@Autowired
	private WaitingListService waitinglistService;
	
	@GetMapping("/surgerywaitinglist")
	public List<WaitingList> waitinglistGetAll(){
		return waitinglistService. waitinglistGetAll();
	}
	
	@GetMapping("/surgerywaitinglist/{waitingListId}")
	public WaitingList waitingListGetOne(@PathVariable Long waitingListId) {
		return waitinglistService.waitingListGetOne(waitingListId);
	}
	
	@PostMapping("/surgerywaitinglist")
	public WaitingList waitingListAddOne(@RequestBody WaitingList waitingList) {
		return waitinglistService.waitingListAddOne(waitingList);
	}
	
	@PutMapping("/surgerywaitinglist")
	public WaitingList waitingListPutOne(@RequestBody WaitingList waitingList) {
		return waitinglistService.waitingListPutOne(waitingList);
	}
	
	@DeleteMapping("/surgerywaitinglist/delete/{waitingListId}")
	public WaitingList waitingListDeleteOne(@PathVariable Long waitingListId) {
		return waitinglistService.waitingListDeleteOne(waitingListId);
	}

	
}