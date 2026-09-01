package brt.com.alura.screenmatch.service;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.json.JsonMapper;

// Classe que converte os dados vindo da API para o estilo do record DadosSeries
public class ConverteDados implements IConverteDados{
    private JsonMapper mapper = new JsonMapper();


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json,classe);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }
}
