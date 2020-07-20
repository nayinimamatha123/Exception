package exception;
import java.util.Scanner;

public class Exception {
	    private final double INTEREST1 = 0.2;
	    private int standard1 = 0;
	    private int area1 = 0;
	    private int duration1 = 0;
	    private int totalCost1;

	    public Exception() {
	        this.standard1 = 0;
	        this.area1 = 0;
	        this.duration1 = 30 * 6;
	    }

	    public void takeInput1() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Select Material Standard");
	        System.out.println(
	                "1. 1200INR if we use standard materials\n" +
	                        "2. 1500INR if we use above standard materials\n" +
	                        "3. 1800INR if customers needs high standard material\n"
	        );
	        System.out.println("Choose Your Option: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                standard1 = 1200;
	                break;
	            case 2:
	                standard1 = 1500;
	                break;
	            case 3:
	                standard1 = 1800;
	                break;
	        }
	        System.out.println("Do you want a Fully Automated? (Yes or No)\n");
	        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
	            standard1 = 2800;
	        }
	        System.out.println("Enter the Total area of the House (Sq. ft)");
	        this.area1 = scanner.nextInt();
	    }
}
	   