
package programacion.ii.pkg2023;


public class Start {


    public static void main(String[] args) {
        System.out.println("Iniciando juego...");

        Tripulante t1 = new Tripulante();
        Tripulante t2 = new Tripulante();
        Tripulante t3 = new Tripulante();


        t2.id = 1;
        t2.userName = "Juanito";
        t2.color = "Rojo";
        t2.rol = "Inge";
        t2.traje = "Traje";
        t2.accesorio = "Sombrero";

        t2.hacerTarea("Tirar basura");
        t2.hacerTarea("Ver camaras");

        t3.id = 2;
        t3.userName = "Jorge";
        t3.color = "Amarillo";
        t3.rol = "Inge";
        t3.traje = "Traje";
        t3.accesorio = "Gorra";

        System.out.println("**** Inicio el juego ****");

        System.out.println("El tripulante 2 es color: " +t2.color);
        System.out.println("Tiene traje " + t2.traje);
        System.out.println("Se llama " + t2.userName);
        System.out.println("Y tiene " + t2.accesorio);
    }
    
}
