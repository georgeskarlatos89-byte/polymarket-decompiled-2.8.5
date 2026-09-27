package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mmc extends up1 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public mmc(int i, long j) {
        super(i, 2);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // defpackage.up1
    public final String toString() {
        return up1.e(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }

    public final mmc x(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mmc mmcVar = (mmc) arrayList.get(i2);
            if (mmcVar.b == i) {
                return mmcVar;
            }
        }
        return null;
    }

    public final nmc y(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nmc nmcVar = (nmc) arrayList.get(i2);
            if (nmcVar.b == i) {
                return nmcVar;
            }
        }
        return null;
    }
}
