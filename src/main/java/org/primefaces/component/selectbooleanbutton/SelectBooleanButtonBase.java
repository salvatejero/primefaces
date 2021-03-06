/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.selectbooleanbutton;

import javax.faces.component.html.HtmlSelectBooleanCheckbox;

import org.primefaces.component.api.Widget;
import org.primefaces.util.ComponentUtils;


abstract class SelectBooleanButtonBase extends HtmlSelectBooleanCheckbox implements Widget {

    public static final String COMPONENT_FAMILY = "org.primefaces.component";

    public static final String DEFAULT_RENDERER = "org.primefaces.component.SelectBooleanButtonRenderer";

    public enum PropertyKeys {

        widgetVar,
        onLabel,
        offLabel,
        onIcon,
        offIcon;
    }

    public SelectBooleanButtonBase() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getWidgetVar() {
        return (String) getStateHelper().eval(PropertyKeys.widgetVar, null);
    }

    public void setWidgetVar(String widgetVar) {
        getStateHelper().put(PropertyKeys.widgetVar, widgetVar);
    }

    public String getOnLabel() {
        return (String) getStateHelper().eval(PropertyKeys.onLabel, null);
    }

    public void setOnLabel(String onLabel) {
        getStateHelper().put(PropertyKeys.onLabel, onLabel);
    }

    public String getOffLabel() {
        return (String) getStateHelper().eval(PropertyKeys.offLabel, null);
    }

    public void setOffLabel(String offLabel) {
        getStateHelper().put(PropertyKeys.offLabel, offLabel);
    }

    public String getOnIcon() {
        return (String) getStateHelper().eval(PropertyKeys.onIcon, null);
    }

    public void setOnIcon(String onIcon) {
        getStateHelper().put(PropertyKeys.onIcon, onIcon);
    }

    public String getOffIcon() {
        return (String) getStateHelper().eval(PropertyKeys.offIcon, null);
    }

    public void setOffIcon(String offIcon) {
        getStateHelper().put(PropertyKeys.offIcon, offIcon);
    }

    @Override
    public String resolveWidgetVar() {
        return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
    }
}