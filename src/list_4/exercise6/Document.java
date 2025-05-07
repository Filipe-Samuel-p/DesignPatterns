package list_4.exercise6;

class Document {
    String title;
    Author author;

    public Document(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Document clone() {
        return new Document(title, author.clone());
    }

    @Override
    public String toString() {
        return "Document: " + title + " | Author: " + author;
    }
}
