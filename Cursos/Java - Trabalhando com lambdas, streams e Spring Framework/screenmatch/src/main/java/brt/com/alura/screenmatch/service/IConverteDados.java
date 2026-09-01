package brt.com.alura.screenmatch.service;

// Interface para trabalhar com a inversão de dados para mais de um
// modo de vídeo.
public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
