package com.hinduja.medhansh.ISSTracker.Controllers;

import com.hinduja.medhansh.ISSTracker.Models.ISSLocator;
import com.hinduja.medhansh.ISSTracker.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ISSController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/issLocation")
    public ISSLocator getISSLocation() {
        return this.locationService.getISSLocation();
    }
}
