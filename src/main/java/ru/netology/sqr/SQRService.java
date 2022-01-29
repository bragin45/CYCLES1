package ru.netology.sqr;

public class SQRService {

    public int sqrCalc(int bottomLimit, int upperLimit) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomLimit) {
                if (i * i <= upperLimit) {
                    count = count + 1;
                }
            }
        }
        System.out.println("Количество квадратов чисел, попавших в диапазон: " + count);
        return count;
    }


}
