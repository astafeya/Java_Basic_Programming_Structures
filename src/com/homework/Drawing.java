package com.homework;

public class Drawing {
    public static void drawRectangle(int side1, int side2) {
        for (int i = 0; i < side1; i++) {
            for (int j = 0; j < side2; j++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void drawTriangle(int side, String type) {
        switch (type) {
            case "upper-left" :
                for (int i = 0; i < side; i++) {
                    for (int j = 0; j < side - i; j++) {
                        System.out.print("# ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                break;
            case "bottom-right" :
                for (int i = 0; i < side; i++) {
                    for (int j = 0; j < side - 1 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = side - 1 - i; j < side; j++) {
                        System.out.print("# ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                break;
            case "upper-right" :
                for (int i = 0; i < side; i++) {
                    for (int j = 0; j < 0 + i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0 + i; j < side; j++) {
                        System.out.print("# ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                break;
            default:
                for (int i = 0; i < side; i++) {
                    for (int j = 0; j < 1 + i; j++) {
                        System.out.print("# ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
        }
    }


}
