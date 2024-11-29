package main;

import java.util.*;

public class SimpleCountStrategy implements VoteCountingStrategy {
    @Override
    public Map<Candidate, Integer> countVotes(List<Vote> votes) {
        Map<Candidate, Integer> results = new HashMap<>();
        for (Vote vote : votes) {
            results.put(vote.getCandidate(), results.getOrDefault(vote.getCandidate(), 0) + 1);
        }
        return results;
    }
}