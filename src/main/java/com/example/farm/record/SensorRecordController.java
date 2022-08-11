package com.example.farm.record;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/sensors")
@AllArgsConstructor
public class SensorRecordController {


    private final SensorRecordService sensorRecordService;

    @PostMapping("add-readings")
    public void addReadings(@RequestBody @Valid List<SensorRecord> readings) {
        sensorRecordService.addReadings(readings);
    }

    @PostMapping("add-reading")
    public void addReading(@RequestBody @Valid SensorRecord reading) {
        sensorRecordService.addReading(reading);
    }

    @GetMapping("all-readings")
    public List<SensorRecord>  allReadings() {
        return sensorRecordService.getAllReadings();
    }


}
