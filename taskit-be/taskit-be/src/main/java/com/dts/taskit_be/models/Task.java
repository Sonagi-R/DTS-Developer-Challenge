package com.dts.taskit_be.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Task {
    private String id;
    private String title;
    private String description;
    private int status;
    private int dueDate;
}
