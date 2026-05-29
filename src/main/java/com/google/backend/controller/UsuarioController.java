/*package com.google.backend.controller;



import com.google.backend.entity.Usuario;
import com.google.backend.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    private final BCryptPasswordEncoder encoder =
            new BCryptPasswordEncoder();

    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {

        usuario.setPassword(
                encoder.encode(usuario.getPassword())
        );

        return usuarioRepository.save(usuario);
    }
}

*/

package com.google.backend.controller;

import com.google.backend.entity.Usuario;
import com.google.backend.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    @GetMapping
public List<Usuario> obtenerUsuarios() {
    return usuarioRepository.findAll();
}
}