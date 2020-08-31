package com.ohmybug.pojo;

/**
 * ClassName:   Location
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Location {
    private Integer id;
    private String location;

    public Location(Integer id, String location) {
        this.id = id;
        this.location = location;
    }

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", location='" + location + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
