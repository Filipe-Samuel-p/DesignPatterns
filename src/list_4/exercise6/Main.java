package list_4.exercise6;

public class Main {
    public static void main(String[] args) {
        Author originalAuthor = new Author("Carla", "carla@email.com");
        Document originalDoc = new Document("Report", originalAuthor);

        Document copiedDoc = originalDoc.clone();
        copiedDoc.author.name = "Lucas";
        copiedDoc.author.email = "lucas@email.com";

        System.out.println("Original: " + originalDoc);
        System.out.println("Copy:     " + copiedDoc);
    }
}
