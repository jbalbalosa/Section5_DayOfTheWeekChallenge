public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Section 5: Day of the week Challenge+");

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }

    private static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Day of the week is Sunday");
                break;
            case 1:
                System.out.println("Day of the week is Monday");
                break;
            case 2:
                System.out.println("Day of the week is Tuesday");
                break;
            case 3:
                System.out.println("Day of the week is Wednesday");
                break;
            case 4:
                System.out.println("Day of the week is Thursday");
                break;
            case 5:
                System.out.println("Day of the week is Friday");
                break;
            case 6:
                System.out.println("Day of the week is Saturday");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }
}