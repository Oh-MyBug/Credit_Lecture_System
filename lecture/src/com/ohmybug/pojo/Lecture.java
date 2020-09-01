package com.ohmybug.pojo;

import java.util.Date;

/**
 * ClassName:   Lecture
 * Data:        2020/8/30
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Lecture {
    private Integer id;
    private String title;
    private String type;
    private String status;
    private String speaker;
    private String location;
    private Date time;
    private String speaker_introduction;
    private String content;
    private Integer yingshu1;
    private Integer yingshu2;
    private Integer yingshu3;
    private Integer yingshu4;
    private Integer tongji1;
    private Integer tongji2;
    private Integer tongji3;
    private Integer tongji4;
    private Integer xinji1;
    private Integer xinji2;
    private Integer xinji3;
    private Integer xinji4;
    private Integer shuji1;
    private Integer shuji2;
    private Integer shuji3;
    private Integer shuji4;
    private Integer shujin1;
    private Integer shujin2;
    private Integer shujin3;
    private Integer shujin4;
    private Integer shushi1;
    private Integer shushi2;
    private Integer shushi3;
    private Integer shushi4;

    public Lecture(Integer id, String title, String type, String status, String speaker, String location, Date time,
                   String speaker_introduction, String content, Integer yingshu1, Integer yingshu2, Integer yingshu3,
                   Integer yingshu4, Integer tongji1, Integer tongji2, Integer tongji3, Integer tongji4,
                   Integer xinji1, Integer xinji2, Integer xinji3, Integer xinji4, Integer shuji1, Integer shuji2,
                   Integer shuji3, Integer shuji4, Integer shujin1, Integer shujin2, Integer shujin3, Integer shujin4
            , Integer shushi1, Integer shushi2, Integer shushi3, Integer shushi4) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.status = status;
        this.speaker = speaker;
        this.location = location;
        this.time = time;
        this.speaker_introduction = speaker_introduction;
        this.content = content;
        this.yingshu1 = yingshu1;
        this.yingshu2 = yingshu2;
        this.yingshu3 = yingshu3;
        this.yingshu4 = yingshu4;
        this.tongji1 = tongji1;
        this.tongji2 = tongji2;
        this.tongji3 = tongji3;
        this.tongji4 = tongji4;
        this.xinji1 = xinji1;
        this.xinji2 = xinji2;
        this.xinji3 = xinji3;
        this.xinji4 = xinji4;
        this.shuji1 = shuji1;
        this.shuji2 = shuji2;
        this.shuji3 = shuji3;
        this.shuji4 = shuji4;
        this.shujin1 = shujin1;
        this.shujin2 = shujin2;
        this.shujin3 = shujin3;
        this.shujin4 = shujin4;
        this.shushi1 = shushi1;
        this.shushi2 = shushi2;
        this.shushi3 = shushi3;
        this.shushi4 = shushi4;
    }

    public Lecture() {
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", speaker='" + speaker + '\'' +
                ", location='" + location + '\'' +
                ", time=" + time +
                ", speaker_introduction='" + speaker_introduction + '\'' +
                ", content='" + content + '\'' +
                ", yingshu1=" + yingshu1 +
                ", yingshu2=" + yingshu2 +
                ", yingshu3=" + yingshu3 +
                ", yingshu4=" + yingshu4 +
                ", tongji1=" + tongji1 +
                ", tongji2=" + tongji2 +
                ", tongji3=" + tongji3 +
                ", tongji4=" + tongji4 +
                ", xinji1=" + xinji1 +
                ", xinji2=" + xinji2 +
                ", xinji3=" + xinji3 +
                ", xinji4=" + xinji4 +
                ", shuji1=" + shuji1 +
                ", shuji2=" + shuji2 +
                ", shuji3=" + shuji3 +
                ", shuji4=" + shuji4 +
                ", shujin1=" + shujin1 +
                ", shujin2=" + shujin2 +
                ", shujin3=" + shujin3 +
                ", shujin4=" + shujin4 +
                ", shushi1=" + shushi1 +
                ", shushi2=" + shushi2 +
                ", shushi3=" + shushi3 +
                ", shushi4=" + shushi4 +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSpeaker_introduction() {
        return speaker_introduction;
    }

    public void setSpeaker_introduction(String speaker_introduction) {
        this.speaker_introduction = speaker_introduction;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getYingshu1() {
        return yingshu1;
    }

    public void setYingshu1(Integer yingshu1) {
        this.yingshu1 = yingshu1;
    }

    public Integer getYingshu2() {
        return yingshu2;
    }

    public void setYingshu2(Integer yingshu2) {
        this.yingshu2 = yingshu2;
    }

    public Integer getYingshu3() {
        return yingshu3;
    }

    public void setYingshu3(Integer yingshu3) {
        this.yingshu3 = yingshu3;
    }

    public Integer getYingshu4() {
        return yingshu4;
    }

    public void setYingshu4(Integer yingshu4) {
        this.yingshu4 = yingshu4;
    }

    public Integer getTongji1() {
        return tongji1;
    }

    public void setTongji1(Integer tongji1) {
        this.tongji1 = tongji1;
    }

    public Integer getTongji2() {
        return tongji2;
    }

    public void setTongji2(Integer tongji2) {
        this.tongji2 = tongji2;
    }

    public Integer getTongji3() {
        return tongji3;
    }

    public void setTongji3(Integer tongji3) {
        this.tongji3 = tongji3;
    }

    public Integer getTongji4() {
        return tongji4;
    }

    public void setTongji4(Integer tongji4) {
        this.tongji4 = tongji4;
    }

    public Integer getXinji1() {
        return xinji1;
    }

    public void setXinji1(Integer xinji1) {
        this.xinji1 = xinji1;
    }

    public Integer getXinji2() {
        return xinji2;
    }

    public void setXinji2(Integer xinji2) {
        this.xinji2 = xinji2;
    }

    public Integer getXinji3() {
        return xinji3;
    }

    public void setXinji3(Integer xinji3) {
        this.xinji3 = xinji3;
    }

    public Integer getXinji4() {
        return xinji4;
    }

    public void setXinji4(Integer xinji4) {
        this.xinji4 = xinji4;
    }

    public Integer getShuji1() {
        return shuji1;
    }

    public void setShuji1(Integer shuji1) {
        this.shuji1 = shuji1;
    }

    public Integer getShuji2() {
        return shuji2;
    }

    public void setShuji2(Integer shuji2) {
        this.shuji2 = shuji2;
    }

    public Integer getShuji3() {
        return shuji3;
    }

    public void setShuji3(Integer shuji3) {
        this.shuji3 = shuji3;
    }

    public Integer getShuji4() {
        return shuji4;
    }

    public void setShuji4(Integer shuji4) {
        this.shuji4 = shuji4;
    }

    public Integer getShujin1() {
        return shujin1;
    }

    public void setShujin1(Integer shujin1) {
        this.shujin1 = shujin1;
    }

    public Integer getShujin2() {
        return shujin2;
    }

    public void setShujin2(Integer shujin2) {
        this.shujin2 = shujin2;
    }

    public Integer getShujin3() {
        return shujin3;
    }

    public void setShujin3(Integer shujin3) {
        this.shujin3 = shujin3;
    }

    public Integer getShujin4() {
        return shujin4;
    }

    public void setShujin4(Integer shujin4) {
        this.shujin4 = shujin4;
    }

    public Integer getShushi1() {
        return shushi1;
    }

    public void setShushi1(Integer shushi1) {
        this.shushi1 = shushi1;
    }

    public Integer getShushi2() {
        return shushi2;
    }

    public void setShushi2(Integer shushi2) {
        this.shushi2 = shushi2;
    }

    public Integer getShushi3() {
        return shushi3;
    }

    public void setShushi3(Integer shushi3) {
        this.shushi3 = shushi3;
    }

    public Integer getShushi4() {
        return shushi4;
    }

    public void setShushi4(Integer shushi4) {
        this.shushi4 = shushi4;
    }
}
