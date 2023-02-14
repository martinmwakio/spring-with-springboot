package com.mmwakio.springbasics.repository;

import com.mmwakio.springbasics.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RoomRepository extends CrudRepository<Room, BigInteger> {
}
