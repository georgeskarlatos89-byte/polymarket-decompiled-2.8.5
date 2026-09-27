package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xg6 extends u8j {
    public final boolean A;
    public final SparseArray B;
    public final SparseBooleanArray C;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public xg6(yg6 yg6Var) {
        b(yg6Var);
        this.u = yg6Var.u;
        this.v = yg6Var.v;
        this.w = yg6Var.w;
        this.x = yg6Var.x;
        this.y = yg6Var.y;
        this.z = yg6Var.z;
        this.A = yg6Var.A;
        SparseArray sparseArray = yg6Var.B;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.B = sparseArray2;
        this.C = yg6Var.C.clone();
    }

    @Override // defpackage.u8j
    public final u8j c(String[] strArr) {
        super.c(strArr);
        return this;
    }

    public final void d(int i) {
        this.t.remove(Integer.valueOf(i));
    }

    public xg6() {
        this.B = new SparseArray();
        this.C = new SparseBooleanArray();
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
    }
}
