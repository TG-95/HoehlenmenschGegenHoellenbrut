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
        gegner1.setGegnerHpMax(20);
        gegner1.setGegnerSchadenMin(1);
        gegner1.setGegnerSchadenMax(10);
        gegner1.setLvl(1);
        gegner1.setGegnerHaeufigkeit(30);
        gegner1.setKillCounter(0);

        Gegner gegner2 = new Gegner();
        gegner2.setGegnerName("Ratte");
        gegner2.setGegnerHp(35);
        gegner2.setGegnerHpMax(35);
        gegner2.setGegnerSchadenMin(10);
        gegner2.setGegnerSchadenMax(15);
        gegner2.setLvl(1);
        gegner2.setGegnerHaeufigkeit(30);
        gegner2.setKillCounter(0);

        Gegner gegner3 = new Gegner();
        gegner3.setGegnerName("Troll");
        gegner3.setGegnerHp(50);
        gegner3.setGegnerHpMax(50);
        gegner3.setGegnerSchadenMin(15);
        gegner3.setGegnerSchadenMax(25);
        gegner3.setLvl(1);
        gegner3.setGegnerHaeufigkeit(20);
        gegner3.setKillCounter(0);


        Gegner gegner4 = new Gegner();
        gegner4.setGegnerName("Ork");
        gegner4.setGegnerHp(70);
        gegner4.setGegnerHpMax(70);
        gegner4.setGegnerSchadenMin(25);
        gegner4.setGegnerSchadenMax(40);
        gegner4.setLvl(1);
        gegner4.setGegnerHaeufigkeit(14);

        Gegner gegner5 = new Gegner();
        gegner5.setGegnerName("Bär");
        gegner5.setGegnerHp(100);
        gegner5.setGegnerHpMax(100);
        gegner5.setGegnerSchadenMin(60);
        gegner5.setGegnerSchadenMax(80);
        gegner5.setLvl(1);
        gegner5.setGegnerHaeufigkeit(5);

        Gegner gegner6 = new Gegner();
        gegner6.setGegnerName("Steinmensch");
        gegner6.setGegnerHp(500);
        gegner6.setGegnerHpMax(500);
        gegner6.setGegnerSchadenMin(20);
        gegner6.setGegnerSchadenMax(50);
        gegner6.setLvl(1);
        gegner6.setGegnerHaeufigkeit(1);

        // Tränke
        int anzahlGesundheitstraenke = 3;
        int heilungGesundheitstrank = 30;
        int dropWahrscheinlichkeitGesundheitstrank = 25; // in Prozent
        Traenke hpT = new Traenke("Heiltrank", "klein", 30);

        //Waffen
        Waffen waffe1 = new Waffen("Kurzschwert", 0, 0);
        Waffen waffe2 = new Waffen("Langschwert", 20, 70);
        Waffen waffe3 = new Waffen("Morgenstern", 40, 20);
        Waffen waffe4 = new Waffen("Pfeil und Bogen", 0,10);

        String gewaehlteWaffeName = waffe1.getName();
        int gewaehlteWaffeZusatzschaden = waffe1.getZusatzSchaden();
        int dieseDropWahrscheinlichkeit = waffe2.getDropWahrscheinlichkeit();

        // Infos
        int anzahlGewonneneKaempfe = 0;





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
            int dieserGegnerSchadenMin;
            int dieserGegnerSchadenMax;
            int dieserGegnerHpMax;

            if (x <= 30){ // Fledermaus
                dieserGegnerName = gegner1.getGegnerName();
                dieserGegnerHp = gegner1.getGegnerHp();
                dieserGegnerSchaden = rand.nextInt((gegner1.getGegnerSchadenMax() -
                                    gegner1.getGegnerSchadenMin()) + 1) + gegner1.getGegnerSchadenMin();
                dieserGegnerSchadenMin = gegner1.getGegnerSchadenMin();
                dieserGegnerSchadenMax = gegner1.getGegnerSchadenMax();
                dieserGegnerHpMax = gegner1.getGegnerHpMax();

            }else if (x <= 60){ // Ratte
                dieserGegnerName = gegner2.getGegnerName();
                dieserGegnerHp = gegner2.getGegnerHp();
                dieserGegnerSchaden = rand.nextInt((gegner2.getGegnerSchadenMax() -
                        gegner2.getGegnerSchadenMin()) + 1) + gegner2.getGegnerSchadenMin();
                 dieserGegnerSchadenMin = gegner2.getGegnerSchadenMin();
                 dieserGegnerSchadenMax = gegner2.getGegnerSchadenMax();
                dieserGegnerHpMax = gegner2.getGegnerHpMax();

            } else if (x <= 80){ // Troll
                dieserGegnerName = gegner3.getGegnerName();
                dieserGegnerHp = gegner3.getGegnerHp();
                dieserGegnerSchaden = rand.nextInt((gegner3.getGegnerSchadenMax() -
                        gegner3.getGegnerSchadenMin()) + 1) + gegner3.getGegnerSchadenMin();
                dieserGegnerSchadenMin = gegner3.getGegnerSchadenMin();
                dieserGegnerSchadenMax = gegner3.getGegnerSchadenMax();
                dieserGegnerHpMax = gegner3.getGegnerHpMax();


            }else if (x <= 94){ // Ork
                dieserGegnerName = gegner4.getGegnerName();
                dieserGegnerHp = gegner4.getGegnerHp();
                dieserGegnerSchaden = rand.nextInt((gegner4.getGegnerSchadenMax() -
                        gegner4.getGegnerSchadenMin()) + 1) + gegner4.getGegnerSchadenMin();
                dieserGegnerSchadenMin = gegner4.getGegnerSchadenMin();
                dieserGegnerSchadenMax = gegner4.getGegnerSchadenMax();
                dieserGegnerHpMax = gegner4.getGegnerHpMax();

            }else if (x <= 99){ // Bär
                dieserGegnerName = gegner5.getGegnerName();
                dieserGegnerHp = gegner5.getGegnerHp();
                dieserGegnerSchaden = rand.nextInt((gegner5.getGegnerSchadenMax() -
                        gegner5.getGegnerSchadenMin()) + 1) + gegner5.getGegnerSchadenMin();
                dieserGegnerSchadenMin = gegner5.getGegnerSchadenMin();
                dieserGegnerSchadenMax = gegner5.getGegnerSchadenMax();
                dieserGegnerHpMax = gegner5.getGegnerHpMax();

            }else { // Steinmensch
                dieserGegnerName = gegner6.getGegnerName();
                dieserGegnerHp = gegner6.getGegnerHp();
                dieserGegnerSchaden = rand.nextInt((gegner6.getGegnerSchadenMax() -
                        gegner6.getGegnerSchadenMin()) + 1) + gegner6.getGegnerSchadenMin();
                dieserGegnerSchadenMin = gegner6.getGegnerSchadenMin();
                dieserGegnerSchadenMax = gegner6.getGegnerSchadenMax();
                dieserGegnerHpMax = gegner6.getGegnerHpMax();

            }

            System.out.println("\t# Ein(e) " + dieserGegnerName + " ist erschienen! #\n");

            // while loop während gegen den Gegner gekämpft wird.
            label:
            while (dieserGegnerHp > 0) {
                // Länge des Gegnernamens ausgeleichen
                if (dieserGegnerName.length() > 8 ){
                    System.out.println("\t Deine HP:\t\t\t" + spieler.getSpielerHp());
                    System.out.println("\t " + dieserGegnerName + " HP:\t\t" + dieserGegnerHp);
                    System.out.println("\n\t Was möchtest du tun?");
                    System.out.println("\t 1. Angreifen");
                    System.out.println("\t 2. Einen Gesundheitstrank trinken");
                    System.out.println("\t 3. Weitere Informationen anzeigen");
                    System.out.println("\t 4. weglaufen...");
                    System.out.println("___________________________________________________________________");

                }
                else{
                    System.out.println("\t Deine HP:\t\t" + spieler.getSpielerHp());
                    System.out.println("\t " + dieserGegnerName + " HP:\t\t" + dieserGegnerHp);
                    System.out.println("\n\t Was möchtest du tun?");
                    System.out.println("\t 1. Angreifen");
                    System.out.println("\t 2. Einen Gesundheitstrank trinken");
                    System.out.println("\t 3. Weitere Informationen anzeigen");
                    System.out.println("\t 4. weglaufen...");
                    System.out.println("___________________________________________________________________");

                }
                String eingabe = in.nextLine();




                // kämpfen
                switch (eingabe) {
                    case "1":
                        // Schaden spieler
                        int dieserSpielerSchaden = (rand.nextInt((spieler.getSpielerSchadenMax() -
                                spieler.getSpielerSchadenMin()) + 1) + spieler.getSpielerSchadenMin()) + gewaehlteWaffeZusatzschaden;

                        dieserGegnerHp -= dieserSpielerSchaden;
                        spieler.setSpielerHp(spieler.getSpielerHp() - dieserGegnerSchaden);

                        System.out.println("\t Du triffst deinen Gegner (" + dieserGegnerName + ") und verursachst " + dieserSpielerSchaden + " Schaden.");
                        System.out.println("\t > Du hast " + dieserGegnerSchaden  + " Schaden erlitten.");
                        System.out.println(" ");

                        if (spieler.getSpielerHp() < 1) {
                            System.out.println(" Du stirbst!");
                            System.out.println(" ");
                            break label;
                        }

                        // Trank benutzen
                        break;

                    case "2":
                        if (anzahlGesundheitstraenke > 0) {
                            // prüfen ob maxHp überschritten wird
                            // ja:
                            if ((spieler.getSpielerHp() + hpT.getHeilung()) > spieler.getSpielerHpMax()){
                                System.out.println("Bist du Sicher, dass du einen Trank verwenden willst?");
                                System.out.println("Du würdest " + (spieler.getSpielerHpMax() - spieler.getSpielerHp()) +
                                        " Hp heilen und " + ((spieler.getSpielerHp() + hpT.getHeilung()) - spieler.getSpielerHpMax()) + " Hp würden verfallen!");
                                System.out.println(" ");
                                System.out.println("1. Ja");
                                System.out.println("2. Nein");
                                String eingabe2 = in.nextLine();

                                // Eingabe des Spielers empfangen
                                switch (eingabe2){
                                    case "1":
                                        anzahlGesundheitstraenke--;
                                        System.out.println("\t Du hast einen Heiltrank getrunken und " + (spieler.getSpielerHpMax() - spieler.getSpielerHp()) + " HP wieder hergestellt.");
                                        spieler.setSpielerHp(spieler.getSpielerHpMax());
                                        System.out.println("\n\t > Du hast jetzt " + spieler.getSpielerHpMax() + " HP."
                                                + "\n\t > Du hast " + anzahlGesundheitstraenke + " Tränke übrig.");
                                        System.out.println(" ");


                                    case "2":
                                        break;

                                    default:
                                        System.out.println("\t ungültige Eingabe!");
                                        System.out.println("\t °°°°°°°°°°°°°°°°°°");
                                        break;


                                }

                            }
                            // maxHp wird nicht überschritten --> Trank trinken
                            else if (!((spieler.getSpielerHp() + hpT.getHeilung()) > spieler.getSpielerHpMax())) {
                                anzahlGesundheitstraenke--;
                                spieler.setSpielerHp((spieler.getSpielerHp() + hpT.getHeilung()));
                                System.out.println("\t Du hast einen Heiltrank getrunken und " + hpT.getHeilung() + " HP wieder hergestellt."
                                        + "\n\t > Du hast jetzt " + spieler.getSpielerHp() + " HP."
                                        + "\n\t > Du hast " + anzahlGesundheitstraenke + " Tränke übrig.");
                                System.out.println(" ");
                            }

                        } else {
                            System.out.println("\t Du hast keine Tränke übrig. Besiege gegner um neue Tränke zu erhalten.");
                            System.out.println(" ");
                        }

                        // Höhle verlassen
                        break;

                    case  "3":
                        System.out.println("\t Spieler: ");
                        System.out.println("\t Spieler max. HP: \t\t" + spieler.getSpielerHpMax());
                        System.out.println("\t Spieler aktuelle HP: \t" + spieler.getSpielerHp());
                        System.out.println("\t Spieler Schaden: \t\t" + spieler.getSpielerSchadenMin() + " bis " + spieler.getSpielerSchadenMax());
                        System.out.println("\t Ausgewählte Waffe: \t" + gewaehlteWaffeName + " mit " + gewaehlteWaffeZusatzschaden + " Zusatzschaden");
                        System.out.println(" ");
                        System.out.println("\t Gegner: \t\t\t\t" + dieserGegnerName);
                        System.out.println("\t Gegner max. HP: \t\t" + dieserGegnerHpMax);
                        System.out.println("\t Gegner aktuelle HP: \t" + dieserGegnerHp);
                        System.out.println("\t Gegner Schaden: \t\t" + dieserGegnerSchadenMin + " bis " + dieserGegnerSchadenMax);
                        System.out.println(" ");
                        System.out.println("\t Anzahl bisher gewonnener Kämpfe: " + anzahlGewonneneKaempfe);
                        System.out.println(" ");
                        System.out.println("***************************************");
                        System.out.println(" ");
                        break ;

                    case "4":
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
                System.out.println(" GAME OVER!");
                System.out.println(" ");
                System.out.println(" Du hast " + anzahlGewonneneKaempfe + " Kämpfe gewonnen!");
                System.out.println(" ");

                break;
            }
            // Gegner besiegt
            System.out.println("=======================================================");
            System.out.println(" # Der/die/das " + dieserGegnerName + " wurde besiegt! # ");
            System.out.println(" # Du hast " + spieler.getSpielerHp() + " HP übrig. #");
            System.out.println("=======================================================");
            System.out.println(" ");
            anzahlGewonneneKaempfe++;

            // Loot: Trank und Waffen
            if ((rand.nextInt(100) < dieseDropWahrscheinlichkeit) && dieserGegnerName.equals("Ork")) {
                gewaehlteWaffeName = waffe2.getName();
                gewaehlteWaffeZusatzschaden = waffe2.getZusatzSchaden();
                System.out.println("Der Ork hat eine Waffe fallengelassen");
                System.out.println("Du erhältst ein " + gewaehlteWaffeName + ". Es verursacht " + gewaehlteWaffeZusatzschaden + " zusätzlichen Schaden");
                System.out.println(" ");
                spieler.setSpielerSchadenMin(spieler.getSpielerSchadenMin() + gewaehlteWaffeZusatzschaden);
                spieler.setSpielerSchadenMax(spieler.getSpielerSchadenMax() + gewaehlteWaffeZusatzschaden);
            }
            else if ((rand.nextInt(100) < 20 ) && dieserGegnerName.equals("Bär")) {
                gewaehlteWaffeName = waffe3.getName();
                gewaehlteWaffeZusatzschaden = waffe3.getZusatzSchaden();
                System.out.println("Du hast eine Waffe gefunden!");
                System.out.println("Du erhältst ein " + gewaehlteWaffeName + ". Es verursacht " + gewaehlteWaffeZusatzschaden + " zusätzlichen Schaden");
                System.out.println(" ");
                spieler.setSpielerSchadenMin(spieler.getSpielerSchadenMin() + gewaehlteWaffeZusatzschaden);
                spieler.setSpielerSchadenMax(spieler.getSpielerSchadenMax() + gewaehlteWaffeZusatzschaden);
            }

            if (rand.nextInt(100) < dropWahrscheinlichkeitGesundheitstrank) {
                anzahlGesundheitstraenke++;
                System.out.println(" # Der/die/das " + dieserGegnerName + " hat einen Trank fallengelassen. #");
                System.out.println(" # Du hast jetzt " + anzahlGesundheitstraenke + " Gesundheitstränke!. # ");
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
                System.out.println("Du verlässt die Höhle! ");
                System.out.println("Du hast " + anzahlGewonneneKaempfe + " Kämpfe gewonnen!");
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
