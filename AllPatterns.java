import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class AllPatterns {
    public void first() {
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("1st Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void second() {
        /*
         * 5
         * 5 4
         * 5 4 3
         * 5 4 3 2
         * 5 4 3 2 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("2nd Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void third() {
        /*
         * 1
         * 2 1
         * 3 2 1
         * 4 3 2 1
         * 5 4 3 2 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("3rd Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fourth() {
        /*
         * 5
         * 4 5
         * 3 4 5
         * 2 3 4 5
         * 1 2 3 4 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("4th Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fifth() {
        /*
         * a
         * a b
         * a b c
         * a b c d
         * a b c d e
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("5th Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void sixth() {
        /*
         * A
         * A B
         * A B C
         * A B C D
         * A B C D E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("6th Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void seventh() {
        /*
         * a
         * b a
         * c b a
         * d c b a
         * e d c b a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("7th Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = i; j >= 97; j--) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void eigth() {
        /*
         * A
         * B A
         * C B A
         * D C B A
         * E D C B A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("8th Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = i; j >= 65; j--) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void nine() {
        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("9th Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void ten() {
        /*
         * 5
         * 4 4
         * 3 3 3
         * 2 2 2 2
         * 1 1 1 1 1
         */

        System.out.println(
                "==========================================================================================================");
        System.out.println("10th Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void eleven() {
        /*
         * a
         * bb
         * ccc
         * dddd
         * eeeee
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("11th Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void twelve() {
        /*
         * A
         * B B
         * C C C
         * D D D D
         * E E E E E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("12th Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void thirteen() {
        /*
         * e
         * d d
         * c c c
         * b b b b
         * a a a a a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("13th Pattern...");
        for (int i = 101; i >= 97; i--) {
            for (int j = i; j <= 101; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void fourteen() {
        /*
         * E
         * D D
         * C C C
         * B B B B
         * A A A A A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("14th Pattern...");
        for (int i = 69; i >= 65; i--) {
            for (int j = i; j <= 69; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void fifteen() {
        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("15th Pattern...");
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public void sixteen() {
        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("16th Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void seventeen() {
        /*
         * 0
         * 1 0
         * 0 1 0
         * 1 0 1 0
         * 0 1 0 1 0
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("17th Pattern...");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void eighteen() {
        /*
         * 1
         * 0 0
         * 1 1 1
         * 0 0 0 0
         * 1 1 1 1 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("18th Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((i % 2) + " ");
            }
            System.out.println();
        }
    }

    public void ninteen() {
        /*
         * 0
         * 1 1
         * 0 0 0
         * 1 1 1 1
         * 0 0 0 0 0
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("19th Pattern...");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((i % 2) + " ");
            }
            System.out.println();
        }
    }

    public void twenty() {
        /*
         * 5
         * 4 4
         * 3 3 3
         * 2 2 2 2
         * 1 1 1 1 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("20th Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void twenty_one() {
        /*
         * 1
         * 1 2
         * 2 3 4
         * 4 5 6 7
         * 7 8 9 10 11
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("21th Pattern...");
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            k--;
            System.out.println();
        }
    }

    public void twenty_two() {
        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("22th Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void twenty_three() {
        /*
         * 5 4 3 2 1
         * 5 4 3 2
         * 5 4 3
         * 5 4
         * 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("23th Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void twenty_four() {
        /*
         * 1 2 3 4 5
         * 2 3 4 5
         * 3 4 5
         * 4 5
         * 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("24th Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void twenty_five() {
        /*
         * 5 4 3 2 1
         * 4 3 2 1
         * 3 2 1
         * 2 1
         * 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("25th Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void twenty_six() {
        /*
         * 1 0 1 0 1
         * 0 1 0 1
         * 1 0 1
         * 0 1
         * 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("26th Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void twenty_seven() {
        /*
         * 11111
         * 2222
         * 333
         * 44
         * 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("27th Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void twenty_eight() {
        /*
         * a b c d e
         * a b c d
         * a b c
         * a b
         * a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("28th Pattern...");
        for (int i = 101; i >= 97; i--) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void twenty_nine() {
        /*
         * a b c d e
         * b c d e
         * c d e
         * d e
         * e
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("29th Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = i; j <= 101; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void thirty() {
        /*
         * A B C D E
         * A B C D
         * A B C
         * A B
         * A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("30 Pattern...");
        for (int i = 69; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void thirty_one() {
        /*
         * A B C D E
         * B C D E
         * C D E
         * D E
         * E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("31 Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = i; j <= 69; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void thirty_two() {
        /*
         * a a a a a
         * b b b b
         * c c c
         * d d
         * e
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("32 Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = i; j <= 101; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void thirty_three() {
        /*
         * e e e e e
         * d d d d
         * c c c
         * b b
         * a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("33 Pattern...");
        for (int i = 101; i >= 97; i--) {
            for (int j = i; j >= 97; j--) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void thirty_four() {
        /*
         * A A A A A
         * B B B B
         * C C C
         * D D
         * E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("34 Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = i; j <= 69; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void thirty_five() {
        /*
         * E E E E E
         * D D D D
         * C C C
         * B B
         * A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("35 Pattern...");
        for (int i = 69; i >= 65; i--) {
            for (int j = i; j >= 65; j--) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void thirty_six() {
        /*
         * 1 0 1 0 1
         * 0 1 0 1
         * 1 0 1
         * 0 1
         * 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("36 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void thirty_seven() {
        /*
         * 1 1 1 1 1
         * 0 0 0 0
         * 1 1 1
         * 0 0
         * 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("37 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print((i % 2) + " ");
            }
            System.out.println();
        }
    }

    public void thirty_eight() {
        /*
         * 0 0 0 0 0
         * 1 1 1 1
         * 0 0 0
         * 1 1
         * 0
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("38 Pattern...");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print((i % 2) + " ");
            }
            System.out.println();
        }
    }

    public void thirty_nine() {
        /*
         * 0 1 0 1 0
         * 1 0 1 0
         * 0 1 0
         * 1 0
         * 0
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("39 Pattern...");
        for (int i = 4; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void fourty() {
        /*
         * 5 5 5 5 5
         * 4 4 4 4
         * 3 3 3
         * 2 2
         * 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("40 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void fourty_one() {
        /*
         *         1
         *       2 1
         *     3 2 1
         *   4 3 2 1
         * 5 4 3 2 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("41 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fourty_two() {
        /*
         *          1
         *        1 2
         *      1 2 3
         *    1 2 3 4
         *  1 2 3 4 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("42 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fourty_three() {
        /*
         *          5
         *        5 4
         *      5 4 3
         *    5 4 3 2
         *  5 4 3 2 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("43 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fourty_four() {
        /*
         *          1
         *        2 1
         *      3 2 1
         *    4 3 2 1
         *  5 4 3 2 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("44 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fourty_five() {
        /*
         *          5
         *        4 5
         *      3 4 5
         *    2 3 4 5
         *  1 2 3 4 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("45 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fourty_six() {
        /*
         *          1
         *        1 0
         *      1 0 1
         *    1 0 1 0
         *  1 0 1 0 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("46 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void fourty_seven() {
        /*
         *          0
         *        0 1
         *      0 1 0
         *    0 1 0 1
         *  0 1 0 1 0
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("47 Pattern...");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void fourty_eight() {
        /*
         *          A
         *        A B
         *      A B C
         *    A B C D
         *  A B C D E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("48 Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = 69; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void fourty_nine() {
        /*
         *          a
         *        a b
         *      a b c
         *    a b c d
         *  a b c d e
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("49 Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = 101; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void fifty() {
        /*
         *          A
         *        B B
         *      C C C
         *    D D D D
         *  E E E E E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("50 Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = 69; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 65; j <= i; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void fifty_one() {
        /*
         *          e
         *        d d
         *      c c c
         *    b b b b
         *  a a a a a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("51 Pattern...");
        for (int i = 101; i >= 97; i--) {
            for (int j = i; j >= 97; j--) {
                System.out.print("  ");
            }
            for (int j = 101; j >= i; j--) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void fifty_two() {
        /*
         *          E
         *        D D
         *      C C C
         *    B B B B
         *  A A A A A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("52 Pattern...");
        for (int i = 69; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 69; j >= i; j--) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public void fifty_three() {
        /*
         *          1
         *        0 0
         *      1 1 1
         *    0 0 0 0
         *  1 1 1 1 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("53 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((i % 2) + " ");
            }
            System.out.println();
        }
    }

    public void fifty_four() {
        /*
         *  1 2 3 4 5
         *    1 2 3 4
         *      1 2 3
         *        1 2
         *          1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("54 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fifty_five() {
        /*
         *  5 4 3 2 1
         *    5 4 3 2
         *      5 4 3
         *        5 4
         *          5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("55 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fifty_six() {
        /*
         *  1 2 3 4 5
         *    2 3 4 5
         *      3 4 5
         *        4 5
         *          5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("56 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fifty_seven() {
        /*
         *  5 4 3 2 1
         *    4 3 2 1
         *      3 2 1
         *        2 1
         *          1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("57 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void fifty_eight() {
        /*
         *  5 5 5 5 5
         *    4 4 4 4
         *      3 3 3
         *        2 2
         *          1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("58 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void fifty_nine() {
        /*
         *  1 1 1 1 1
         *    2 2 2 2
         *      3 3 3
         *        4 4
         *          5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("59 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void sixty() {
        /*
         *  1 0 1 0 1
         *    0 1 0 1
         *      1 0 1
         *        0 1
         *          1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("60 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }

    public void sixty_one() {
        /*
         *  0 0 0 0 0
         *    1 1 1 1
         *      0 0 0
         *        1 1
         *          0
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("61 Pattern...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print((i % 2) + " ");
            }
            System.out.println();
        }
    }

    public void sixty_two() {
        /*
         *  a b c d e
         *    a b c d
         *      a b c
         *        a b
         *          a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("62 Pattern...");
        for (int i = 101; i >= 97; i--) {
            for (int j = 101; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void sixty_three() {
        /*
         *  A B C D E
         *    A B C D
         *      A B C
         *        A B
         *          A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("63 Pattern...");
        for (int i = 69; i >= 65; i--) {
            for (int j = 69; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void sixty_four() {
        /*
         *  a b c d e
         *    b c d e
         *      c d e
         *        d e
         *          e
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("64 Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = 97; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 101; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void sixty_five() {
        /*
         *  A B C D E
         *    B C D E
         *      C D E
         *        D E
         *          E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("65 Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 69; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void sixty_six() {
        /*
         *     1
         *    1 2
         *   1 2 3
         *  1 2 3 4
         * 1 2 3 4 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("66 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void sixty_seven() {
        /*
         *      a
         *     a b
         *    a b c
         *   a b c d
         *  a b c d e
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("67 Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = 101; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void sixty_eight() {
        /*
         *
         *  *
         *  * *
         *  * * *
         *  * * * *
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("68 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void sixty_nine() {
        /*
         *
         *     *
         *    * *
         *   * * *
         *  * * * *
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("69 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void seventy() {
        /*
         *      A
         *     A B
         *    A B C
         *   A B C D
         *  A B C D E
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("70 Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = 69; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_one() {
        /*
         *      e
         *     e d
         *    e d c
         *   e d c b
         *  e d c b a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("71 Pattern...");
        for (int i = 101; i >= 97; i--) {
            for (int j = 97; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 101; j >= i; j--) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_two() {
        /*
         *          1
         *        1 2 1
         *      1 2 3 2 1
         *    1 2 3 4 3 2 1
         *  1 2 3 4 5 4 3 2 1
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("72 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\b\b"); // for overwrite
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_three() {
        /*
         *          1
         *        2 1 2
         *      3 2 1 2 3
         *    4 3 2 1 2 3 4
         *  5 4 3 2 1 2 3 4 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("73 Pattern...");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.print("\b\b");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_four() {
        /*
         *          a
         *        a b a
         *      a b c b a
         *    a b c d c b a
         *  a b c d e d c b a
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("74 Pattern...");
        for (int i = 97; i <= 101; i++) {
            for (int j = 101; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.print("\b\b");
            for (int j = i; j >= 97; j--) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_five() {
        /*
         *          A
         *        A B A
         *      A B C B A
         *    A B C D C B A
         *  A B C D E D C B A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("75 Pattern...");
        for (int i = 65; i <= 69; i++) {
            for (int j = 69; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.print("\b\b");
            for (int j = i; j >= 65; j--) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_six() {
        /*
         *          e
         *        e d e
         *      e d c d e
         *    e d c b c d e
         *  e d c b a b c d e
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("76 Pattern...");
        for (int i = 101; i >= 97; i--) {
            for (int j = 97; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 101; j >= i; j--) {
                System.out.print((char) j + " ");
            }
            System.out.print("\b\b");
            for (int j = i; j <= 101; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_seven() {
        /*
         *          E
         *        D E D
         *      C D E D C
         *    B C D E D C B
         *  A B C D E D C B A
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("77 Pattern...");
        for (int i = 69; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 69; j++) {
                System.out.print((char) j + " ");
            }
            System.out.print("\b\b");
            for (int j = 69; j >= i; j--) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public void seventy_eight() {
        /*
         *          5
         *        5 4 5
         *      5 4 3 4 5
         *    5 4 3 2 3 4 5
         *  5 4 3 2 1 2 3 4 5
         */
        System.out.println(
                "==========================================================================================================");
        System.out.println("78 Pattern...");
        for (int i = 5; i >= 1; i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.print("\b\b");
            for(int j=i;j<=5;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void seventy_nine() {
        /* 
        1 2 3 4 5 4 3 2 1
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1 
                1
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("79 Pattern...");
        for(int i=5;i>=1;i--) {
            for(int j=5;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.print("\b\b");
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void eighty() {
        /* 
        1 2 3 4 5 4 3 2 1
          2 3 4 5 4 3 2
            3 4 5 4 3
              4 5 4
                5
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("80 Pattern...");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("  ");
            }
            for(int j=i;j<=5;j++) {
                System.out.print(j+" ");
            }
            System.out.print("\b\b");
            for(int j=5;j>=i;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_one(){
        /*
        A B C D E D C B A
          A B C D C B A
            A B C B A
              A B A
                A
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("81 Pattern...");
        for(int i=69;i>=65;i--) {
            for(int j=69;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=65;j<=i;j++) {
                System.out.print((char)j+" ");
            }
            System.out.print("\b\b");
            for(int j=i;j>=65;j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_two(){
        /*
        a b c d e d c b a 
          b c d e d c b 
            c d e d c
              d e d
                e
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("82 Pattern...");
        for(int i=97;i<=101;i++) {
            for(int j=97;j<=i;j++) {
                System.out.print("  ");
            }
            for(int j=i;j<=101;j++) {
                System.out.print((char)j+" ");
            }
            System.out.print("\b\b");
            for(int j=101;j>=i;j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_three(){
        /*
        A B C D E D C B A
        A B C D   D C B A
        A B C       C B A 
        A B           B A
        A               A
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("83 Pattern...");
        for(int i=69;i>=65;i--) {
            for(int j=65;j<=i;j++) {
                System.out.print((char)j+" ");
            }
            for(int j=i;j<=69;j++) {
                System.out.print("  ");
            }
            System.out.print("\b\b\b\b");
            for(int j=69;j>i;j--) {
                System.out.print("  ");
            }
            for(int j=i;j>=65;j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_four(){
        /*
        a b c d e d c b a
        a b c d   d c b a 
        a b c       c b a
        a b           b a
        a               a
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("84 Pattern...");
        for(int i=101;i>=97;i--) {
            for(int j=97;j<=i;j++) {
                System.out.print((char)j+" ");
            }
            for(int j=i;j<=101;j++) {
                System.out.print("  ");
            }
            System.out.print("\b\b\b\b");
            for(int j=101;j>i;j--) {
                System.out.print("  ");
            }
            for(int j=i;j>=97;j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_five(){
        /*
        A               A
        A B           B A
        A B C       C B A
        A B C D   D C B A
        A B C D E D C B A
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("85 Pattern...");
        for(int i=65;i<=69;i++) {
            for(int j=65;j<=i;j++) {
                System.out.print((char)j+" ");
            }
            for(int j=i;j<=69;j++) {
                System.out.print("  ");
            }
            System.out.print("\b\b\b\b");
            for(int j=69;j>i;j--) {
                System.out.print("  ");
            }
            for(int j=i;j>=65;j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_six(){
        /*
        a               a
        a b           b a
        a b c       c b a
        a b c d   d c b a
        a b c d e d c b a
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("86 Pattern...");
        for(int i=97;i<=101;i++) {
            for(int j=97;j<=i;j++) {
                System.out.print((char)j+" ");
            }
            for(int j=i;j<=101;j++) {
                System.out.print("  ");
            }
            System.out.print("\b\b\b\b");
            for(int j=101;j>i;j--) {
                System.out.print("  ");
            }
            for(int j=i;j>=97;j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_seven(){
        /*
        1 2 3 4 5 4 3 2 1
        1 2 3 4   4 3 2 1
        1 2 3       3 2 1
        1 2           2 1
        1               1
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("87 Pattern...");
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            for(int j=5;j>=i;j--) {
                System.out.print("  ");
            }
            System.out.print("\b\b\b\b");
            for(int j=i;j<5;j++) {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        } 
    }
    public void eighty_eight(){
        /*
        1               1
        1 2           2 1
        1 2 3       3 2 1
        1 2 3 4   4 3 2 1
        1 2 3 4 5 4 3 2 1
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("88 Pattern...");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            for(int j=5;j>=i;j--) {
                System.out.print("  ");
            }
            System.out.print("\b\b\b\b");
            for(int j=i;j<5;j++) {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void eighty_nine(){
        /*
        e d c b a b c d e
        e d c b   b c d e
        e d c       c d e 
        e d           d e 
        e               e
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("89 Pattern...");
        for(int i=97;i<=101;i++) {
            for(int j=101;j>=i;j--) {
                System.out.print((char)j+" ");
            }
            for(int j=97;j<=i;j++) {
                System.out.print("  ");
            }
            System.out.print("\b\b\b\b");
            for(int j=i;j>97;j--) {
                System.out.print("  ");
            }
            for(int j=i;j<=101;j++) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public void ninty(){
        /*
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1
                1
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("90 Pattern...");
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.print("\b\b");
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--) {
            for(int j=5;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.print("\b\b");
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void ninty_one() {
        /* 
        1 2 3 4 5 4 3 2 1 
          1 2 3 4 3 2 1
            1 2 3 2 1 
              1 2 1
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
        */
        System.out.println(
                "==========================================================================================================");
        System.out.println("91 Pattern...");
        for(int i=5;i>=1;i--) {
            for(int j=5;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.print("\b\b");
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.print("\b\b");
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AllPatterns ap = new AllPatterns();

        ap.first();
        ap.second();
        ap.third();
        ap.fourth();
        ap.fifth();
        ap.sixth();
        ap.seventh();
        ap.eigth();
        ap.nine();
        ap.ten();
        ap.eleven();
        ap.twelve();
        ap.thirteen();
        ap.fourteen();
        ap.fifteen();
        ap.sixteen();
        ap.seventeen();
        ap.eighteen();
        ap.ninteen();
        ap.twenty();
        ap.twenty_one();
        ap.twenty_two();
        ap.twenty_three();
        ap.twenty_four();
        ap.twenty_five();
        ap.twenty_six();
        ap.twenty_seven();
        ap.twenty_eight();
        ap.twenty_nine();
        ap.thirty();
        ap.thirty_one();
        ap.thirty_two();
        ap.thirty_three();
        ap.thirty_four();
        ap.thirty_five();
        ap.thirty_six();
        ap.thirty_seven();
        ap.thirty_eight();
        ap.thirty_nine();
        ap.fourty();
        ap.fourty_one();
        ap.fourty_two();
        ap.fourty_three();
        ap.fourty_four();
        ap.fourty_five();
        ap.fourty_six();
        ap.fourty_seven();
        ap.fourty_eight();
        ap.fourty_nine();
        ap.fifty();
        ap.fifty_one();
        ap.fifty_two();
        ap.fifty_three();
        ap.fifty_four();
        ap.fifty_five();
        ap.fifty_six();
        ap.fifty_seven();
        ap.fifty_eight();
        ap.fifty_nine();
        ap.sixty();
        ap.sixty_one();
        ap.sixty_two();
        ap.sixty_three();
        ap.sixty_four();
        ap.sixty_five();
        ap.sixty_six();
        ap.sixty_seven();
        ap.sixty_eight();
        ap.sixty_nine();
        ap.seventy();
        ap.seventy_one();
        ap.seventy_two();
        ap.seventy_three();
        ap.seventy_four();
        ap.seventy_five();
        ap.seventy_six();
        ap.seventy_seven();
        ap.seventy_eight();
        ap.seventy_nine();
        ap.eighty();
        ap.eighty_one();
        ap.eighty_two();
        ap.eighty_three();
        ap.eighty_four();
        ap.eighty_five();
        ap.eighty_six();
        ap.eighty_seven();
        ap.eighty_eight();
        ap.eighty_nine();
        ap.ninty();
        ap.ninty_one();
    }
}