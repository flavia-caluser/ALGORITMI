package SDA1;

import java.util.Scanner;

public class Ex4 {
    //verificare de rotatie a unui string
      //ultimul caracter devine primul si restul isi modifica pozitia cu +1

    //parcurg string-urile pe caractere
      //daca ultimul caracter al string1 == cu primul caracter al string2 si
      // celelalte caractere de la string1 au corespondent la string2 cu o
      // pozitie in plus atunci string2 e rotatie de string1
    //EXEMPLU DE ROTATIE: abc - cab
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul string:");
        String string1 = scanner.nextLine();
        System.out.println("Introdu al doilea string:");
        String string2 = scanner.nextLine();
        if (string1.length() != string2.length()){
            System.out.println("String-ul al doilea nu e rotatie a primului string");
        }else{
            int contor = 0;
            if (string1.charAt(string1.length()-1) == string2.charAt(0)) {
                for (int i = 0; i < string1.length()-1; i++) {
                    if (string1.charAt(i) == string2.charAt(i+1)){
                        contor++;
                    }
                }
            }
            if (contor == string1.length()-1){
                System.out.println("String-ul 2 este rotatie a string-ului 1");
            }else {
                System.out.println("String-ul al doilea nu e rotatie a primului string");
            }
        }
    }
}
