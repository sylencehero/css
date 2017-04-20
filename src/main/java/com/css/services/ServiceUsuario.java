package com.css.services;

import java.util.List;
import com.css.commons.Response;
import com.css.interfaces.IUsuario;
import com.css.pojos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author IVAN.ROCHA
 */

@Service("usuariosService")
public class ServiceUsuario {
    
    @Autowired
    @Qualifier("usuariosDao")
    private IUsuario usuarios;
    
    public Response getDataUsuarios() {
        List<Usuario> usuariosList = usuarios.getUsuarios();
        Response respuesta = new Response(usuariosList);
        return respuesta;
    }
    
}
