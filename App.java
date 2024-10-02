public class App {


    public static void main(String[] args) {

        MetodoOrdenamiento ordenar = new MetodoOrdenamiento();

        int[] array = ordenar.crearArreglo();

        System.out.println(" ");

        ordenar.imprimirArreglo(array);

        System.out.println(" "); //Aprender metodo de insercion con dos for.

        ordenar.sortInserccion(array, true);

        System.out.println(" ");

        ordenar.imprimirArreglo(array);


    }
}