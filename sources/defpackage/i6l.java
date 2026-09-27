package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i6l {
    public static final lki b = new lki(11);
    public static final i6l c;
    public final g6l a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new i6l(new g6l(0));
    }

    public i6l(g6l g6lVar) {
        this.a = g6lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof i6l) && ((i6l) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
