// Mirian Fabiola Guzman Moreno 
// 202410050105
// Programa qie indica si un alumno aprobp o reprobo segun su nota
public class Ejercicio_6 
{
    public static void main(String[] args) 
    {
        String[] compañeros = {"Fernando", "Dimas"};
        int[] notas = {56, 70};

        for (int i = 0; i < compañeros.length; i++)
        {
            System.out.println("Nombre: " + compañeros[i]);
            System.out.println("Nota: " + notas[i]);
            if (notas[i] >= 70) {
                System.out.println("Resultado: Aprobado");
            } else {
                System.out.println("Resultado: Reprobado");
            }
            System.out.println();
        }
    }
}
