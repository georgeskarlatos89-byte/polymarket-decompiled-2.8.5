package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class l0n {
    public static final fl0 a = new b7h();

    public static synchronized void a() {
        synchronized (l0n.class) {
            fl0 fl0Var = a;
            Iterator it = ((dl0) fl0Var.values()).iterator();
            if (!it.hasNext()) {
                fl0Var.clear();
            } else {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }
}
