package ru.netology.sqr;
public class SQRService {
    public int calculate(int x, int y) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= x && square <= y) {
                count++;
            }
        }
        return count;
    }
}
