package Classwork;
//## Задача 1
//**Вычисление log(N!)**
//Реализовать рекурсивную процедуру вычисления логарифма факториала.
//
//**Немного математики:**
//
//по свойству логарифмов:
//
//log(ab) = log(a) + log(b)
//
//значит:
//
//log(N!) = log(1 × 2 × 3 × ... × N) = log(1) + log(2) + log(3) + ... + log(N)
public class Logarifm {
    public static void main(String[] args) {
        System.out.println(logFact(20));
    }
    public static double logFact(double n) {
        if(n <= 1) {
            return 0;
        } else {
           return Math.log(n) + logFact(n - 1);
        }
    }
}
