/**
 * 
 */
package com.rbs.breach.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author user
 *
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BreachDataException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BreachDataException(String exception) {
		super(exception);
	}

}
