package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cke implements Iterator, xja {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public cke(xje xjeVar) {
        aej[] aejVarArr = new aej[8];
        for (int i = 0; i < 8; i++) {
            aejVarArr[i] = new eej(this);
        }
        this.b = new zje(xjeVar, aejVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((yje) obj).c;
            case 1:
                return ((zje) obj).c;
            default:
                return ((i3) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (Map.Entry) ((yje) obj).next();
            case 1:
                return (Map.Entry) ((zje) obj).next();
            default:
                return ((i3) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((yje) this.b).remove();
                return;
            case 1:
                ((zje) this.b).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public cke(Object[] objArr) {
        objArr.getClass();
        this.b = new i3(objArr);
    }

    public cke(wje wjeVar) {
        aej[] aejVarArr = new aej[8];
        for (int i = 0; i < 8; i++) {
            aejVarArr[i] = new dej(this);
        }
        this.b = new yje(wjeVar, aejVarArr);
    }
}
