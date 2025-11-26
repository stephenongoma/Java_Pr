import java.util.Scanner;

public class StudentMarksheet {

    public static void main(String[] args) {
        // Creating a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // --- 1. TITLE BLOCK ---
        System.out.println("\n=======================================================");
        System.out.println("Dedan Kimathi University of Technology");
        System.out.println("School of Computer Science and IT");
        System.out.println("Department of Computer Science");
        System.out.println("Academic Year: 2024/2025");
        System.out.println("STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("=======================================================\n");

        // Define unit names (for header printing)
        final String UNIT_1 = "CCS 2211";
        final String UNIT_2 = "CCS 2212";
        final String UNIT_3 = "CCS 2213";
        final String UNIT_4 = "CCS 2214";
        final String UNIT_5 = "CCS 2215";
        final String UNIT_6 = "CCS 2216";
        final String UNIT_7 = "CCS 2217";
        final int NUM_UNITS = 7; // Used only for calculation

        // -------------------------------------------------------------------
        // --- 2. INPUT CAPTURE AND VARIABLE DECLARATION ---
        // -------------------------------------------------------------------

        System.out.println("Please enter data for 5 students (ensure all marks are whole numbers):");
        System.out.println("----------------------------------------------------------------------\n");

        // --- Student 1 (Group Member 1:) ---
        System.out.println("--- Student 1 ---");
        System.out.print("Enter Registration Number: ");
        String regNo1 = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Full Name : ");
        String fullName1 = scanner.nextLine();
        System.out.print("Enter marks for " + UNIT_1 + ": ");
        int m1_u1 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_2 + ": ");
        int m1_u2 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_3 + ": ");
        int m1_u3 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_4 + ": ");
        int m1_u4 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_5 + ": ");
        int m1_u5 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_6 + ": ");
        int m1_u6 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_7 + ": ");
        int m1_u7 = scanner.nextInt();

        // --- Student 2 (Group Member 2: Stephen Ongoma) ---
        System.out.println("\n--- Student 2 ---");
        System.out.print("Enter Registration Number : ");
        String regNo2 = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Full Name : ");
        String fullName2 = scanner.nextLine();
        System.out.print("Enter marks for " + UNIT_1 + ": ");
        int m2_u1 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_2 + ": ");
        int m2_u2 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_3 + ": ");
        int m2_u3 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_4 + ": ");
        int m2_u4 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_5 + ": ");
        int m2_u5 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_6 + ": ");
        int m2_u6 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_7 + ": ");
        int m2_u7 = scanner.nextInt();

        // --- Student 3 (Sample Student 1) ---
        System.out.println("\n--- Student 3 ---");
        System.out.print("Enter Registration Number: ");
        String regNo3 = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Full Name: ");
        String fullName3 = scanner.nextLine();
        System.out.print("Enter marks for " + UNIT_1 + ": ");
        int m3_u1 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_2 + ": ");
        int m3_u2 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_3 + ": ");
        int m3_u3 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_4 + ": ");
        int m3_u4 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_5 + ": ");
        int m3_u5 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_6 + ": ");
        int m3_u6 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_7 + ": ");
        int m3_u7 = scanner.nextInt();

        // --- Student 4 (Sample Student 2) ---
        System.out.println("\n--- Student 4 ---");
        System.out.print("Enter Registration Number: ");
        String regNo4 = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Full Name: ");
        String fullName4 = scanner.nextLine();
        System.out.print("Enter marks for " + UNIT_1 + ": ");
        int m4_u1 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_2 + ": ");
        int m4_u2 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_3 + ": ");
        int m4_u3 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_4 + ": ");
        int m4_u4 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_5 + ": ");
        int m4_u5 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_6 + ": ");
        int m4_u6 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_7 + ": ");
        int m4_u7 = scanner.nextInt();

        // --- Student 5 (Sample Student 3) ---
        System.out.println("\n--- Student 5 ---");
        System.out.print("Enter Registration Number: ");
        String regNo5 = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Full Name: ");
        String fullName5 = scanner.nextLine();
        System.out.print("Enter marks for " + UNIT_1 + ": ");
        int m5_u1 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_2 + ": ");
        int m5_u2 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_3 + ": ");
        int m5_u3 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_4 + ": ");
        int m5_u4 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_5 + ": ");
        int m5_u5 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_6 + ": ");
        int m5_u6 = scanner.nextInt();
        System.out.print("Enter marks for " + UNIT_7 + ": ");
        int m5_u7 = scanner.nextInt();

        scanner.close(); // Close scanner once all input is done

        // -------------------------------------------------------------------
        // --- 3. CALCULATIONS ---
        // -------------------------------------------------------------------

        // Student 1 Calculations
        int totalMarks1 = m1_u1 + m1_u2 + m1_u3 + m1_u4 + m1_u5 + m1_u6 + m1_u7;
        double avgMarks1 = (double) totalMarks1 / NUM_UNITS;

        // Student 2 Calculations
        int totalMarks2 = m2_u1 + m2_u2 + m2_u3 + m2_u4 + m2_u5 + m2_u6 + m2_u7;
        double avgMarks2 = (double) totalMarks2 / NUM_UNITS;

        // Student 3 Calculations
        int totalMarks3 = m3_u1 + m3_u2 + m3_u3 + m3_u4 + m3_u5 + m3_u6 + m3_u7;
        double avgMarks3 = (double) totalMarks3 / NUM_UNITS;

        // Student 4 Calculations
        int totalMarks4 = m4_u1 + m4_u2 + m4_u3 + m4_u4 + m4_u5 + m4_u6 + m4_u7;
        double avgMarks4 = (double) totalMarks4 / NUM_UNITS;

        // Student 5 Calculations
        int totalMarks5 = m5_u1 + m5_u2 + m5_u3 + m5_u4 + m5_u5 + m5_u6 + m5_u7;
        double avgMarks5 = (double) totalMarks5 / NUM_UNITS;

        // -------------------------------------------------------------------
        // --- 4. FORMATTED OUTPUT (Using printf) ---
        // -------------------------------------------------------------------

        System.out.println("\n\n*********************************************************************************");
        System.out.println(" STUDENT MARK SHEET ");
        System.out.println("*********************************************************************************\n");

        // --- FORMAT STRINGS ---
        // Column widths: RegNo(16), Name(25), Units(8*7), Totals(8), Average(10), Status(8), Grade(6)
        final String HEADER_FORMAT = "| %-16s | %-25s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-10s | %-8s | %-6s |\n";
        final String DATA_FORMAT   = "| %-16s | %-25s | %-8d | %-8d | %-8d | %-8d | %-8d | %-8d | %-8d | %-8d | %-10.2f | %-8s | %-6s |\n";
        final String SEPARATOR     = "+------------------+---------------------------+----------+----------+----------+----------+----------+----------+----------+----------+------------+----------+--------+\n";

        // Separator
        System.out.print(SEPARATOR);

        // Header Row
        System.out.printf(HEADER_FORMAT,
                "Reg No.", "Full Name",
                UNIT_1, UNIT_2, UNIT_3, UNIT_4, UNIT_5, UNIT_6, UNIT_7,
                "TOTALS", "AVERAGE", "STATUS", "GRADE");

        // Separator
        System.out.print(SEPARATOR);

        // Data for Student 1
        System.out.printf(DATA_FORMAT,
                regNo1, fullName1,
                m1_u1, m1_u2, m1_u3, m1_u4, m1_u5, m1_u6, m1_u7,
                totalMarks1, avgMarks1, "", ""); // Status/Grade left blank

        // Data for Student 2
        System.out.printf(DATA_FORMAT,
                regNo2, fullName2,
                m2_u1, m2_u2, m2_u3, m2_u4, m2_u5, m2_u6, m2_u7,
                totalMarks2, avgMarks2, "", ""); // Status/Grade left blank

        // Data for Student 3
        System.out.printf(DATA_FORMAT,
                regNo3, fullName3,
                m3_u1, m3_u2, m3_u3, m3_u4, m3_u5, m3_u6, m3_u7,
                totalMarks3, avgMarks3, "", ""); // Status/Grade left blank

        // Data for Student 4
        System.out.printf(DATA_FORMAT,
                regNo4, fullName4,
                m4_u1, m4_u2, m4_u3, m4_u4, m4_u5, m4_u6, m4_u7,
                totalMarks4, avgMarks4, "", ""); // Status/Grade left blank

        // Data for Student 5
        System.out.printf(DATA_FORMAT,
                regNo5, fullName5,
                m5_u1, m5_u2, m5_u3, m5_u4, m5_u5, m5_u6, m5_u7,
                totalMarks5, avgMarks5, "", ""); // Status/Grade left blank

        // Separator
        System.out.print(SEPARATOR);

    }
}