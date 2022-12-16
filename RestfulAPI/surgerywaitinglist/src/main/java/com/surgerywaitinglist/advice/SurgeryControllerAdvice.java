package com.surgerywaitinglist.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.surgerywaitinglist.exception.WaitingListNotFoundException;

@ControllerAdvice
public class SurgeryControllerAdvice {

	@ExceptionHandler(WaitingListNotFoundException.class)
	public ResponseEntity<String> handleWaitingListNotFoundException(WaitingListNotFoundException exception){
		
		return new ResponseEntity<String>("No Record Found", HttpStatus.NOT_FOUND);
	}
}
