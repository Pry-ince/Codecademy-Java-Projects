
// Math magic project.

package LearnJavaVariables.LearnJavaManipulatingVariables.Project;

public class MathMagic {
    public static void main(String args[]) {
        int myNumber = 3;
        // myNumber is the original number.

        int stepOne = myNumber * myNumber;

        int stepTwo = stepOne + myNumber;

        int stepThree = stepTwo / myNumber;

        int stepFour = stepThree + 17;

        int stepFive = stepFour - myNumber;

        int stepSix = stepFive / 6;

        System.out.println(stepSix);
    }
}
