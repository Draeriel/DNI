public class DNI {
    public String document = "";
    public char letra = ' ';

    public DNI(){
        this.document = "";
    }
    public DNI(String ausweiss){
        this.document = ausweiss;
    }
    public String getDNI(){
        return this.document;
    }

    public void setLetra(){
        double futuraLetra = Integer.parseInt(this.document)/23.0;
        int resto = (int)(((futuraLetra - (int) (futuraLetra)) * 23)+0.1);
        Tabla letter = new Tabla(resto);
        this.letra = letter.getLetra();


    }
    public char dnicompleto(){
        return this.letra;
    }

}
