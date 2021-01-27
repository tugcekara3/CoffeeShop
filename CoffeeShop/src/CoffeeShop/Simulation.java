package CoffeeShop;

import java.util.Scanner;

public class Simulation {
	public static int NeIstersiniz(Starbucks s1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gitmek istediginiz tusa basiniz");
        System.out.println("Americano i�in 1");
        System.out.println("Macchiato i�in 2");
        System.out.println("Brownie i�in 3");
        System.out.println("��kmak i�in 4");
        int input = scan.nextInt();
        int totalCost = 0;
        if (input == 1 || input == 2) {
            System.out.println("Tall i�in 1");
            System.out.println("Grande i�in 2");
            System.out.println("Venti i�in 3");

            int size = scan.nextInt();

            if (input == 1 && size == 1) {
                totalCost += s1.SellAmericano("Tall");
            }

            if (input == 1 && size == 2) {
                totalCost += s1.SellAmericano("Grande");
            }

            if (input == 1 && size == 3) {
                totalCost += s1.SellAmericano("Venti");
            }

            if (input == 2 && size == 1) {
                totalCost += s1.SellMacchiato("Tall");
            }

            if (input == 2 && size == 2) {
                totalCost += s1.SellMacchiato("Grande");
            }

            if (input == 2 && size == 3) {
                totalCost += s1.SellMacchiato("Venti");
            }

        }
        if (input == 3) {
            totalCost += s1.sellBrownie();
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Customer c1;
        System.out.println("Hos geldiniz");

        Scanner scan = new Scanner(System.in);
        System.out.println("Kay�tl� m�steri iseniz 1e de�ilseniz 2 ye bas�n�z");
        int m = scan.nextInt();
        if (m == 2) {

            System.out.println("Yeni m��teri kayd� olu�turuluyor");
            System.out.println("M��teri numaran�z� girin");
            int id = scan.nextInt();
            System.out.println("Isminizi girin");
            String name = scan.nextLine();
            name = scan.nextLine();
            System.out.println("Mailinizi girin");
            String mail = scan.nextLine();
             if (!(mail.contains("@") && mail.length() > 6) )
            while (true) {
                System.out.println("Mailinizi tekrar giriniz, sartlari sa�lam�yor");
                mail = scan.nextLine();
                if (mail.contains("@") && mail.length() > 6) {
                    break;
                }

            }
            System.out.println("�ifrenizi girin");
            String password = scan.nextLine();
             if (password.length() < 6)
            while (true) {
                System.out.println("�ifrenizi tekrar giriniz, 7 hane olmal� en az");
                password = scan.nextLine();
                if (password.length() > 6) {
                    break;
                }

            }
            c1 = new Customer(id, name, mail, password);

        } else {
            System.out.println("M��teri numaran�z� giriniz");
            int n = scan.nextInt();
            while (!(n == 1919 || n == 2020)) {
                System.out.println("Yanl�� m��teri numaras� tekrar giriniz");
                n = scan.nextInt();
            }
            c1 = new Customer(n);

            System.out.println("�ifre de�i�tirmek i�in 1e devam etmek i�in 2 ye bas�n�z");
            n = scan.nextInt();
            if (n == 1) {
                System.out.println("�ifrenizi girin");
                String password = scan.nextLine();
                if (password.length() < 6) 
                {
                    while (true) {
                    System.out.println("�ifrenizi tekrar giriniz, 7 hane olmal� en az");
                    password = scan.nextLine();
                    if (password.length() > 6) {
                        break;
                    }

                }
                }
                c1.changePassword(password);
            }

        }

        Starbucks s1 = new Starbucks();
        int cost;
        int totalCost = 0;
        do {
            boolean bedavaIcecek = false;

            s1.printMenu();

            cost = NeIstersiniz(s1);
            totalCost += cost;
            int starCount = c1.getStar();
            if (cost > 0) {
                starCount = c1.increaseStar();
            }

            if (starCount >= s1.RewardStarCount()) {
                System.out.println("Bedava yiyecek/i�ecek kazand�n�z");
                System.out.println("Toplam odeme =" + totalCost);
                bedavaIcecek = true;
                System.out.println("L�tfen bedava yiyece�inizi/i�ece�inizi al�n�z");
                s1.printMenu();
                NeIstersiniz(s1);
                bedavaIcecek = false;
                c1.resetstar();
            }

            System.out.println("Toplam odeme =" + totalCost);
        } while (cost != 0);
        System.out.println("�yi g�nler dileriz");
        System.out.println("Bizi tercih etti�iniz i�in te�ekk�r ederiz");

        System.out.println("Isletme kari =" + s1.totalProfit);
        System.out.println("Isletme ciro =" + s1.totalSales);
    }

}
