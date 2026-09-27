package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h26 implements i07 {
    public final List a;
    public final float[] b;
    public final int c;

    public h26(List list, float[] fArr) {
        this.a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            nw9.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + ArraysKt.b0(fArr));
        }
        this.c = fArr.length;
    }

    public final Object a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final Object b(boolean z, float f) {
        float f2;
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f3 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f4 = fArr[i];
            int i4 = i3 + 1;
            if (z) {
                f2 = f4 - f;
            } else {
                f2 = f - f4;
            }
            if (f2 < 0.0f) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if (f2 <= f3) {
                i2 = i3;
                f3 = f2;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final float c(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            float[] fArr = this.b;
            if (indexOf < fArr.length) {
                return fArr[indexOf];
            }
            return Float.NaN;
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h26) {
                h26 h26Var = (h26) obj;
                if (!Intrinsics.areEqual(this.a, h26Var.a) || !Arrays.equals(this.b, h26Var.b) || this.c != h26Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i < i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(CollectionsKt.J(i, this.a));
                sb2.append('=');
                if (i >= 0) {
                    float[] fArr = this.b;
                    if (i < fArr.length) {
                        f = fArr[i];
                        sb2.append(f);
                        sb.append(sb2.toString());
                        if (i >= i2 - 1) {
                            sb.append(", ");
                        }
                        i++;
                    }
                }
                f = Float.NaN;
                sb2.append(f);
                sb.append(sb2.toString());
                if (i >= i2 - 1) {
                }
                i++;
            } else {
                sb.append("})");
                return sb.toString();
            }
        }
    }
}
