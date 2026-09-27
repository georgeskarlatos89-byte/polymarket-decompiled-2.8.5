package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class e6l implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ AbstractSet c;

    public /* synthetic */ e6l(AbstractSet abstractSet, int i) {
        this.a = i;
        this.c = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractSet abstractSet = this.c;
        switch (i) {
            case 0:
                f6l f6lVar = (f6l) abstractSet;
                if (this.b >= f6lVar.b() - f6lVar.a()) {
                    return false;
                }
                return true;
            case 1:
                if (this.b >= ((ejl) ((zk0) abstractSet).b).e) {
                    return false;
                }
                return true;
            case 2:
                zol zolVar = (zol) abstractSet;
                if (this.b >= zolVar.a() - zolVar.b()) {
                    return false;
                }
                return true;
            default:
                if (this.b >= ((v2o) ((zk0) abstractSet).b).e) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractSet abstractSet = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                f6l f6lVar = (f6l) abstractSet;
                if (i2 < f6lVar.b() - f6lVar.a()) {
                    g6l g6lVar = f6lVar.b;
                    Object obj = g6lVar.b[f6lVar.a() + i2];
                    this.b = i2 + 1;
                    return obj;
                }
                dmk.t();
                return null;
            case 1:
                ejl ejlVar = (ejl) ((zk0) abstractSet).b;
                int[] iArr = ejlVar.d;
                int i3 = this.b;
                this.b = i3 + 1;
                return ejlVar.d(iArr[i3] & 31);
            case 2:
                int i4 = this.b;
                zol zolVar = (zol) abstractSet;
                if (i4 < zolVar.a() - zolVar.b()) {
                    Object obj2 = zolVar.b.b[zolVar.b() + i4];
                    this.b = i4 + 1;
                    return obj2;
                }
                dmk.t();
                return null;
            default:
                int i5 = this.b;
                this.b = i5 + 1;
                v2o v2oVar = (v2o) ((zk0) abstractSet).b;
                return v2oVar.d(v2oVar.d[i5] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
