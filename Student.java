import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
class Student{
    int id;
    String name;
    int age;
    String course;

    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Student> st = new ArrayList<>();
        int choice =0;
        
        while (choice!=6){
            System.out.println("\n=====================================");
            System.out.println("     Student Management System       ");
            System.out.println("========================================");
            System.out.println("1. Add student");
            System.out.println("2. View All students");
            System.out.println("3. Search student");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");
            System.out.println("Enter your choice = ");
            choice =sc.nextInt();
            switch (choice){
                case 1:{
                    Student s = new Student();
                    System.out.print("Student id = ");
                    s.id=sc.nextInt();
                    boolean found = false;
                    
                    for (Student student : st){
                        if(student.id == s.id){
                            found = true;
                            break;
                        }
                    }
                    if(found){
                        System.out.println("student Id already exists! please enter a different Id.");
                    }
                    else{
                    System.out.print("Student name = ");
                    s.name = sc.next();
                    System.out.print("Student age = ");
                    s.age = sc.nextInt();
                    System.out.print("Student Course = ");
                    s.course = sc.next();
                    st.add(s);
                    System.out.println("Student added successfully");}
                    break;
                }
                case 2:{
                    if (st.isEmpty()){
                        System.out.println("The details are not available");
                    }
                    else {
                        System.out.println("\n =============================");
                        System.out.println("       Student deatils      ");
                        System.out.println("====================");
                        for(Student s:st){
                            System.out.println("ID: " +s.id);
                            System.out.println("Name: " +s.name);
                            System.out.println("Age: " +s.age);
                            System.out.println("Course: " +s.course);
                            System.out.println("-------------------");
                        }
                    }break;
                }
                case 3:{
                    System.out.println("enter id to search student");
                    int search = sc.nextInt();
                    boolean found =false;

                    for(Student s : st){
                        if (s.id == search){
                            System.out.println("Student found!");
                            System.out.println("Id : " +s.id);
                            System.out.println("Name :"+s.name);
                            System.out.println("Age :"+s.age);
                            System.out.println("Course :"+s.course);
                            found =true;
                            break;
                        }
                    }
                    if (found == false){
                        System.out.println("Student not found!");
                    }
                   break; 
                }
                case 4:{
                    System.out.println("enter id to update student details");
                    int update = sc.nextInt();
                    boolean found = false;

                    for(Student s : st){
                        if (s.id == update){
                            System.out.println("Student found! let's update it");
                           
                            System.out.println("Current name :"+s.name);
                            System.out.print("Enter new name: ");
                            s.name = sc.next();
                            System.out.println("current Age :"+s.age);
                            System.out.print("Enter new Age :");
                            s.age = sc.nextInt();
                            System.out.println(" Current Course :"+s.course);
                            System.out.print("Enter new course");
                            s.course = sc.next();
                            found =true;
                            break;  
                        }
                    }
                    if (found == false){
                        System.out.println("Student not found!");
                    }
                    break;   
                }
                case 5:{
                    System.out.println("Enter Id to delete student details");
                    int del = sc.nextInt();
                Iterator<Student> it =st.iterator();
                boolean found = false;
                while (it.hasNext()){
                    Student s = it.next();
                    if(s.id ==del){
                        it.remove();
                        System.out.println("Student deleted sucessfully");
                        found = true;
                        break;
                    }
                }
            if (found == false) {
              System.out.println("Student not found!.");
            }   
                    break;
                }
                case 6:{
                    System.out.println("*************************");
                    System.out.println("Thank you for using student management system");
                    System.out.println("*********************");
                    break;
                }
                default:{
                    System.out.println("Invalid choice!please enter 1 to 6. ");
                    break;
                }
            }
        }
    }
    
}