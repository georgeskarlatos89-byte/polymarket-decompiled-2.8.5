package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class szn {
    public int a;
    public final int b;
    public szn c;
    public final HashMap d = new HashMap(0);

    public szn(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
            return;
        }
        omf.a();
        throw null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return hdi.l(identityHashCode, "Node", new StringBuilder(String.valueOf(identityHashCode).length() + 4));
    }
}
