public class VolumeofEarth {
    public static void main(String[] args) {
        int r = 6378;
        double pi = 3.14;
        double volumekm = (4/3)*pi*r*r*r;
        double volumeMiles = volumekm * 0.239913;
        System.out.println("The Volume of earth in cubic kilometer is " + volumekm + " and cubic miles " + volumeMiles);

    }
}