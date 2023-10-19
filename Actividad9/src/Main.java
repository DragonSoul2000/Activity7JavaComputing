import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            Perro a; //objeto pero en cadaver
            String nombre ="",raza="",color="",tamaño="",comida="";
            double gramos;
            short edad;

            a   = new Perro();
            // Ladrar method
            //metodo comida
            System.out.println("un dia estabas bien feliz de la vida, un perro de color:");
            color= teclado.nextLine();
            a.setColor(color);
            System.out.println("dicho color es " + a.getColor()+
                    "\npor lo que se te acerco y te dijo forma tierna");
            System.out.println(a.ladrar());
            System.out.println("Tu respondiste: que pasa amiguin, ¿quieres comida?, " +
                    "\n tal vez sea eso, no te preocupes ya te voy a dar alimento amigo: ");
            System.out.println("¿cuál es el nombre del perro?");
            nombre=teclado.nextLine();
            a.setNombre(nombre);
            System.out.println(" cuando fuste a ir por la bolsas de crocretas de tu fiel amigo " + a.getNombre() +
                    "\npero descubriste que se te acabaron las crocretas, " +
                    "\npor lo que tuviste que ir a la tienda a comprar nuevo alimento");
            System.out.println("Cuando llegaste al departamento de comida de perros,");
            System.out.println("En ese momento tenias que recordar las características de tu perro: ");
            System.out.println("ya que su alimento influye en ello. por lo que te acordastes de su: \"");
            System.out.println("Edad: ");
            edad=teclado.nextShort();
            a.setEdad(edad);
            //preguntar al maestro
            teclado.nextLine();
            System.out.println("Su raza: ");
            raza=teclado.nextLine();
            a.setRaza(raza);
            //

            System.out.println("tamaño");
            tamaño=teclado.nextLine();
            a.setSize(tamaño);
            System.out.println("Ya recordado los datos, fuiste a comprar la bolsa.");
            System.out.println("los gramos de la bolsa son");
            gramos=teclado.nextDouble();
            teclado.nextLine();
            System.out.println("La bolsa que compraste fue de carne:");
            comida= teclado.nextLine();

            System.out.println(a.comer(comida,gramos));










            System.out.println();









        } catch (Exception e){
            System.out.println("Hubo un error en los datos");
        }






    }



}