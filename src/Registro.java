public class Registro {
    String codigo;

    public Registro(String codigo) {
        // (Eu quero que o programa pare de rodar se algum código estiver errado.)

        // Código obrigatoriamente é uma String de 9 dígitos numéricos.
        if (codigo.length() != 9) {
            throw new IllegalArgumentException("Código precisa ter 9 dígitos.");
        }
        // Código obrigatoriamente é uma String composta apenas por números.
        for (int i = 0; i < codigo.length(); i++) {
            char c = codigo.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Código ser composto apenas por números.");
            }
        }

        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}