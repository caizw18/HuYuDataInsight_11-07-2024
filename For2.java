public class For2 {
    
    public static void main(String[] args) {
        
        int[] marks = {125, 132, 95, 116, 110};

        int highest_marks = maximum(marks);

        System.out.println("The highest mark is: " + highest_marks);
    }

    public static int maximum(int[] marks){

        int MaxSoFar = marks[0];

        for(int num : marks){
            if(num > MaxSoFar)
                MaxSoFar = num;
        }

        return MaxSoFar;
    }
}