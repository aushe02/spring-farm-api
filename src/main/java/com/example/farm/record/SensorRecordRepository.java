package com.example.farm.record;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRecordRepository extends JpaRepository<SensorRecord, Long> {
}
