import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
    public class Administrator {

        private static ArrayList<Apprenant> studentList = new ArrayList<>();
        private static Apprenant[] ApprenantArr;
        private static ArrayList<Classe> ClassList = new ArrayList<>();
        private static Classe[] ClassArr;

        public static void addStudent() {
            System.out.println("How Many Student Do You Want To ADD  : ");
            Scanner cin = new Scanner(System.in);
            int EnterNumber = cin.nextInt();
            ApprenantArr = new Apprenant[EnterNumber];
            for (int i = 0; i < EnterNumber; i++) {
                ApprenantArr[i] = new Apprenant();
                System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ");
                System.out.println("Enter the \"First Name\" : ");
                ApprenantArr[i].setNom(cin.nextLine());
                System.out.println("Enter the \"Last Name\": ");
                ApprenantArr[i].setPrenom(cin.nextLine());
                System.out.println("Enter the \"Date Of Birth\" : ");
                ApprenantArr[i].setdateNaissance(cin.nextLine());
                System.out.println("Enter the \"Address\" : ");
                ApprenantArr[i].setAdresse(cin.nextLine());
                System.out.println("Enter the \"Telephone Number\" : ");
                ApprenantArr[i].setNumeroTelephone(cin.nextLine());
                System.out.println("Enter the \"Class Number\" : ");
                ApprenantArr[i].setnumClasse(cin.nextInt());

            }   
            for (int i = 0; i < ApprenantArr.length; i++) {
                studentList.add(ApprenantArr[i]);
            }

        }

        public static void displayStudentList() {

            if (studentList.isEmpty()) {
                System.out.println("No Student Info available To Display It: ");
            } else {
                System.out.println("☀ ☀ ☀ ☀ ☀ ☀  The Students List ☀ ☀ ☀ ☀ ☀ ☀ ");
                for (int i = 0; i < studentList.size(); i++) {
                    System.out.println("The Student no: " + i);
                    System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ");
                    Student Ob_student = studentList.get(i);
                    System.out.println("\uD83D\uDE0E First Name is: " + Ob_student.getFirst_Name());
                    System.out.println("\uD83D\uDE03 Last Name is: " + Ob_student.getLast_Name());
                    System.out.println("\uD83D\uDE04 Date Of Birth is: " + Ob_student.getDate_of_birth());
                    System.out.println("\uD83D\uDE03 Address is: " + Ob_student.getAddress());
                    System.out.println("\uD83D\uDE01 Telephone Number is: " + Ob_student.getTele_Number());
                    System.out.println("\uD83D\uDC9B Class Number is: " + Ob_student.getClass_Number());
                    System.out.println("\uD83D\uDE06 Id Number is: " + Ob_student.getId_Number());

                }
            }
        }

        public static void modifyStudentInfo() {
            int choice;
            Scanner cin = new Scanner(System.in);

            if (studentList.isEmpty()) {
                System.out.println("No Student Info available To Modify It: ");
            } else {
                System.out.println("Please provide the \"First\" Name of the student whose information you'd like to update: ");
                String StudentName = cin.next();
                for (int i = 0; i < studentList.size(); i++) {
                    Apprenant Ob_student = studentList.get(i);
                    //StudentName Searching Process
                    if (Ob_student.getNom().equals(StudentName)) {

                        System.out.println("Please specify the modification you'd like to make:");
                        System.out.println("========= Student Information Menu ==========");
                        System.out.println("1. Modify First Name");
                        System.out.println("2. Modify Last Name");
                        System.out.println("3. Modify Date Of Birth");
                        System.out.println("4. Modify Address");
                        System.out.println("5. Modify Telephone Number");
                        System.out.println("6. Modify Class Number");
                        System.out.println("7. Modify ID Number");
                        System.out.println("Enter your choice: ");
                        choice = cin.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Enter new First Name: ");
                                String newFirstName = cin.next();
                                Ob_student.setNom(newFirstName);
                                break;
                            case 2:
                                System.out.println("Enter new Last Name: ");
                                String newLastName = cin.next();
                                Ob_student.setPrenom(newLastName);
                                break;
                            case 3:
                                System.out.println("Enter new Date Of Birth: ");
                                String new_date_of_birth = cin.next();
                                Ob_student.setDate_of_birth(new_date_of_birth);
                                break;
                            case 4:
                                System.out.println("Enter new Address: ");
                                String newAddress = cin.next();
                                Ob_student.setAddress(newAddress);
                                break;
                            case 5:
                                System.out.println("Enter new Telephone Number: ");
                                double new_tele_Number = cin.nextDouble();
                                Ob_student.setTele_Number(new_tele_Number);
                                break;
                            case 6:
                                System.out.println("Enter new Class Number: ");
                                int new_class_Number = cin.nextInt();
                                Ob_student.setClass_Number(new_class_Number);
                                break;
                            case 7:
                                System.out.println("Enter new ID Number: ");
                                int new_id_Number = cin.nextInt();
                                Ob_student.setId_Number(new_id_Number);
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }


                    } else {
                        System.out.println("Sorry, The name doesn't Exist ");
                    }
                }

            }

        }


        public static void DeleteStudent() {

            int choice;
            Scanner cin = new Scanner(System.in);

            if (studentList.isEmpty()) {
                System.out.println("No Student Info available To Modify It: ");
            } else {
                System.out.println("Please provide the \"First\" Name of the student whose information you'd like to Delete: ");
                String StudentName = cin.next();
                for (int i = 0; i < studentList.size(); i++) {
                    Student Ob_student = studentList.get(i);
                    //StudentName Searching Process
                    if (Ob_student.getFirst_Name().equals(StudentName)) {
                        studentList.remove(i);
                    } else {
                        System.out.println("Sorry, The name doesn't Exist ");
                    }
                }

            }

        }

        public static void searchStudent() {
            String nameToSearch;
            Scanner cin = new Scanner(System.in);

            if (studentList.isEmpty()) {
                System.out.println("No Student Info available To Display It: ");
            } else {
                System.out.println("Please enter the name you are searching for:");
                nameToSearch = cin.next();
                boolean found = false;

                for (int i = 0; i < studentList.size(); i++) {
                    Student ob_student = studentList.get(i);

                    // StudentName Searching Process
                    if (ob_student.getFirst_Name().equals(nameToSearch)) {
                        System.out.println("Student Found ✔ ");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("The Student not found ❗❗");
                }
            }
        }


        //My function for manage the class

        public static void addClass() {
            System.out.println("How Many Class Do You Want To ADD  : ");
            Scanner cin = new Scanner(System.in);
            int EnterNumber = cin.nextInt();
            ClassArr = new Class[EnterNumber];
            for (int i = 0; i < EnterNumber; i++) {
                ClassArr[i] = new Class();
                System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ");
                System.out.println("Enter the \"Class Number\" : ");
                ClassArr[i].setClass_Number(cin.nextInt());
                System.out.println("Enter the \"Class Name\" : ");
                ClassArr[i].setClass_Name(cin.next());
                System.out.println("Enter  \" effectif\" : ");
                ClassArr[i].setEffectif(cin.nextInt());
            }
            for (int i = 0; i < ClassArr.length; i++) {
                ClassList.add(ClassArr[i]);
            }


        }

        public static void displayClassList() {

            if (ClassList.isEmpty()) {
                System.out.println("No Class Info available To Display It: ");
            } else {
                System.out.println("☀ ☀ ☀ ☀ ☀ ☀  The Class List ☀ ☀ ☀ ☀ ☀ ☀ ");
                for (int i = 0; i < ClassList.size(); i++) {
                    System.out.println("The Class no In ENNA List: ");
                    System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ");
                    Class Ob_Class = ClassList.get(i);
                    System.out.println("\uD83D\uDE0E Class Number is : " + Ob_Class.getClass_Number());
                    System.out.println("\uD83D\uDE03 Class Name is: " + Ob_Class.getClass_Name());
                    System.out.println("\uD83D\uDE04 Date Of Birth is: " + Ob_Class.getEffectif());
                }
            }

        }


        public static void modifyClass() {
            int choice;
            Scanner cin = new Scanner(System.in);

            if (ClassList.isEmpty()) {
                System.out.println("No Class Info available To Modify It: ");
            } else {
                System.out.println("Please provide the \"Class\" Name  whose information you'd like to update: ");
                String ClassName = cin.next();
                for (int i = 0; i < ClassList.size(); i++) {
                    Class Ob_Class = ClassList.get(i);
                    //StudentName Searching Process
                    if (Ob_Class.getClass_Name().equals(ClassName)) {

                        System.out.println("Please specify the modification you'd like to make:");
                        System.out.println("========= Class Information Menu ==========");
                        System.out.println("1. Modify Class Number");
                        System.out.println("2. Modify Class_Name");
                        System.out.println("3. Modify Effectif");
                        choice = cin.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Enter new Class Number: ");
                                int newClassNumber = cin.nextInt();
                                Ob_Class.setClass_Number(newClassNumber);
                                break;
                            case 2:
                                System.out.println("Enter new Class Name: ");
                                String newClassName = cin.next();
                                Ob_Class.setClass_Name(newClassName);
                                break;
                            case 3:
                                System.out.println("Enter new effectif: ");
                                int new_effectif = cin.nextInt();
                                Ob_Class.setEffectif(new_effectif);
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }


                    } else {
                        System.out.println("\uD83D\uDE14Sorry, The name doesn't Exist ");
                    }
                }

            }


        }


        public static void DeleteClass() {
            Scanner cin = new Scanner(System.in);

            if (ClassList.isEmpty())
            {
                System.out.println("\uD83D\uDE2D No class available for deletion.");
            } else
            {
                System.out.println("Please provide the class name you'd like to delete: ");
                String className = cin.next();
                boolean classFound = false;

                for (int i = 0; i < ClassList.size(); i++)
                {
                    Class obClass = ClassList.get(i);

                    if (obClass.getClass_Name().equals(className))
                    {
                        ClassList.remove(i);
                        System.out.println("✨ The deletion process was successful! 🚀");
                        classFound = true;
                        break;
                    }
                }

                if (!classFound)
                {
                    System.out.println("\uD83D\uDE14 Sorry, this class name doesn't exist. ⚠");
                }
            }
        }


        public static void filterClass()
        {

            if (studentList.isEmpty())
            {
                System.out.println("\uD83D\uDE2D No class available for Filter.");
            }
            else
            {
                String Fname,Lname;
                int ClassNumber;
               //print student and his class
                //filter by ClassNumber
                System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
                System.out.println("📚  Students Sorted by Their Classes 🎓✨");
                for(int i = 0; i<studentList.size(); i++)
                {
                    Student ob = studentList.get(i);
                    Fname = ob.getFirst_Name();
                    Lname = ob.getLast_Name();
                    ClassNumber = ob.getClass_Number();
                    System.out.println("✅ : "+Fname +" "+Lname+" Class Number is : "+ClassNumber);
                }



            }

        }

    }