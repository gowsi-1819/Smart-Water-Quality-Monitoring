import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Smart Water Quality Monitoring System ===");

        System.out.print("Enter pH value: ");
        double pH = sc.nextDouble();

        System.out.print("Enter Turbidity (NTU): ");
        double turbidity = sc.nextDouble();

        System.out.print("Enter TDS (mg/L): ");
        double tds = sc.nextDouble();

        String status = WaterQualityChecker.checkWaterQuality(pH, turbidity, tds);
        String risk = WaterQualityChecker.diseaseRisk(status);

        System.out.println("\nWater Quality Status: " + status);
        System.out.println("Health Advisory: " + risk);
        System.out.println("\nNote: This is a rule-based indication, not a medical diagnosis.");

        sc.close();
    }
}
