package defpackage;

import defpackage.ege;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class fge {
    public static final ege a(Throwable th) {
        ege egeVar;
        th.getClass();
        if (th instanceof ege) {
            egeVar = (ege) th;
        } else {
            egeVar = null;
        }
        if (egeVar == null) {
            return new ege.f(th);
        }
        return egeVar;
    }
}
