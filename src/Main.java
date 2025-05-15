import br.com.grazi.model.Weather;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Weather weather = new Weather();

        try {
            while (true){
                System.out.println(
                        """
                        -------------------------------
                        | PREVISÃO DO TEMPO           |
                        | 1 - Definir nome da cidade; |
                        | 0 - Sair;                   |
                        -------------------------------
                        """);
                int choose = scanner.nextInt();
                if (choose == 0){
                    System.out.println("Saindo...");
                    break;
                } else if (choose == 1){
                    System.out.println("Digite o nome da cidade:");
                    String name = scanner.next();
                    weather.weatherNow(name);
                } else {
                    System.out.println("Opção Inválida!");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Opção Inválida!");
        }
    }
}