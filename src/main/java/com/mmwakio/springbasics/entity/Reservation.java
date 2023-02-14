package com.mmwakio.springbasics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger reservationId;
    @Column(name = "ROOM_ID")
    private BigInteger roomId;
    @Column(name = "GUEST_ID")
    private BigInteger guestId;
    @Column(name = "RES_DATE")
    private Date reservationDate;

    public BigInteger getReservationId() {
        return reservationId;
    }

    public void setReservationId(BigInteger reservationId) {
        this.reservationId = reservationId;
    }

    public BigInteger getRoomId() {
        return roomId;
    }

    public void setRoomId(BigInteger roomId) {
        this.roomId = roomId;
    }

    public BigInteger getGuestId() {
        return guestId;
    }

    public void setGuestId(BigInteger guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", roomId=" + roomId +
                ", guestId=" + guestId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}