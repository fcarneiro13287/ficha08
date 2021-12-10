public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("XPTO","319089876");

        Funcionario f1 = new Funcionario();
        f1.setSalario(1000);
        f1.setNome("Jose");
        empresa.adiciona(f1);
        Funcionario f2 = new Funcionario();
        f2.setSalario(1700);
        f2.setNome("Maria");
        empresa.adiciona(f2);

        for(int i=2;i<10;i++){
            Funcionario f = new Funcionario();
            f.setNome("empregado"+i);
            f.setSalario(1000+i*100);
            empresa.adiciona(f);
        }
        System.out.println("mostra o metodo toString e Funcionario da Empresa");
        System.out.println(empresa);
        empresa.mostraFuncionarios();

        System.out.println("mostra o metodo toString de cada Funcionario");
        for(int i=0;i<empresa.getEmpregados().length;i++){
            System.out.println(empresa.getEmpregados()[i]);
        }

        Funcionario f7 = new Funcionario();
        Funcionario f8 = new Funcionario();

        System.out.println(f8.getIdentificador());

    }
}
