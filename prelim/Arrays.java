package prelim;

public class Arrays {
    public static void main(String[] args){
        
        //Single Dimensional Array
        int numbers[] = {1, 2, 3, 4, 5};
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        
        System.out.print("\n");
        
        //Multi-Dimensional Array
        int marks[][] = {
            {90, 92, 89, 98, 91},
            {93, 97, 95, 90, 92},
            {94, 96, 97, 89, 98}
        };
        
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < marks.length; i++){
            for(int j = 0;j < marks[i].length;j++){
                System.out.print(marks[i][j] + " ");
                sum += marks[i][j];
                count++; 
            }
            System.out.println();
        }
        
        double average = (double) sum/count;
        
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
                
    }
}
