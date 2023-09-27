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
package org.primefaces.pandora.view.misc.terminal;

import org.primefaces.model.terminal.TerminalAutoCompleteModel;
import org.primefaces.model.terminal.TerminalCommand;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class TerminalAutoCompleteView implements Serializable {
    
    private TerminalAutoCompleteModel autoCompleteModel;

    public TerminalAutoCompleteView() {
        this.autoCompleteModel = buildAutoCompleteModel();
    }
    
    private TerminalAutoCompleteModel buildAutoCompleteModel() {
        TerminalAutoCompleteModel model = new TerminalAutoCompleteModel();

        TerminalCommand git = model.addCommand("git");
        
        git.addArgument("checkout");
        git.addArgument("commit");
        git.addArgument("status");
        git.addArgument("pull");
        git.addArgument("push").addArgument("origin").addArgument("master");
        
        TerminalCommand svn = model.addCommand("svn");
        
        svn.addArgument("commit");
        svn.addArgument("checkout");
        svn.addArgument("status");
        svn.addArgument("update");
        
        return model;
    }

    public TerminalAutoCompleteModel getAutoCompleteModel() {
        return autoCompleteModel;
    }

    public String handleCommand(String command, String[] params) {
        StringBuilder response = new StringBuilder("The command you entered was: '").append(command);
        
        for (String param : params) {
            response.append(" ").append(param);
        }
        
        return response.append("'").toString();
    }
    
}
