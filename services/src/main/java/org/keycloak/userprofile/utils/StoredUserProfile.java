/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
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

package org.keycloak.userprofile.utils;

import org.keycloak.userprofile.UserProfile;

import java.util.List;

/**
 * Abstraction, which allows to update the user in various contexts (Required action of already existing user, or first identity provider
 * login when user doesn't yet exists in Keycloak DB)
 *
 * @author <a href="mailto:markus.till@bosch.io">Markus Till</a>
 */
public interface StoredUserProfile extends UserProfile {

    void setSingleAttribute(String name, String value);

    void setAttribute(String key, List<String> value);

    void removeAttribute(String attr);
}