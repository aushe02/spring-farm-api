package com.example.farm.sensor;

import com.example.farm.record.SensorRecord;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Table(name = "Sensor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Sensor {


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

    @NotNull
    @Column(nullable = false, unique = true)
    private UUID uuidSensor;

    @NotNull
    private String nickName;

    @NotNull
    private String lat;

    @NotNull
    private String lon;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SensorType sensorType;

    @OneToMany(mappedBy="sensor")
    private List<SensorRecord> sensorRecordList;

}
