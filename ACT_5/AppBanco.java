public class AppBanco {
    public static void  main(String[] args){
        Cuenta[] cuentas = 2;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done){
            System.out.print("D)epositar R)etirar C)onsultar S)alir: ");
            String op = in.next();
            if (op.equals("D")|| op.equals("R")){
                System.out.print("Ingrese un número de cuenta y un monto: ");
                int num = int.nextInt();
                double monto = in.nextDouble();
                if(op.equals("D")){
                    cuentas[num].depositar(monto);
                }
                else{
                    cuentas[num].retirar(monto);
                }
                System.out.println("Saldo: "+cuentas[num].getSaldo());
            }
            else if (op.equals("C")){
                for (int n = 0; n<cuentas.lenght; n++){
                    cuentas[n].consultar();
                    System.out.println(n+""+cuentas[n].getSaldo());
                }
            }
            else if (input == "S"){
                done = true;
            }
        }
    }
}
