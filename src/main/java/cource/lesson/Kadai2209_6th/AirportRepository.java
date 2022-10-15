package cource.lesson.Kadai2209_6th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AirportRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findByCode(String airportCode) {

        String query = "SELECT *" + " FROM airports" + " WHERE airportCode=?";

        return jdbcTemplate.queryForMap(query, airportCode);
    }
    
}
