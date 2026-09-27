package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fah implements or4, Iterable, xja {
    public final eah a;
    public final int b;
    public final int c;

    public fah(eah eahVar, int i, int i2) {
        this.a = eahVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fah) {
            fah fahVar = (fah) obj;
            if (fahVar.b == this.b && fahVar.c == this.c && Intrinsics.areEqual(fahVar.a, this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        eah eahVar = this.a;
        if (eahVar.i != this.c) {
            gah.e();
        }
        int i = this.b;
        eahVar.l(i);
        return new z09(eahVar, i + 1, eahVar.b[(i * 5) + 3] + i);
    }
}
