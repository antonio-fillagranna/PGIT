package main;

import java.util.List;
import java.util.Map;

public interface VoteCountingStrategy {
    Map<Candidate, Integer> countVotes(List<Vote> votes);
}