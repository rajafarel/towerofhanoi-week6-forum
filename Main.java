import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //recursion
        recursive.tOHrecursive(3, 'A', 'B', 'C');
        //iterative
        iterative TOH = new iterative();
        Stack<Integer> peg1 = new Stack<>();
        Stack<Integer> peg2 = new Stack<>();
        Stack<Integer> peg3 = new Stack<>();

        for (int i = 3; i >= 1; i--) {
            peg1.push(i);
        }

        TOH.tOHiterative(3, peg1, peg2, peg3);

    }
}