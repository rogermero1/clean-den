/**
 *  Copyright 2009-2020 PrimeTek.
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.primefaces.pandora.view.misc;

import org.primefaces.PrimeFaces;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class ResetInputView {
    
    private String text1;
    
    private String text2;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
    
    public void save() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data Saved"));
    }
    
    public void reset() {
        PrimeFaces.current().resetInputs("form:panel");
    }
    
    public void resetFail() {
        this.text1 = null;
        this.text2 = null;
        
        FacesMessage msg = new FacesMessage("Model reset, but it won't work properly.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
