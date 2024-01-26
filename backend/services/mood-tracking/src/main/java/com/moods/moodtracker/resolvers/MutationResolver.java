package com.moods.moodtracker.resolvers;

import com.moods.moodtracker.models.Mood;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    public Mood createMood(MoodInput input) {
    }
}
