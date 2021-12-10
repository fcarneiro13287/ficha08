public class Empresa {
    private String nome;
    private String numeroFiscal;
    private Funcionario[] empregados;
    private static int numeroFuncionarios=0;

    //construtores
    public Empresa() {
        this.empregados= new Funcionario[10];
    }

    public Empresa (String nome, String numeroFiscal){
        this.empregados= new Funcionario[10];
        this.nome=nome;
        this.numeroFiscal=numeroFiscal;
    }

    //metodos
    public void adiciona (Funcionario f){
        if (numeroFuncionarios<=9){
            this.empregados[numeroFuncionarios]=f;
            numeroFuncionarios++;
        } else{
            System.out.println("Não podemos acrescentar mais funcionarios");
        }
    }
    public void mostraFuncionarios(){
        for(int i=0; i< empregados.length;i++){
            System.out.println("Nome Empregado:"+this.empregados[i].getNome());
            System.out.println("Salario Empregado:"+this.empregados[i].getSalario());
        }
    }

    //getters
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

    //setters
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
    @Override
    public String toString(){
        return "Nome Empresa: "+this.nome+" Numero Fiscal:"+this.numeroFiscal;
    }
}

