package com.mmwakio.springbasics.repository;

import java.math.BigInteger;
import java.sql.Date;

import com.mmwakio.springbasics.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, BigInteger> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}