package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fll {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public final void a(Object obj) {
        obj.getClass();
        b(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void b(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = bd0.API_PRIORITY_OTHER;
            }
            this.a = Arrays.copyOf(objArr, i2);
            this.c = false;
            return;
        }
        if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final gpl c() {
        this.c = true;
        Object[] objArr = this.a;
        int i = this.b;
        kll kllVar = sll.b;
        if (i == 0) {
            return gpl.e;
        }
        return new gpl(objArr, i);
    }
}
