public class TestaEmpresa {
    Empresa empresa = new Empresa();

    Funcionario f1 = new Funcionario();
    f1.setSalario(1000);
    empresa.adiciona(f1);
    Funcionario f2 = new Funcionario();
    f2.salario = 1700;
    empresa.adiciona(f2);

}
