import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1) Zametki");
            System.out.println("2) BankSystem");
            System.out.println("3) Calculator");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Zametki note1 = new Zametki("Personal", "Farida", "For my future husband", "Blue", LocalDate.of(2022, 7, 21), false, "A4", "Private");
                    Zametki note2 = new Zametki("Work", "Farida", "Meeting Notes", "Blue", LocalDate.of(2022, 4, 12), false, "A4", "Public");
                    Zametki note3 = new Zametki("Study", "Farida", "Study Plan", "Green", LocalDate.of(2022, 5, 15), true, "A5", "Private");
                    Zametki note4 = new Zametki("Personal", "Farida", "Gift Ideas", "Pink", LocalDate.of(2022, 2, 13), false, "A6", "Shared");
                    Zametki[] notes = {note1, note2, note3, note4};
                    for (Zametki note : notes) {
                        System.out.println(note.toString());
                    }
                    break;
                case 2:
                    BankSystem user1 = new BankSystem("Begimbank", "Azamat Begimbai uulu", "Russia ", "Baumanskaya 234/9", 1987, "1000000");
                    BankSystem user2 = new BankSystem("SamBank", "Farida Begimbai kyzy ", "Bishkek", "Isakeeva 18/4", 1981, "1500000");

                    System.out.println("Before Transfer:");
                    System.out.println(user1.getUserName() + "'s Total Money: " + user1.getTotalMoney());
                    System.out.println(user2.getUserName() + "'s Total Money: " + user2.getTotalMoney());

                    user1.transfer(user2, 300);

                    System.out.println("After Transfer:");
                    System.out.println(user1.getUserName() + "'s Total Money: " + user1.getTotalMoney());
                    System.out.println(user2.getUserName() + "'s Total Money: " + user2.getTotalMoney());

                    System.out.println("Before Payment:");
                    System.out.println(user1.getUserName() + "'s Total Money: " + user1.getTotalMoney());

                    user1.makePayment(200);

                    System.out.println("After Payment:");
                    System.out.println(user1.getUserName() + "'s Total Money: " + user1.getTotalMoney());
                    break;
                case 3:
                    Calculator calculator = new Calculator();
                    System.out.println("Calculator Operations:");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.print("Enter your choice (1/2/3/4): ");
                    int choice1 = scanner.nextInt();
                    calculator.calc(choice1);
                    break;
            }
        }
    }
}
