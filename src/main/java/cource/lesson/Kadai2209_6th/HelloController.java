package cource.lesson.Kadai2209_6th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private AirportService service;

    @GetMapping("/hello")
    public String getAirportCode(String airportCode, Model model) {

        List<String> airportCodeList = service.getAllAirportCode();

        model.addAttribute("airportCodeList", airportCodeList);

        return "hello";
    }

    @PostMapping("/database/airport_database")
    public String postRequest(@RequestParam("airport_code") String airportCode, Model model) {

        AirportEntity airportEntity = service.getAirportEntity(airportCode);

        model.addAttribute("airports", airportEntity);

        return "database/airport_database";
    }

}
