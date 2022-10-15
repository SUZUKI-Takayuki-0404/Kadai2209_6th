package cource.lesson.Kadai2209_6th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AirportService {
    @Autowired
    private AirportRepository repository;

    public AirportEntity getAirportEntity(String airport_code) {

        Map<String, Object> map = repository.findByCode(airport_code);

        String airportCode = (String) map.get("airportCode");
        String airportName = (String) map.get("airportName");
        String country = (String) map.get("country");

        AirportEntity airportEntity = new AirportEntity();
        airportEntity.setAirportCode(airportCode);
        airportEntity.setAirportName(airportName);
        airportEntity.setCountry(country);

        return airportEntity;
    }
    
}
