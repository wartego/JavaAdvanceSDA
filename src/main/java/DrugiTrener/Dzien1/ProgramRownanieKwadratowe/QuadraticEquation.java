package DrugiTrener.Dzien1.ProgramRownanieKwadratowe;

public class QuadraticEquation {
private int a;
private int b;
private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Solution getSolution(){
double delta = b*b - 4 * a * c;
double x1 = (-b - Math.sqrt(delta))/(2 * a);
double x2 = (-b + Math.sqrt(delta))/(2 * a);
return new Solution(x1,x2);
}

    public class Solution{
        private double x1;
        private double x2;

        public Solution(double x1, double x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        public double getX1() {
            return x1;
        }

        public double getX2() {
            return x2;
        }
    }

}
