package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day1_InterviewQuestions {

    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList(
                "Amit Verma",
                "Arun Kumar",
                "Ananya Rao",
                "Akash Malhotra",
                "Aishwarya Iyer",
                "Bhavya Shah",
                "Bhaskar Reddy",
                "Bharat Joshi",
                "Bindu Menon",
                "Chris Anderson",
                "Chaitanya Kulkarni",
                "Charan Teja",
                "Catherine Moore",
                "Divya Nair",
                "Ethan Miller",
                "Farhan Khan",
                "Farzana Begum",
                "Faisal Ahmed",
                "Francis Dsouza",
                "Gokul Raj",
                "Ganesh Iyer",
                "Gaurav Bansal",
                "Gayathri Devi",
                "Harini Iyer",
                "Harshita Jain",
                "Hari Krishnan",
                "Hitesh Patel",
                "Ibrahim Patel",
                "Ishaan Khanna",
                "Imran Sheikh",
                "Indhu Mathi",
                "Jason Williams",
                "Karthik Subramanian",
                "Laura Bennett",
                "Manoj Kulkarni",
                "Neha Gupta",
                "Oliver Brown",
                "Priya Malhotra",
                "Quentin Ross",
                "Rahul Mehta",
                "Sneha Rao",
                "Suresh Babu",
                "Shalini Gupta",
                "Sandeep Verma",
                "Swetha Rao",
                "Thomas Clark",
                "Uday Prakash",
                "Vikram Singh",
                "William Turner",
                "Xavier Martin",
                "Yash Agrawal",
                "Zoya Siddiqui"
        );

        //List of employee whose name starts with A

        List<String> results = employeeNames.stream().filter(employee -> employee.startsWith("A")).collect(Collectors.toList());
        System.out.println("Starting A letter: " +results);

        //count of employees

        long count = employeeNames.stream().count();
        System.out.println("Total Employees: " +count);



    }
}
