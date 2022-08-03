package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Inspiriert durch den YouTuber "Codecourse".
        https://www.youtube.com/watch?v=EpB9u4ItOYU&t=21s&ab_channel=Codecourse
         */

        // System Objekte
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Spiel Variablen
        String[] gegner = {"Troll", "Ork", "Ratte", "Fledermaus", "Bär", "Steinmensch"};
        int maxGegnerGesundheit = 75;
        int gegnerSchaden = 25;

        // Spieler Variablen
        int spielerGesundheit = 100;
        int angriffSchaden = 50;
        int anzahlGesundheitstraenke = 3;
        int heilungGesundheitstrank = 30;
        int dropWahrscheinlichkeitGesundheitstrank = 25; // in Prozent

        boolean laeuft = true;

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                               ,-.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          ___,---.__          /'|`\\          __,---,___");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ,-'    \\`    `-.____,-'  |  `-.____,-'    //    `-.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      ,'        |           ~'\\     /`~           |        `.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    /      ___//              `. ,'          ,  , \\___      \\");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    |    ,-'   `-.__   _         |        ,    __,-'   `-.    |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    |   /          /\\_  `   .    |    ,      _/\\          \\   |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \\  |           \\ \\`-.___ \\   |   / ___,-'/ /           |  /");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \\  \\           | `._   `\\\\  |  //'   _,' |           /  /");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      `-.\\         /'  _ `---'' , . ``---' _  `\\         /,-'");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ``       /     \\    ,='/ \\`=.    /     \\       ''");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                 |__   /|\\_,--.,-.--,--._/|\\   __|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                 /  `./  \\\\`\\ |  |  | /,//' \\,'  \\");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                /   /     ||--+--|--+-/-|     \\   \\");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t               |   |     /'\\_\\_\\ | /_/_/`\\     |   |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                \\   \\__, \\_     `~'     _/ .__/   /");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                 `-._,-'   `-._______,-'   `-._,-'");
        System.out.println("                                                                             ");
        System.out.println(" ██░ ██  ▒█████  ▓█████  ██░ ██  ██▓    ▓█████  ███▄    █  ███▄ ▄███▓▓█████  ███▄    █   ██████  ▄████▄   ██░ ██     ██▒   █▓  ██████          ██░ ██  ▒█████  ▓█████  ██▓     ██▓    ▓█████  ███▄    █  ▄▄▄▄    ██▀███   █    ██ ▄▄▄█████▓\n" +
                "▓██░ ██▒▒██▒  ██▒▓█   ▀ ▓██░ ██▒▓██▒    ▓█   ▀  ██ ▀█   █ ▓██▒▀█▀ ██▒▓█   ▀  ██ ▀█   █ ▒██    ▒ ▒██▀ ▀█  ▓██░ ██▒   ▓██░   █▒▒██    ▒         ▓██░ ██▒▒██▒  ██▒▓█   ▀ ▓██▒    ▓██▒    ▓█   ▀  ██ ▀█   █ ▓█████▄ ▓██ ▒ ██▒ ██  ▓██▒▓  ██▒ ▓▒\n" +
                "▒██▀▀██░▒██░  ██▒▒███   ▒██▀▀██░▒██░    ▒███   ▓██  ▀█ ██▒▓██    ▓██░▒███   ▓██  ▀█ ██▒░ ▓██▄   ▒▓█    ▄ ▒██▀▀██░    ▓██  █▒░░ ▓██▄           ▒██▀▀██░▒██░  ██▒▒███   ▒██░    ▒██░    ▒███   ▓██  ▀█ ██▒▒██▒ ▄██▓██ ░▄█ ▒▓██  ▒██░▒ ▓██░ ▒░\n" +
                "░▓█ ░██ ▒██   ██░▒▓█  ▄ ░▓█ ░██ ▒██░    ▒▓█  ▄ ▓██▒  ▐▌██▒▒██    ▒██ ▒▓█  ▄ ▓██▒  ▐▌██▒  ▒   ██▒▒▓▓▄ ▄██▒░▓█ ░██      ▒██ █░░  ▒   ██▒        ░▓█ ░██ ▒██   ██░▒▓█  ▄ ▒██░    ▒██░    ▒▓█  ▄ ▓██▒  ▐▌██▒▒██░█▀  ▒██▀▀█▄  ▓▓█  ░██░░ ▓██▓ ░ \n" +
                "░▓█▒░██▓░ ████▓▒░░▒████▒░▓█▒░██▓░██████▒░▒████▒▒██░   ▓██░▒██▒   ░██▒░▒████▒▒██░   ▓██░▒██████▒▒▒ ▓███▀ ░░▓█▒░██▓      ▒▀█░  ▒██████▒▒ ██▓    ░▓█▒░██▓░ ████▓▒░░▒████▒░██████▒░██████▒░▒████▒▒██░   ▓██░░▓█  ▀█▓░██▓ ▒██▒▒▒█████▓   ▒██▒ ░ \n" +
                " ▒ ░░▒░▒░ ▒░▒░▒░ ░░ ▒░ ░ ▒ ░░▒░▒░ ▒░▓  ░░░ ▒░ ░░ ▒░   ▒ ▒ ░ ▒░   ░  ░░░ ▒░ ░░ ▒░   ▒ ▒ ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░ ▒ ░░▒░▒      ░ ▐░  ▒ ▒▓▒ ▒ ░ ▒▓▒     ▒ ░░▒░▒░ ▒░▒░▒░ ░░ ▒░ ░░ ▒░▓  ░░ ▒░▓  ░░░ ▒░ ░░ ▒░   ▒ ▒ ░▒▓███▀▒░ ▒▓ ░▒▓░░▒▓▒ ▒ ▒   ▒ ░░   \n" +
                " ▒ ░▒░ ░  ░ ▒ ▒░  ░ ░  ░ ▒ ░▒░ ░░ ░ ▒  ░ ░ ░  ░░ ░░   ░ ▒░░  ░      ░ ░ ░  ░░ ░░   ░ ▒░░ ░▒  ░ ░  ░  ▒    ▒ ░▒░ ░      ░ ░░  ░ ░▒  ░ ░ ░▒      ▒ ░▒░ ░  ░ ▒ ▒░  ░ ░  ░░ ░ ▒  ░░ ░ ▒  ░ ░ ░  ░░ ░░   ░ ▒░▒░▒   ░   ░▒ ░ ▒░░░▒░ ░ ░     ░    \n" +
                " ░  ░░ ░░ ░ ░ ▒     ░    ░  ░░ ░  ░ ░      ░      ░   ░ ░ ░      ░      ░      ░   ░ ░ ░  ░  ░  ░         ░  ░░ ░        ░░  ░  ░  ░   ░       ░  ░░ ░░ ░ ░ ▒     ░     ░ ░     ░ ░      ░      ░   ░ ░  ░    ░   ░░   ░  ░░░ ░ ░   ░      \n" +
                " ░  ░  ░    ░ ░     ░  ░ ░  ░  ░    ░  ░   ░  ░         ░        ░      ░  ░         ░       ░  ░ ░       ░  ░  ░         ░        ░    ░      ░  ░  ░    ░ ░     ░  ░    ░  ░    ░  ░   ░  ░         ░  ░         ░        ░              \n" +
                "                                                                                                ░                        ░              ░                                                                     ░                            ");



        System.out.println("Willkommen in der Hö(h)lle!");
        System.out.println(" ");
        System.out.println("Du blickst hoch zu der schmalen Öffnung an der Höhlendecke, durch die du gerade heruntergesprungen bist. Jetzt gibt es kein Zurück mehr!" +
                "\nDer spärliche Lichtkegel der durch den Spalt über dir dringt, lässt dich deine Umgebung nur wenige Meter weit erkennen." +
                "\nEs ist nass und kalt. In der Ferne hörst du ein leises Knurren. Du umfasst dein Schwert fester und gehst wachsam aber entschlossen in die Dunkelheit...");

        // while loop, die das Spiel am Laufen hält.
        SPIEL:
        while (laeuft) {
            System.out.println("___________________________________________________________________");
            System.out.println(" ");

            int gegnerGesundheit = rand.nextInt(maxGegnerGesundheit);
            String dieserGegner = gegner[rand.nextInt(gegner.length)];
            System.out.println("\t# Ein(e) " + dieserGegner + " ist erschienen! #\n");

            // while loop während gegen den Gegner gekämpft wird.
            while (gegnerGesundheit > 0) {
                System.out.println("\t Deine HP:\t\t" + spielerGesundheit);
                System.out.println("\t " + dieserGegner + " HP:\t\t" + gegnerGesundheit);
                System.out.println("\n\t Was möchtest du tun?");
                System.out.println("\t 1. Angreifen");
                System.out.println("\t 2. Einen Gesundheitstrank trinken");
                System.out.println("\t 3. weglaufen...");
                System.out.println("___________________________________________________________________");

                String eingabe = in.nextLine();
                if (eingabe.equals("1")) {
                    int schadenVerursacht = rand.nextInt(angriffSchaden);
                    int schadenErlitten = rand.nextInt(gegnerSchaden);

                    gegnerGesundheit -= schadenVerursacht;
                    spielerGesundheit -= schadenErlitten;

                    System.out.println("\t Du triffst den " + dieserGegner + " und verursachst " + schadenVerursacht + " Schaden.");
                    System.out.println("\t > Du hast " + schadenErlitten + " Schaden erlitten.");
                    System.out.println(" ");

                    if (spielerGesundheit < 1) {
                        System.out.println("Du stirbst!");
                        System.out.println(" ");
                        break;
                    }

                } else if (eingabe.equals("2")) {
                    if (anzahlGesundheitstraenke > 0) {
                        spielerGesundheit += heilungGesundheitstrank;
                        anzahlGesundheitstraenke--;
                        System.out.println("\t Du hast einen Heiltrank getrunken und " + heilungGesundheitstrank + " HP wieder hergestellt."
                                + "\n\t > Du hast jetzt " + spielerGesundheit + " HP."
                                + "\n\t > Du hast " + anzahlGesundheitstraenke + " Tränke übrig.");
                        System.out.println(" ");
                    } else {
                        System.out.println("\t Du hast keine Tränke übrig. Besiege gegner um neue Tränke zu erhalten.");
                        System.out.println(" ");
                    }

                } else if (eingabe.equals("3")) {
                    System.out.println("\t Du bist vor dem " + dieserGegner + " weggelaufen!.");
                    continue SPIEL;


                } else {
                    System.out.println("\t ungültige Eingabe!");
                    System.out.println("\t °°°°°°°°°°°°°°°°°°");
                }

            }

            if (spielerGesundheit < 1) {
                System.out.println("GAME OVER!");
                System.out.println(" ");
                break;
            }
            System.out.println("=======================================================");
            System.out.println(" # Der/die/das " + dieserGegner + " wurde besiegt! # ");
            System.out.println(" # Du hast " + spielerGesundheit + " HP übrig. #");
            System.out.println("=======================================================");
            System.out.println(" ");
            if (rand.nextInt(100) < dropWahrscheinlichkeitGesundheitstrank) {
                anzahlGesundheitstraenke++;
                System.out.println(" # Der/die/das " + dieserGegner + " hat einen Trank fallengelassen. #");
                System.out.println(" # Du hast " + anzahlGesundheitstraenke + " Gesundheitstränke übrig. # ");
                System.out.println(" ");
            }
            System.out.println("Was möchtest du tun?");
            System.out.println("1. Weiterkämpfen");
            System.out.println("2. Die Höhle verlassen.");
            System.out.println("___________________________________________________________________");

            String eingabe = in.nextLine();

            // Eingabe validieren und Fehleingaben des Nutzers abfangen.
            while (!eingabe.equals("1") && !eingabe.equals("2")) {
                System.out.println("ungültige Eingabe!");
                eingabe = in.nextLine();
            }

            if (eingabe.equals("1")) {
                System.out.println("Du führst dein Abenteuer fort.");
            } else {
                System.out.println("Du verlässt die Höhle! "); // Hier Scoresystem einfügen
                System.out.println(" ");
                break;
            }
        }
        System.out.println("#######################");
        System.out.println("# Danke fürs Spielen! #");
        System.out.println("#######################");
    }
}
