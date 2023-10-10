package behavioral.cor;

public class TestProblemSolving {
    public static void main(String[] args) {
        DecisiveComponent startChain = new AnsweringMachine();
        DecisiveComponent midlChain = new CallCenterOperator();
        DecisiveComponent endChain = new Engineer();
        startChain.setNextInstance(midlChain);
        midlChain.setNextInstance(endChain);
        startChain.solveProblem("I am tired!");
    }
}
