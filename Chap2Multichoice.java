package COMP340Midterm;

import java.util.Scanner;

public class Chap2Multichoice {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] answers = {
        	    "C", "B", "A", "B", "B", "B", "D", "B", "B", "A", 
        	    "B", "B", "B", "B", "A", "B", "B", "B", "B", "B", 
        	    "B", "A", "C", "B", "B", "B", "B", "B", "C", "B"};
        
        String[] responses = new String[30];
        int score = 0;

 
        // Questions and user input
        for (int i = 0; i < 30; i++) {
            // Print each question
            switch (i) {
            case 0:
                System.out.println("1. The \"Ability to Evolve\" in OS design means that:");
                System.out.println("A. The OS can function without hardware updates.");
                System.out.println("B. The OS can update itself automatically.");
                System.out.println("C. New system functions won't interfere with existing services.");
                System.out.println("D. The OS will remove old features to improve speed.");
                break;
            case 1:
                System.out.println("2. An operating system benefits programmers by:");
                System.out.println("A. Simplifying hardware configuration.");
                System.out.println("B. Providing an interface between applications and hardware.");
                System.out.println("C. Limiting file management options.");
                System.out.println("D. Requiring direct control of I/O devices.");
                break;
            case 2:
                System.out.println("3. An API in the context of an operating system is:");
                System.out.println("A. The interface between application programs and utilities.");
                System.out.println("B. The interface between OS and hardware.");
                System.out.println("C. The set of OS services used by device drivers.");
                System.out.println("D. The programming language used in OS development.");
                break;
            case 3:
                System.out.println("4. Job Control Language (JCL) is used to:");
                System.out.println("A. Monitor CPU temperature.");
                System.out.println("B. Provide instructions for executing jobs.");
                System.out.println("C. Control hardware devices directly.");
                System.out.println("D. Compile OS-level programs.");
                break;
            case 4:
                System.out.println("5. Interrupts are a desirable feature in batch processing because they:");
                System.out.println("A. Decrease memory usage.");
                System.out.println("B. Allow immediate error handling.");
                System.out.println("C. Prioritize batch over real-time processing.");
                System.out.println("D. Restrict multiple processes from running.");
                break;
            case 5:
                System.out.println("6. User mode and kernel mode differ primarily in:");
                System.out.println("A. Accessibility of network resources.");
                System.out.println("B. Privilege levels and access to memory.");
                System.out.println("C. Amount of processor time allocated.");
                System.out.println("D. Number of applications that can be run.");
                break;
            case 6:
                System.out.println("7. In uniprogramming, CPU utilization is:");
                System.out.println("A. High due to simultaneous task processing.");
                System.out.println("B. Optimized by swapping tasks frequently.");
                System.out.println("C. Managed by multiple OS processes.");
                System.out.println("D. Low because the CPU is idle during wait times.");
                break;
            case 7:
                System.out.println("8. A process is defined as:");
                System.out.println("A. A single instruction executed by the CPU.");
                System.out.println("B. A task or program in execution, managed by the OS.");
                System.out.println("C. An OS command used to launch applications.");
                System.out.println("D. The physical representation of a program in memory.");
                break;
            case 8:
                System.out.println("9. A deadlock occurs when:");
                System.out.println("A. A process waits for I/O.");
                System.out.println("B. Two or more processes wait on each other indefinitely.");
                System.out.println("C. Processes fail to release memory.");
                System.out.println("D. A program runs out of memory.");
                break;
            case 9:
                System.out.println("10. The execution context of a process includes:");
                System.out.println("A. Internal data such as priority and I/O event status.");
                System.out.println("B. Only the code needed to run the process.");
                System.out.println("C. Instructions for system hardware.");
                System.out.println("D. A temporary stack for system calls.");
                break;
            case 10:
                System.out.println("11. In process management, the Program Counter (PC) is used to:");
                System.out.println("A. Manage memory allocation.");
                System.out.println("B. Track which instruction is currently being executed.");
                System.out.println("C. Monitor network connections.");
                System.out.println("D. Organize file storage.");
                break;
            case 11:
                System.out.println("12. The kernel of an operating system is responsible for:");
                System.out.println("A. Managing user accounts and profiles.");
                System.out.println("B. Handling process scheduling, memory, and device control.");
                System.out.println("C. Providing graphics rendering functions.");
                System.out.println("D. Serving as an interface for user applications.");
                break;
            case 12:
                System.out.println("13. Virtual memory enables an OS to:");
                System.out.println("A. Allocate memory for graphics processing.");
                System.out.println("B. Extend RAM by using disk space.");
                System.out.println("C. Increase CPU speed.");
                System.out.println("D. Limit the memory used by each process.");
                break;
            case 13:
                System.out.println("14. Paging in an OS refers to:");
                System.out.println("A. Fragmenting memory for faster access.");
                System.out.println("B. Transferring fixed-size memory pages between main and secondary memory.");
                System.out.println("C. Using extra memory to run multiple processes.");
                System.out.println("D. Adjusting memory size dynamically.");
                break;
            case 14:
                System.out.println("15. A real address differs from a virtual address in that it:");
                System.out.println("A. Refers to the physical location in memory.");
                System.out.println("B. Is an address generated by applications.");
                System.out.println("C. Is used only in virtual memory systems.");
                System.out.println("D. Points to the cache rather than RAM.");
                break;
            case 15:
                System.out.println("16. An Application Binary Interface (ABI) serves as:");
                System.out.println("A. A code interpreter for hardware instructions.");
                System.out.println("B. The interface between OS and application utilities.");
                System.out.println("C. A memory management tool.");
                System.out.println("D. A graphical interface for end-users.");
                break;
            case 16:
                System.out.println("17. The System Bus is responsible for:");
                System.out.println("A. Providing power to the CPU.");
                System.out.println("B. Connecting processor, memory, and I/O modules.");
                System.out.println("C. Loading the OS on startup.");
                System.out.println("D. Storing instructions for program execution.");
                break;
            case 17:
                System.out.println("18. A process index represents:");
                System.out.println("A. The ID of the main process in an OS.");
                System.out.println("B. The current process running in the OS.");
                System.out.println("C. The memory range for a process.");
                System.out.println("D. The code block size for each function.");
                break;
            case 18:
                System.out.println("19. Kernel mode allows the OS to:");
                System.out.println("A. Only access user applications.");
                System.out.println("B. Access privileged instructions and all memory.");
                System.out.println("C. Execute all commands as root.");
                System.out.println("D. Operate exclusively in virtual memory.");
                break;
            case 19:
                System.out.println("20. A buffer register is primarily used to:");
                System.out.println("A. Increase CPU clock speed.");
                System.out.println("B. Store temporary data during processing.");
                System.out.println("C. Control I/O device drivers.");
                System.out.println("D. Manage system power settings.");
                break;
            case 20:
                System.out.println("21. The function of an Address Register (AR) is to:");
                System.out.println("A. Store data being transferred.");
                System.out.println("B. Hold the memory address for read/write operations.");
                System.out.println("C. Control the speed of the CPU.");
                System.out.println("D. Manage network access.");
                break;
            case 21:
                System.out.println("22. The Instruction Set Architecture (ISA) refers to:");
                System.out.println("A. A layer between OS and hardware.");
                System.out.println("B. OS software design patterns.");
                System.out.println("C. User-mode applications.");
                System.out.println("D. Virtual memory configuration.");
                break;
            case 22:
                System.out.println("23. The purpose of the Program Control (PC) register is to:");
                System.out.println("A. Indicate available system memory.");
                System.out.println("B. Track system interrupts.");
                System.out.println("C. Keep track of the next instruction.");
                System.out.println("D. Allocate processor resources.");
                break;
            case 23:
                System.out.println("24. A process list includes:");
                System.out.println("A. The permissions for all users.");
                System.out.println("B. Steps and states of a process.");
                System.out.println("C. A list of system errors.");
                System.out.println("D. Available OS upgrades.");
                break;
            case 24:
                System.out.println("25. Base and limit registers are used to:");
                System.out.println("A. Control memory paging.");
                System.out.println("B. Specify the address range for a process.");
                System.out.println("C. Track I/O requests.");
                System.out.println("D. Determine the CPU frequency.");
                break;
            case 25:
                System.out.println("26. Multiprogramming improves CPU utilization by:");
                System.out.println("A. Scheduling only one task at a time.");
                System.out.println("B. Allowing multiple jobs to reside in memory.");
                System.out.println("C. Increasing virtual memory.");
                System.out.println("D. Running tasks in serial order.");
                break;
            case 26:
                System.out.println("27. An OS achieves multitasking by:");
                System.out.println("A. Limiting user privileges.");
                System.out.println("B. Using time-sharing for processes.");
                System.out.println("C. Increasing system interrupts.");
                System.out.println("D. Prioritizing batch processes.");
                break;
            case 27:
                System.out.println("28. Semaphore in OS context helps to:");
                System.out.println("A. Monitor system errors.");
                System.out.println("B. Avoid deadlock and synchronize tasks.");
                System.out.println("C. Control memory paging.");
                System.out.println("D. Track OS services.");
                break;
            case 28:
                System.out.println("29. Thrashing occurs when:");
                System.out.println("A. A system overheats.");
                System.out.println("B. The CPU is overclocked.");
                System.out.println("C. Excessive paging reduces performance.");
                System.out.println("D. Cache memory is full.");
                break;
            case 29:
                System.out.println("30. Context switching is used to:");
                System.out.println("A. Move data between two processes.");
                System.out.println("B. Save and restore process states.");
                System.out.println("C. Assign memory dynamically.");
                System.out.println("D. Limit CPU time.");
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
