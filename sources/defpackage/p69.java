package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class p69 extends nz4 {
    public nz4[] q0 = new nz4[4];
    public int r0 = 0;

    public final void R(int i, gkk gkkVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            nz4 nz4Var = this.q0[i2];
            ArrayList arrayList2 = gkkVar.a;
            if (!arrayList2.contains(nz4Var)) {
                arrayList2.add(nz4Var);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            rsl.a(this.q0[i3], i, arrayList, gkkVar);
        }
    }

    public void S() {
    }
}
