public class CalculadoraMedia {

    public static void main(String[] args) {
        // Array de notas dos alunos
        double[] notas = {8.5, 7.0, 9.5, 6.5};

        // Chamando o método para calcular a média das notas
        double media = calcularMedia(notas);

        // Imprimindo a média das notas
        System.out.println("A média das notas é: " + media);
    }

    public static double calcularMedia(double[] notas) {
        // Verificando se o array de notas está vazio
        if (notas.length == 0) {
            System.out.println("Não há notas para calcular a média.");
            return 0.0;
        }

        // Calculando a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
