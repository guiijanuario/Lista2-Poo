package Exercicio3;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    public static void main(String[] args) {
        Map<String, String> objetosECores = new HashMap<>();
        objetosECores.put("bola", "azul");
        objetosECores.put("boneca", "amarela");
        objetosECores.put("dado", "rosa");

        for (String chave : objetosECores.keySet()) {
            String value = objetosECores.get(chave);
            System.out.println(chave + " -> " + value);
        }
        }
    }
