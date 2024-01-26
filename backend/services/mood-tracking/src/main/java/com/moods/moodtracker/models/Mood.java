package com.moods.moodtracker.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mood {
    @Id
    private String id;
    private String name;
    private String description;

}