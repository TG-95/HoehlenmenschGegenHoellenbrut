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

        // Spieler
        Spieler spieler = new Spieler();

        // Gegner
        Gegner gegner1 = new Gegner();
        gegner1.setGegnerName("Fledermaus");
        gegner1.setGegnerHp(20);
        gegner1.setGetGegnerHpMax(20);
        gegner1.setGegnerSchadenMin(1);
        gegner1.setGegnerSchadenMax(10);
        gegner1.setLvl(1);
        gegner1.setGegnerHaeufigkeit(30);

        Gegner gegner2 = new Gegner();
        gegner2.setGegnerName("Ratte");
        gegner2.setGegnerHp(35);
        gegner2.setGetGegnerHpMax(35);
        gegner2.setGegnerSchadenMin(10);
        gegner1.setGegnerSchadenMax(15);
        gegner2.setLvl(1);
        gegner2.setGegnerHaeufigkeit(30);

        Gegner gegner3 = new Gegner();
        gegner3.setGegnerName("Troll");
        gegner3.setGegnerHp(50);
        gegner3.setGetGegnerHpMax(50);
        gegner3.setGegnerSchadenMin(15);
        gegner1.setGegnerSchadenMax(25);
        gegner3.setLvl(1);
        gegner3.setGegnerHaeufigkeit(20);

        Gegner gegner4 = new Gegner();
        gegner4.setGegnerName("Ork");
        gegner4.setGegnerHp(70);
        gegner4.setGetGegnerHpMax(70);
        gegner4.setGegnerSchadenMin(25);
        gegner1.setGegnerSchadenMax(40);
        gegner4.setLvl(1);
        gegner4.setGegnerHaeufigkeit(14);

        Gegner gegner5 = new Gegner();
        gegner5.setGegnerName("Bär");
        gegner5.setGegnerHp(100);
        gegner5.setGetGegnerHpMax(100);
        gegner5.setGegnerSchadenMin(60);
        gegner1.setGegnerSchadenMax(80);
        gegner5.setLvl(1);
        gegner5.setGegnerHaeufigkeit(5);

        Gegner gegner6 = new Gegner();
        gegner6.setGegnerName("Steinmensch");
        gegner6.setGegnerHp(500);
        gegner6.setGetGegnerHpMax(500);
        gegner6.setGegnerSchadenMin(20);
        gegner1.setGegnerSchadenMax(50);
        gegner6.setLvl(1);
        gegner6.setGegnerHaeufigkeit(1);



        int anzahlGesundheitstraenke = 3;
        int heilungGesundheitstrank = 30;
        int dropWahrscheinlichkeitGesundheitstrank = 25; // in Prozent

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
        System.out.println("""
                 ██░ ██  ▒█████  ▓█████  ██░ ██  ██▓    ▓█████  ███▄    █  ███▄ ▄███▓▓█████  ███▄    █   ██████  ▄████▄   ██░ ██     ██▒   █▓  ██████          ██░ ██  ▒█████  ▓█████  ██▓     ██▓    ▓█████  ███▄    █  ▄▄▄▄    ██▀███   █    ██ ▄▄▄█████▓
                ▓██░ ██▒▒██▒  ██▒▓█   ▀ ▓██░ ██▒▓██▒    ▓█   ▀  ██ ▀█   █ ▓██▒▀█▀ ██▒▓█   ▀  ██ ▀█   █ ▒██    ▒ ▒██▀ ▀█  ▓██░ ██▒   ▓██░   █▒▒██    ▒         ▓██░ ██▒▒██▒  ██▒▓█   ▀ ▓██▒    ▓██▒    ▓█   ▀  ██ ▀█   █ ▓█████▄ ▓██ ▒ ██▒ ██  ▓██▒▓  ██▒ ▓▒
                ▒██▀▀██░▒██░  ██▒▒███   ▒██▀▀██░▒██░    ▒███   ▓██  ▀█ ██▒▓██    ▓██░▒███   ▓██  ▀█ ██▒░ ▓██▄   ▒▓█    ▄ ▒██▀▀██░    ▓██  █▒░░ ▓██▄           ▒██▀▀██░▒██░  ██▒▒███   ▒██░    ▒██░    ▒███   ▓██  ▀█ ██▒▒██▒ ▄██▓██ ░▄█ ▒▓██  ▒██░▒ ▓██░ ▒░
                ░▓█ ░██ ▒██   ██░▒▓█  ▄ ░▓█ ░██ ▒██░    ▒▓█  ▄ ▓██▒  ▐▌██▒▒██    ▒██ ▒▓█  ▄ ▓██▒  ▐▌██▒  ▒   ██▒▒▓▓▄ ▄██▒░▓█ ░██      ▒██ █░░  ▒   ██▒        ░▓█ ░██ ▒██   ██░▒▓█  ▄ ▒██░    ▒██░    ▒▓█  ▄ ▓██▒  ▐▌██▒▒██░█▀  ▒██▀▀█▄  ▓▓█  ░██░░ ▓██▓ ░\s
                ░▓█▒░██▓░ ████▓▒░░▒████▒░▓█▒░██▓░██████▒░▒████▒▒██░   ▓██░▒██▒   ░██▒░▒████▒▒██░   ▓██░▒██████▒▒▒ ▓███▀ ░░▓█▒░██▓      ▒▀█░  ▒██████▒▒ ██▓    ░▓█▒░██▓░ ████▓▒░░▒████▒░██████▒░██████▒░▒████▒▒██░   ▓██░░▓█  ▀█▓░██▓ ▒██▒▒▒█████▓   ▒██▒ ░\s
                 ▒ ░░▒░▒░ ▒░▒░▒░ ░░ ▒░ ░ ▒ ░░▒░▒░ ▒░▓  ░░░ ▒░ ░░ ▒░   ▒ ▒ ░ ▒░   ░  ░░░ ▒░ ░░ ▒░   ▒ ▒ ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░ ▒ ░░▒░▒      ░ ▐░  ▒ ▒▓▒ ▒ ░ ▒▓▒     ▒ ░░▒░▒░ ▒░▒░▒░ ░░ ▒░ ░░ ▒░▓  ░░ ▒░▓  ░░░ ▒░ ░░ ▒░   ▒ ▒ ░▒▓███▀▒░ ▒▓ ░▒▓░░▒▓▒ ▒ ▒   ▒ ░░  \s
                 ▒ ░▒░ ░  ░ ▒ ▒░  ░ ░  ░ ▒ ░▒░ ░░ ░ ▒  ░ ░ ░  ░░ ░░   ░ ▒░░  ░      ░ ░ ░  ░░ ░░   ░ ▒░░ ░▒  ░ ░  ░  ▒    ▒ ░▒░ ░      ░ ░░  ░ ░▒  ░ ░ ░▒      ▒ ░▒░ ░  ░ ▒ ▒░  ░ ░  ░░ ░ ▒  ░░ ░ ▒  ░ ░ ░  ░░ ░░   ░ ▒░▒░▒   ░   ░▒ ░ ▒░░░▒░ ░ ░     ░   \s
                 ░  ░░ ░░ ░ ░ ▒     ░    ░  ░░ ░  ░ ░      ░      ░   ░ ░ ░      ░      ░      ░   ░ ░ ░  ░  ░  ░         ░  ░░ ░        ░░  ░  ░  ░   ░       ░  ░░ ░░ ░ ░ ▒     ░     ░ ░     ░ ░      ░      ░   ░ ░  ░    ░   ░░   ░  ░░░ ░ ░   ░     \s
                 ░  ░  ░    ░ ░     ░  ░ ░  ░  ░    ░  ░   ░  ░         ░        ░      ░  ░         ░       ░  ░ ░       ░  ░  ░         ░        ░    ░      ░  ░  ░    ░ ░     ░  ░    ░  ░    ░  ░   ░  ░         ░  ░         ░        ░             \s
                                                                                                                ░                        ░              ░                                                                     ░                           \s""");




        System.out.println("Willkommen in der Hö(h)lle!");
        System.out.println(" ");
        System.out.println("""
                Du blickst hoch zu der schmalen Öffnung an der Höhlendecke, durch die du gerade heruntergesprungen bist. Jetzt gibt es kein Zurück mehr!
                Der spärliche Lichtkegel der durch den Spalt über dir dringt, lässt dich deine Umgebung nur wenige Meter weit erkennen.
                Es ist nass und kalt. In der Ferne hörst du ein leises Knurren. Du umfasst dein Schwert fester und gehst wachsam aber entschlossen in die Dunkelheit...""");

        // while loop, die das Spiel am Laufen hält.
        SPIEL:
        while (true) {
            System.out.println("___________________________________________________________________");
            System.out.println(" ");

            // Zufällige Wahl des Gegners und Zuweisung der passenden Variablen
            int x = rand.nextInt(101);
            String dieserGegnerName;
            int dieserGegnerHp;
            int dieserGegnerSchaden;

            if (x <= 30){ // Fledermaus
                dieserGegnerName = gegner1.getGegnerName();
                dieserGegnerHp = gegner1.getGegnerHp();
                dieserGegnerSchaden = gegner1.getGegnerSchadenMax() - rand.nextInt((gegner1.getGegnerSchadenMin()+1));

            }else if (x <= 60){ // Ratte
                dieserGegnerName = gegner2.getGegnerName();
                dieserGegnerHp = gegner2.getGegnerHp();
                dieserGegnerSchaden = gegner2.getGegnerSchadenMax() - rand.nextInt(gegner2.getGegnerSchadenMax()+1);

            } else if (x <= 80){ // Troll
                dieserGegnerName = gegner3.getGegnerName();
                dieserGegnerHp = gegner3.getGegnerHp();
                dieserGegnerSchaden = gegner3.getGegnerSchadenMax() - rand.nextInt(gegner3.getGegnerSchadenMax()+1);

            }else if (x <= 94){ // Ork
                dieserGegnerName = gegner4.getGegnerName();
                dieserGegnerHp = gegner4.getGegnerHp();
                dieserGegnerSchaden = gegner4.getGegnerSchadenMax() - rand.nextInt(gegner4.getGegnerSchadenMax()+1);

            }else if (x <= 99){ // Bär
                dieserGegnerName = gegner5.getGegnerName();
                dieserGegnerHp = gegner5.getGegnerHp();
                dieserGegnerSchaden = gegner5.getGegnerSchadenMax() - rand.nextInt(gegner5.getGegnerSchadenMax()+1);

            }else { // Steinmensch
                dieserGegnerName = gegner6.getGegnerName();
                dieserGegnerHp = gegner6.getGegnerHp();
                dieserGegnerSchaden = gegner6.getGegnerSchadenMax() - rand.nextInt(gegner6.getGegnerSchadenMax()+1);

            }

            System.out.println("\t# Ein(e) " + dieserGegnerName + " ist erschienen! #\n");

            // while loop während gegen den Gegner gekämpft wird.
            label:
            while (dieserGegnerHp > 0) {
                System.out.println("\t Deine HP:\t\t" + spieler.getSpielerHp());
                System.out.println("\t " + dieserGegnerName + " HP:\t\t" + dieserGegnerHp);
                System.out.println("\n\t Was möchtest du tun?");
                System.out.println("\t 1. Angreifen");
                System.out.println("\t 2. Einen Gesundheitstrank trinken");
                System.out.println("\t 3. weglaufen...");
                System.out.println("___________________________________________________________________");

                String eingabe = in.nextLine();
                // kämpfen
                switch (eingabe) {
                    case "1":
                        int schadenVerursacht = spieler.getSpielerSchadenMax();

                        dieserGegnerHp = schadenVerursacht;
                        spieler.setSpielerHp(spieler.getSpielerHp() - dieserGegnerSchaden);

                        System.out.println("\t Du triffst den " + dieserGegnerName + " und verursachst " + spieler.getSpielerSchadenMax() + " Schaden.");
                        System.out.println("\t > Du hast " + dieserGegnerSchaden  + " Schaden erlitten.");
                        System.out.println(" ");

                        if (spieler.getSpielerHp() < 1) {
                            System.out.println("Du stirbst!");
                            System.out.println(" ");
                            break label;
                        }

                        // Trank benutzen
                        break;
                    case "2":
                        if (anzahlGesundheitstraenke > 0) {
                            spieler.setSpielerHp((spieler.getSpielerHp() + heilungGesundheitstrank));
                            anzahlGesundheitstraenke--;
                            System.out.println("\t Du hast einen Heiltrank getrunken und " + heilungGesundheitstrank + " HP wieder hergestellt."
                                    + "\n\t > Du hast jetzt " + spieler.getSpielerHp() + " HP."
                                    + "\n\t > Du hast " + anzahlGesundheitstraenke + " Tränke übrig.");
                            System.out.println(" ");
                        } else {
                            System.out.println("\t Du hast keine Tränke übrig. Besiege gegner um neue Tränke zu erhalten.");
                            System.out.println(" ");
                        }

                        // Höhle verlassen
                        break;
                    case "3":
                        System.out.println("\t Du bist vor dem " + dieserGegnerName + " weggelaufen!.");
                        continue SPIEL;


                    default:
                        System.out.println("\t ungültige Eingabe!");
                        System.out.println("\t °°°°°°°°°°°°°°°°°°");
                        break;
                }

            }

            // Der Spieler ist gestorben.
            if (spieler.getSpielerHp() < 1) {
                System.out.println("GAME OVER!");
                System.out.println(" ");
                break;
            }
            // Gegner besiegt
            System.out.println("=======================================================");
            System.out.println(" # Der/die/das " + dieserGegnerName + " wurde besiegt! # ");
            System.out.println(" # Du hast " + spieler.getSpielerHp() + " HP übrig. #");
            System.out.println("=======================================================");
            System.out.println(" ");

            // Trank
            if (rand.nextInt(100) < dropWahrscheinlichkeitGesundheitstrank) {
                anzahlGesundheitstraenke++;
                System.out.println(" # Der/die/das " + dieserGegnerName + " hat einen Trank fallengelassen. #");
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
        // Spielerde (Loop ist verlassen)
        System.out.println("#######################");
        System.out.println("# Danke fürs Spielen! #");
        System.out.println("#######################");
    }
}
