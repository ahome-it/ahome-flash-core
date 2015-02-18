/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.flash.core.client.events;

import com.ait.toolkit.flash.core.client.events.handlers.ClickHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ClickEvent extends MouseEvent {

    public static String EVENT_NAME = "click";

    /**
     * UiBinder implementations
     */
    private static Type<ClickHandler> TYPE = new Type<ClickHandler>(EVENT_NAME, null);

    public static Type<ClickHandler> getType() {
        return TYPE;
    }

    public static Type<ClickHandler> getAssociatedType() {
        return TYPE;
    }

    protected ClickEvent() {

    }

    protected ClickEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

}
