package pe.gob.ep.ginnet.controller.catalogo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.gob.ep.ginnet.radamanthys.bean.Catalogo;
import pe.gob.ep.ginnet.radamanthyz.service.RadamanthyzService;

@Controller
public class CatalogoController {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private RadamanthyzService radamanthyzService;

	@RequestMapping(value = "listelementocatalogobyidgrupo.app")
	public @ResponseBody Map<String, ? extends Object> listelementocatalogobyidgrupo(Integer idGrupo) throws Exception {
		System.out.println("idGrupo->>>"+idGrupo);
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data",radamanthyzService.findCatalogoByIdGrupo(idGrupo) );
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Catalogo>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	

		
}
