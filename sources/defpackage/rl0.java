package defpackage;

import java.util.RandomAccess;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rl0 extends l3 implements RandomAccess {
    public final /* synthetic */ int[] b;

    public rl0(int[] iArr) {
        this.b = iArr;
    }

    @Override // defpackage.o1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return ArraysKt.h(((Number) obj).intValue(), this.b);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.b[i]);
    }

    @Override // defpackage.o1
    public final int getSize() {
        return this.b.length;
    }

    @Override // defpackage.l3, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ArraysKt.D(((Number) obj).intValue(), this.b);
    }

    @Override // defpackage.o1, java.util.Collection
    public final boolean isEmpty() {
        if (this.b.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.l3, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = this.b;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (intValue == iArr[length]) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        }
        return -1;
    }
}
