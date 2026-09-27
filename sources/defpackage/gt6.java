package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class gt6 extends xl6 {
    public int m;

    public gt6(jkk jkkVar) {
        super(jkkVar);
        if (jkkVar instanceof ad9) {
            this.e = wl6.HORIZONTAL_DIMENSION;
        } else {
            this.e = wl6.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.xl6
    public final void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ql6 ql6Var = (ql6) it.next();
                ql6Var.a(ql6Var);
            }
        }
    }
}
