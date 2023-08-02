import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static Store store;

    private static void showMainMenu() {
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Create New Store");
            System.out.println("2. Exit");
            String firstChoice = scanner.nextLine();

            switch (firstChoice) {
                case "1" -> {
                    store = createNewStore();
                    store.showStoreMenu();
                }
                case "2" -> {
                    exitProgram();
                }
                default -> System.out.println("Incorrect Input Given.");
            }
        }
    }

    private static void exitProgram(){
        System.out.println("Thank you for using the system");
        System.exit(0);
    }

    private static Store createNewStore(){
        String name;
        while (true){
            System.out.println("Please enter the store name");
            name = scanner.nextLine();
            if (!name.isEmpty()){
                break;
            }else{
                System.out.println("Please enter a valid store name");
            }
        }
        name = name.trim();
        return new Store(name);
    }

        public static void main (String[]args){
            System.out.println("Welcome to the Store Manager");
            showMainMenu();
        }
    }
