
package programacion.ii.pkg2023;


public class Tripulante {
    int id;
    String nombre;
    String rol;
    String color;
    String userName;
    int nivel;
    String accesorio;
    String traje;


    void caminar() {
        System.out.println("Estoy caminando");
    }

    void hacerTarea( String tarea) {
        System.out.println("Haciendo tarea " + tarea);
    }

    void matar(int id) {
        System.out.println("Estoy matando a " + id);
    }

    void reportar(int id) {
        System.out.println("Estoy reportando a " + id);
    }

}
