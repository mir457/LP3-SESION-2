public class CuentaAhorro extends Cuenta{
    public void retirar(double monto){
        super.retirar(monto);
        double saldo = getSaldo();
        if (saldo<minSaldo){
            minSaldo=saldo;
        }
    }
    public void consultar(){
        double interes = minSaldo*tasaInteres/1|00;
        depositar(interes);
        minSaldo=getSaldo();
    }
}

