package br.com.ourogourmet.ouro.gourmet.usuario.exceptions;

public class UsuarioSenhaInvalidaException extends RuntimeException {
    public UsuarioSenhaInvalidaException() {
        super("Senha informada está incorreta.");
    }
}
