package main;

public class Main {
    public static void main(String[] args) {
        // Criação de candidatos
        Candidate candidate1 = ElectionFactory.createCandidate("Alice");
        Candidate candidate2 = ElectionFactory.createCandidate("Bob");

        // Criação da eleição com estratégia de contagem simples
        Election election = new Election(new SimpleCountStrategy());

        // Registro do observador de resultados
        election.registerObserver(new ResultDisplay());

        // Registro de votos
        election.addVote(new Vote(candidate1));
        election.addVote(new Vote(candidate2));
        election.addVote(new Vote(candidate1));
    }
}
