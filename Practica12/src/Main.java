//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
String [] G02 = {"Claudia", "Karina", "Casas", "Ramos"};
int [][] matriz ={{1,2},{3,4}};

        for (int j=0; j < matriz.length; j++){
            for (int k=0; k < matriz.length; k++){
                System.out.println("Elemento de la fila: "+j +", columna: "+k +" es: "+matriz[j][k] );
            }
        }
        for (int i = 0; i < G02.length; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("Forma 1 Elemento: " + G02[i]);
        }
        for  (String elemento:G02){
            System.out.println("Forma 2 Elemento: " + elemento);
        }
    }
}