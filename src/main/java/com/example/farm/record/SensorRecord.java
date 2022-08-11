package com.example.farm.record;

import com.example.farm.sensor.Sensor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SensorRecord {

    @Id
    @SequenceGenerator(
            name = "record_sequence",
            sequenceName = "record_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "record_sequence",
            strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name="uuidSensor", nullable=false)
    private Sensor sensor;


    @NotNull
    private float temp;


}
