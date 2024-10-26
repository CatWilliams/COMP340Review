package COMP340Midterm;

import java.util.Scanner;

public class Chap1Multichoice {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] answers = {
            "B", "D", "C", "A", "D", "B", "A", "B", "D", "A", 
            "C", "B", "A", "B", "C", "A", "D", "C", "B", "D",
            "C", "B", "D", "A", "B", "D", "A", "B", "C", "C"};
       
        String[] responses = new String[30];
        int score = 0;

 
        // Questions and user input
        for (int i = 0; i < 30; i++) {
            // Print each question
            switch (i) {
                case 0:
                    System.out.println("1. ___ controls the operation of the computer and processes data.");
                    System.out.println("A. Address Register (AR)");
                    System.out.println("B. Processor");
                    System.out.println("C. System Bus");
                    System.out.println("D. Main Memory");
                    break;
                case 1:
                    System.out.println("2. ___ connects the Processor, Main Memory and I/O Modules facilitating communication.");
                    System.out.println("A. Interrupt");
                    System.out.println("B. Program");
                    System.out.println("C. Buffer Register (BR)");
                    System.out.println("D. System Bus");
                    break;
                case 2:
                    System.out.println("3. Contains the address of the location from where data is read or where data is written.");
                    System.out.println("A. Buffer Register (BR)");
                    System.out.println("B. CPU");	
                    System.out.println("C. Address Register (AR)");
                    System.out.println("D. Process");
                    break;
                case 3:
                    System.out.println("4. The interface between application programs and its utilities.");
                    System.out.println("A. Application Programming Interface (API)");
                    System.out.println("B. Application Binary Interface (ABI)");	
                    System.out.println("C. Job Control Language (JCL)");
                    System.out.println("D. Instruction Set Architecture (ISA)");
                    break;
                case 4:
                    System.out.println("5. The interface between the hardware and the OS.");
                    System.out.println("A. Application Programming Interface (API)");
                    System.out.println("B. Application Binary Interface (ABI)");	
                    System.out.println("C. Job Control Language (JCL)");
                    System.out.println("D. Instruction Set Architecture (ISA)");
                    break;
                case 5:
                    System.out.println("6. ___ combines two or more processors on a single piece of silicon.");
                    System.out.println("A. Program");
                    System.out.println("B. Multicore Processor");	
                    System.out.println("C. I/O Module");
                    System.out.println("D. Multiprocessor");
                    break;
                case 6:
                    System.out.println("7. A ___ is an instance of running a program, managed and scheduled by the OS. Includes running its code, data, and execution state.");
                    System.out.println("A. Process");
                    System.out.println("B. Interrupt");	
                    System.out.println("C. Deadlock");
                    System.out.println("D. Transport");
                    break;
                case 7:
                    System.out.println("8. The Memory Address Register (MAR) is used to:");
                    System.out.println("A. Hold data to be processed.");
                    System.out.println("B. Store the memory address to be accessed.");
                    System.out.println("C. Perform mathematical operations.");
                    System.out.println("D. Store the result of operations.");
                    break;
                case 8:
                    System.out.println("9. Which memory type is non-volatile?");
                    System.out.println("A. RAM");
                    System.out.println("B. Cache");
                    System.out.println("C. ROM");
                    System.out.println("D. Register");
                    break;
                case 9:
                    System.out.println("10. What does the Memory Buffer Register (MBR) hold?");
                    System.out.println("A. Instructions to execute.");
                    System.out.println("B. The result of an operation.");
                    System.out.println("C. Data read from or written to memory.");
                    System.out.println("D. Memory addresses to be accessed.");
                    break;
                case 10:
                    System.out.println("11. The role of a GPU is to:");
                    System.out.println("A. Store data.");
                    System.out.println("B. Execute operating system tasks.");
                    System.out.println("C. Perform parallel data processing.");
                    System.out.println("D. Manage memory addresses.");
                    break;
                case 11:
                    System.out.println("12. An interrupt allows:");
                    System.out.println("A. Sequential program execution.");
                    System.out.println("B. Modules to pause the CPU.");
                    System.out.println("C. The CPU to ignore external devices.");
                    System.out.println("D. Memory to be volatile.");
                    break;
                case 12:
                    System.out.println("13. Which type of locality has the tendency to involve a number of memory locations that are used at a time (clustered)?");
                    System.out.println("A. Spatial locality");
                    System.out.println("B. Temporal locality");
                    System.out.println("C. Static locality");
                    System.out.println("D. Global locality");
                    break;
                case 13:
                    System.out.println("14. What is the function of cache memory?");
                    System.out.println("A. Store the operating system.");
                    System.out.println("B. Hold frequently accessed data for quick CPU access.");
                    System.out.println("C. Control hardware connections.");
                    System.out.println("D. Provide long-term storage.");
                    break;
                case 14:
                    System.out.println("15. How does short I/O differ from long I/O?");
                    System.out.println("A. Short I/O involves complex I/O operations.");
                    System.out.println("B. Long I/O completes faster.");
                    System.out.println("C. Short I/O handles simple, quick operations.");
                    System.out.println("D. Long I/O cannot be interrupted.");
                    break;
                case 15:
                    System.out.println("16. A ___ register holds data during read and write operations.");
                    System.out.println("A. Address");
                    System.out.println("B. Buffer");
                    System.out.println("C. Processor");
                    System.out.println("D. Program Counter");
                    break;
                case 16:
                    System.out.println("17. What does the term 'volatile' mean in computer memory?");
                    System.out.println("A. Memory retains data when powered off.");
                    System.out.println("B. Memory loses data when powered off.");
                    System.out.println("C. Memory is accessed sequentially.");
                    System.out.println("D. Memory is located close to the CPU.");
                    break;
                case 17:
                    System.out.println("18. Which memory level typically has the largest storage?");
                    System.out.println("A. L1 cache");
                    System.out.println("B. L2 cache");
                    System.out.println("C. RAM");
                    System.out.println("D. Hard disk");
                    break;
                case 18:
                    System.out.println("19. What is the main purpose of a system bus?");
                    System.out.println("A. Manage OS tasks.");
                    System.out.println("B. Connect hardware components.");
                    System.out.println("C. Process data.");
                    System.out.println("D. Perform calculations.");
                    break;
                case 19:
                    System.out.println("20. Which interrupt type is triggered by hardware failure?");
                    System.out.println("A. Program");
                    System.out.println("B. Timer");
                    System.out.println("C. I/O");
                    System.out.println("D. Hardware failure");
                    break;
                case 20:
                    System.out.println("21. In memory hierarchy, which type is closest to the CPU?");
                    System.out.println("A. Disk");
                    System.out.println("B. Hard Drive");
                    System.out.println("C. Cache");
                    System.out.println("D. Secondary memory");
                    break;
                case 21:
                    System.out.println("22. When will a process be suspended?");
                    System.out.println("A. When the system cache is full, preventing any new data from being loaded."); 
                    System.out.println("B. If all the processes in main memory are in a blocked state.");
                    System.out.println("C. When a process is waiting for data from a buffer overflow, causing it to pause execution.");
                    System.out.println("D. If all the processes in main memory are in a ready state.");
                    break;
                case 22:
                    System.out.println("23. What is the difference between primary and secondary memory?");
                    System.out.println("A. Primary is volatile, secondary is non-volatile.");
                    System.out.println("B. Primary is larger, secondary is smaller.");
                    System.out.println("C. Primary is slower, secondary is faster.");
                    System.out.println("D. Primary is external, secondary is internal.");
                    break;
                case 23:
                    System.out.println("24. Why is data stored in registers faster to access?");
                    System.out.println("A. Registers are physically closer to the CPU.");
                    System.out.println("B. Registers are slower than cache.");
                    System.out.println("C. Registers are managed by the OS.");
                    System.out.println("D. Registers store large amounts of data.");
                    break;
                case 24:
                    System.out.println("25. The ___ is responsible for executing arithmetic and logical operations.");
                    System.out.println("A. Memory Management Unit (MMU)");
                    System.out.println("B. Arithmetic Logic Unit (ALU)");
                    System.out.println("C. Control Unit (CU)");
                    System.out.println("D. Input/Output Controller");
                    break;
                case 25:
                    System.out.println("26. What is data is managed in memory tables?");
                    System.out.println("A. Their physical appearance and colour in the user interface.");
                    System.out.println("B. Their location in memory, their status, and attributes.");
                    System.out.println("C. Their reference to memory, I/O and files.");
                    System.out.println("D. Their status and the portion of the memory being used.");
                    break;
                case 26:
                    System.out.println("27. Which term describes the time taken to access data from memory?");
                    System.out.println("A. Latency");
                    System.out.println("B. Bandwidth");
                    System.out.println("C. Throughput");
                    System.out.println("D. Overhead");
                    break;
                case 27:
                    System.out.println("28. What is an advantage of virtual memory?");
                    System.out.println("A. It uses more physical memory.");
                    System.out.println("B. It allows for larger applications to run.");
                    System.out.println("C. It speeds up disk access.");
                    System.out.println("D. It eliminates fragmentation.");
                    break;
                case 28:
                    System.out.println("29. The term 'PCB' stands for:");
                    System.out.println("A. Process Configure Block");
                    System.out.println("B. Process Control and Balance");
                    System.out.println("C. Process Control Block");
                    System.out.println("D. Peripheral Control Block");
                    break;
                case 29:
                    System.out.println("30. The ___ contains process elements like the identifier, state, and priority. Managed by the OS.?");
                    System.out.println("A. I/O Table");
                    System.out.println("B. Application Programming Interface (API)");
                    System.out.println("C. Process Control Block (PCB)");
                    System.out.println("D. Buffer Register");
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
