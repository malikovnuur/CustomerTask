import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ExceptionClass {
        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer("Daniel", "Kimsanbaev", Country.KYRGYZSTAN, LocalDate.of(1999,9,13), "Kimsanbaev@gmail.com");
        Customer customer2 = new Customer("Daniyar", "Seyitkulov", Country.TAJIKSTAN, LocalDate.of(1998,11,4), "Daniyar@gmail.com");
        Customer customer3 = new Customer("Adilet", "Moldobaev", Country.KYRGYZSTAN, LocalDate.of(2002,9,3), "Adilet@gmail.com");
        Customer customer4 = new Customer("Amangeldi", "Berdibekov", Country.UZBEKISTAN, LocalDate.of(2000,5,8), "Berdi@gmail.com");
        Customer customer5 = new Customer("Aijamal", "Kimsanbaeva", Country.TURKEY, LocalDate.of(1996,3,11), "Aija@gmail.com");
        Customer customer6 = new Customer("Altynbek", "Nazarov", Country.TURKEY, LocalDate.of(1990,2,10), "Nazarkg@gmail.com");
        Customer customer7 = new Customer("Asya", "Jamalova", Country.KYRGYZSTAN, LocalDate.of(1999,5,14), "Asya@gmail.com");
        Customer customer8 = new Customer("Ayday", "jekshenova", Country.TAJIKSTAN, LocalDate.of(2001,8,22), "Ayka@gmail.com");
        Customer customer9 = new Customer("Ayperi", "Mamatova", Country.KAZAKSTAN, LocalDate.of(2004,04,14), "Mamatova@gmail.com");

        try {
            Customer customer10 = new Customer();
            Customer[] customers = {customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8};
            System.out.println("If click '1' button = 'get age'\n If click '2' button = 'same country'\n If click '3' button = 'sortCountry'\n If click '4' button = get AllUsers ");
            while (true) {
                switch (scanner.nextInt()) {
                    case 1 -> System.out.println(Arrays.toString(customer5.sameCountry(customers, scanner.next())));
                    case 2 -> System.out.println(Arrays.toString(customer10.sortCountry(customers)));
                    case 3 -> System.out.println(Arrays.toString(customer10.customers(customers)));
                    case 4 -> System.out.println((Arrays.toString(customer10.getAge(customers))));
                    default -> throw new ExceptionClass(" Error!! write correctly ");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("write by instruction ");
        }
    }

    public static void Text(){
        try (FileWriter fileWriter = new FileWriter("text.txt")){
            fileWriter.write("""
                    Customer деген класс тузунуз.
                    Полерерин толтурунуз аты, фамилиясы,
                    туулган олкосу,туулган жылы,почтасы
                    болсун.Дагы бир service деген интерфейс
                    ачып аны анын ичине 4 метод жазыныз." +
                    "1-кардардын жашын кайтаруучу метод жазыныз,
                    2-мамлекети окшош кардарларды кайтарыныз,
                    3-кардарлардын мамлекетин сорттоп чыгарыныз,
                    4-баардык кардарларды кайтаруучу метод жазыныз." +
                    "Ал интерфейсти Customer клласына impliments кылып
                    методдорго логикасын жазыныз.Mainдан жазган логиканызды иштетиниз");
                    """);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }public static void Read() throws FileNotFoundException {
        FileReader fileReader = new FileReader("text.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }

    }

