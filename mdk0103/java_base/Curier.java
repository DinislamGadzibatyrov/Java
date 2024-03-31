package JavaBase;

public class Curier {
    public static void main(String[] args) {
        int totalFloors = 10;
        int apartmentsPerFloor = 5;

        for (int floor = 1; floor <= totalFloors; floor++) {
            for (int apartment = 1; apartment <= apartmentsPerFloor; apartment++) {
                System.out.println("Доставлена посылка на " + floor + " этаж, квартира " + apartment);
            }
        }
    }
}