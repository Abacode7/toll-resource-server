package com.pluralsight.resourceserver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollStationController {
    List<TollStation> tollStations;

	public TollStationController() {
		tollStations = new ArrayList<>();
		tollStations.add(new TollStation("111", 124.1f, 2));
		tollStations.add(new TollStation("112", 1364.0f, 4));
		tollStations.add(new TollStation("113", 117.9f, 3));
	}


    @GetMapping("/api/tollStations")
    public List<TollStation> getTollStations(){
        return tollStations;
    }
}
