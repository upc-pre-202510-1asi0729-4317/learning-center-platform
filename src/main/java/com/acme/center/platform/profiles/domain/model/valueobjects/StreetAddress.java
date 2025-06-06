package com.acme.center.platform.profiles.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record StreetAddress(
        String street,
        String number,
        String city,
        String postalCode,
        String country
) {
    public StreetAddress() {
        this(null,null,null,null,null);
    }

    public String getStreetAddress() {
        return "%s %s, %s, %s, %s".formatted(street, number, city, postalCode, country);
    }

    public StreetAddress {
        if (street == null || street.isBlank()) {
            throw new IllegalArgumentException("Street address cannot be null or blank");
        }
        if (number == null || number.isBlank()) {
            throw new IllegalArgumentException("Street address cannot be null or blank");
        }
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("Street address cannot be null or blank");
        }
        if (postalCode == null || postalCode.isBlank()) {
            throw new IllegalArgumentException("Street address cannot be null or blank");
        }
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Street address cannot be null or blank");
        }
    }
}
