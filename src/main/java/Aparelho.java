public abstract class Aparelho {
    protected Voltagem voltagem;  // Referência para a voltagem

    public void setVoltagem(Voltagem voltagem) {
        this.voltagem = voltagem;
    }

    public abstract float calcularConsumo();  // Calcular o custo do consumo de energia
}
