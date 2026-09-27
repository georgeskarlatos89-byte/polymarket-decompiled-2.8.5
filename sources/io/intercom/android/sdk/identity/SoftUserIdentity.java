package io.intercom.android.sdk.identity;

import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE = create("", "", "", "", "", "", "", "");

    public static SoftUserIdentity create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new AutoValue_SoftUserIdentity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public abstract String anonymousId();

    public abstract String email();

    public abstract String encryptedUserId();

    public abstract String fingerprint();

    public abstract String hmac();

    public abstract String intercomId();

    public boolean isPresent() {
        return !equals(NONE);
    }

    public boolean isSameUser(Registration registration) {
        boolean z;
        String userId = registration.getUserId();
        String email = registration.getEmail();
        if (TextUtils.isEmpty(userId) && TextUtils.isEmpty(email)) {
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(userId)) {
            if (z && userId.equals(userId())) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!TextUtils.isEmpty(email)) {
            if (z && email.equals(email())) {
                return true;
            }
            return false;
        }
        return z;
    }

    public abstract String jwt();

    public abstract String userId();
}
