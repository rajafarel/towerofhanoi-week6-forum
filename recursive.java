public class recursive {
    public static void tOHrecursive(int n, char startPeg,char tempPeg,char destPeg){
        if (n == 1) {
            System.out.println("Move disk from " + startPeg + " to " + destPeg);
            return;
        }
        tOHrecursive(n-1,startPeg,destPeg,tempPeg);
        tOHrecursive(1,startPeg,tempPeg,destPeg);
        tOHrecursive(n-1,tempPeg,startPeg,destPeg);
    }
}
