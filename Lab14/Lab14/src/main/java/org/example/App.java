package org.example;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
public class App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Выберите задание: ");
        String choice=scanner.nextLine();
        try {
            switch(choice) {
                case "1": {
                    Path file=Paths.get("profession.txt");
                    System.out.print("Введите название будущей профессии: ");
                    String profession=scanner.nextLine();
                    System.out.print("Введите информацию о будущей профессии: ");
                    String information=scanner.nextLine();
                    try(FileWriter writer=new FileWriter(file.toFile())) {
                        writer.write("Профессия: "+profession+System.lineSeparator()+information);
                    }
                    BasicFileAttributes attributes=Files.readAttributes(file,BasicFileAttributes.class);
                    System.out.println("Путь к файлу: "+file.toAbsolutePath());
                    System.out.println("Размер файла: "+attributes.size()+" байт");
                    System.out.println("Дата создания: "+new Date(attributes.creationTime().toMillis()));
                    System.out.println("Дата изменения: "+new Date(attributes.lastModifiedTime().toMillis()));
                    System.out.println("Обычный файл: "+attributes.isRegularFile());
                    System.out.println("Можно читать: "+Files.isReadable(file));
                    System.out.println("Можно записывать: "+Files.isWritable(file));
                    System.out.println("Содержимое файла:");
                    System.out.println(new String(Files.readAllBytes(file),"UTF-8"));
                    break;
                }
                case "2": {
                    Path file=Paths.get("f.txt");
                    StringBuilder data=new StringBuilder();
                    for(int i=0;i<10;i++) {
                        System.out.print("Введите целое число "+(i+1)+": ");
                        int number=Integer.parseInt(scanner.nextLine());
                        data.append(number).append(System.lineSeparator());
                    }
                    try(FileWriter writer=new FileWriter(file.toFile())) {
                        writer.write(data.toString());
                    }
                    String content=new String(Files.readAllBytes(file),"UTF-8");
                    System.out.println("Числа из файла:");
                    System.out.print(content);
                    String[] numbers=content.trim().split("\\s+");
                    long sum=0;
                    for(String number:numbers) sum+=Integer.parseInt(number);
                    double average=(double)sum/numbers.length;
                    int count=0;
                    for(String number:numbers) {
                        if(Integer.parseInt(number)>average) count++;
                    }
                    System.out.println("Среднее арифметическое: "+average);
                    System.out.println("Количество чисел больше среднего: "+count);
                    break;
                }
                case "3": {
                    Path fileF=Paths.get("f.txt");
                    Path fileG=Paths.get("g.txt");
                    Path fileH=Paths.get("h.txt");
                    Random random=new Random();
                    List<String> allNumbers=new ArrayList<>();
                    List<String> threeDigitNumbers=new ArrayList<>();
                    List<String> otherNumbers=new ArrayList<>();
                    for(int i=0;i<30;i++) {
                        int number=random.nextInt(1999)-999;
                        allNumbers.add(String.valueOf(number));
                        if(Math.abs(number)>=100&&Math.abs(number)<=999) {
                            threeDigitNumbers.add(String.valueOf(number));
                        } else {
                            otherNumbers.add(String.valueOf(number));
                        }
                    }
                    Files.write(fileF,allNumbers);
                    Files.write(fileG,threeDigitNumbers);
                    Files.write(fileH,otherNumbers);
                    System.out.println("Содержимое файла f:");
                    System.out.println(new String(Files.readAllBytes(fileF),"UTF-8"));
                    System.out.println("Трехзначные числа из файла g:");
                    System.out.println(new String(Files.readAllBytes(fileG),"UTF-8"));
                    System.out.println("Остальные числа из файла h:");
                    System.out.println(new String(Files.readAllBytes(fileH),"UTF-8"));
                    break;
                }
                case "4": {
                    Path file=Paths.get("body_mass.txt");
                    StringBuilder data=new StringBuilder();
                    for(int i=0;i<5;i++) {
                        System.out.print("Введите массу тела "+(i+1)+"-го человека: ");
                        double mass=Double.parseDouble(scanner.nextLine().replace(',','.'));
                        if(Double.isNaN(mass)||Double.isInfinite(mass)||mass<=0) {
                            System.out.println("Введите положительное число");
                            i--;
                            continue;
                        }
                        data.append(mass).append(System.lineSeparator());
                    }
                    try(FileWriter writer=new FileWriter(file.toFile())) {
                        writer.write(data.toString());
                    }
                    String content=new String(Files.readAllBytes(file),"UTF-8");
                    System.out.println("Масса тела из файла:");
                    System.out.print(content);
                    String[] masses=content.trim().split("\\s+");
                    double sum=0;
                    for(String mass:masses) sum+=Double.parseDouble(mass);
                    System.out.println("Средняя масса тела: "+sum/masses.length);
                    break;
                }
                case "5": {
                    Path file=Paths.get("f.txt");
                    StringBuilder data=new StringBuilder();
                    for(int i=0;i<10;i++) {
                        System.out.print("Введите целое число "+(i+1)+": ");
                        int number=Integer.parseInt(scanner.nextLine());
                        data.append(number).append(System.lineSeparator());
                    }
                    try(FileWriter writer=new FileWriter(file.toFile())) {
                        writer.write(data.toString());
                    }
                    String content=new String(Files.readAllBytes(file),"UTF-8");
                    System.out.println("Числа из файла:");
                    System.out.print(content);
                    String[] numbers=content.trim().split("\\s+");
                    int count=0;
                    for(String number:numbers) {
                        long value=Long.parseLong(number);
                        if(Math.abs(value)%10==5) count++;
                    }
                    System.out.println("Количество чисел, оканчивающихся на 5: "+count);
                    break;
                }
                default:
                    System.out.println("Неверный выбор");
            }
        } catch(IOException e) {
            System.out.println("Ошибка работы с файлом: "+e.getMessage());
        } catch(NumberFormatException e) {
            System.out.println("Ошибка: необходимо ввести число");
        }
    }
}