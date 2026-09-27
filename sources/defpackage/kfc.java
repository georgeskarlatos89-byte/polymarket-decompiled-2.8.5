package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kfc {
    public final SparseArray a;
    public tij b;

    public kfc(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(tij tijVar, int i, int i2) {
        int a = tijVar.a(i);
        SparseArray sparseArray = this.a;
        kfc kfcVar = (kfc) sparseArray.get(a);
        if (kfcVar == null) {
            kfcVar = new kfc(1);
            sparseArray.put(tijVar.a(i), kfcVar);
        }
        if (i2 > i) {
            kfcVar.a(tijVar, i + 1, i2);
        } else {
            kfcVar.b = tijVar;
        }
    }
}
