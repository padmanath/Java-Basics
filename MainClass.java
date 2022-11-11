package Collection;

import java.util.*;

public class MainClass {

	static List<StudentDetails> std;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		std = new ArrayList<>();
		std.add(new StudentDetails(02, "padmanathan", 17, 800));
		std.add(new StudentDetails(01, "shiva", 17, 1000));
		std.add(new StudentDetails(03, "dhamodharan", 15, 450));
		std.add(new StudentDetails(04, "praveen", 16, 1000));
		System.out.println("welcome.........!!!!!!");
		for (StudentDetails l : std)
			System.out.println(l);
		System.out.println("do you want to sort the order put yes or no");

		String ty = sc.next();
		boolean J=true;
		do {
		if ("yes".equals(ty)) {

			get();

		} else if ("no".equals(ty)) {
			System.out.println(" thank you for visiting");
			J=false;
		} else 
			System.out.println("enter the valed data");
		

	}while (J);
	}

	public static void getdetails() {
//		for (StudentDetails l : std) 
//		System.out.println(l);

		int userinput = sc.nextInt();

		switch (userinput) {

		case 1:
			Comparator<StudentDetails> com = new Comparator<StudentDetails>() {

				public int compare(StudentDetails A, StudentDetails B) {

					if (A.stdId > B.stdId)

						return 1;

					else

						return -1;
				}

			};

			Collections.sort(std, com);

			for (StudentDetails t : std) {
				System.out.println(t);
			}
			break;
		case 2:
			Comparator<StudentDetails> com3 = new Comparator<StudentDetails>() {

				public int compare(StudentDetails A, StudentDetails B) {

					return A.stNname.compareTo(B.stNname);
				}

			};

			Collections.sort(std, com3);

			for (StudentDetails t : std) {
				System.out.println(t);
			}
			break;

		case 3:
			Comparator<StudentDetails> com1 = new Comparator<StudentDetails>() {

				public int compare(StudentDetails A, StudentDetails B) {

					if (A.stdAge > B.stdAge)

						return 1;

					else

						return -1;
				}

			};

			Collections.sort(std, com1);

			for (StudentDetails t : std) {
				System.out.println(t);
			}
			break;

		case 4:
			Comparator<StudentDetails> com2 = new Comparator<StudentDetails>() {

				public int compare(StudentDetails A, StudentDetails B) {

					if (A.stdMarks > B.stdMarks)

						return 1;

					else

						return -1;
				}

			};

			Collections.sort(std, com2);

			for (StudentDetails t : std) {
				System.out.println(t);
			}
			break;

		default:
			System.out.println("incorrect number");

		}

	}

	public static void get() {
		
		System.out.println("Enter the number\n1.student id\n2.student name\n3.student age\n4.marksheet");
		getdetails();
		System.out.println("Do you want to contiane means yes or no");
		String condition = sc.next();
		boolean T = true;
		
		do {
			if ("yes".equals(condition)) {
				System.out.println("Enter the number\n1.student id\n2.student name\n3.student age\n4.marksheet");
				getdetails();

			} else if ("no".equals(condition)) {
				System.out.println(" thank you for visiting");
				T = false;
				
			} else {
				System.out.println("enter the valed data");
			}

		} while (T);

	}

}
