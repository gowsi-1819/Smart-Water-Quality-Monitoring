public class WaterQualityChecker {

    public static String checkWaterQuality(double pH, double turbidity, double tds) {

        if (pH < 6.5 || pH > 8.5 || turbidity > 5 || tds > 500) {
            return "UNSAFE";
        }
        return "SAFE";
    }

    public static String diseaseRisk(String status) {

        if (status.equals("UNSAFE")) {
            return "Possible risk of waterborne diseases like Cholera, Typhoid, Dysentery";
        }
        return "No significant waterborne disease risk detected";
    }
}
