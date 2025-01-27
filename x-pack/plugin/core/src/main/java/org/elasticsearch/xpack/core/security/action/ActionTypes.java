/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.core.security.action;

import org.elasticsearch.action.ActionResponse;
import org.elasticsearch.action.ActionType;

/**
 * A collection of actions types for the Security plugin that need to be available in xpack.core.security and thus cannot be stored
 * directly with their transport action implementation.
 */
public final class ActionTypes {
    private ActionTypes() {};

    public static final ActionType<ActionResponse.Empty> RELOAD_REMOTE_CLUSTER_CREDENTIALS_ACTION = ActionType.localOnly(
        "cluster:admin/xpack/security/remote_cluster_credentials/reload"
    );
}
