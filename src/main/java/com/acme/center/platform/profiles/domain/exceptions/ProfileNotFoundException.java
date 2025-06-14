package com.acme.center.platform.profiles.domain.exceptions;

public class ProfileNotFoundException extends RuntimeException {
    public ProfileNotFoundException(String message) {
        super(message);
    }
}
