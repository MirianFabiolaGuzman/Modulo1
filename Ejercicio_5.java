// Mirian Fabiola Guzman Moreno
// NC: 202410050105
// Arreglo multidimensional 
public class Ejercicio_5
{
    public static void main(String[] args)
    {
        String[][] compañerosdeclase = {
            {"Norma", "Gavarrete", "Ing.Industrial", "Maquilla"},
            {"Luis", "Ayala", "Ing.Industrial", "Camaronera"},
            {"Bryan", "Vasquez", "Ing.Electronica", "ENNE"},
            {"Luis", "Juarez", "Ing.Electronica", "Tecnico Electricista"},
            {"Ruth", "Bautista", "Ing.Industrial", " Corporation LEAR"}
        };

        for (int i = 0; i < compañerosdeclase.length; i++)
        {
            System.out.println("Companero " + (i + 1) + ": ");
            System.out.println("Nombre: " + compañerosdeclase[i][0]);
            System.out.println("Apellido: " + compañerosdeclase[i][1]);
            System.out.println("Carrera: " + compañerosdeclase[i][2]);
            System.out.println("Lugar de Trabajo: " + compañerosdeclase[i][3]);
            System.out.println();
        }
    }
}