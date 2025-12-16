package String;

// Ques165.java
// LeetCode 165 : Compare Version Numbers
// Language: Java
// IDE: IntelliJ IDEA compatible

public class Ques165 {

    // Ye function do version strings ko compare karta hai
    // Return:
    // -1 -> version1 chhota hai
    //  1 -> version1 bada hai
    //  0 -> dono equal hain
    public int compareVersion(String version1, String version2) {

        // Step 1:
        // Dono version ko "." ke basis par split kar diya
        // Example:
        // "1.2.10" -> ["1", "2", "10"]
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        // Step 2:
        // Dono arrays me se jo bada length hoga
        // utni baar loop chalana padega
        int len = Math.max(v1.length, v2.length);

        // Step 3:
        // Har index par numbers ko compare karenge
        for (int i = 0; i < len; i++) {

            // Agar v1 me ith index exist karta hai
            // to usko integer me convert kar lo
            // warna maan lo value 0 hai
            int num1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;

            // Same cheez version2 ke liye
            int num2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;

            // Step 4:
            // Jaise hi difference mile, turant return kar do
            if (num1 < num2) {
                return -1;   // version1 chhota hai
            }

            if (num1 > num2) {
                return 1;    // version1 bada hai
            }
        }

        // Step 5:
        // Agar sab parts equal nikle
        return 0;
    }

    // (Optional) main method sirf IntelliJ me test karne ke liye
    public static void main(String[] args) {
        Ques165 obj = new Ques165();

        System.out.println(obj.compareVersion("1.0.1", "1"));      // Output: 1
        System.out.println(obj.compareVersion("1.01", "1.001"));   // Output: 0
        System.out.println(obj.compareVersion("1.0", "1.0.0"));    // Output: 0
        System.out.println(obj.compareVersion("0.1", "1.1"));      // Output: -1
    }
}

