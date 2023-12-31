package ec.fin.online15.aplicacion.convertidores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("toUpperCaseConverter")
public class ToUpperCaseConverter implements Converter {
  
	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return (value != null) ? value.toString().toUpperCase() : null;
		// Or (String) value;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		return (value != null) ? value.toUpperCase() : null;
	}

}