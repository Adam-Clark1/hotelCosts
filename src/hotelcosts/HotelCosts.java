package hotelcosts;

import java.util.Scanner;

public class HotelCosts {

    static Scanner input = new Scanner(System.in);
    static int days;
    static int daystot;
    static int room;
    static int board;
    static double price = 0;
    static int rprice = 0;
    static int bprice = 0;

    public static void main(String[] args) {

        days();
        roomtype();
        price();
    }

    public static void days() {

        System.out.println("How many days are you planning on staying for?");
        System.out.println("The hotel offers a dicount of 20% of your daily rate for each day you stay over 1 week.");
        days = input.nextInt();
        daystot = days;

    }

    public static void roomtype() {

        System.out.println("What type of room would you like?");
        System.out.println("1. Single (1) £50");
        System.out.println("2. Double (2) £75");
        System.out.println("3. Family (4) £105");
        System.out.println("Please type in a number.");

        room = input.nextInt();

        System.out.println("What board do you want?");
        System.out.println("1. Self Catering (£0)");
        System.out.println("2. Half-board (£10)");
        System.out.println("3. Full-board (£20)");
        System.out.println("Please type in a number.");

        board = input.nextInt();

    }

    public static void price() {

        if (room == 1) {
            rprice = 50;
        } else if (room == 2) {
            rprice = 75;
        } else if (room == 3) {
            rprice = 105;
        }

        if (board == 1) {
            bprice = 0;
        } else if (board == 2) {
            bprice = 10;
        } else if (board == 3) {
            bprice = 20;
        }

        int roomprice = rprice + bprice;
        if (daystot > 7) {
            price = price + (7 * roomprice);
            days = days - 7;
            price = price + ((days * roomprice) * 0.8);
        }

        System.out.println("Before discound: £" + (daystot * roomprice));
        System.out.println("After discount: £" + (price));
    }

}
