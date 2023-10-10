package behavioral.cor;

import java.util.Random;

public class CallCenterOperator extends DecisiveComponent {

    public CallCenterOperator() {
        successRate = 1.4;
    }

    @Override
    public String solveProblem(String problem) {
        if (new Random().nextInt(0, 100) * successRate > 50) {
            System.out.println("Problem solved by call center's operator");
            return problem;
        } else return nextInstance.solveProblem(problem);
    }
}
