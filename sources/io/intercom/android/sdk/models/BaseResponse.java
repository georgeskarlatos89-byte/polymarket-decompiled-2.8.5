package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.User;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class BaseResponse {
    private final Config config;
    private final boolean hasConversations;
    private final User user;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static abstract class Builder {
        Config config;
        boolean has_conversations;
        User.Builder user;

        public abstract BaseResponse build();
    }

    public BaseResponse(Builder builder) {
        User build;
        Config config = builder.config;
        this.config = config == null ? new Config() : config;
        this.hasConversations = builder.has_conversations;
        User.Builder builder2 = builder.user;
        if (builder2 == null) {
            build = User.NULL;
        } else {
            build = builder2.build();
        }
        this.user = build;
    }

    public Config getConfig() {
        return this.config;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasConversations() {
        return this.hasConversations;
    }
}
