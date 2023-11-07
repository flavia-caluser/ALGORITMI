import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
    //MAI TREBUIE SA SCAP DE SPATII
    public static void main(String[] args) {
        String characters = "!tnus ubn eraamrgorp al";
        String document = "Sunt bun la programare";
        System.out.println(document);
        System.out.println(canBeGenerated(characters.toLowerCase(), document.toLowerCase()));
    }
    public static boolean canBeGenerated(String characters, String document){
        //generez mapa in care cheia este fiecare caracter din characters si valoarea este de cate ori
        // apare
        //pentru fiecare caracter din document
        //verific daca mapa nu contine ca si cheie caracterul curent sau daca valoarea de la caracterul
        // curent din mapa este 0
          //return false;
        //scad de la cheia caracterul curent din valoare 1
        //return true;
        Map<Character, Integer> appearances = new HashMap<>();
        for(int i=0; i< characters.length();i++){
            char key = characters.charAt(i);
            if(!appearances.containsKey(key)){
                appearances.put(key, 1);
            }else {
                appearances.put(key, appearances.get(key) +1);
            }
        }
        for(int i=0; i< document.length();i++){
            char currentKey = document.charAt(i);
            if(!appearances.containsKey(currentKey) || appearances.get(currentKey) == 0){
                return false;
            }
            int currentKeyValue = appearances.get(currentKey);
            appearances.put(currentKey,currentKeyValue-1);
        }
        return true;
    }
}
