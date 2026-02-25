package cep;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaCEP consultaCEP = new ConsultaCEP();
        Scanner sc = new Scanner(System.in);
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        String busca = "";

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite o cep da sua residência: ");
            busca = sc.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                CEP endereco = consultaCEP.buscaCep(busca);
                System.out.println(endereco);
                geradorDeArquivo.salvaJson(endereco);
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicação");
            }



        }
    }

}
