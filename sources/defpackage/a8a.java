package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class a8a extends IOException {
    public ndc a;

    public a8a(String str) {
        super(str);
        this.a = null;
    }

    public static a8a a() {
        return new a8a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
