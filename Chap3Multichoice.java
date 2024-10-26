package COMP340Midterm;

import java.util.Scanner;

public class Chap3Multichoice {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] answers = {
        	    "B", "B", "B", "B", "B", "B", "B", "A", "D", "C", 
        	    "B", "A", "B", "B", "C", "B", "B", "C", "A", "B", 
        	    "B", "D", "B", "B", "B", "B", "A", "B", "D", "C" };
        
        String[] responses = new String[30];
        int score = 0;

 
        // Questions and user input
        for (int i = 0; i < 30; i++) {
            // Print each question
            switch (i) {
            case 0:
                System.out.println("1. A process in an OS is defined as:");
                System.out.println("A. A single instruction in a program.");
                System.out.println("B. A unit of activity with program code and data.");
                System.out.println("C. A temporary file created by the OS.");
                System.out.println("D. An error in the operating system.");
                break;
            case 1:
                System.out.println("2. Two essential elements associated with a process are:");
                System.out.println("A. Memory size and CPU time.");
                System.out.println("B. Program code and associated data.");
                System.out.println("C. File pointers and memory table.");
                System.out.println("D. Cache memory and virtual address.");
                break;
            case 2:
                System.out.println("3. The element in a process that indicates if it’s running or waiting is called:");
                System.out.println("A. Process Index.");
                System.out.println("B. State.");
                System.out.println("C. Memory allocation.");
                System.out.println("D. Priority.");
                break;
            case 3:
                System.out.println("4. Context data in a process holds:");
                System.out.println("A. File system data.");
                System.out.println("B. The processor’s register data.");
                System.out.println("C. Cache data.");
                System.out.println("D. Memory buffer information.");
                break;
            case 4:
                System.out.println("5. What is a Process Control Block (PCB)?");
                System.out.println("A. A memory location for process-specific files.");
                System.out.println("B. A structure that holds data on a process.");
                System.out.println("C. An I/O management block.");
                System.out.println("D. A virtual memory allocation.");
                break;
            case 5:
                System.out.println("6. A trace of a process is:");
                System.out.println("A. A list of files accessed.");
                System.out.println("B. A record of executed instructions.");
                System.out.println("C. An error log for the process.");
                System.out.println("D. A memory allocation log.");
                break;
            case 6:
                System.out.println("7. The dispatcher in an OS is responsible for:");
                System.out.println("A. Allocating files to memory.");
                System.out.println("B. Moving the CPU between processes.");
                System.out.println("C. Managing disk storage.");
                System.out.println("D. Checking process errors.");
                break;
            case 7:
                System.out.println("8. Process spawning refers to:");
                System.out.println("A. Creating a child process.");
                System.out.println("B. Creating a process in virtual memory.");
                System.out.println("C. Terminating a process.");
                System.out.println("D. Moving a process to cache.");
                break;
            case 8:
                System.out.println("9. A process can be terminated by:");
                System.out.println("A. Running out of memory.");
                System.out.println("B. Reaching a HALT instruction.");
                System.out.println("C. Exceeding CPU time limits.");
                System.out.println("D. All of the above.");
                break;
            case 9:
                System.out.println("10. The state where a process is waiting for an event is:");
                System.out.println("A. Running.");
                System.out.println("B. Ready.");
                System.out.println("C. Blocked.");
                System.out.println("D. New.");
                break;
            case 10:
                System.out.println("11. A transition from Blocked to Ready occurs when:");
                System.out.println("A. The CPU is free.");
                System.out.println("B. The event it was waiting for occurs.");
                System.out.println("C. The process completes execution.");
                System.out.println("D. Memory is cleared.");
                break;
            case 11:
                System.out.println("12. Swapping out a process means:");
                System.out.println("A. Transferring the process to disk.");
                System.out.println("B. Loading it into cache.");
                System.out.println("C. Terminating the process.");
                System.out.println("D. Suspending it temporarily.");
                break;
            case 12:
                System.out.println("13. A process may be suspended due to:");
                System.out.println("A. Insufficient files.");
                System.out.println("B. A parent process request.");
                System.out.println("C. Network latency.");
                System.out.println("D. Memory overflow.");
                break;
            case 13:
                System.out.println("14. Memory tables in an OS manage:");
                System.out.println("A. Process states.");
                System.out.println("B. Real and virtual memory allocation.");
                System.out.println("C. User permissions.");
                System.out.println("D. I/O devices.");
                break;
            case 14:
                System.out.println("15. I/O tables track:");
                System.out.println("A. Virtual memory.");
                System.out.println("B. CPU load.");
                System.out.println("C. Device status and memory usage.");
                System.out.println("D. File history.");
                break;
            case 15:
                System.out.println("16. File tables in an OS store:");
                System.out.println("A. Device connections.");
                System.out.println("B. Information on files, status, and attributes.");
                System.out.println("C. The memory table index.");
                System.out.println("D. Data on the OS kernel.");
                break;
            case 16:
                System.out.println("17. The role of the Process Control Block (PCB) is to:");
                System.out.println("A. Track I/O requests.");
                System.out.println("B. Manage the OS’s state and process data.");
                System.out.println("C. Log system errors.");
                System.out.println("D. Monitor memory cache.");
                break;
            case 17:
                System.out.println("18. The user mode in OS restricts:");
                System.out.println("A. Access to all system files.");
                System.out.println("B. Full control over the CPU.");
                System.out.println("C. I/O instructions.");
                System.out.println("D. Memory paging.");
                break;
            case 18:
                System.out.println("19. The kernel mode allows:");
                System.out.println("A. Complete control over processor functions.");
                System.out.println("B. Only read access to CPU registers.");
                System.out.println("C. Partial access to virtual memory.");
                System.out.println("D. User access to I/O.");
                break;
            case 19:
                System.out.println("20. One key function of an OS kernel is:");
                System.out.println("A. File encryption.");
                System.out.println("B. Buffer management and I/O allocation.");
                System.out.println("C. Graphics processing.");
                System.out.println("D. Network setup.");
                break;
            case 20:
                System.out.println("21. In a multiprogramming environment, the dispatcher:");
                System.out.println("A. Terminates processes.");
                System.out.println("B. Schedules tasks in a queue.");
                System.out.println("C. Manages file allocation.");
                System.out.println("D. Executes I/O requests.");
                break;
            case 21:
                System.out.println("22. The process of swapping refers to:");
                System.out.println("A. Running processes in a queue.");
                System.out.println("B. Removing a process from memory.");
                System.out.println("C. Loading data into cache.");
                System.out.println("D. Transferring processes between memory and disk.");
                break;
            case 22:
                System.out.println("23. A suspended process is one that:");
                System.out.println("A. Is terminated by the OS.");
                System.out.println("B. Has been temporarily removed from memory.");
                System.out.println("C. Is actively running on the CPU.");
                System.out.println("D. Is in the ready state.");
                break;
            case 23:
                System.out.println("24. Process spawning typically creates:");
                System.out.println("A. A memory dump.");
                System.out.println("B. A child process.");
                System.out.println("C. A virtual address.");
                System.out.println("D. A system exception.");
                break;
            case 24:
                System.out.println("25. Process tables are crucial for:");
                System.out.println("A. Managing device drivers.");
                System.out.println("B. Tracking the current state of each process.");
                System.out.println("C. Storing user files.");
                System.out.println("D. Logging user sessions.");
                break;
            case 25:
                System.out.println("26. The OS manages virtual memory using:");
                System.out.println("A. Cache tables.");
                System.out.println("B. Memory tables.");
                System.out.println("C. I/O tables.");
                System.out.println("D. File tables.");
                break;
            case 26:
                System.out.println("27. When a process requires I/O, it enters the:");
                System.out.println("A. Blocked state.");
                System.out.println("B. Ready state.");
                System.out.println("C. Running state.");
                System.out.println("D. Terminated state.");
                break;
            case 27:
                System.out.println("28. In OS terminology, the ready state means:");
                System.out.println("A. The process is waiting for I/O.");
                System.out.println("B. The process is awaiting execution.");
                System.out.println("C. The process has completed execution.");
                System.out.println("D. The process is paused.");
                break;
            case 28:
                System.out.println("29. Virtual addresses are used in:");
                System.out.println("A. File storage.");
                System.out.println("B. Physical memory.");
                System.out.println("C. Disk management.");
                System.out.println("D. Virtual memory systems.");
                break;
            case 29:
                System.out.println("30. Memory paging is used to:");
                System.out.println("A. Decrease cache size.");
                System.out.println("B. Increase file size.");
                System.out.println("C. Map virtual memory to physical memory.");
                System.out.println("D. Allocate virtual addresses.");
                break;
            }

            // Get user's response
            System.out.print("Your answer: ");
            responses[i] = scan.nextLine().toUpperCase();

            // Feedback for user's answer
            if (responses[i].equals(answers[i])) {
            	System.out.println();
                System.out.println("CORRECT!");
                score++; //increment score for correct answers
            } else {
            	System.out.println();
                System.out.println("INCORRECT. The correct answer is: " + answers[i]);
            }
            
          //Creating a visual break
            System.out.println("\n");  
        }

        // Closing the scanner
        scan.close();
        
        //Display user's score
        System.out.println("Your final score: " + score + "/30");
        System.out.println();
        
        //Feedback based on score
        if (score >= 0 && score <= 15) {
            System.out.println("Please review your answers.");
        } else if (score >= 16 && score <= 20) {
            System.out.println("Good job!");
        } else if (score >= 21 && score <= 25) {
            System.out.println("Well done!");
        } else if (score >= 26 && score <= 30) {
            System.out.println("Great job!");
        }
    
    }   
}
