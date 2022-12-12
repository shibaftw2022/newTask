import sun.plugin2.main.client.WDonatePrivilege;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";

        do {
            input = "";
            while (!(input.equals("1")) && !(input.equals("2")) && !(input.equals("3"))) {
                System.out.println("Hello, kindly select the choice of user by the number : ");
                System.out.println("1) Encode.");
                System.out.println("2) Decode.");
                System.out.println("3) Exit.");
                input = sc.nextLine();
            }

            switch (input) {
                case "1":
                    encoderPanel();
                    break;
                case "2":
                    decoderPanel();
                    break;
                default:
                    break;
            }

        }
        while(!input.equals("3"));

        System.out.println("Hello world!");
    }


    public static void encoderPanel() {
        Scanner sc = new Scanner(System.in);
        String plainText = "";
        String offset = "";
        Encoder encoder = new Encoder();


        System.out.println("Enter plainText: ");
        plainText = sc.nextLine();
        System.out.println("Enter offset character: ");
        offset = sc.nextLine();
        encoder.setOffset(offset);
        System.out.println(encoder.encode(plainText));

    }

    public static void decoderPanel() {
        Scanner sc = new Scanner(System.in);
        String encodedText = "";
        Encoder decoder = new Encoder();
        System.out.println("Enter encodedText: ");
        encodedText = sc.nextLine();
        System.out.println(decoder.decode(encodedText));

    }
    }
