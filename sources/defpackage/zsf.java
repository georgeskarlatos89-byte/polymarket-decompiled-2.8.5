package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zsf {
    public SparseArray a;
    public int b;
    public Set c;

    public final ysf a(int i) {
        SparseArray sparseArray = this.a;
        ysf ysfVar = (ysf) sparseArray.get(i);
        if (ysfVar == null) {
            ysf ysfVar2 = new ysf();
            sparseArray.put(i, ysfVar2);
            return ysfVar2;
        }
        return ysfVar;
    }
}
