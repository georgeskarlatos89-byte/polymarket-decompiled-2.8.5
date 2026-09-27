package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import com.intercom.twig.Twig;
import defpackage.hdi;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Registration {
    private UserAttributes attributes;
    private final Twig twig = LumberMill.getLogger();
    private String email = "";
    private String userId = "";
    private Validity validity = Validity.NOT_SET;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum Validity {
        NOT_SET,
        INVALID,
        VALID
    }

    public static Registration create() {
        return new Registration();
    }

    private void updateState(boolean z) {
        Validity validity;
        Validity validity2 = this.validity;
        if (validity2 != Validity.NOT_SET && validity2 != Validity.VALID) {
            return;
        }
        if (z) {
            validity = Validity.VALID;
        } else {
            validity = Validity.INVALID;
        }
        this.validity = validity;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Registration registration = (Registration) obj;
            if (!this.email.equals(registration.email) || !this.userId.equals(registration.userId)) {
                return false;
            }
            UserAttributes userAttributes = this.attributes;
            UserAttributes userAttributes2 = registration.attributes;
            if (userAttributes != null) {
                return userAttributes.equals(userAttributes2);
            }
            if (userAttributes2 == null) {
                return true;
            }
        }
        return false;
    }

    public UserAttributes getAttributes() {
        return this.attributes;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i;
        int e = hdi.e(this.email.hashCode() * 31, 31, this.userId);
        UserAttributes userAttributes = this.attributes;
        if (userAttributes != null) {
            i = userAttributes.hashCode();
        } else {
            i = 0;
        }
        return e + i;
    }

    public boolean isValidRegistration() {
        return Validity.VALID.equals(this.validity);
    }

    public String toString() {
        return "Registration{email='" + this.email + "', userId='" + this.userId + "', attributes=" + this.attributes + '}';
    }

    public Registration withEmail(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z = !isEmpty;
        if (!isEmpty) {
            this.email = str;
        } else {
            this.twig.e("Email cannot be null or empty", new Object[0]);
        }
        updateState(z);
        return this;
    }

    public Registration withUserAttributes(UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is null", new Object[0]);
            return this;
        }
        if (userAttributes.isEmpty()) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is empty", new Object[0]);
            return this;
        }
        this.attributes = userAttributes;
        return this;
    }

    public Registration withUserId(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z = !isEmpty;
        if (!isEmpty) {
            this.userId = str;
        } else {
            this.twig.e("UserId cannot be null or empty", new Object[0]);
        }
        updateState(z);
        return this;
    }
}
