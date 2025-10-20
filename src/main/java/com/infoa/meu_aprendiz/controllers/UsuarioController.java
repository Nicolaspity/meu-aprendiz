package com.senai.infoa.meu_aprendiz.controllers;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/cadastro")
    public String cadastrar(@RequestBody UserDto userDto) {
        return userService.cadastrar(userDto);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLogin user) {
        boolean success = loginService.validateUser(user);

        if (success) {
            return ResponseEntity.ok().body("{\"message\":\"Usuário " + user.getUsername() + " logado com sucesso!\"}");
        } else {
            return ResponseEntity.status(401).body("{\"error\":\"Credenciais inválidas!\"}");
        }
    }
}