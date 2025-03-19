
public class Login {
    private String username;
    private String password;
    private WishList wishList;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        this.wishList = new WishList(username + "'s WishList", "WL-" + username.hashCode());
    }

    public boolean authenticate(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Login successful! Welcome, " + username);
            return true;
        } else {
            System.out.println("Invalid credentials. Try again.");
            return false;
        }
    }

    public void displayWishList() {
        System.out.print(username + "'s Wish List: ");
        wishList.printList();
    }

    public WishList getWishList() {
        return wishList;
    }
}