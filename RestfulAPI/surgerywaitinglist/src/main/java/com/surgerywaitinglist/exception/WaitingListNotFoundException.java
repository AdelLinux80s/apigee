package com.surgerywaitinglist.exception;

import java.text.MessageFormat;
import java.util.NoSuchElementException;

public class WaitingListNotFoundException extends NoSuchElementException {

	

	public WaitingListNotFoundException(Long waitingListId) {
		super(MessageFormat.format("Could not find waitinlist with id: {0}",waitingListId));
	}
}
