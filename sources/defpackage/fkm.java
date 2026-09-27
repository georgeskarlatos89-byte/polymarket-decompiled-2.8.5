package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fkm {
    public static final fkm d;
    public static final fkm e;
    public final boolean a;
    public final c0o b;
    public final c0o c;

    static {
        int i;
        nxn nxnVar = c0o.g;
        d = new fkm(false, c0o.s(0, new Object[4]), c0o.s(0, new Object[4]));
        Object[] objArr = new Object[4];
        Object[] objArr2 = new Object[4];
        Object obj = new Object();
        int length = objArr.length;
        int i2 = 0 + 1;
        if (i2 >= 0) {
            if (i2 <= length) {
                i = length;
            } else {
                i = (length >> 1) + length + 1;
                if (i < i2) {
                    int highestOneBit = Integer.highestOneBit(0);
                    i = highestOneBit + highestOneBit;
                }
                if (i < 0) {
                    i = bd0.API_PRIORITY_OTHER;
                }
            }
            if (i > length) {
                objArr = Arrays.copyOf(objArr, i);
            }
            objArr[0] = obj;
            c0o.s(0 + 1, objArr);
            c0o.s(0, objArr2);
            e = new fkm(true, c0o.s(0, new Object[4]), c0o.s(0, new Object[4]));
            return;
        }
        dmk.v("cannot store more than Integer.MAX_VALUE elements");
    }

    public /* synthetic */ fkm(boolean z, c6l c6lVar, c6l c6lVar2) {
        this.a = z;
        this.b = c6lVar;
        this.c = c6lVar2;
    }
}
