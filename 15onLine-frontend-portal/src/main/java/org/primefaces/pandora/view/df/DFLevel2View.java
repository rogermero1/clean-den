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
package org.primefaces.pandora.view.df;

import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named("dfLevel2View")
@RequestScoped
public class DFLevel2View {
    
    public void openLevel3() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        PrimeFaces.current().dialog().openDynamic("level3", options, null);
    }
    
    public void onReturnFromLevel3(SelectEvent event) {
        //pass back to level 1
        PrimeFaces.current().dialog().closeDynamic(event.getObject());
    }
}
