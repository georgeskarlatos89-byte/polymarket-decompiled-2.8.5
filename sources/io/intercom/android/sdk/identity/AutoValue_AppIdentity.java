package io.intercom.android.sdk.identity;

import defpackage.dmk;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_AppIdentity extends AppIdentity {
    private final String apiKey;
    private final String appId;

    public AutoValue_AppIdentity(String str, String str2) {
        if (str != null) {
            this.apiKey = str;
            if (str2 != null) {
                this.appId = str2;
                return;
            } else {
                dmk.s("Null appId");
                throw null;
            }
        }
        dmk.s("Null apiKey");
        throw null;
    }

    @Override // io.intercom.android.sdk.identity.AppIdentity
    public String apiKey() {
        return this.apiKey;
    }

    @Override // io.intercom.android.sdk.identity.AppIdentity
    public String appId() {
        return this.appId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppIdentity) {
            AppIdentity appIdentity = (AppIdentity) obj;
            if (this.apiKey.equals(appIdentity.apiKey()) && this.appId.equals(appIdentity.appId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.appId.hashCode() ^ ((this.apiKey.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppIdentity{apiKey=");
        sb.append(this.apiKey);
        sb.append(", appId=");
        return woa.r(sb, this.appId, "}");
    }
}
