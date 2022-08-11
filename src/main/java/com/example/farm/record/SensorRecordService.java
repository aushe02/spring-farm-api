package com.example.farm.record;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SensorRecordService {

    private final SensorRecordRepository sensorRecordRepository;

    public void addReading(SensorRecord reading) {
        sensorRecordRepository.save(reading);
    }

    public List<SensorRecord> getAllReadings() {
        return sensorRecordRepository.findAll();
    }

    public void addReadings(List<SensorRecord> readings) {
        sensorRecordRepository.saveAll(readings);
    }
}
