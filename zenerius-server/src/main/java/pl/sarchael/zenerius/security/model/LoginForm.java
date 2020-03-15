package pl.sarchael.zenerius.security.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginForm {
    private String username;
    private String password;
}
