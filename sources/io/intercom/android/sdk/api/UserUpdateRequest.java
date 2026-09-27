package io.intercom.android.sdk.api;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class UserUpdateRequest {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        Map<String, Object> attributes;
        boolean isNewSession = false;
        boolean isSentFromBackground = true;
        boolean isInternalUpdate = false;

        public UserUpdateRequest build() {
            HashMap hashMap = new HashMap();
            Map<String, Object> map = this.attributes;
            if (map != null) {
                hashMap.putAll(map);
            }
            return new AutoValue_UserUpdateRequest(this.isNewSession, this.isSentFromBackground, this.isInternalUpdate, hashMap);
        }

        public Builder isInternalUpdate(boolean z) {
            this.isInternalUpdate = z;
            return this;
        }

        public Builder isNewSession(boolean z) {
            this.isNewSession = z;
            return this;
        }

        public Builder isSentFromBackground(boolean z) {
            this.isSentFromBackground = z;
            return this;
        }

        public Builder withAttributes(Map<String, Object> map) {
            this.attributes = map;
            return this;
        }
    }

    public static UserUpdateRequest create(boolean z, boolean z2, Map<String, Object> map, boolean z3) {
        return new Builder().isNewSession(z).isSentFromBackground(z2).withAttributes(map).isInternalUpdate(z3).build();
    }

    public abstract Map<String, Object> getAttributes();

    public abstract boolean isInternalUpdate();

    public abstract boolean isNewSession();

    public abstract boolean isSentFromBackground();

    public boolean isValidUpdate() {
        if (!isInternalUpdate() && getAttributes().isEmpty()) {
            return false;
        }
        return true;
    }

    public static UserUpdateRequest create(boolean z, boolean z2, boolean z3) {
        return create(z, z2, null, z3);
    }
}
