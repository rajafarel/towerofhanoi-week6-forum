import java.util.Stack;

public class iterative {
    public static void tOHiterative(int n, Stack<Integer> src, Stack<Integer> aux, Stack<Integer> des) {

        int numMoves = (int) Math.pow(2, n) - 1;


        for (int i = 1; i <= numMoves; i++) {
            if (i % 3 == 1) {
                if (!src.isEmpty() && (des.isEmpty() || src.peek() < des.peek())) {
                    moveDisk(src, des, 'A', 'C');
                }
                else if (!des.isEmpty() && (src.isEmpty() || des.peek() < src.peek())) {
                    moveDisk(des, src, 'C', 'A');
                }
            }
            else if (i % 3 == 2) {
                if(!src.isEmpty() && (aux.isEmpty() || src.peek() < aux.peek())){
                    moveDisk(src, aux, 'A', 'B');
                }
                else if(!aux.isEmpty() && (src.isEmpty() || aux.peek() < src.peek())){
                    moveDisk(aux, src, 'B', 'A');
                }
            } else {
                if (!aux.isEmpty() && (des.isEmpty() || aux.peek() < des.peek())) {
                    moveDisk(aux, des, 'B', 'C');
                } else if (!des.isEmpty() && (aux.isEmpty() || des.peek() < aux.peek())) {
                    moveDisk(des, aux, 'C', 'B');
                }
            }
        }
    }
    public static void moveDisk(Stack<Integer> sourceStack, Stack<Integer> destinationStack,char startPeg, char destPeg) {
        int disk = sourceStack.pop();
        destinationStack.push(disk);
        System.out.println("Move disk from " + startPeg + " to  " + destPeg);
    }

}
