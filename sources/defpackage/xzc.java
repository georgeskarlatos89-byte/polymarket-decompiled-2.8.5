package defpackage;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xzc {
    public boolean b;
    public String d;
    public boolean e;
    public boolean f;
    public final vzc a = new vzc();
    public int c = -1;

    public final void a(int i) {
        this.c = i;
        this.e = false;
    }

    public final void b(String str) {
        if (!StringsKt.T(str)) {
            this.d = str;
            this.e = false;
        } else {
            dmk.v("Cannot pop up to an empty route");
        }
    }
}
