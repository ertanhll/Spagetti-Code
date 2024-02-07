/*
    Aufgabe 2) Neugestaltung von Spaghetti-Code durch Methoden
*/
public class Aufgabe2 {

    public static void main(String[] args) {

        // die nötige variablen sind initialisiert.

        String text1 = "Have a great day!";
        String text2 = "This is a Teststring";
        int num1 = 35061;
        int num2 = 1010;

        //for schleife liest text1 dann gibt jeden einzelnen char und einen "-" nach jedem char aus.
        // Aber bis zum letzten char.


        for (int i = 0; i < text1.length() - 1; i++) {
            System.out.print(text1.charAt(i));
            System.out.print('-');
        }

        //hier wird  letzten char ausgegeben.

        System.out.println(text1.charAt(text1.length() - 1));

        int decades = 1;
        int digitCount = 0;

        // while schleife läuft 5 mal. ab 5. mal; der wert des decades ist größer als num1.
        // Am ende ist digitCount 5 geworden.
        while (num1 > decades) {
            decades = decades * 10;
            digitCount++;
        }
        decades /= 10;    //hier decades ist 10000.

        // while schleife läuft und gibt  jeden einzelnen digit  mit der hilfe modulo aus.
        // Zwischen jedem Digit wird einen stern ausgegeben. else if läuft hier nicht.
        // Wenn userer wert des num1 mit null endet würde zB:35060, würde else if auch laufen.

        while (num1 > 0) {
            System.out.print(num1 / decades);
            num1 %= decades;
            digitCount--;
            if (num1 > 0) {
                System.out.print('*');
            } else if (digitCount > 0) {
                System.out.println("*0");
            }
            decades /= 10;
        }

        // In while schleife werden jeden Digit und stern als print rausgegeben.
        // Hier mit dem println fängt das Programm in näcsten Zeile an.
        System.out.println();

        // Nach jedem Char gibt die while schleife einen punkt raus.
        int len = text2.length() - 1;
        while (len > -1) {
            System.out.print(text2.charAt(text2.length() - 1 - len));
            if (len > 0) {
                System.out.print('.');
            }
            len--;
        }
        System.out.println();

        /* mit ersten for schleife wälht das Program  den ersten Separator und
         mit zweiten  for schleife nachdem jeden einzelnem char ersten Separator rausgibt.
         wenn zweite for schleife endet fängt wieder von ersten for schleife an mit dem i=1.
         i=1 ist unserer zweite Seperator.
         Dann wieder zweite for schleife läuft mit den zweiten Separator bis zum String Ende.
         Dann wieder von ersten for schleife läuft i=2. i=2 ist unserer dritten Separator.
         Zweite for schleife läuft mit dritten Separator.*/

        String separators = "#.+";
        for (int i = 0; i < separators.length(); i++) {
            for (int j = 0; j < text1.length() - 1; j++) {
                System.out.print(text1.charAt(j));
                System.out.print(separators.charAt(i));
            }
            System.out.println(text1.charAt(text1.length() - 1));
        }

        //while schleife läuft und gibt  jeden einzelnen digit  mit der hilfe modulo aus.
        // Zwischen jedem Digit wird  einen # ausgegeben.
        int dec = 1;
        int numDigits = 0;
        while (num2 > dec) {
            dec *= 10;
            numDigits += 1;
        }
        dec = dec / 10;
        while (num2 > 0) {
            numDigits--;
            System.out.print(num2 / dec);
            num2 = num2 % dec;
            if (num2 > 0) {
                System.out.print('#');
            } else if (numDigits > 0) {
                System.out.print('#');
                System.out.println('0');
            }
            dec /= 10;
        }
        int num3 = 35061;
        int num4 = 1010;
        System.out.println();
        System.out.println(text(text1,'-'));
        System.out.println(digit(num3, '*'));
        System.out.println(text(text2, '.'));


        for(int i=0 ;i<=separators.length()-1; i++){
            System.out.println(text(text1,separators.charAt(i)));
        }
        System.out.println(digit(num4, '#'));
    }

    //TODO: Implementieren Sie hier Ihre Methoden

    public static String text(String s, char c) {

        String result = "";

        for (int i = 0; i < s.length() - 1; i++) {
            result += s.charAt(i);
            result += c;

        }
        result += s.charAt(s.length() - 1);

        return result;


    }

    public static String digit(int i, char c){

        String result = "";


        int decades = 1;
        int digitCount = 0;

        while (i > decades) {
            decades = decades * 10;
            digitCount++;
        }
        decades /= 10;

        while (digitCount > 0) {

            result += i/decades;
            i %= decades;
            digitCount--;
            if (i> 0) {
                result += c;
            } else if (digitCount > 0) {
                result += c;

            }
            decades /= 10;

        }

        return result;

    }
}
