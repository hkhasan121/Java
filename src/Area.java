public class Area {
    public static void main(String[] args) {
        System.out.println("Area of radius: " + area(-1654));
        System.out.println("Area of rectangle: " + area(-5,-5));
    }
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        return 3.1416 * radius * radius;

    }
    public static double area(double x, double y){
        if((x < 0 && y < 0) || x < 0 || y< 0){
            return -1;
        }
        return x * y;
    }
}
