package br.com.lds.springsecurity.atividade.main.service.authentication;

import br.com.lds.springsecurity.atividade.main.domain.UserModel;

public interface AuthenticationService {
    UserModel authenticate(final String email, final String password);
}
