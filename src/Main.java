import UdemyInterfacesChallenge.ISaveable;
import UdemyInterfacesChallenge.Monster;
import UdemyInterfacesChallenge.Player;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Player rom = new Player("Krooksoma", 3455, 250);
        System.out.println(rom.toString());
        saveObject(rom);
        rom.setWeapon("Bastard Sword");
        System.out.println(rom.getStrength());
        ISaveable were = new Monster("Werewolf", 35, 33);
//        the class is being cast to allow us to run the code
        System.out.println(((Monster) were).getStrength());
        saveObject(were);
        saveObject(rom);
        loadObject(rom);
        System.out.println(rom);

    }
    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose an option: " +
                "1 to enter a String" +
                "0 to quit.");

        while(!quit){
            System.out.println("Choose and option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
// passing ISaveable as parameter allowing us to use any object that implements this interface
    public static void saveObject(ISaveable objectToSave){
//        cycling through all the entries, saving then and returning
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
