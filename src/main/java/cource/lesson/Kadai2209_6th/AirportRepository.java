package cource.lesson.Kadai2209_6th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class AirportRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findByCode(String airportCode) {

        String query = "SELECT * FROM airports WHERE airportCode=?";

        return jdbcTemplate.queryForMap(query, airportCode);
    }

    public List<String> findAllCode() {

        String sql = "SELECT airportCode FROM airports";

        List<String> foundCodeList = new ArrayList<>();

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

        while (rowSet.next()) {
            foundCodeList.add(rowSet.getString("airportCode"));
        }

        return foundCodeList;
    }
}
