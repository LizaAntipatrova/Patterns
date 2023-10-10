package behavioral.cor;

import java.util.Random;

public class AnsweringMachine extends DecisiveComponent {

    public AnsweringMachine() {
        successRate = 1.1;
    }

    @Override
    public String solveProblem(String problem) {
        if (new Random().nextInt(0, 100) * successRate > 50) {
            System.out.println("Problem solved by answering machine");
            return problem;
        } else return nextInstance.solveProblem(problem);
    }
}
