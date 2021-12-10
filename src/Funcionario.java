public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String bi;
    private static int identificador=0;

    public Funcionario(){
        Funcionario.identificador++;
    };

    public Funcionario(String nome) {
        Funcionario.identificador++;
        this.nome = nome;
    }

    public void recebeAumento(double aumento){
    };

    public double calculaGanhoAnual(){
        return 10;
    };

    public double calculaHoraExtra(int hora){
        return 10;
    };

    public double getBonificacao(){
        return 10;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    /*public void setSalario(double salario) {
        this.salario = salario;
    }*/

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public int getIdentificador() {
        return identificador;
    }

    /* não faz sentido
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }*/
    @Override
    public String toString(){
        return "Nome:"+this.nome+"Salario:"+this.salario;
    }
}
