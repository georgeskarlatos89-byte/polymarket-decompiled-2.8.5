package io.intercom.android.sdk.models;

import defpackage.dmk;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_SocialAccount extends SocialAccount {
    private final String profileUrl;
    private final String provider;

    public AutoValue_SocialAccount(String str, String str2) {
        if (str != null) {
            this.provider = str;
            if (str2 != null) {
                this.profileUrl = str2;
                return;
            } else {
                dmk.s("Null profileUrl");
                throw null;
            }
        }
        dmk.s("Null provider");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialAccount) {
            SocialAccount socialAccount = (SocialAccount) obj;
            if (this.provider.equals(socialAccount.getProvider()) && this.profileUrl.equals(socialAccount.getProfileUrl())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProfileUrl() {
        return this.profileUrl;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return this.profileUrl.hashCode() ^ ((this.provider.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocialAccount{provider=");
        sb.append(this.provider);
        sb.append(", profileUrl=");
        return woa.r(sb, this.profileUrl, "}");
    }
}
