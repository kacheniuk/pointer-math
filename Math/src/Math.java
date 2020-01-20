public class Math {

    public static final double PI = 3.14;
    public static final int R = 178;
    public static final int H = 126;
    public static final int K = 360;

    public static double lenght ( int R, double PI) {
        return (2*PI*R*R);
    }
    public static double square ( int R, double PI) {
        return (PI*R*R);
    }
    public static double squareR (int R, double Pi, int H, int K) {
        return ((Pi*R*R*H)/K);
    }

}
