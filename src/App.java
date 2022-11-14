public class App {

    public static void main(String[] args) {

        Ponto pontoA = new Ponto(10, 5);
        Ponto pontoB = new Ponto(3, 2);

        if (pontoA.VerificarPontos(pontoB)) {
            System.out.println("Os pontos A(x,y) e B(x,y) são iguais ");
        } else {
            System.out.println("Os pontos A(x,y) e B(x,y) não são iguais");
        }

        pontoA.CalcularDistancia(pontoB);
        System.out.println("O calculo da distância entre os pontos A e B é: "
                + pontoA.CalcularDistancia(pontoB));

    }

}