package list_4.exercise6;

class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Author clone() {
        return new Author(name, email);
    }

    @Override
    public String toString() {
        return name + " <" + email + ">";
    }
}
