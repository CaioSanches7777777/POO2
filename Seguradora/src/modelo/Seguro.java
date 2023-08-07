package modelo;

public class Seguro {
    private float valor;
    private boolean vigencia;
    private Cliente proprietario;
    private Cliente[] assegurado;
    private Veiculo veiAssegurado;

    public Seguro(float valor, boolean vigencia, Cliente proprietario, Cliente[] assegurado, Veiculo veiAssegurado) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
        this.assegurado = assegurado;
        this.veiAssegurado = veiAssegurado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public Cliente[] getAssegurado() {
        return assegurado;
    }

    public void setAssegurado(Cliente[] assegurado) {
        this.assegurado = assegurado;
    }

    public Veiculo getVeiAssegurado() {
        return veiAssegurado;
    }

    public void setVeiAssegurado(Veiculo veiAssegurado) {
        this.veiAssegurado = veiAssegurado;
    }

    
}
