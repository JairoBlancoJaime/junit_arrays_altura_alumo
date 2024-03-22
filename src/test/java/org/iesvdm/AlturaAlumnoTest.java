package org.iesvdm;

import org.junit.jupiter.api.Test;
public class AlturaAlumnoTest {

    private AlturaAlumno nombre;
    private AlturaAlumno altura;

    @Test
    void aniadeNombre (){}

    @Test
    void aniadeAltura (){}

    @Test
    void buscaNombre(){
        int indice=1;
        String[] nombres={"jose", "cesar", "lucas"};
        String nombre = "lucas";

        int indiceEsperado = 2;

        int resultado = buscaNombre(nombre, altura);


    }

    @Test
    void modificaAltura() {
        double [] alturas = {1, 7};
        int pos=0;
        double alturaNueva;
    }

    @Test
    void mostrar() {
        String[] nombres = {"Ana", "Juan", "Maria", "Pedro"};
        double[] alturas = {1.65, 1.75, 1.70, 1.80};

        String salidaObtenida = mostrar(nombres, alturas);
    }

    @Test
    void calculaMaximo () {}

    @Test
    void calculaMedia () {}

    @Test
    void givenNombresAndAlturasWhenMostrarThenPrin(){

        final PrintStream standardOut = System.out;
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStreamCAptor));

        String[] nombres = {"hola", "hello", "adios", "goodbye"};
        double[] alturas = {1.20, 1.70, 1.60, 1.80};
        AlturaAlumno.mostrar(nombres, alturas);

        assert (nombres.length>0);
        assert (nombres.length>0);

        assertEquals ("hola\t|   1.20\nhello\t|   1.70\nadios\t|   1.60\ngoodbye\t|   1.8\n" +outputStreamCaptor);
        int indexOfHello=outputStreamCaptor.toString().indexOf("hello");
        assertTrue (indexOfHello>-1);
    }
}
