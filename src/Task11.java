import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание 11:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 0 до 1 000 000: ");
        int number = scanner.nextInt();

        String result = numberToWords(number);
        System.out.println(result);
    }

    public static String numberToWords(int number) {
        if (number == 0) {
            return "ноль";
        }

        String[] units = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять",
                "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать"};
        String[] tens = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
                "восемьдесят", "девяносто"};
        String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
                "восемьсот", "девятьсот"};

        String result = "";

        if (number >= 1000) {
            int thousands = number / 1000;
            if (thousands == 1) {
                result += "одна тысяча ";
            } else if (thousands == 2) {
                result += "две тысячи ";
            } else if (thousands >= 3 && thousands <= 4) {
                result += units[thousands] + " тысячи ";
            } else if (thousands >= 5 && thousands <= 10) {
                result += units[thousands] + " тысяч ";
            } else {
                result += hundreds[thousands] + " тысяч ";
            }

            number %= 1000;
        }

        if (number >= 100) {
            int hundredsDigit = number / 100;
            result += hundreds[hundredsDigit] + " ";
            number %= 100;
        }

        if (number >= 20) {
            int tensDigit = number / 10;
            result += tens[tensDigit] + " ";
            number %= 10;
        }

        if (number > 0) {
            result += units[number] + " ";
        }

        return result.trim();

    }
}
