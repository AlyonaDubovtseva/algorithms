package Homework;

import java.util.HashMap;

//Напишите функцию, которая принимает на вход текст и возвращает количество вхождений каждого слова
//(с учетом окончаний. Т.е. "яблоко" и "яблока" -- это два разных слова ). Сложность -- O(n)
public class CountsOfWords {
    public static void main(String[] args) {
        String text = "яблоко яблока груша яблоки яблоко";
        HashMap<String, Integer> wordCount = counter(text);

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

    public static HashMap<String, Integer> counter(String text) {
        String[] array = text.split("\\s+|\\p{P}");
        HashMap<String, Integer> countWord = new HashMap<>();

        for(String word : array) {
            word = word.toLowerCase().trim();
            if(!(countWord.containsKey(word))) {
                countWord.put(word, 1);
            } else {
                countWord.put(word, countWord.get(word) + 1);
            }
        }
        return countWord;
    }
}
