package CoffeeShop;

import java.util.Scanner;

public class Simulation {
	public static int NeIstersiniz(Starbucks s1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gitmek istediginiz tusa basiniz");
        System.out.println("Americano için 1");
        System.out.println("Macchiato için 2");
        System.out.println("Brownie için 3");
        System.out.println("Çýkmak için 4");
        int input = scan.nextInt();
        int totalCost = 0;
        if (input == 1 || input == 2) {
            System.out.println("Tall için 1");
            System.out.println("Grande için 2");
            System.out.println("Venti için 3");

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
        System.out.println("Kayýtlý müsteri iseniz 1e deðilseniz 2 ye basýnýz");
        int m = scan.nextInt();
        if (m == 2) {

            System.out.println("Yeni müþteri kaydý oluþturuluyor");
            System.out.println("Müþteri numaranýzý girin");
            int id = scan.nextInt();
            System.out.println("Isminizi girin");
            String name = scan.nextLine();
            name = scan.nextLine();
            System.out.println("Mailinizi girin");
            String mail = scan.nextLine();
             if (!(mail.contains("@") && mail.length() > 6) )
            while (true) {
                System.out.println("Mailinizi tekrar giriniz, sartlari saðlamýyor");
                mail = scan.nextLine();
                if (mail.contains("@") && mail.length() > 6) {
                    break;
                }

            }
            System.out.println("Þifrenizi girin");
            String password = scan.nextLine();
             if (password.length() < 6)
            while (true) {
                System.out.println("Þifrenizi tekrar giriniz, 7 hane olmalý en az");
                password = scan.nextLine();
                if (password.length() > 6) {
                    break;
                }

            }
            c1 = new Customer(id, name, mail, password);

        } else {
            System.out.println("Müþteri numaranýzý giriniz");
            int n = scan.nextInt();
            while (!(n == 1919 || n == 2020)) {
                System.out.println("Yanlýþ müþteri numarasý tekrar giriniz");
                n = scan.nextInt();
            }
            c1 = new Customer(n);

            System.out.println("Þifre deðiþtirmek için 1e devam etmek için 2 ye basýnýz");
            n = scan.nextInt();
            if (n == 1) {
                System.out.println("Þifrenizi girin");
                String password = scan.nextLine();
                if (password.length() < 6) 
                {
                    while (true) {
                    System.out.println("Þifrenizi tekrar giriniz, 7 hane olmalý en az");
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
                System.out.println("Bedava yiyecek/içecek kazandýnýz");
                System.out.println("Toplam odeme =" + totalCost);
                bedavaIcecek = true;
                System.out.println("Lütfen bedava yiyeceðinizi/içeceðinizi alýnýz");
                s1.printMenu();
                NeIstersiniz(s1);
                bedavaIcecek = false;
                c1.resetstar();
            }

            System.out.println("Toplam odeme =" + totalCost);
        } while (cost != 0);
        System.out.println("Ýyi günler dileriz");
        System.out.println("Bizi tercih ettiðiniz için teþekkür ederiz");

        System.out.println("Isletme kari =" + s1.totalProfit);
        System.out.println("Isletme ciro =" + s1.totalSales);
    }

}
