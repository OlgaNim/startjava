public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера");
        boolean current = true;
            if (true) {
                System.out.println("Модель компьютера: Hewlett-Packard");
            }
        byte numberInName = 0; 
            System.out.println("Имя устройства: DESKTOP-K1T" + numberInName + "VRR");
        short part1OfCPU = 3;
        char part2OfCPU = '\u002D';
        int part3OfCPU = 2310;
            System.out.println("Процессор: Intel(R) Core(TM) i" + part1OfCPU + part2OfCPU + part3OfCPU + "M CPU");
        float perfomanceCPU = 2.10F;
            System.out.println("Мощность процессора:" + perfomanceCPU + " GHz");
        long ProductCode =36;
            System.out.println("Код продукта: 2BD6B48A-FF" + ProductCode + "-48D0-A4F5-53D0344F39D1");
        double memory = 6.0;
            System.out.println("Оперативная память: " + memory + " ГБ" + "\n");

        System.out.println("2.Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        // процент скидки
        int discountPer = 11;
        int totalCost = penCost + bookCost;
        int discountAmount = totalCost / 100 * discountPer;
        int totalDiscountCost = totalCost - discountAmount;
            System.out.println("Общая стоимость товаров без скидки: " + totalCost);
            System.out.println("Сумма скидки: " + discountAmount);
            System.out.println("Общая стоимость товаров со скидкой: " + totalDiscountCost + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a       ");
        System.out.println("   J   a a  v   v  a a      ");
        System.out.println("J  J  aaaaa  V V  aaaaa     ");
        System.out.println(" JJ  a     a  V  a     a"+ "\n");

        System.out.println("4. Вывод min и max значений целых числовых типов byte, short, int, long");
        System.out.println("Вывод числового типа byte:");
        byte maxByte = 127;
        System.out.print(maxByte + ", ");
        byte incremByte = ++maxByte;
        System.out.print(incremByte + ", ");
        byte decremByte = --maxByte;
        decremByte = --maxByte;
        System.out.println(decremByte + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        // найдем разницу между числами
        c = a - b;
        a = a - c;
        b = b + c;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        a = b ^ a;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char ch36 = 36;
        char ch42 = 42;
        char ch64 = 64;
        char ch124 = 124;
        char ch126 = 126;
        System.out.println("36 " + ch36 + "\n" +"42 " + ch42 + "\n"+"64 " + ch64 + "\n"+"124 " + ch124 + "\n"+"126 " + ch126 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char ch1 = 47;
        char ch2 = 92;
        // нижнее подчеркивание
        char ch3 = 95;
        // левая скобка
        char ch4 = 40;
        // правая скобка
        char ch5 = 41;
        System.out.println("    " + ch1 + ch2 + "        ");
        System.out.println("   " + ch1 + "  " + ch2 + "     ");
        System.out.println("  " + ch1 + ch3 + ch4 + " " + ch5 + ch2 +"     ");
        System.out.println(" " + ch1 + "      " + ch2 + "     ");
        System.out.println("" + ch1 + ch3 + ch3 + ch3 + ch3 + ch1 + ch2 + ch3 + ch3 + ch2 + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        System.out.println("Число " + n + " содержит:");
        int z = n % 10;
        int y = n / 10 % 10;
        int x = n / 100;
        int s = x + y + z;
        int p = x * y * z;
        System.out.println("  сотен - " + x + "\n" + "  десятков - " + y + "\n" + "  единиц - " + z);
        System.out.println("Сумма его цифр = " +  s);
        System.out.println("Произведение = " + p + "\n");

        System.out.println("9. Вывод времени");
        int sec = 86399;
        int minutes = sec / 60;
        int hours = minutes / 60;
        int secRem = sec - (hours * 60 * 60);
        int minRem = secRem / 60;
        int secRemRem = secRem - (minRem * 60);
        System.out.println(hours + ":" + minRem + ":" + secRemRem);

    }
}