package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface uk4 {
    default Object b(Class cls) {
        return f(xif.a(cls));
    }

    lgf d(xif xifVar);

    lgf e(xif xifVar);

    default Object f(xif xifVar) {
        lgf e = e(xifVar);
        if (e == null) {
            return null;
        }
        return e.get();
    }

    default Set g(xif xifVar) {
        return (Set) d(xifVar).get();
    }

    default lgf i(Class cls) {
        return e(xif.a(cls));
    }
}
