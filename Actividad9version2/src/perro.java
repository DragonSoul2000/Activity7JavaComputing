import java.util.Scanner;

public class perro {



    private String nombre;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    private String color;
    private String tamaño;

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    private  short edad;

    public String comer(String comida ){
        /*
        Scanner teclado = new Scanner(System.in);
        String comida="";
        comida= teclado.nextLine();
          System.out.println("Elige el tipo de comida");
         */

        String resultado="";


        if (comida=="res"||comida=="Res"&& edad<=2){
            resultado="crocreta de res para cachorro";

        } else if (comida=="pollo"||comida=="Pollo"&& edad<=2) {
            resultado="crocreta de pollo para cachorro";
        } else if (comida=="carne"||comida=="carne"&& edad>=2 && tamaño=="pequeño") {
            resultado="crocreta de pollo para pequeño";

        }

        return resultado;
    }

    public String ladrar (){
        String ladrar ="";
        ladrar="guau guau";
        return ladrar;
    }



}
