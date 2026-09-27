package org.webrtc;

import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class SessionDescription {
    public final String description;
    public final Type type;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK;

        public String canonicalForm() {
            return name().toLowerCase(Locale.US);
        }
    }

    public SessionDescription(Type type, String str) {
        this.type = type;
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }
}
