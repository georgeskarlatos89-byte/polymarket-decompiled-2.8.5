package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class up7 implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ up7(int i) {
        this.a = i;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                nq7[] nq7VarArr = zp7.b;
                if (i >= 4) {
                    return false;
                }
                return true;
            default:
                int i2 = this.b;
                nq7[] nq7VarArr2 = zp7.b;
                if (i2 >= 4) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap hashMap = new HashMap();
                for (nq7 nq7Var : zp7.c[this.b]) {
                    hashMap.put(nq7Var.b, nq7Var);
                }
                this.b++;
                return hashMap;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
