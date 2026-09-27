package defpackage;

import android.net.Uri;
import java.net.URL;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r2g {
    public final String a;
    public final Uri b;
    public final URL c;
    public final boolean d;

    public r2g(Uri uri) {
        this.b = uri;
        String uri2 = uri.toString();
        uri2.getClass();
        this.a = uri2;
        this.c = new URL(uri2);
        this.d = false;
    }

    public final String toString() {
        return this.a;
    }

    public r2g(String str, boolean z) {
        this.b = Uri.parse(str);
        this.a = str;
        this.c = new URL(str);
        this.d = z;
    }
}
