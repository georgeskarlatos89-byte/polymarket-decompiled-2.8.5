package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class al6 implements Iterator, xja {
    public int a = -1;
    public int b;
    public int c;
    public IntRange d;
    public int e;
    public final /* synthetic */ bl6 f;

    public al6(bl6 bl6Var) {
        this.f = bl6Var;
        int e = lnf.e(0, 0, bl6Var.a.length());
        this.b = e;
        this.c = e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        bl6 bl6Var = this.f;
        CharSequence charSequence = bl6Var.a;
        int i = this.c;
        int i2 = 0;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        int i3 = bl6Var.b;
        if (i3 > 0) {
            int i4 = this.e + 1;
            this.e = i4;
        }
        if (i <= charSequence.length()) {
            Pair pair = (Pair) bl6Var.c.invoke(charSequence, Integer.valueOf(this.c));
            if (pair == null) {
                this.d = new a(this.b, StringsKt.P(charSequence), 1);
                this.c = -1;
            } else {
                int intValue = ((Number) pair.first).intValue();
                int intValue2 = ((Number) pair.second).intValue();
                this.d = lnf.k(this.b, intValue);
                int i5 = intValue + intValue2;
                this.b = i5;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                this.c = i5 + i2;
            }
            this.a = 1;
        }
        this.d = new a(this.b, StringsKt.P(charSequence), 1);
        this.c = -1;
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a != 0) {
            IntRange intRange = this.d;
            intRange.getClass();
            this.d = null;
            this.a = -1;
            return intRange;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
