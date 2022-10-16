package cource.lesson.Kadai2209_6th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AirportRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findByCode(String airportCode) {

        String query = "SELECT *" + " FROM airports" + " WHERE airportCode=?";

        return jdbcTemplate.queryForMap(query, airportCode);
    }

    public List<String> findAllCode() {

        //Airport code list (tentative, to be replaced by SQL later)
        String[] airportCodes = {
                "NRT", "HND", "KIX", "NGO", "JFK", "BOS", "ORD", "DFW",
                "SFO", "LAX", "SAN", "YVR", "HNL", "LHR", "CDG", "FRA",
                "DME", "PVG", "SHA", "HKG", "BJS", "DLC", "TSN", "CAN",
                "ICN", "GMP", "PUS", "TPE", "TSA", "KHH", "SGN", "HAN",
                "BKK", "KUL", "SIN", "CGK", "MNL", "DEL", "GUM", "SYD"};

        return List.of(airportCodes);
    }
}
