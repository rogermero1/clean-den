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
package org.primefaces.pandora.view.input;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.UnselectEvent;

@Named
@RequestScoped
public class CheckboxView {

    private String[] selectedConsoles;
    private String[] selectedConsoles2;
    private String[] selectedCities;
    private String[] selectedCities2;
    private List<String> cities;
    private List<SelectItem> cars;
    private String[] selectedCars;

    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("Miami");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
        cities.add("Brasilia");
        cities.add("Amsterdam");
        
        cars = new ArrayList<>();
        SelectItemGroup germanCars = new SelectItemGroup("German Cars");
        germanCars.setSelectItems(new SelectItem[] {
            new SelectItem("BMW", "BMW"),
            new SelectItem("Mercedes", "Mercedes"),
            new SelectItem("Volkswagen", "Volkswagen")
        });
        
        SelectItemGroup americanCars = new SelectItemGroup("American Cars");
        americanCars.setSelectItems(new SelectItem[]{
            new SelectItem("Chrysler", "Chrysler"),
            new SelectItem("GM", "GM"),
            new SelectItem("Ford", "Ford")
        });

        cars.add(germanCars);
        cars.add(americanCars);
    }

    public String[] getSelectedConsoles() {
        return selectedConsoles;
    }

    public void setSelectedConsoles(String[] selectedConsoles) {
        this.selectedConsoles = selectedConsoles;
    }

    public String[] getSelectedCities() {
        return selectedCities;
    }

    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }

    public String[] getSelectedCities2() {
        return selectedCities2;
    }

    public void setSelectedCities2(String[] selectedCities2) {
        this.selectedCities2 = selectedCities2;
    }

    public String[] getSelectedConsoles2() {
        return selectedConsoles2;
    }

    public void setSelectedConsoles2(String[] selectedConsoles2) {
        this.selectedConsoles2 = selectedConsoles2;
    }

    public List<String> getCities() {
        return cities;
    }

    public List<SelectItem> getCars() {
        return cars;
    }

    public void setCars(List<SelectItem> cars) {
        this.cars = cars;
    }

    public String[] getSelectedCars() {
        return selectedCars;
    }

    public void setSelectedCars(String[] selectedCars) {
        this.selectedCars = selectedCars;
    }

    public void onItemUnselect(UnselectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        
        FacesMessage msg = new FacesMessage();
        msg.setSummary("Item unselected: " + event.getObject().toString());
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        
        context.addMessage(null, msg);
    }
}
