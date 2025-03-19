import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creăm un utilizator fictiv
        Login user = new Login("cristian", "123");

        // Cerem inputul utilizatorului pentru login
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Verificăm autentificarea
        if (user.authenticate(inputUsername, inputPassword)) {
            WishList userWishList = user.getWishList();

            // Adăugăm câteva produse în wishlist
            userWishList.add("Laptop");
            userWishList.add("Monitor");
            userWishList.add("Mouse");

            // Afișăm wishlist-ul
            userWishList.printList();

            // Verificăm dacă un produs este disponibil
            System.out.print("Enter a product to check availability: ");
            String productToCheck = scanner.nextLine();
            userWishList.available(productToCheck);

            // Eliminăm un produs
            System.out.print("Enter a product to remove: ");
            String productToRemove = scanner.nextLine();
            userWishList.removeProduct(productToRemove);
            userWishList.printList();
        }

        scanner.close();
    }
}
