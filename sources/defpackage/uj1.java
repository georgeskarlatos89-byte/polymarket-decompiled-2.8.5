package defpackage;

import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class uj1 {
    public final ArrayList a;
    public final ArrayList b;

    public uj1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final float a(int i, int i2) {
        Float A;
        float[] fArr = (float[]) CollectionsKt.J(i, this.b);
        if (fArr != null && (A = ArraysKt.A(i2, fArr)) != null) {
            return A.floatValue();
        }
        return 182.0f;
    }

    public final float b(int i, int i2) {
        Float A;
        float[] fArr = (float[]) CollectionsKt.J(i, this.a);
        if (fArr != null && (A = ArraysKt.A(i2, fArr)) != null) {
            return A.floatValue();
        }
        return 0.0f;
    }
}
