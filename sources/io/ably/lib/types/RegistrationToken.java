package io.ably.lib.types;

import defpackage.woa;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class RegistrationToken {
    public String token;
    public Type type;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public enum Type {
        GCM,
        FCM;

        public static Type fromName(String str) {
            try {
                return valueOf(str.toUpperCase(Locale.ROOT));
            } catch (Throwable unused) {
                return null;
            }
        }

        public static Type fromOrdinal(int i) {
            try {
                return values()[i];
            } catch (Throwable unused) {
                return null;
            }
        }

        public String toName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public RegistrationToken(Type type, String str) {
        this.type = type;
        this.token = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RegistrationToken{type=");
        sb.append(this.type);
        sb.append(", token='");
        return woa.r(sb, this.token, "'}");
    }
}
