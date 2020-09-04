package com.ohmybug.dao;

import com.ohmybug.pojo.Reservation;

import java.util.List;

/**
 * ClassName:   ReservationDao
 * Data:        2020/9/3
 * author:      Oh_MyBug
 * version:     V1.0
 */
public interface ReservationDao {
    int addReservation(Reservation reservation);

    Reservation queryReservation(Reservation reservation);

    int deleteResercation(Reservation reservation);

    Integer queryForPageTotalCountByStudentId(Integer studentId);

    List<Reservation> queryforPageItems(int begin, int pageSize, int studentId);
}
