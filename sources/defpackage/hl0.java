package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hl0 extends el0 {
    public Object[] a;
    public int b;

    @Override // defpackage.el0
    public final int a() {
        return this.b;
    }

    @Override // defpackage.el0
    public final Object get(int i) {
        return ArraysKt.C(i, this.a);
    }

    @Override // defpackage.el0, java.lang.Iterable
    public final Iterator iterator() {
        return new gl0(this);
    }

    @Override // defpackage.el0
    public final void set(int i, Object obj) {
        Object[] objArr = this.a;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            objArr = Arrays.copyOf(this.a, length);
            this.a = objArr;
        }
        if (objArr[i] == null) {
            this.b++;
        }
        objArr[i] = obj;
    }
}
