
package prelim;


public class practice {
    public static void main(String[] args) {
        int marks [] = {1,2,3,4,5};
                
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks [i] + " ");
            sum += marks[i];
            count++;
        }
        
        System.out.println(marks[0]);
        
        double average = (double) sum/count;
        
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
    }
}
