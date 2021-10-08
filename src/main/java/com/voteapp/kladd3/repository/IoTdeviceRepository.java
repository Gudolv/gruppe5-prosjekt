package com.voteapp.kladd3.repository;

import com.voteapp.kladd3.models.IoTDevice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IoTdeviceRepository extends CrudRepository<IoTDevice,Long> {


}
