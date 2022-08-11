package com.example.farm.sensor;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/sensors")
@AllArgsConstructor
public class SensorController {

    private final SensorService sensorService;

    @PostMapping("add-sensor")
    public void addSensor(@RequestBody @Valid Sensor sensor) {
        sensorService.addSensor(sensor);
    }

    @GetMapping("get-all")
    public List<Sensor>  getAllSensors() {
        return sensorService.getSensors();
    }



}
