public class Televisao extends Aparelho {
    public float calcularConsumo() {
        return 120 * voltagem.ajustarCusto();  // 120W para a televisão, ajustado pela voltagem
    }
}
