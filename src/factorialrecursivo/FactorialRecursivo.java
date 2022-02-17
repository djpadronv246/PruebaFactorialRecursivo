/*
Factorial Recursivo
Fecha: 9 de Septiembre del 2021.
Nombre: Dulce Jocelyn Padrón Villalpando
 */
package factorialrecursivo;

public class FactorialRecursivo {
    public static void main(String[] args) {
        int n=5;
        //Guarda el resultado en una variable
        int resultado=factorialRecursivo(n);
        
        //Muestra el resultado
        System.out.println(resultado);
        
    }
    public static int factorialRecursivo(int numero){
        int res;
        if(numero==1){
            //Se termina la recursión
            return 1;
        }else{
            //Se llama asi misma la función, con el valor del numero menos 1
            res= numero*factorialRecursivo(numero-1);
        }
        //Devolvemos el valor
        return res;
    }
}
