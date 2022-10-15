package cource.lesson.Kadai2209_6th;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "airports")
public class AirportEntity {

    private String airportCode;
    private String airportName;
    private String country;

}

