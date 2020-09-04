package com.ohmybug.service.impl;

import com.ohmybug.dao.LectureDao;
import com.ohmybug.dao.ReservationDao;
import com.ohmybug.dao.impl.LectureDaoImpl;
import com.ohmybug.dao.impl.ReservationDaoImpl;
import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Page;
import com.ohmybug.pojo.Reservation;
import com.ohmybug.service.ReservationService;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:   ReservationServletImpl
 * Data:        2020/9/3
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class ReservationServletImpl implements ReservationService {
    private ReservationDao reservationDao = new ReservationDaoImpl();
    private LectureDao lectureDao = new LectureDaoImpl();

    @Override
    public int addResercation(Reservation reservation) {
        return reservationDao.addReservation(reservation);
    }

    @Override
    public Reservation queryReservation(Reservation reservation) {
        return reservationDao.queryReservation(reservation);
    }

    @Override
    public int deleteResercation(Reservation reservation) {
        return reservationDao.deleteResercation(reservation);
    }

    @Override
    public Page<Lecture> page(int pageNo, int pageSize, int studentId) {
        Page<Lecture> page = new Page<>();

        page.setPageSize(pageSize);

        Integer pageTotalCount = reservationDao.queryForPageTotalCountByStudentId(studentId);
        page.setPageTotalCount(pageTotalCount);

        int pageTotal = pageTotalCount % pageSize > 0 ? pageTotalCount / pageSize + 1 : pageTotalCount / pageSize;
        page.setPageTotal(pageTotal);

        page.setPageNo(pageNo);

        int begin = (page.getPageNo() - 1) * pageSize;
        List<Reservation> reservations = reservationDao.queryforPageItems(begin, pageSize, studentId);

        List<Lecture> items = new ArrayList<>();

        for (Reservation reservation : reservations) {
            items.add(lectureDao.queryLectureById(reservation.getLectureId()));
        }
        page.setItems(items);
        return page;
    }
}
