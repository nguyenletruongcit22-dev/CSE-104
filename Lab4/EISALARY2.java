package Lab4;



import java.util.Scanner;

public class EISALARY2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total_hour = 0;
        double tang_ca = 0;
        double officeSalary = 0;
        double overtime_salary = 0;

        for (int i = 0; i < n; i++) {
            double offHour = 0;
            double otHour = 0;
            double offSalary = 0;
            double otSalary = 0;
            
            for (int j = 0; j < 5; j++) {
                double day = sc.nextDouble();
                if (day > 8) {
                    otHour += day - 8;
                    offHour += 8;
                } else {
                    offHour += day;
                }
            }

            double salary_hour = sc.nextDouble();
            offSalary = offHour * salary_hour;
            otSalary = otHour * salary_hour * 1.5;
            System.out.println(offSalary + otSalary);

            total_hour += offHour;
            tang_ca += otHour;
            officeSalary += offSalary;
            overtime_salary += otSalary;
        }

        if (total_hour > 0)
            System.out.printf("%.2f\n", officeSalary / total_hour);
        else
            System.out.printf("0.00\n");

        if (tang_ca > 0)
            System.out.printf("%.2f\n", overtime_salary / tang_ca);
        else
            System.out.printf("0.00\n");
    }
}

