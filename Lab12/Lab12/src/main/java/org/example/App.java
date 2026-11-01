package org.example;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Выберите задание:");
        int choice=scanner.nextInt();
        switch(choice) {
            case 1: {
                LinkedHashMap<String,Computer> computers=new LinkedHashMap<>();
                computers.put("Lenovo IdeaPad",new Laptop("Lenovo IdeaPad",1,16,15.6));
                computers.put("ASUS VivoBook",new Laptop("ASUS VivoBook",2,8,15.6));
                computers.put("HP Pavilion",new Laptop("HP Pavilion",3,16,17.3));
                computers.put("Dell OptiPlex",new Desktop("Dell OptiPlex",4,16,"Dell 24"));
                computers.put("HP ProDesk",new Desktop("HP ProDesk",5,8,"HP 22"));
                computers.put("Acer Veriton",new Desktop("Acer Veriton",6,32,"Acer 27"));
                computers.put("Dell PowerEdge",new Server("Dell PowerEdge",7,64,2));
                computers.put("HPE ProLiant",new Server("HPE ProLiant",8,128,4));
                Iterator<String> iterator=computers.keySet().iterator();
                while(iterator.hasNext()) {
                    String key=iterator.next();
                    System.out.println("Ключ: "+key+", значение: "+computers.get(key));
                }
                break;
            }
            case 2: {
                List<University> universities=new ArrayList<>(Arrays.asList(
                        new University(1,"БГУ","Беларусь",1,Arrays.asList(5,5,4,5)),
                        new University(2,"БНТУ","Беларусь",2,Arrays.asList(4,4,5,4)),
                        new University(3,"БГУИР","Беларусь",3,Arrays.asList(5,5,5,5)),
                        new University(4,"МГУ","Россия",1,Arrays.asList(2,3,2,2)),
                        new University(5,"СПбГУ","Россия",2,Arrays.asList(4,5,4,5)),
                        new University(6,"Оксфорд","Великобритания",1,Arrays.asList(5,5,5,5)),
                        new University(7,"Гарвард","США",1,Arrays.asList(3,2,3,2)),
                        new University(8,"Кембридж","Великобритания",2,Arrays.asList(4,4,4,5))
                ));
                System.out.println("Университеты со средним рейтингом меньше 3:");
                Iterator<University> iterator=universities.iterator();
                while(iterator.hasNext()) {
                    University university=iterator.next();
                    if(university.getAverageRating()<3) {
                        System.out.println(university);
                    }
                }
                iterator=universities.iterator();
                while(iterator.hasNext()) {
                    University university=iterator.next();
                    if(university.getAverageRating()>=4) {
                        university.setRank(university.getRank()+1);
                    }
                }
                universities.sort(Comparator.comparingDouble(University::getAverageRating).reversed().thenComparing(University::getName,Comparator.reverseOrder()));
                System.out.println("Университеты по убыванию среднего рейтинга:");
                iterator=universities.iterator();
                while(iterator.hasNext()) {
                    University university=iterator.next();
                    System.out.printf("ID: %d, название: %s, средний рейтинг: %.2f%n",university.getId(),university.getName(),university.getAverageRating());
                }
                break;
            }
            default:
                System.out.println("Неверный номер задания");
        }
    }
    public static void printUniversities(List<University> universities,int rank) {
        Iterator<University> iterator=universities.iterator();
        while(iterator.hasNext()) {
            University university=iterator.next();
            if(university.getRank()==rank) {
                System.out.println(university);
            }
        }
    }
}