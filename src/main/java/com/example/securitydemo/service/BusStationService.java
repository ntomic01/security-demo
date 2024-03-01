package com.example.securitydemo.service;

import com.example.securitydemo.dto.DestinationDto;

import java.util.List;

public interface BusStationService {

    List<DestinationDto> getAvailableDestinations();
}
