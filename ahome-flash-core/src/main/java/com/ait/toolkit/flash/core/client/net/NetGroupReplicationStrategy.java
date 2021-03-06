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
package com.ait.toolkit.flash.core.client.net;

/**
 * The Enum NetGroupReplicationStrategy.
 */
public enum NetGroupReplicationStrategy {

    /** The LOWES t_ first. */
    LOWEST_FIRST("lowestFirst"),
    /** The RARES t_ first. */
    RAREST_FIRST("rarestFirst");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new net group replication strategy.
     * 
     * @param strategy the strategy
     */
    private NetGroupReplicationStrategy(String strategy) {
        value = strategy;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the net group replication strategy
     */
    public static native NetGroupReplicationStrategy fromValue(String value) /*-{
		switch (value) {
		case 'lowestFirst':
			return @com.ait.toolkit.flash.core.client.net.NetGroupReplicationStrategy::LOWEST_FIRST;
		case 'rearestFirst':
			return @com.ait.toolkit.flash.core.client.net.NetGroupReplicationStrategy::RAREST_FIRST;
		}
    }-*/;
}
