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
package org.primefaces.pandora.convert;

import java.io.Serializable;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.primefaces.model.timeline.TimelineEvent;
import org.primefaces.pandora.domain.Order;

@FacesConverter("org.primefaces.pandora.converter.OrderConverter")
public class OrderConverter implements Converter, Serializable {

    private List<TimelineEvent<Order>> events;

    public OrderConverter() {
    }

    @Override
    public TimelineEvent<Order> getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty() || events == null || events.isEmpty()) {
            return null;
        }

        for (TimelineEvent<Order> event : events) {
            if (event.getData().getNumber() == Integer.valueOf(value)) {
                return event;
            }
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }

        return String.valueOf((((TimelineEvent<Order>) value).getData()).getNumber());
    }

    public List<TimelineEvent<Order>> getEvents() {
        return events;
    }

    public void setEvents(List<TimelineEvent<Order>> events) {
        this.events = events;
    }
}
