package main;

public class Vote {
    private final Candidate candidate;

    public Vote(Candidate candidate) {
        this.candidate = candidate;
    }

    public Candidate getCandidate() {
        return candidate;
    }
}