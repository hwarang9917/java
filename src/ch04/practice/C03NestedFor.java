package ch04.practice;

public class C03NestedFor {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j == i) {
                    System.out.println();
                }
            }
        }

        System.out.println("----------------");
        /*
         *****
         ****
         ***
         **
         *
         */

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        /*
        *****
        ****#
        ***##
        **###
        *####
        #####
         */

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < 6 - i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        // @formatter:off
        /*
             *
            **
           ***
          ****
         *****
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (4-i); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        /*
         *****
          ****
           ***
            **
             *
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        };

        System.out.println("--------------------");

        /*
        0
        01
        012
        0123
        01234
         */

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (j == i) {
                    System.out.println();
                }
            }
        }

        System.out.println("--------------------");

        /*
        1
        12
        123
        1234
        12345
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j == i) {
                    System.out.println();
                }
            }
        }

        System.out.println("--------------------");

        /*
        0
        12
        345
        6789
        01234
         */
        int num1 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num1 % 10);
                num1++;
            }
            System.out.println();
        }

        System.out.println("--------------------");

        /*
        1
        23
        456
        7890
        12345
         */

        int num2 = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num2 % 10);
                num2++;
            }
            System.out.println();
        }

        // @formatter:on
    }
}