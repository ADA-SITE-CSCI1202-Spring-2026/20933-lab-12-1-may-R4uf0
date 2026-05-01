import java.util.HashSet;

public class UsernameChecker {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();

        // TODO 1 — HashSet automatically ignores duplicates
        usernames.add("ali");
        usernames.add("leyla");
        usernames.add("murad");
        usernames.add("ali");    // duplicate, ignored
        usernames.add("nigar");
        usernames.add("leyla");  // duplicate, ignored

        System.out.println("Unique usernames:");

        // TODO 2
        usernames.forEach(name -> System.out.println(name));

        System.out.println("\nChecking username:");
        String newUsername = "ali";

        // TODO 3
        if (usernames.contains(newUsername)) {
            System.out.println("Username already taken");
        } else {
            usernames.add(newUsername);
            System.out.println("Username added");
        }
    }
}