package main;

import java.util.*;

public class Election {
    private final List<Vote> votes = new ArrayList<>();
    private final List<ElectionObserver> observers = new ArrayList<>();
    private VoteCountingStrategy countingStrategy;

    public Election(VoteCountingStrategy countingStrategy) {
        this.countingStrategy = countingStrategy;
    }

    public void setCountingStrategy(VoteCountingStrategy strategy) {
        this.countingStrategy = strategy;
    }

    public void registerObserver(ElectionObserver observer) {
        observers.add(observer);
    }

    public void addVote(Vote vote) {
        votes.add(vote);
        notifyObservers();
    }

    private void notifyObservers() {
        Map<Candidate, Integer> results = countingStrategy.countVotes(votes);
        for (ElectionObserver observer : observers) {
            observer.update(results);
        }
    }
}