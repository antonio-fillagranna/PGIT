package main;

public class ElectionFactory {
    public static Candidate createCandidate(String name) {
        return new Candidate(name);
    }

    public static Voter createVoter(String id) {
        return new Voter(id);
    }
}
