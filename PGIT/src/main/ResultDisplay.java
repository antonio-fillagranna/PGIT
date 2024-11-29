package main;

import java.util.Map;

public class ResultDisplay implements ElectionObserver {
    @Override
    public void update(Map<Candidate, Integer> results) {
        System.out.println("Current Results:");
        results.forEach((candidate, count) -> System.out.println(candidate.getName() + ": " + count + " votes"));
    }
}