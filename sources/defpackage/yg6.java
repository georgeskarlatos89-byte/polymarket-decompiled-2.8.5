package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yg6 extends v8j {
    public static final yg6 D = new yg6(new xg6());
    public final boolean A;
    public final SparseArray B;
    public final SparseBooleanArray C;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        ix2.v(1000, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, 1002, 1003, 1004);
        ix2.v(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 1006, 1007, 1008, 1009);
        ix2.v(1010, 1011, 1012, 1013, 1014);
        u1k.G(1015);
        u1k.G(1016);
        u1k.G(1017);
        u1k.G(1018);
    }

    public yg6(xg6 xg6Var) {
        super(xg6Var);
        this.u = xg6Var.u;
        this.v = xg6Var.v;
        this.w = xg6Var.w;
        this.x = xg6Var.x;
        this.y = xg6Var.y;
        this.z = xg6Var.z;
        this.A = xg6Var.A;
        this.B = xg6Var.B;
        this.C = xg6Var.C;
    }

    @Override // defpackage.v8j
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && yg6.class == obj.getClass()) {
                yg6 yg6Var = (yg6) obj;
                if (super.equals(yg6Var) && this.u == yg6Var.u && this.v == yg6Var.v && this.w == yg6Var.w && this.x == yg6Var.x && this.y == yg6Var.y && this.z == yg6Var.z && this.A == yg6Var.A) {
                    SparseBooleanArray sparseBooleanArray = yg6Var.C;
                    SparseBooleanArray sparseBooleanArray2 = this.C;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            } else {
                                SparseArray sparseArray = yg6Var.B;
                                SparseArray sparseArray2 = this.B;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i2);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    n8j n8jVar = (n8j) entry.getKey();
                                                    if (map2.containsKey(n8jVar) && Objects.equals(entry.getValue(), map2.get(n8jVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.v8j
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.u ? 1 : 0)) * 961) + (this.v ? 1 : 0)) * 961) + (this.w ? 1 : 0)) * 28629151) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 961) + (this.A ? 1 : 0)) * 31;
    }
}
