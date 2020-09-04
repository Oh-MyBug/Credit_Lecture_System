package com.ohmybug.service;

import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Page;
import com.ohmybug.pojo.Reservation;

/**
 * ClassName:   ReservationService
 * Data:        2020/9/3
 * author:      Oh_MyBug
 * version:     V1.0
 */
public interface ReservationService {
    int addResercation(Reservation reservation);

    Reservation queryReservation(Reservation reservation);

    int deleteResercation(Reservation reservation);

    Page<Lecture> page(int pageNo, int pageSize, int studentId);
}
