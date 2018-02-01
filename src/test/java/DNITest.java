import org.junit.Test;


public class DNITest {
    @Test
    public void miDni() {
        String document = "43177139";
        DNI ausweiss = new DNI(document);
        ausweiss.setLetra();
        char letra = ausweiss.dnicompleto();
        System.out.println(letra);
    }
    @Test
    public void abuela() {
        String document = "43040215";
        DNI ausweiss = new DNI(document);
        ausweiss.setLetra();
        char letra = ausweiss.dnicompleto();
        System.out.println(letra);
    }
    @Test
    public void diana() {
        String document = "43177140";
        DNI ausweiss = new DNI(document);
        ausweiss.setLetra();
        char letra = ausweiss.dnicompleto();
        System.out.println(letra);
    }
    @Test
    public void delia() {
        String document = "43177141";
        DNI ausweiss = new DNI(document);
        ausweiss.setLetra();
        char letra = ausweiss.dnicompleto();
        System.out.println(letra);
    }


}
