package defpackage;

import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fh9 {
    public final String a;
    public final boolean b;

    public fh9(String str, String str2) {
        this.a = str;
        boolean z = false;
        if (str2 != null && e.u(str2, "application/json", false)) {
            z = true;
        }
        this.b = z;
    }
}
