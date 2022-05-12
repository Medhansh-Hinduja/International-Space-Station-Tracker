package com.hinduja.medhansh.ISSTracker.Models;

public class ISSLocator {
    //{"message": "success", "timestamp": 1652366106, "iss_position": {"latitude": "49.0157", "longitude": "177.9467"}}
    private String message;
    private long timestamp;
    private ISSPosition iss_position;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public ISSPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(ISSPosition iss_position) {
        this.iss_position = iss_position;
    }

    @Override
    public String toString() {
        return "ISSLocator{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                ", iss_position=" + iss_position +
                '}';
    }
}
