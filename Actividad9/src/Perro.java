public class Perro {




    private String nombre;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    private String raza;
    private String color;
    private String size;
    private short edad;




    // Ladrar method
    public String comer( String comida,double gramos ){
        String resultado="";
        if (gramos<=20){

            if (comida =="res"|| comida=="Res"&& edad<=2){
                resultado="crocreta de res para cachorro";
            } else if (comida == "pollo"||comida=="Pollo"&& edad<=2) {
                resultado="crocreta de pollo para cachorro";
            } else if (comida=="res"||comida=="res"&& edad>=2 && size=="pequeño"||size=="Pequeño") {
                resultado="crocreta de res para pequeño";
            }else if (comida=="res"||comida=="res"&& edad>=2 && size=="mediano"||size=="Mediano") {
                resultado="crocreta de res para mediano";
            }else if (comida=="res"||comida=="res"&& edad>=2 && size=="grande"||size=="Grande") {
                resultado="crocreta de res para grande";//
            }else if (comida=="pollo"||comida=="pollo"&& edad>=2 && size=="pequeño"||size=="Pequeño") {
                resultado="crocreta de pollo para pequeño";
            }else if (comida=="pollo"||comida=="pollo"&& edad>=2 && size=="mediano"||size=="Mediano") {
                resultado="crocreta de pollo para mediano";
            }else if (comida=="pollo"||comida=="pollo"&& edad>=2 && size=="grande"||size=="Grande") {
                resultado="crocreta de pollo para pequeño";
            }
        }


        return resultado;
    }

    public String ladrar (){
        String ladrar ="";
        ladrar="guau guau";
        return ladrar;
    }




    //metodo comida

}
