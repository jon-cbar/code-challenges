public class Day2Operators {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip_cost = meal_cost * (tip_percent / 100d);
        double tax_cost = meal_cost * (tax_percent / 100d);
        double total_cost = meal_cost + tip_cost + tax_cost;
        long rounded_cost = Math.round(total_cost);
        System.out.println(rounded_cost);
    }

    public static void main(String[] args) {
        solve(12, 20, 8);
    }
}
