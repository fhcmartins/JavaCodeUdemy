package mod_05_Estrutura_Condicional;

import java.util.*;

class conta_comum{
    protected double saldo;

    public conta_comum(double deposito){
        saldo = deposito;
    }

    public void saque (double valor){
        if(valor > saldo){
            System.out.println("valor acima do saldo");
            return;
        }
        saldo = saldo - valor;
    }

    public void deposito(double valor){
        saldo = saldo + valor;
    }

}

class conta_especial extends conta_comum{
     public double limite;
     
     public conta_especial(double valor){
         super(valor);
         limite = 1500;
         saldo = saldo + limite;
     }

     public void saque(double valor){
         if(valor > saldo){
             System.out.println("Valor acima do saldo");
             return;
         }
         saldo = saldo - valor;

         if(saldo < limite){
             System.out.println("Voce esta acima do limite");
         }
     }
}

class conta_poupanca extends conta_comum{
    public Date aniversario;
    public conta_poupanca(double valor){
        super(valor);
    }
}

class BancoApp{
    public static void main(String[] args){
        Scanner le = new Scanner(System.in);
        //int car;
        System.out.println("Abrindo conta Especial de Ana");
        System.out.println("Informe valor para deposito: ");
        conta_especial Ana = new conta_especial(le.nextDouble());
        System.out.println("Abrindo conta Poupanca Andre");
        System.out.println("Informe valor para deposito");
        conta_poupanca Andre = new conta_poupanca(le.nextDouble());

        do{
            System.out.println("Saldo Ana: " + Ana.saldo);
            System.out.println("Saldo Andre " + Andre.saldo);
            System.out.println("Informe valor para saque de Ana: ");
            Ana.saque(le.nextDouble());
            System.out.println("Informe valor para saque de Andre ");
            System.out.println("Saldo Ana: " + Ana.saldo);
            System.out.println("Saldo Andr: " + Andre.saldo);
            System.out.println("Informe valor para deposito de Ana: ");
            Ana.deposito(le.nextDouble());
            System.out.println("Informe valor para deposito de Andre: ");
            Andre.deposito(le.nextDouble());
            System.out.println("Saldo Ana: " + Ana.saldo);
            System.out.println("Saldo Andre: " + Andre.saldo);
            System.out.println("Deseja sair? Pressione 0 para SIM: ");
        }
        while(le.nextInt()!=0);
    }
}