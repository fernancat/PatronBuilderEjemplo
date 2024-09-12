import builder.Email;

public class Main {
    public static void main(String[] args) {

        Email email = new Email.EmailBuilder()
                .setDestinario("fernan@gmail.com")
                .setAsunto("oferta importante")
                .setCuerpo("25% de descuento en un producto")
                .build();

        System.out.println(email);

    }
}