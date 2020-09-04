package com.ohmybug.dao.impl;

import com.ohmybug.dao.ReservationDao;
import com.ohmybug.pojo.Reservation;

import java.util.List;

/**
 * ClassName:   ReservationDaoImpl
 * Data:        2020/9/3
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class ReservationDaoImpl extends BaseDao implements ReservationDao {
    @Override
    public int addReservation(Reservation reservation) {
        String sql = "insert into `reservation`(`studentId`, `lectureId`) values(?, ?)";
        return update(sql, reservation.getStudentId(), reservation.getLectureId());
    }

    @Override
    public Reservation queryReservation(Reservation reservation) {
        String sql = "select `id`, `studentId`, `lectureId` from `reservation` where `studentId` = ? and `lectureId` " +
                "= ?";
        return queryForOne(Reservation.class, sql, reservation.getStudentId(), reservation.getLectureId());
    }

    @Override
    public int deleteResercation(Reservation reservation) {
        String sql = "delete from `reservation` where `studentId` = ? and `lectureId` = ?";
        return update(sql, reservation.getStudentId(), reservation.getLectureId());
    }

    @Override
    public Integer queryForPageTotalCountByStudentId(Integer studentId) {
        String sql = "select count(*) from `reservation` where `studentId` = ?";
        Number number = (Number) queryForSingleValue(sql, studentId);
        return number.intValue();
    }

    @Override
    public List<Reservation> queryforPageItems(int begin, int pageSize, int studentId) {
        String sql = "select `id`, `studentId`, `lectureId` from `reservation` where `studentId` = ? limit ?, ? ";
        return queryForList(Reservation.class, sql, studentId, begin, pageSize);
    }
}
