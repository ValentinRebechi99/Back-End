/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.ValentinRebechi.Security.Service;

import com.Portfolio.ValentinRebechi.Security.Entity.Usuario;
import com.Portfolio.ValentinRebechi.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vale_
 */
@Service
@Transactional
public class UsuarioService {

    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {

        return iusuarioRepository.findByNombreUsuario(nombreUsuario);

    }

    public boolean existByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existByEmail(String email) {
        return iusuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }
}
