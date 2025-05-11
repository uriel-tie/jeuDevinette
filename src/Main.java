import java.util.Scanner;
import java.util.Random;
public class Main {

        public static void main(String[] args) {
            Random random = new Random();
            int nombreCible = random.nextInt(100) + 1;
            int nombreDeviner = -1;
            int tentative = 0;
            int tentativeMax = 10;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenue dans le jeu de devinettes !");
            System.out.println("Devinez un nombre entre 1 et 100. Vous avez 10 tentatives.");

            while (tentative < tentativeMax) {
                System.out.print("Entrez votre nombre : ");
                nombreDeviner = scanner.nextInt();
                tentative++;

                if (nombreDeviner == nombreCible) {
                    System.out.println("Bravo ! Vous avez deviné le nombre en " + tentative + " tentatives.");
                    break;
                } else if (nombreDeviner < nombreCible) {
                    System.out.println("Plus grand !");
                } else {
                    System.out.println("plus petit !");
                }
            }

            if (tentative == tentativeMax && nombreDeviner != nombreCible) {
                System.out.println("Perdu, vous avez utilisé vos 10 tentatives. Le nombre était : " + nombreCible);
            }

            scanner.close();
        }


}
