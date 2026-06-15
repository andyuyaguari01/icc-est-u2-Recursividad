public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("suma consecutiva de 5");
        int res = runEjercicio1(5);
        System.out.println("ES"+ res);
        //runEjercicio1();

        System.out.println("Ejercicio2");
        long res2 = runEjercicio2(2,40);
        System.out.println("Es"+ res2);
    }

        // Escribe una funcion recursiva que calcule la suma de todos los  numeros enteros 
        // consecutivos desde 1 hasta a un numero dado n. Por ejemplo, si n es igual a 5 ,
        // la funcion debe devolver 1 +2 +3 +4 + 5 = 15
        private static int runEjercicio1(int n){
            //CASPO BASE : N=1 
            if (n==1){
                return 1;
            }
            // CASO RECURSIVO
            int res = n + runEjercicio1(n-1);
            return res;
            
        }

        // Potencia de un numero : Escribe una funcion recursiva que calcule la potencia
        // de un numero base elevado a un exponente entero exponete, Por ejemplo, si base 
        // base es 2 y exponente es 3 , la funcion debe devolver 2^3 = 8.
        private static long runEjercicio2( int base , int exponete){
            //CASO BASE
            if(exponete==1){ 
            return base ; 

            }
            //CASO RECURSIVO
            return base * runEjercicio2(base, exponete-1);

        }

}
