package com.css.daos;

import com.css.interfaces.IUsuario;
import java.util.List;
import com.css.mappers.MapUsuario;
import com.css.pojos.Usuario;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IVAN.ROCHA
 */
@Repository("usuariosDao")
@Profile("jdbc")
public class DaoUsuarios implements IUsuario {

    @Autowired
    @Qualifier("sessionFactory")
    private SqlSessionFactory ssf;

    @Override
    public List<Usuario> getUsuarios() {
        SqlSession session = ssf.openSession();
        MapUsuario mapper = session.getMapper(MapUsuario.class);
        List<Usuario> usuarios = null;
        try {
            usuarios = (List<Usuario>) mapper.getUsuarios();
        } finally {
            session.close();
        }
        return usuarios;
    }

}
