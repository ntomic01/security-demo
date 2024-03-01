package com.example.securitydemo.service.impl;

import com.example.securitydemo.dto.BusStationDestionationsDto;
import com.example.securitydemo.dto.DestinationDto;
import com.example.securitydemo.service.BusStationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BusStationServiceImpl implements BusStationService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<DestinationDto> getAvailableDestinations() {

       ResponseEntity<BusStationDestionationsDto> response = restTemplate.getForEntity("http://redvoznje.bas.rs/api/destination?countryId=9",
               BusStationDestionationsDto.class);
       if(response.getStatusCode().is2xxSuccessful()){
           return response.getBody().getResult();
       }
        return null;
    }
}
