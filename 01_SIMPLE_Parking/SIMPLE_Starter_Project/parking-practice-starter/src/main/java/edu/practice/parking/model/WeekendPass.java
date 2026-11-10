package edu.practice.parking.model;

public class WeekendPass extends ParkingPass {
    private final int flatCents;

    public WeekendPass(long id, String registration, int flatCents) {
        super(id, registration);
        this.flatCents = flatCents;
    }

    public int getFlatCents() {
        return flatCents;
    }

    @Override
    public int priceCents(int stayMinutes) {
        if (stayMinutes <= 0) {
            throw new IllegalArgumentException("Stay minutes must be strictly positive.");
        }
        if (stayMinutes <= 480) {
            return flatCents;
        }

        int overtimeMinutes = stayMinutes - 480;

        int additionalHours = (overtimeMinutes + 59) / 60;

        return flatCents + (additionalHours * 150);
    }
}
