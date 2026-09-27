package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wic {
    public static final ArrayDeque b = new ArrayDeque(0);
    public Object a;

    /* JADX WARN: Multi-variable type inference failed */
    public static wic a(Object obj) {
        wic wicVar;
        wic wicVar2;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            wicVar = (wic) arrayDeque.poll();
            wicVar2 = wicVar;
        }
        if (wicVar == null) {
            wicVar2 = new Object();
        }
        wicVar2.a = obj;
        return wicVar2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wic) && this.a.equals(((wic) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
