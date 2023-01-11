public class Main {
    public static void main(String[] args) {
        // Exercise 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Exercise 2
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameToUpperCase);

        // Exercise 3
        String newFullName = "Иванов Семён Семёнович";
        if(newFullName.contains("ё")){
            System.out.println(newFullName.replace('ё', 'е'));
        } else {
            System.out.println(newFullName);
        }
    }
}