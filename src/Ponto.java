public class Ponto {

    private int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this.x = 0;
        this.y = 0;

    }

    public boolean VerificarPontos(Ponto pontoA) {
        if (this.x == pontoA.x && this.y == pontoA.y) {
            return true;
        } else {
            return false;
        }
    }

    public double CalcularDistancia(Ponto pontoB) {
        double D = Math.sqrt(Math.pow((pontoB.x - this.x), 2) + Math.pow((pontoB.y - this.y), 2));
        return (D);
    }

}