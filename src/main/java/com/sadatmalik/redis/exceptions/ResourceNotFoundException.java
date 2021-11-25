package com.sadatmalik.redis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// @ResponseStatus ensures that if this exception is thrown from a method called by a controller,
// the specified HttpStatus will be returned to the client along with the message
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    // Create a constructor with the incoming message and call super to invoke the RuntimeException object
    public ResourceNotFoundException(String message) {
        super(message);
    }
}