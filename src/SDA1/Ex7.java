package SDA1;

import java.util.Scanner;

public class Ex7 {
    //input: "baca"
    //output:  ["b","ba","bac","baca","a","ac","aca","c","ca"]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu cuvantul:");
        String word = scanner.nextLine();
        String[] sequences = new String[getNumberOfSequences(word)];
        int counter = 0;
        for (int i = 0; i < word.length()+1; i++) {
            for (int j = i+1; j < word.length()+1; j++) {
                if (i<j){
                    sequences[counter] = word.substring(i, j);
                }else{
                    sequences[counter] = word.substring(j, i);
                }
                counter++;
            }
        }
        String[] currentArray = new String[counter];
        for (int i = 0; i < counter; i++) {
            if (!isSequenceAlreadyInArray(sequences[i], currentArray)){
                System.out.print(sequences[i] + " ");
            }
            currentArray[i] = sequences[i];
        }
    }

    public static int getNumberOfSequences (String word){
        int sum = 0;
        for (int i = word.length(); i > 0; i--) {
            sum += i;
        }
        return sum;
    }

    public static boolean isSequenceAlreadyInArray(String sequence, String[] array){
        for (int i = 0; i < array.length; i++) {
            if (sequence.equals(array[i])){
                return true;
            }
        }
        return false;
    }
}
