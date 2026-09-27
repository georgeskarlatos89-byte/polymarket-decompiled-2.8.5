package org.socure.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c extends Mat {
    public c(d... dVarArr) {
        if (dVarArr.length == 0) {
            return;
        }
        int length = dVarArr.length;
        if (length > 0) {
            b(length, a.a(5, 2));
        }
        float[] fArr = new float[length * 2];
        for (int i = 0; i < length; i++) {
            d dVar = dVarArr[i];
            int i2 = i * 2;
            fArr[i2] = (float) dVar.a;
            fArr[i2 + 1] = (float) dVar.b;
        }
        g(fArr);
    }
}
