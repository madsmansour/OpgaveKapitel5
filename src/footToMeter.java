public class footToMeter {

    public static double footToMeter(double foot) {
        double meter = 0;
        //foot = 3.279 * meter;
        meter = 0.305 * foot;
        return meter;

    }

    public static void main(String[] args) {
        double k = footToMeter(5);
        System.out.println(k);
        double p = meterToFoot(5);
        System.out.println(p);


    }

    public static double meterToFoot(double meter) {
        double foot = 0;
        foot = 3.279 * meter;
        return foot;
    }

}