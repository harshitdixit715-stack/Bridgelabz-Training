public class Pens {
    public static void main(String[] args) {
        int totalpens = 14;
        int Students = 3;
        int penperStudent = totalpens/Students;
        int remainingpens = totalpens%Students; // remainder
        System.out.println("The Pen Per Student is " + penperStudent + " remaining pen not distributed is " + remainingpens);
    }
}