package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class dxn {
    public static eq9 a;

    public static final int a(lcg lcgVar, String str) {
        lcgVar.getClass();
        int columnCount = lcgVar.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < columnCount) {
                if (Intrinsics.areEqual(str, lcgVar.getColumnName(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        String o = hdi.o("`", str, '`');
        int columnCount2 = lcgVar.getColumnCount();
        while (true) {
            if (i < columnCount2) {
                if (Intrinsics.areEqual(o, lcgVar.getColumnName(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return -1;
        }
        return i;
    }
}
