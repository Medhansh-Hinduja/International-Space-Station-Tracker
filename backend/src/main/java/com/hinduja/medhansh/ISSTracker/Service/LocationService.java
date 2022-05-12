package com.hinduja.medhansh.ISSTracker.Service;

import com.hinduja.medhansh.ISSTracker.Models.ISSLocator;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {

    private static final String FAILED = "failed";

    @HystrixCommand(fallbackMethod = "fallback")
    public ISSLocator getISSLocation() {
        RestTemplate temp = new RestTemplate();
        return temp.getForObject("http://api.open-notify.org/iss-now.json", ISSLocator.class);
    }

    public ISSLocator fallback() {
        ISSLocator locator = new ISSLocator();
        locator.setMessage(FAILED);
        return locator;
    }
}

/* try {
            RestTemplate temp = new RestTemplate();
            return temp.getForObject("http://api.open-notify.org/iss-now.json", ISSLocator.class);
        } catch (Exception e) {
            ISSLocator locator = new ISSLocator();
            locator.setMessage(FAILED);
            return locator;
        } */
