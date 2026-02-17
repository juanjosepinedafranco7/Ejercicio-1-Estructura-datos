public class NotasAlumnos {
    public static void main(String[] args) {
        int[][] notas = {{85, 90, 78, 92}, {70, 88, 95, 82}, {92, 76, 89, 94}};
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            System.out.println("Promedio alumno " + i + ": " + (suma / 4.0));
        }
    }
}
