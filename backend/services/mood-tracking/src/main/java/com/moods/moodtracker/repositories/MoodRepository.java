package com.moods.moodtracker.repositories;

import com.moods.moodtracker.models.Mood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodRepository extends JpaRepository<Mood, String> {
}
