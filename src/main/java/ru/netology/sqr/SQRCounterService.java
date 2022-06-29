package ru.netology.sqr;

public class SQRCounterService {
    public int sqrofCount(int min, int max) {
        int Sqr = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) >= min && (i * i) <= max) {
                System.out.println(i);
                Sqr++;
            }
        }
        return Sqr;
    }
}

