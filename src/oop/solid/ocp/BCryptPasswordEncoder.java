package oop.solid.ocp;

public class BCryptPasswordEncoder implements PasswordEncoder {
    @Override
    public String encoding(String password) {
        // BCrypt 방식의 패스워드 암호화 구현
        return password;
    }
}
