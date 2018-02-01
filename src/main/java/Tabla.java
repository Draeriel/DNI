public class Tabla extends DNI{
    private String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    private int numero = 0;

    public Tabla(int numero){
        this.numero= numero;
    }
    public char getLetra(){
        char letra = this.letras.charAt(this.numero);

        return letra;
    }
}
