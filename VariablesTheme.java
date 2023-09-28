public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера");
        boolean current = true;
        if (true) {
            System.out.println("Модель компьютера: Hewlett-Packard");
            }
        byte numberInName = 0; 
            System.out.println("Имя устройства: DESKTOP-K1T" + numberInName + "VRR");
        short part1OfCpu = 3;
        char part2OfCpu = '\u002D';
        int part3OfCpu = 2310;
            System.out.println("Процессор: Intel(R) Core(TM) i" + part1OfCpu + 
        part2OfCpu + part3OfCpu + "M CPU");
        float perfomanceCpu = 2.10F;
            System.out.println("Мощность процессора:" + perfomanceCpu + " GHz");
        long productCode =36;
            System.out.println("Код продукта: 2BD6B48A-FF" + productCode + "-48D0-A4F5-53D0344F39D1");
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
        byte byteNumber = 127;
        System.out.println(byteNumber + ", " + ++byteNumber + ", " + --byteNumber);
        System.out.println("Вывод числового типа short:");
        short shortNumber = 32767;
        System.out.println(shortNumber + ", " + ++shortNumber + ", " + --shortNumber);
        System.out.println("Вывод числового типа int:");
        int intNumber = 2147483647;
        System.out.println(intNumber + ", " + ++intNumber + ", " + --intNumber);
        System.out.println("Вывод числового типа long:");
        long longNumber = 9223372036854775807L;
        System.out.println(longNumber + ", " + ++longNumber + ", " + --longNumber + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        // найдем разницу между числами
        tmp = a - b;
        a -= tmp;
        b += tmp;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        int dollarNum = dollar;
        char aster = '*';
        int asterNum = aster;
        char doggy = '@';
        int doggyNum = doggy;
        char verticalBar = '|';
        int verticalBarNum = verticalBar;
        char tilde = '~';
        int tildeNum = tilde;
        System.out.println(dollarNum + " - " + dollar + "\n" + asterNum + " - " + aster + "\n"
        + doggyNum + " - " + doggy + "\n" + verticalBarNum + " - " + verticalBar + "\n"
        + tildeNum + " - "+ tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char undersc = '_';
        char leftPar = '(';
        char rightPar = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + undersc + leftPar + " " + rightPar + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + undersc + undersc + undersc + undersc + slash 
        + backslash + undersc + undersc + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int firstNumber = 123;
        System.out.println("Число " + firstNumber + " содержит:");
        int unit = firstNumber % 10;
        int decade = firstNumber / 10 % 10;
        int hundred = firstNumber / 100;
        int sum = hundred + decade + unit;
        int multiplication = hundred * decade * unit;
        System.out.println("  сотен - " + hundred + "\n" + "  десятков - " + decade + "\n" 
        + "  единиц - " + unit);
        System.out.println("Сумма его цифр = " +  sum);
        System.out.println("Произведение = " + multiplication + "\n");

        System.out.println("9. Вывод времени");
        int secBase = 86399;
        int hours = secBase / 60 / 60;
        int min = secBase / 60 % 60;
        int sec = secBase / 1 % 60;
        System.out.println(hours + ":" + min + ":" + sec);

    }
}