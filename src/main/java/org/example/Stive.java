package org.example;

public class Stive {
    public static int numbCal( int [] numbers){
        int max= numbers[0];
        int min= numbers[0];
        for( int i=1; i<numbers.length; i++){
            if (numbers[i]>max)
                max=numbers[i];
            if (numbers[i]<min)
                min = numbers[i];

        }
        return max-min;
    }
    public static void main(String[] args) {
        int [] numbers={23, 45, 62, 98, 65};
        int result = numbCal(numbers);
        System.out.println("The difference between the largest and smallest values is: " + result );

    }
}

//