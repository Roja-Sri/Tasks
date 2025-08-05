package Task;

public class Task5_3 {

    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        } else {
            System.out.println("Access granted. Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);  
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
