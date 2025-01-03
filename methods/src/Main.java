public class Main {

// Сложные задачи (20)

// 1. Написать метод, который возвращает факториал заданного числа.

    public static int factorial(int num) {
        int result;
        if (num == 0 || num == 1)
            return 1;
        result = factorial(num - 1) * num;
        return result;
    }

// 2. Написать метод, который возвращает среднее арифметическое массива чисел.

    public static int sredArifmetic(int[] arr) {
        int sum = 0;
        int sum2 = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            sum2 = sum / arr.length;
        }
        return sum2;
    }

// 3. Написать метод, который возвращает сумму элементов массива.

    public static int summa(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

// 4. Написать метод, который возвращает произведение элементов массива.

    public static int proizveden(int[] arr) {
        int proiz = 1;
        for (int i = 0; i < arr.length; i++) {
            proiz = proiz * arr[i];
        }
        return proiz;
    }

// 5. Написать метод, который возвращает наибольшее число из массива.

    public static int naibolshChislo(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

// 6. Написать метод, который возвращает наименьшее число из массива.

    public static int naimenshChislo(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

// 7. Написать метод, который возвращает разницу между максимальным и минимальным элементом массива.

    public static int raznica(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int dif;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        dif = max - min;
        return dif;
    }

// 8. Написать метод, который возвращает сумму квадратов элементов массива.

    public static int summakvadratov(int[] arr) {
        int kvadrat = 0;
        int dif = 0;
        for (int i = 0; i < arr.length; i++) {
            kvadrat = arr[i] * arr[i];
            dif = dif + kvadrat;
        }
        return dif;
    }

// 9. Написать метод, который находит объем цилиндра по радиусу и высоте.

    public static void printObemCilindra(double radius, double visota) {
        double pi = 3.14159;
        double obem = 0;
        if (radius < 0 || visota < 0) {
            System.out.println("Числа должны быть положительными");
        } else {
            obem = pi * (radius * radius) * visota;
            System.out.println(obem);
        }
    }

// 10. Написать метод, который вычисляет гипотенузу прямоугольного треугольника по двум катетам.

    public static void printGipotenuzaPrimougTreug(double katet, double katet2) {
        double gipotenuza = 0;
        if (katet == katet2) {
//        if (katet < 0 || katet2 < 0) {
            System.out.print("Числа равны => ");
        }
        if (katet <= 0 || katet2 <= 0) {
            System.out.println("Числа должны быть положительными");
        } else {
            gipotenuza = Math.sqrt((katet * katet) + (katet2 * katet2));
            System.out.println(gipotenuza);
        }
    }

// 11. Написать метод, который возвращает сумму чисел от 1 до заданного числа без использования циклов и условий.

    public static int summaChicel(int chislo) {
        if (chislo == 0) {
            return 0;
        } else {
            return chislo + summaChicel(chislo - 1);
        }
    }

// 12. Написать метод, который проверяет, является ли число степенью двойки.

    public static void printProverka(int num) {
        boolean stepen;
        while (num % 2 == 0) {
            num /= 2;
        }
        if (num != 1) {
            stepen = false;
        } else {
            stepen = true;
        }
        System.out.println(stepen);
    }

// 13. Написать метод, который вычисляет сумму чисел, кратных 3 или 5, в заданном диапазоне.

    public static int summachicel(int chislo, int chislo2) {
        int sum = 0;
        for (int i = chislo; i <= chislo2; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
//                sum = sum + i;
                sum += i;
            }
        }
        return sum;
    }

// 14. Написать метод, который возвращает сумму цифр числа.

    public static int summaCifrChicla(int num) {
        int sum = 0;
//        if (num < 0) {
//            num = -num;
//        }
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

// 15. Написать метод, который возвращает произведение цифр числа.

    public static int proisvCifrChicla(int num) {
        int proiz = 0;
        int chislo = 1;
//        if (num < 0) {
//            num = -num;
//        }
        while (num > 0) {
            proiz = num % 10;
            chislo = chislo * proiz;
            num = num / 10;
        }
        return chislo;
    }

// 16. Написать метод, который возвращает количество цифр в числе.

    public static int kolicectvoCifr(int cifru) {
        if (cifru < 0) {
            return kolicectvoCifr(-cifru);
        } else if (cifru == 0) {
            return 0;
        } else {
            return 1 + kolicectvoCifr(cifru / 10);
        }
    }

// 17. Написать метод, который возвращает число, полученное в результате зеркального отображения (реверса) заданного числа.

    public static int reverse(int num) {
        int chislo = 0;
        int zerkalniu = 0;
        while (num != 0) {
            chislo = num % 10;
            zerkalniu = zerkalniu * 10 + chislo;
            num = num / 10;
        }
        return zerkalniu;
    }

// 18. Написать метод, который возвращает значение числа Фибоначчи с заданным номером.

    public static int Fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return Fibonacci(number - 1) + Fibonacci(number - 2);
    }

// 19. Написать метод, который возвращает длину окружности по заданному радиусу.

    public static double dlinaOkrujnosti(double radius) {
        double pi = 3.14159;
        double dlina = 0;
        while (dlina <= 0) {
            dlina = 2 * pi * radius;
        }
        return dlina;
    }

// 20. Написать метод, который проверяет, является ли треугольник прямоугольным по трём сторонам.

    public static double printprimougTreug(double gipotenuza, double katet, double katet2) {

        boolean treugolnik;
        double katetu = 0;
        gipotenuza = gipotenuza * gipotenuza;
        katetu = ((katet * katet) + (katet2 * katet2));
        if (gipotenuza == katetu);
        if (gipotenuza != katetu) {
            treugolnik = false;
        } else {
            treugolnik = true;
        }
        System.out.println(treugolnik);
        return katetu;
    }



// геометрия решается через формулы
// для циклов используем только рекурсию
// можно делать все через циклы, но факториал только через рекурсию
// 11 задание нельзя делать через циклы

// напишите метод, который возврашает что-то (void тут не используется)
// факториал: возвращаем int, название (факториал) и принимаем заданное число (public static int factorial(int num)

// 20 задание: формула сумма квадратов катетов = гипотенуза (Пифагор)



    public static void main(String[] args) {
        System.out.println();
        // 1
        System.out.print("Факториал: ");
        System.out.println(factorial(3));
        // 2
        int[] arr = {1,2,3,4,5};
        System.out.print("Среднее арифметическое: ");
        System.out.println(sredArifmetic(arr));
        // 3
        int[] arr2 = {2,3,5,8,9};
        System.out.print("Сумма элементов: ");
        System.out.println(summa(arr2));
        // 4
        int[] arr3 = {20,3,5};
        System.out.print("Произведение элементов: ");
        System.out.println(proizveden(arr3));
        // 5
        int[] arr4 = {4,25,13,5,-8};
        System.out.print("Наибольшее число: ");
        System.out.println(naibolshChislo(arr4) + "  ");
        // 6
        int[] arr5 = {4,-25,13,5,-8};
        System.out.print("Наименьшее число: ");
        System.out.println(naimenshChislo(arr5) + "  ");
        // 7
        int[] arr6 = {4,78,15,67,9};
        System.out.print("Разница: ");
        System.out.println(raznica(arr6) + "  ");
        // 8
        int[] arr7 = {4,8,9};
        System.out.print("Сумма квадратов: ");
        System.out.println(summakvadratov(arr7));
        // 9
        System.out.print("Объем цилиндра: ");
        printObemCilindra(5,5.5);
        // 10
        System.out.print("Гипотенуза прямоугольного треугольника по двум катетам: ");
        printGipotenuzaPrimougTreug(4.5,6);
        // 11
        System.out.print("Сумма чисел: ");
        System.out.println(summaChicel(20));
        // 12
        System.out.print("Является ли число степенью двойки: ");
        printProverka(5);
        // 13
        System.out.print("Сумма чисел, кратных 3 или 5: ");
        System.out.println(summachicel(90,100));
        // 14
        System.out.print("Cумма цифр числа: ");
        System.out.println(summaCifrChicla(123));
        // 15
        System.out.print("Произведение цифр числа: ");
        System.out.println(proisvCifrChicla(333));
        // 16
        System.out.print("Количество цифр в числе: ");
        System.out.println(kolicectvoCifr(567));
        // 17
        System.out.print("Зеркальное отображение заданного числа: ");
        System.out.println(reverse(159));
        // 18
        System.out.print("Фибоначчи: ");
        System.out.println(Fibonacci(8));
        // 19
        System.out.print("Длина окружности: ");
        System.out.println(dlinaOkrujnosti(8));
        // 20
        System.out.print("Является ли треугольник прямоугольным по трём сторонам: ");
        printprimougTreug(1,1,0);

    }
}