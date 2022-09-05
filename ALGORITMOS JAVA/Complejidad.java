public class Complejidad {


    /*Segundo algoritmo utilizando la formula (n * (n + 1))/2 para realizar la suma*/
    public double Algoritmo2(double n ) {
        double startTime = System.nanoTime();
        double suma = (n * (n +1)) / 2;
        double endTime = System.nanoTime();
        double timeElapsed = endTime - startTime;

        System.out.println("El tiempo de ejecucion fue en nanosegundos: " + timeElapsed);
        System.out.println("El tiempo de ejecucion fue en  milisegudos: " + timeElapsed / 1000000);
        return suma;
    }


    public static void main(String[] args)  {

        Complejidad complejidad = new Complejidad();
        complejidad.Algoritmo2(200000);

    }
}