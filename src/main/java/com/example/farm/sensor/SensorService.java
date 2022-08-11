package com.example.farm.sensor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private SensorRepository sensorRepository;

    public void addSensor(Sensor sensor) {
        sensorRepository.save(sensor);
    }

    public List<Sensor> getSensors() {
        return sensorRepository.findAll();
    }
}
