package com.moods.moodtracker.resolvers;

import com.moods.moodtracker.models.Mood;
import org.springframework.stereotype.Component;
import graphql.kickstart.tools.GraphQLMutationResolver;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public Mood mood(String id) {
    }

    public List<Mood> moods() {
    }
}