package edu.practice.parking.service;

import edu.practice.parking.model.*;
import edu.practice.parking.dto.*;
import edu.practice.parking.repo.*;
import edu.practice.parking.error.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ParkingService {
    private final PassRepository repo;

    public ParkingService(PassRepository repo) {
        this.repo = repo;
    }

    public Collection<ParkingPass> all() {
        return repo.all();
    }

    public Quote quote(long id, int minutes) {
        // TODO Task 3: validate stay, return 404 when ID missing, calculate dynamically.
        throw new UnsupportedOperationException("Task 3");
    }

    public List<Quote> allQuotes(int minutes) {
        if (minutes <= 0) {
            throw new IllegalArgumentException("Stay minutes must be Positive.");
        }

        List<Quote> quates = new ArrayList<>();

        for (ParkingPass pass: repo.all()) {
            quates.add(toQuote(pass, minutes));
        }

        quates.sort(Comparator.comparingInt(Quote::priceCents).thenComparingLong(Quote::id));

        return quates;
    }

    public ParkingPass addHourly(NewHourlyPass body) {
        // TODO Task 3: validate id, registration, rate and duplicate ID before saving.
        throw new UnsupportedOperationException("Task 3");
    }

    private static Quote toQuote(ParkingPass pass, int minutes) {
        return new Quote(pass.getId(), pass.getRegistration(), pass.getClass().getSimpleName(), minutes, pass.priceCents(minutes));
    }
    // You may add a private helper method for constructing Quote objects.
}
