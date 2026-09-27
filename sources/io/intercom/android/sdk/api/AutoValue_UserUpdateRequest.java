package io.intercom.android.sdk.api;

import defpackage.ace;
import defpackage.dmk;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_UserUpdateRequest extends UserUpdateRequest {
    private final Map<String, Object> attributes;
    private final boolean internalUpdate;
    private final boolean newSession;
    private final boolean sentFromBackground;

    public AutoValue_UserUpdateRequest(boolean z, boolean z2, boolean z3, Map<String, Object> map) {
        this.newSession = z;
        this.sentFromBackground = z2;
        this.internalUpdate = z3;
        if (map != null) {
            this.attributes = map;
        } else {
            dmk.s("Null attributes");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserUpdateRequest) {
            UserUpdateRequest userUpdateRequest = (UserUpdateRequest) obj;
            if (this.newSession == userUpdateRequest.isNewSession() && this.sentFromBackground == userUpdateRequest.isSentFromBackground() && this.internalUpdate == userUpdateRequest.isInternalUpdate() && this.attributes.equals(userUpdateRequest.getAttributes())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (this.newSession) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (i ^ 1000003) * 1000003;
        if (this.sentFromBackground) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.internalUpdate) {
            i3 = 1231;
        }
        return this.attributes.hashCode() ^ ((i5 ^ i3) * 1000003);
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isInternalUpdate() {
        return this.internalUpdate;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isNewSession() {
        return this.newSession;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isSentFromBackground() {
        return this.sentFromBackground;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserUpdateRequest{newSession=");
        sb.append(this.newSession);
        sb.append(", sentFromBackground=");
        sb.append(this.sentFromBackground);
        sb.append(", internalUpdate=");
        sb.append(this.internalUpdate);
        sb.append(", attributes=");
        return ace.n(sb, this.attributes, "}");
    }
}
