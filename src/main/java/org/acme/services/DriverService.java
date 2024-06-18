package org.acme.services;

import java.time.ZonedDateTime;
import java.util.Date;

import org.acme.models.Driver;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
@RequiredArgsConstructor
public class DriverService {
    public Driver getDriver(String driverId) {
        log.info("Get Driver Information for id = {}", driverId);
        //Could call an external service, database, etc.

        //Mocking driver details
        //random expiration based on id, even number will be expired and odd number will be valid
        long days = Long.parseLong(driverId) % 2;
        Date licenseExpiration = new Date(ZonedDateTime.now().plusDays(days).toInstant().toEpochMilli());
        return new Driver(driverId, "Arthur", "SP", "Campinas", 13, 30, licenseExpiration, false);
    }
}
