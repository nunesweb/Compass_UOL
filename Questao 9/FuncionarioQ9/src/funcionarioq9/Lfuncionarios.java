/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarioq9;

/**
 *
 * @author Sergio Ferr
 */
public class Lfuncionarios {

    String func;
    double salario;

    public Lfuncionarios(String func, double salario) {
        this.func = func;
        this.salario = salario;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBoni() {
        if (this.salario <= 1000) {
            return this.salario * 0.2;
        } else if (this.salario < 2000) {
            return this.salario * 0.1;
        } else {
            return -(this.salario * 0.1);
        }
    }

    public double getSalLiquido() {
        return salario + this.getBoni();
    }
    
}
