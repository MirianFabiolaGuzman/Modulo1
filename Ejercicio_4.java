// Mirian Fabiola Guzman Moreno
// NC:202410050105
// Programa que guarda e imprime el nombre de mis compaeñeros 
public class Ejercicio_4 
{
    public static void main(String[] args) 
    {
        String[] nc = {"Bripny", "Osmer", "Cristian", "Noel", "Danllis", "Ermin", "Evelyn", "Blanca", "Ivania", "Francisco"};

        for (int i = 0; i < nc.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + nc[i]);
        }
    }
}