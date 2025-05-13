import java.util.Scanner;
import java.util.Random;
public class Main {

        public static void main(String[] args) {
            // Création d’un objet Random pour générer un nombre aléatoire entre 1 et 100
            Random random = new Random();
            int nombreCible = random.nextInt(100) + 1;

            // Variables pour stocker le nombre proposé par le joueur et le nombre de tentatives
            int nombreDeviner = -1;
            int tentative = 0;
            int tentativeMax = 10;

            // Création d’un scanner pour lire les entrées clavier de l'utilisateur    
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenue dans le jeu de devinettes !");
            System.out.println("Devinez un nombre entre 1 et 100. Vous avez 10 tentatives.");

            //le joueur effectue des tentatives jusqu'a attendre la limite    
            while (tentative < tentativeMax) {
                System.out.print("Entrez votre nombre : ");
                nombreDeviner = scanner.nextInt();
                tentative++;

                //si le nombre cible est egal au nombre proposer    
                if (nombreDeviner == nombreCible) {
                    System.out.println("Bravo ! Vous avez deviné le nombre en " + tentative + " tentatives.");
                    break;
                //si le nombre proposer est inférieur au nombre cible        
                } else if (nombreDeviner < nombreCible) {
                    System.out.println("Plus grand !");
                //si le nombre proposer est supérieur au nombre cible         
                } else {
                    System.out.println("plus petit !");
                }
            }
            //si le nombre de tentative maximum est atteinte    
            if (tentative == tentativeMax && nombreDeviner != nombreCible) {
                System.out.println("Perdu, vous avez utilisé vos 10 tentatives. Le nombre était : " + nombreCible);
            }

            scanner.close();
        }


}
