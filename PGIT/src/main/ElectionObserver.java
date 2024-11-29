package main;

import java.util.Map;

public interface ElectionObserver {
    void update(Map<Candidate, Integer> results);
}