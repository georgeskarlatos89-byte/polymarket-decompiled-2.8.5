package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ase {
    public static final String a;

    static {
        String str;
        Object obj;
        Iterator<E> it = zre.b().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                try {
                    Class.forName(((zre) obj).a());
                    break;
                } catch (ClassNotFoundException e) {
                    e.toString();
                }
            } else {
                obj = null;
                break;
            }
        }
        zre zreVar = (zre) obj;
        if (zreVar != null) {
            str = zreVar.c();
        }
        a = str;
    }
}
