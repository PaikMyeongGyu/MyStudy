package oop.solid.ocp;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRegister {
    UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    public void register(String username, String password) {

        if(userRepository.isExists(username))
            throw new DuplicateUserException();

        String encodedPassword = passwordEncoder.encoding(password);
        userRepository.save(username, encodedPassword);
    }
}
