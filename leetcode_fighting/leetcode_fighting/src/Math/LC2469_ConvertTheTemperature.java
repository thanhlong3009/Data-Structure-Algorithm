package Math;

public class LC2469_ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double[] rs = new double[2];
        rs[0] = celsius + 273.15;
        rs[1] = celsius * 1.80 + 32.00;
        return rs;
    }
}
