/*
 * Copyright (C) 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.pippo.core;

public final class PippoConstants {

    public static final String LOCATION_OF_PIPPO_BUILTIN_PROPERTIES = "pippo/pippo-builtin.properties";

    public static final String LOCATION_OF_PIPPO_CLASSPATH_PROPERTIES = "conf/application.properties";

    public static final String APPLICATION_PROPERTIES = "application.properties";

    public static final String SYSTEM_PROPERTY_PIPPO_MODE = "pippo.mode";

    public static final String SYSTEM_PROPERTY_PIPPO_SETTINGS = "pippo.settings";

    public static final String SETTING_APPLICATION_NAME = "application.name";

    public static final String SETTING_APPLICATION_VERSION = "application.version";

    public static final String SETTING_APPLICATION_LANGUAGES = "application.languages";

    public static final String SETTING_APPLICATION_COOKIE_PREFIX = "application.cookie.prefix";

    public static final String SETTING_SERVER_PORT = "server.port";

    public static final String SETTING_SERVER_HOST = "server.host";

    private PippoConstants() {
        // restrict instantiation
    }
}