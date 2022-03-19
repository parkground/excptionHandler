package com.example.zerobase.domain;

import com.example.zerobase.type.ZerobaseCourseStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ZerobaseCourse {
    private Long id;

    private String name;

    private String logo;

    private ZerobaseCourseStatus status;

    private LocalDate startAt;

    private LocalDate endAt;

    private boolean hidden;

    @Builder
    public ZerobaseCourse(Long id, String name, ZerobaseCourseStatus status, LocalDate startAt, LocalDate endAt, boolean hidden) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.startAt = startAt;
        this.endAt = endAt;
        this.hidden = hidden;
    }

    public boolean isSameStatus(ZerobaseCourseStatus status) {
        return this.status == status;
    }
}
