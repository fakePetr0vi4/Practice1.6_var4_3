import java.util.Scanner;

     class main {
        public static String filter(Plant plant) {
            String filteredName = plant.getName().replaceAll("[AEIOUYaeiouаеиоуыэюяАЕИОУЫЭЮЯ]", "");
            filteredName = filteredName + "VGTBL";
            return filteredName;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название растения на английском или русском языке:");
            String plantName = scanner.nextLine();
            Plant plant = new Plant(plantName);
            String filteredName = filter(plant);
            System.out.println(plantName + ", "  + filteredName);
            System.out.println("Максимов Никита РИБО-05-22");
        }
    }


