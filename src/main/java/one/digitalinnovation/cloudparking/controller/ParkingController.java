package one.digitalinnovation.cloudparking.controller;

import one.digitalinnovation.cloudparking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){
        var parking = new Parking();
        parking.setColor("PRATA");
        parking.setLicense("CVO-3030");
        parking.setModel("VW GOL");
        parking.setState("SP");

        var parkingb = new Parking();
        parkingb.setColor("BRANCO");
        parkingb.setLicense("CYA-7777");
        parkingb.setModel("CRETA");
        parkingb.setState("SP");

        return Arrays.asList(parking, parkingb);

    }
}
