package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bun {
    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof bun)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -991236229;
    }

    public final String toString() {
        int length = String.valueOf(true).length();
        StringBuilder sb = new StringBuilder(length + HttpStatusCodesKt.HTTP_EARLY_HINTS + String.valueOf(1).length() + 1);
        sb.append("MLKitLoggingOptions{libraryName=play-services-mlkit-document-scanner, enableFirelog=true, firelogEventType=1}");
        return sb.toString();
    }
}
