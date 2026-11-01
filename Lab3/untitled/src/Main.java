void main(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите номер задания");
    int zadanie = scanner.nextInt();
    scanner.nextLine();
    switch (zadanie){
        case 1:
            System.out.println("Введите строку");
            String line = scanner.nextLine();
            System.out.println("Индекс первого вхождения символа а:" + line.indexOf('а'));
            break;
        case 2:
            System.out.println("Введите email");
            String email = scanner.nextLine();
            int pos = email.indexOf('@');
            if(pos != -1){
                String domain = email.substring(pos + 1);
                System.out.println(domain);
            } else {
                System.out.println("Нет домена");
            }
            break;
        case 3:
            Employee[] a = {
                    new Employee("Ivanov", 1234.50),
                    new Employee("Petrov", 987.20),
                    new Employee("Sidorov", 1500.00)
            };
            Report.generateReport(a);
            break;
        case 4:
            String s = "xzzx xzxx xxxx xabx x12x xAax";
            Pattern pattern = Pattern.compile("[a-zA-Z]\\d{2}[a-zA-Z]");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                System.out.println(s.substring(matcher.start(), matcher.end()));
            }
            break;
        default:
            System.out.println("Нету такого задания");
            break;
    }
}
class Employee{
    String fullname;
    double salary;
    Employee(String fullname,double salary){
        this.fullname = fullname;
        this.salary = salary;
    }
}
class Report{
    static void generateReport(Employee[] a){
        for(int i=0;i<a.length;i++){
            System.out.printf("%-15s%10.2f%n", a[i].fullname, a[i].salary);
        }
    }
}