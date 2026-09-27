package androidx.collection;

import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.apl;
import defpackage.dgh;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010'R\u0016\u0010+\u001a\u00020)8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u001e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0016\u00101\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0011\u00103\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b2\u0010\u0018¨\u00064"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Landroidx/collection/SparseArrayCompat;", "key", "e", "(I)Ljava/lang/Object;", "index", "", "l", "value", "m", "(ILjava/lang/Object;)Ljava/lang/Object;", "k", "(ILjava/lang/Object;)V", "n", "()I", "", "i", "()Z", "j", "(I)I", "o", "g", "h", "(Ljava/lang/Object;)I", d.d, "(I)Z", "b", "()V", "a", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[I", "keys", "", "", "[Ljava/lang/Object;", "values", "I", "size", "f", "isEmpty", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: a, reason: from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* renamed from: b, reason: from kotlin metadata */
    public /* synthetic */ int[] keys;

    /* renamed from: c, reason: from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* renamed from: d, reason: from kotlin metadata */
    public /* synthetic */ int size;

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = apl.a;
            this.values = apl.c;
            return;
        }
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.keys = new int[i5];
        this.values = new Object[i5];
    }

    public void a(int key, E value) {
        int i = this.size;
        if (i != 0 && key <= this.keys[i - 1]) {
            k(key, value);
            return;
        }
        if (this.garbage && i >= this.keys.length) {
            dgh.a(this);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.keys = Arrays.copyOf(this.keys, i6);
            this.values = Arrays.copyOf(this.values, i6);
        }
        this.keys[i2] = key;
        this.values[i2] = value;
        this.size = i2 + 1;
    }

    public void b() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public SparseArrayCompat<E> c() {
        Object clone = super.clone();
        clone.getClass();
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return c();
    }

    public boolean d(int key) {
        if (g(key) >= 0) {
            return true;
        }
        return false;
    }

    public E e(int key) {
        return (E) dgh.c(this, key);
    }

    public final boolean f() {
        return i();
    }

    public int g(int key) {
        if (this.garbage) {
            dgh.a(this);
        }
        return apl.a(this.size, key, this.keys);
    }

    public int h(E value) {
        if (this.garbage) {
            dgh.a(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    public boolean i() {
        if (n() == 0) {
            return true;
        }
        return false;
    }

    public int j(int index) {
        if (this.garbage) {
            dgh.a(this);
        }
        return this.keys[index];
    }

    public void k(int key, E value) {
        int a = apl.a(this.size, key, this.keys);
        if (a >= 0) {
            this.values[a] = value;
            return;
        }
        int i = ~a;
        if (i < this.size && this.values[i] == dgh.b()) {
            this.keys[i] = key;
            this.values[i] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            dgh.a(this);
            i = ~apl.a(this.size, key, this.keys);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.keys = Arrays.copyOf(this.keys, i6);
            this.values = Arrays.copyOf(this.values, i6);
        }
        int i7 = this.size;
        if (i7 - i != 0) {
            int[] iArr = this.keys;
            int i8 = i + 1;
            ArraysKt.k(i8, i, i7, iArr, iArr);
            Object[] objArr = this.values;
            ArraysKt.l(i8, i, this.size, objArr, objArr);
        }
        this.keys[i] = key;
        this.values[i] = value;
        this.size++;
    }

    public void l(int index) {
        if (this.values[index] != dgh.b()) {
            this.values[index] = dgh.b();
            this.garbage = true;
        }
    }

    public E m(int key, E value) {
        int g = g(key);
        if (g >= 0) {
            Object[] objArr = this.values;
            E e = (E) objArr[g];
            objArr[g] = value;
            return e;
        }
        return null;
    }

    public int n() {
        if (this.garbage) {
            dgh.a(this);
        }
        return this.size;
    }

    public E o(int index) {
        if (this.garbage) {
            dgh.a(this);
        }
        Object[] objArr = this.values;
        if (index < objArr.length) {
            return (E) objArr[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(j(i2));
            sb.append('=');
            E o = o(i2);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public /* synthetic */ SparseArrayCompat(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
