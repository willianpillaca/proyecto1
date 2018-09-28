package pe.gob.ep.ginnet.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import pe.gob.ep.ginnet.seguridad.bean.UserSecurity;

public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
	@Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		String rol=request.getParameter("rol");
		Integer idRolLogin=Integer.parseInt(rol);
		UserSecurity user = (UserSecurity) authentication.getPrincipal();
		user.getUsuarioLogueado().setIdRolSelectedLogin(idRolLogin);
		request.getSession().setAttribute("usuario", user.getUsuarioLogueado());
        super.onAuthenticationSuccess(request, response, authentication);
    }
}
