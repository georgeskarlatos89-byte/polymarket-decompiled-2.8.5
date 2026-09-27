package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hii {
    public final int a;
    public final int b;
    public final int c;
    public final Function1 d;

    public hii(int i, int i2, int i3, Function1 function1) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = function1;
    }

    public final int a(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        if (z) {
            return this.b;
        }
        return this.a;
    }
}
