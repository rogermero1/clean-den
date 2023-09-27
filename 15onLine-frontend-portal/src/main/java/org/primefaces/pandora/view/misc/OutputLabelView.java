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

import javax.faces.view.ViewScoped;

import javax.inject.Named;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Named
@ViewScoped
public class OutputLabelView implements Serializable {

    @NotNull
    private String value;

    private String nullableValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNullableValue() {
        return nullableValue;
    }

    public void setNullableValue(String nullableValue) {
        this.nullableValue = nullableValue;
    }
}
