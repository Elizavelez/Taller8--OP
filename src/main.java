public class main {

    public static void main(String[] args) {

        //Objeto e instancia
        persona alguien = new persona();

        //Setter
        alguien.setNombre("Andres");
        alguien.setEdad(26);
        alguien.setTelefono("2367438");

        //Imprimir
        System.out.println(alguien.getNombre());
        System.out.println(alguien.getEdad());
        System.out.println(alguien.getTelefono());

        //Imprimir junto
        System.out.println("La persona: " + alguien.getNombre() + " Tiene la edad de: " + alguien.getEdad()
                +" y su numero telefonico es: " + alguien.getTelefono() );
    }
}

//clase persona
class  persona{

    //Variables
    private String Nombre;
    private int Edad;
    private String Telefono;

    //Set y get de nombre
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return this.Nombre;
    }

    //Set y get de edad
    public void setEdad(int Edad){
        this.Edad=Edad;
    }
    public int getEdad(){
        return this.Edad;
    }

    //Set y get de telefono
    public void setTelefono(String telefono){
        this.Telefono=telefono;
    }
    public String getTelefono(){
        return this.Telefono;
    }
}