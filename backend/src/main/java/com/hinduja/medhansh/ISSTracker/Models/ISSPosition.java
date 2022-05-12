package com.hinduja.medhansh.ISSTracker.Models;

public class ISSPosition {
    // {"iss_position": {"latitude": "49.0157", "longitude": "177.9467"}}
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ISSPosition{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
