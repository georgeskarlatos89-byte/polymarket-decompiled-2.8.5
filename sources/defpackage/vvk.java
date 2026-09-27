package defpackage;

import io.ably.lib.http.HttpConstants;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum vvk {
    POST(HttpConstants.Methods.POST),
    GET(HttpConstants.Methods.GET);

    private final String a;

    vvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
