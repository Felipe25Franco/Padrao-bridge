public class Computador extends Aparelho {
    public float calcularConsumo() {
        return 250 * voltagem.ajustarCusto();  // 250W para o computador, ajustado pela voltagem
    }
}
