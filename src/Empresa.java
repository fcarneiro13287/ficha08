public class Empresa {
    private String nome;
    private String numeroFiscal;
    private Funcionario[] empregados;
    private static int numeroFuncionarios=0;

    public Empresa (String nome, String numeroFiscal){
        this.empregados= new Funcionario[10];
        this.nome=nome;
        this.numeroFiscal=numeroFiscal;
    }

    public void adiciona (Funcionario f){
        if (numeroFuncionarios<=9){
            this.empregados[numeroFuncionarios]=f;
            numeroFuncionarios++;
        } else{
            System.out.println("Não podemos acrescentar mais funcionarios");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public static int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }

    public static void setNumeroFuncionarios(int numeroFuncionarios) {
        Empresa.numeroFuncionarios = numeroFuncionarios;
    }
}

