package com.ohmybug.dao.impl;

import com.ohmybug.dao.LectureDao;
import com.ohmybug.pojo.Lecture;

import java.util.List;

/**
 * ClassName:   LectureDaoImpl
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class LectureDaoImpl extends BaseDao implements LectureDao {
    @Override
    public int addLecture(Lecture lecture) {
        String sql = "INSERT INTO `lecture` (`title`, `type`, `status`, `speaker`, " +
                "`location`, `time`, `speaker_introduction`, `content`, `yingshu1`, " +
                "`yingshu2`, `yingshu3`, `yingshu4`, `tongji1`, `tongji2`, `tongji3`, `tongji4`, `xinji1`, `xinji2`, " +
                "`xinji3`, `xinji4`, `shuji1`, `shuji2`, `shuji3`, `shuji4`, `shujin1`, `shujin2`, `shujin3`, " +
                "`shujin4`, `shushi1`, `shushi2`, `shushi3`, `shushi4`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return update(sql, lecture.getTitle(), lecture.getType(), lecture.getStatus(), lecture.getSpeaker(),
                lecture.getLocation(), lecture.getTime(), lecture.getSpeakerIntroduction(), lecture.getContent(),
                lecture.getYingshu1(), lecture.getYingshu2(), lecture.getYingshu3(), lecture.getYingshu4(),
                lecture.getTongji1(), lecture.getTongji2(), lecture.getTongji3(), lecture.getTongji4(),
                lecture.getXinji1(), lecture.getXinji2(), lecture.getXinji3(), lecture.getXinji4(),
                lecture.getShuji1(), lecture.getShuji2(), lecture.getShuji3(), lecture.getShuji4(),
                lecture.getShujin1(), lecture.getShujin2(), lecture.getShujin3(), lecture.getShujin4(),
                lecture.getShushi1(), lecture.getShushi2(), lecture.getShushi3(), lecture.getShushi4());
    }

    @Override
    public int deleteLectureNyId(int id) {
        String sql = "delete from `lecture` where id = ?";
        return update(sql, id);
    }

    @Override
    public int updateLecture(Lecture lecture) {
        String sql = "update `lecture` set `title` = ?, `type` = ?, `status` = ?, " +
                "`speaker` = ?,`location` = ?, `time` = ?, `speaker_introduction` = ?, " +
                "`content` = ?,`yingshu1` = ?,`yingshu2` = ?, `yingshu3` = ?, `yingshu4` = ?, `tongji1` = ?, " +
                "`tongji2` = ?, `tongji3` = ?, `tongji4` = ?, `xinji1` = ?, `xinji2` = ?,`xinji3` = ?, `xinji4` = ?, " +
                "`shuji1` = ?, `shuji2` = ?, `shuji3` = ?, `shuji4` = ?, `shujin1` = ?, `shujin2` = ?, `shujin3` = ?," +
                " `shujin4` = ?, `shushi1` = ?, `shushi2` = ?, `shushi3` = ?, `shushi4` = ? where id = ?";
        return update(sql, lecture.getTitle(), lecture.getType(), lecture.getStatus(), lecture.getSpeaker(),
                lecture.getLocation(), lecture.getTime(), lecture.getSpeakerIntroduction(), lecture.getContent(),
                lecture.getYingshu1(), lecture.getYingshu2(), lecture.getYingshu3(), lecture.getYingshu4(),
                lecture.getTongji1(), lecture.getTongji2(), lecture.getTongji3(), lecture.getTongji4(),
                lecture.getXinji1(), lecture.getXinji2(), lecture.getXinji3(), lecture.getXinji4(),
                lecture.getShuji1(), lecture.getShuji2(), lecture.getShuji3(), lecture.getShuji4(),
                lecture.getShujin1(), lecture.getShujin2(), lecture.getShujin3(), lecture.getShujin4(),
                lecture.getShushi1(), lecture.getShushi2(), lecture.getShushi3(), lecture.getShushi4(),
                lecture.getId());
    }

    @Override
    public Lecture queryLectureById(Integer id) {
        String sql = "select `id`, `title`, `type`, `status`, `speaker`, " +
                "`location`, `time`, `speaker_introduction`, `content`, `yingshu1`, " +
                "`yingshu2`, `yingshu3`, `yingshu4`, `tongji1`, `tongji2`, `tongji3`, `tongji4`,`xinji1`, `xinji2`, " +
                "`xinji3`, `xinji4`, `shuji1`, `shuji2`, `shuji3`, `shuji4`, `shujin1`, `shujin2`, `shujin3`, " +
                "`shujin4`, `shushi1`, `shushi2`, `shushi3`, `shushi4` from `lecture` where id = ?";
        return queryForOne(Lecture.class, sql, id);
    }

    @Override
    public List<Lecture> queryLectures() {
        String sql = "select `id`, `title`, `type`, `status`, `speaker`, " +
                "`location`, `time`, `speaker_introduction`, `content`, `yingshu1`, " +
                "`yingshu2`, `yingshu3`, `yingshu4`, `tongji1`, `tongji2`, `tongji3`, `tongji4`,`xinji1`, `xinji2`, " +
                "`xinji3`, `xinji4`, `shuji1`, `shuji2`, `shuji3`, `shuji4`, `shujin1`, `shujin2`, `shujin3`, " +
                "`shujin4`, `shushi1`, `shushi2`, `shushi3`, `shushi4` from `lecture`";
        return queryForList(Lecture.class, sql);
    }
}
