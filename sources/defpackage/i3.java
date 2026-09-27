package defpackage;

import java.util.Iterator;
import kotlin.UByte;
import kotlin.UInt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class i3 implements Iterator, xja {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public i3(tg7 tg7Var) {
        this.a = 2;
        this.c = tg7Var;
        this.b = tg7Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b >= ((l3) obj).size()) {
                    return false;
                }
                return true;
            case 1:
                if (this.b >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
            case 2:
                if (this.b <= 0) {
                    return false;
                }
                return true;
            case 3:
                if (this.b >= ((byte[]) obj).length) {
                    return false;
                }
                return true;
            case 4:
                if (this.b >= ((int[]) obj).length) {
                    return false;
                }
                return true;
            case 5:
                if (this.b >= ((long[]) obj).length) {
                    return false;
                }
                return true;
            default:
                if (this.b >= ((short[]) obj).length) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return ((l3) obj).get(i2);
                }
                dmk.t();
                return null;
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    ahh.i(e.getMessage());
                    return null;
                }
            case 2:
                tg7 tg7Var = (tg7) obj;
                int i4 = tg7Var.c;
                int i5 = this.b;
                this.b = i5 - 1;
                return tg7Var.e[i4 - i5];
            case 3:
                int i6 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i6 < bArr.length) {
                    this.b = i6 + 1;
                    return UByte.m884boximpl(UByte.m885constructorimpl(bArr[i6]));
                }
                ahh.i(String.valueOf(i6));
                return null;
            case 4:
                int i7 = this.b;
                int[] iArr = (int[]) obj;
                if (i7 < iArr.length) {
                    this.b = i7 + 1;
                    return new UInt(UInt.m886constructorimpl(iArr[i7]));
                }
                ahh.i(String.valueOf(i7));
                return null;
            case 5:
                int i8 = this.b;
                long[] jArr = (long[]) obj;
                if (i8 < jArr.length) {
                    this.b = i8 + 1;
                    return new hkj(jArr[i8]);
                }
                ahh.i(String.valueOf(i8));
                return null;
            default:
                int i9 = this.b;
                short[] sArr = (short[]) obj;
                if (i9 < sArr.length) {
                    this.b = i9 + 1;
                    return new vsj(sArr[i9]);
                }
                ahh.i(String.valueOf(i9));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i3(Object[] objArr) {
        this.a = 1;
        objArr.getClass();
        this.c = objArr;
    }

    public /* synthetic */ i3(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }
}
