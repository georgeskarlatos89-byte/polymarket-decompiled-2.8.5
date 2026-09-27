package defpackage;

import androidx.collection.SparseArrayCompat;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class dob extends dak {
    public static final ym8 d = new ym8(1);
    public final SparseArrayCompat b = new SparseArrayCompat();
    public boolean c = false;

    @Override // defpackage.dak
    public final void onCleared() {
        super.onCleared();
        SparseArrayCompat sparseArrayCompat = this.b;
        int n = sparseArrayCompat.n();
        for (int i = 0; i < n; i++) {
            bob bobVar = (bob) sparseArrayCompat.o(i);
            d4l d4lVar = bobVar.l;
            d4lVar.c();
            d4lVar.c = true;
            cob cobVar = bobVar.n;
            if (cobVar != null) {
                bobVar.j(cobVar);
            }
            bob bobVar2 = d4lVar.a;
            if (bobVar2 != null) {
                if (bobVar2 == bobVar) {
                    d4lVar.a = null;
                    if (cobVar != null) {
                        boolean z = cobVar.b;
                    }
                    d4lVar.d = true;
                    d4lVar.b = false;
                    d4lVar.c = false;
                    d4lVar.e = false;
                } else {
                    dmk.v("Attempting to unregister the wrong listener");
                    return;
                }
            } else {
                dmk.n("No listener register");
                return;
            }
        }
        sparseArrayCompat.b();
    }
}
