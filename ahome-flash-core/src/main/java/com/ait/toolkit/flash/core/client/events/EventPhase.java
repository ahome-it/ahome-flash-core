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

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class EventPhase.
 */
public final class EventPhase extends JsObject {

    /** The Constant AT_TARGET. */
    public static final int AT_TARGET = 2;

    /** The Constant BUBBLING_PHASE. */
    public static final int BUBBLING_PHASE = 3;

    /** The Constant CAPTURING_PHASE. */
    public static final int CAPTURING_PHASE = 1;

    /**
     * Instantiates a new event phase.
     */
    protected EventPhase() {

    }

    EventPhase(JavaScriptObject obj) {
        jsObj = obj;
    }

}
