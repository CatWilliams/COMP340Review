package COMP340Midterm;

import java.util.Scanner;

public class Chap4Multichoice {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] answers = {
                "D", "B", "B", "A", "A", "B", "B", "B", "A", "C",
                "B", "C", "C", "B", "A", "B", "A", "B", "A", "A",
                "B", "C", "C", "A", "B", "B", "C", "B", "C", "B"};

        String[] responses = new String[30];
        int score = 0;

 
        // Questions and user input
        for (int i = 0; i < 30; i++) {
            // Print each question
            switch (i) {
            case 0:
                System.out.println("1. A thread differs from a process because it:");
                System.out.println("A. Has its own independent address space.");
                System.out.println("B. Shares the same address space with other threads in the process.");
                System.out.println("C. Cannot be scheduled individually.");
                System.out.println("D. Runs independently of the OS.");
                break;
            case 1:
                System.out.println("2. A single-threaded process:");
                System.out.println("A. Has multiple execution paths.");
                System.out.println("B. Contains only one thread of execution.");
                System.out.println("C. Allows multiple users to access the same data.");
                System.out.println("D. Requires multithreading to run.");
                break;
            case 2:
                System.out.println("3. A benefit of using threads in a process is:");
                System.out.println("A. Reduced process priority.");
                System.out.println("B. Improved time and communication efficiency.");
                System.out.println("C. Increased memory usage.");
                System.out.println("D. Reduced communication between threads.");
                break;
            case 3:
                System.out.println("4. When a process is suspended, what happens to its threads?");
                System.out.println("A. Only the main thread is suspended.");
                System.out.println("B. All threads in the process are also suspended.");
                System.out.println("C. Some threads continue running.");
                System.out.println("D. Threads become independent processes.");
                break;
            case 4:
                System.out.println("5. Thread synchronization is achieved by:");
                System.out.println("A. Allocating unique address space for each thread.");
                System.out.println("B. Using a common address space for all threads in the process.");
                System.out.println("C. Limiting the number of threads per process.");
                System.out.println("D. Isolating each thread's resources.");
                break;
            case 5:
                System.out.println("6. User-Level Threads (ULTs) are managed by:");
                System.out.println("A. The OS kernel.");
                System.out.println("B. The application itself.");
                System.out.println("C. The hardware.");
                System.out.println("D. External drivers.");
                break;
            case 6:
                System.out.println("7. A disadvantage of ULTs is:");
                System.out.println("A. They require kernel mode for thread switching.");
                System.out.println("B. They are blocked if the OS has system calls blocking.");
                System.out.println("C. They use too much CPU time.");
                System.out.println("D. They require special hardware support.");
                break;
            case 7:
                System.out.println("8. What is jacketing?");
                System.out.println("A. Converting blocking calls into non-blocking calls.");
                System.out.println("B. Scheduling multiple processes on a single CPU.");
                System.out.println("C. Allocating extra memory to each process.");
                System.out.println("D. Isolating processes from kernel interference.");
                break;
            case 8:
                System.out.println("9. An advantage of Kernel-Level Threads (KLTs) is:");
                System.out.println("A. They cannot utilize multiple processors.");
                System.out.println("B. The kernel can schedule threads across multiple CPUs.");
                System.out.println("C. They are managed by applications only.");
                System.out.println("D. They require no kernel support.");
                break;
            case 9:
                System.out.println("10. In a 1:1 thread-to-process relationship:");
                System.out.println("A. Each thread has multiple processes.");
                System.out.println("B. Each process has a unique thread.");
                System.out.println("C. Each thread shares resources with others.");
                System.out.println("D. Threads cannot access system calls.");
                break;
            case 10:
                System.out.println("11. A 1:M thread relationship means:");
                System.out.println("A. Multiple threads can access multiple processes.");
                System.out.println("B. One thread can access multiple processes.");
                System.out.println("C. Multiple processes share one thread.");
                System.out.println("D. Multiple threads share one resource.");
                break;
            case 11:
                System.out.println("12. Which of the following has an M:1 relationship?");
                System.out.println("A. Traditional UNIX systems.");
                System.out.println("B. Single-threaded applications.");
                System.out.println("C. Multithreaded Linux applications.");
                System.out.println("D. Solaris using multiple threads in a single process.");
                break;
            case 12:
                System.out.println("13. In Windows, a thread goes from 'Waiting' to 'Ready' when:");
                System.out.println("A. Time has expired.");
                System.out.println("B. A required resource becomes available.");
                System.out.println("C. The user terminates the thread.");
                System.out.println("D. It encounters an error.");
                break;
            case 13:
                System.out.println("14. A thread state transition from 'Waiting' to 'Transition' occurs when:");
                System.out.println("A. All resources are available.");
                System.out.println("B. The thread has taken too long in the waiting state.");
                System.out.println("C. The OS is ready to schedule it.");
                System.out.println("D. Another process terminates.");
                break;
            case 14:
                System.out.println("15. Thread synchronization is crucial for:");
                System.out.println("A. Running multiple threads with separate address spaces.");
                System.out.println("B. Managing shared resources among threads.");
                System.out.println("C. Restricting thread execution.");
                System.out.println("D. Increasing memory allocation.");
                break;
            case 15:
                System.out.println("16. What is the function of the OS dispatcher?");
                System.out.println("A. Terminate processes.");
                System.out.println("B. Transfer the CPU from one process to another.");
                System.out.println("C. Create child processes.");
                System.out.println("D. Delete unused threads.");
                break;
            case 16:
                System.out.println("17. Kernel-Level Threads are advantageous because:");
                System.out.println("A. They can be managed entirely by applications.");
                System.out.println("B. They support concurrency across multiple processors.");
                System.out.println("C. They do not require kernel mode switching.");
                System.out.println("D. They cannot block each other.");
                break;
            case 17:
                System.out.println("18. A context switch in multithreading is:");
                System.out.println("A. Switching between two threads in the same process.");
                System.out.println("B. Allocating memory to a process.");
                System.out.println("C. Changing the scheduling policy.");
                System.out.println("D. Starting a new process.");
                break;
            case 18:
                System.out.println("19. A 'New' to 'Ready' transition occurs when:");
                System.out.println("A. The process is scheduled to execute.");
                System.out.println("B. The process is created and waits to be scheduled.");
                System.out.println("C. The process is blocked.");
                System.out.println("D. The process terminates.");
                break;
            case 19:
                System.out.println("20. In multithreading, the 'Running' to 'Blocked' transition happens when:");
                System.out.println("A. The thread completes its task.");
                System.out.println("B. The thread waits for a resource.");
                System.out.println("C. The OS reboots.");
                System.out.println("D. Another thread is terminated.");
                break;
            case 20:
                System.out.println("21. What does thread jacketing accomplish?");
                System.out.println("A. Increases CPU allocation.");
                System.out.println("B. Converts blocking calls to non-blocking calls.");
                System.out.println("C. Deletes all process threads.");
                System.out.println("D. Allocates additional memory.");
                break;
            case 21:
                System.out.println("22. A multithreaded process can:");
                System.out.println("A. Only run on a single processor.");
                System.out.println("B. Run multiple threads within the same address space.");
                System.out.println("C. Be scheduled by applications only.");
                System.out.println("D. Share resources with other processes.");
                break;
            case 22:
                System.out.println("23. Which thread management type allows threads to access system calls?");
                System.out.println("A. User-Level Threads.");
                System.out.println("B. Kernel-Level Threads.");
                System.out.println("C. Application-Level Threads.");
                System.out.println("D. Hardware Threads.");
                break;
            case 23:
                System.out.println("24. A Windows thread goes from 'Transition' to 'Ready' when:");
                System.out.println("A. Another process ends.");
                System.out.println("B. Necessary resources are available.");
                System.out.println("C. Time has expired.");
                System.out.println("D. It encounters an error.");
                break;
            case 24:
                System.out.println("25. Threads in a 1:1 mapping:");
                System.out.println("A. Share memory with other threads.");
                System.out.println("B. Have a one-to-one mapping with processes.");
                System.out.println("C. Are unable to execute in parallel.");
                System.out.println("D. Share address space across processes.");
                break;
            case 25:
                System.out.println("26. In which scenario would thread synchronization be necessary?");
                System.out.println("A. When threads share an isolated memory area.");
                System.out.println("B. When threads require the same resource.");
                System.out.println("C. When threads execute independently.");
                System.out.println("D. When threads are terminated.");
                break;
            case 26:
                System.out.println("27. Which is a benefit of a multithreaded process?");
                System.out.println("A. Improved CPU efficiency.");
                System.out.println("B. Independent resource allocation for each thread.");
                System.out.println("C. Memory separation between threads.");
                System.out.println("D. Reduced process execution speed.");
                break;
            case 27:
                System.out.println("28. Thread communication efficiency refers to:");
                System.out.println("A. Reduced memory usage.");
                System.out.println("B. Faster data exchange between threads.");
                System.out.println("C. Reduced thread execution.");
                System.out.println("D. Restricted resource access.");
                break;
            case 28:
                System.out.println("29. In an M:1 thread-to-process relationship:");
                System.out.println("A. Each thread requires its own process.");
                System.out.println("B. Threads execute independently of the process.");
                System.out.println("C. Multiple threads can exist in one process.");
                System.out.println("D. Processes share memory with each other.");
                break;
            case 29:
                System.out.println("30. Which of the following describes jacketing?");
                System.out.println("A. Switching between threads without the OS.");
                System.out.println("B. Blocking I/O system calls for threads.");
                System.out.println("C. Allowing threads to safely access shared resources.");
                System.out.println("D. Using kernel mode for thread execution.");
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
