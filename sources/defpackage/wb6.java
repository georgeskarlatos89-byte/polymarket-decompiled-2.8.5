package defpackage;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wb6 implements ofd {
    public static final /* synthetic */ long e = oo4.a.objectFieldOffset(wb6.class.getDeclaredField(VerticalAlignment.TOP));
    public final int a;
    public final int b;
    public final AtomicReferenceArray c;
    public final int[] d;
    private volatile /* synthetic */ long top;

    public wb6(int i) {
        if (i > 0) {
            if (i <= 536870911) {
                this.top = 0L;
                int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
                this.a = highestOneBit;
                this.b = Integer.numberOfLeadingZeros(highestOneBit) + 1;
                int i2 = highestOneBit + 1;
                this.c = new AtomicReferenceArray(i2);
                this.d = new int[i2];
                return;
            }
            f27.q(ace.f(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        f27.q(ace.f(i, "capacity should be positive but it is "));
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        do {
        } while (o() != null);
    }

    @Override // defpackage.ofd
    public final void e1(Object obj) {
        obj.getClass();
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.b) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.c;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, obj)) {
                wb6 wb6Var = this;
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = wb6Var.a;
                    }
                    i++;
                    this = wb6Var;
                } else {
                    this = wb6Var;
                }
            }
            if (identityHashCode <= 0) {
                dmk.v("index should be positive");
                return;
            }
            while (true) {
                long j = this.top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                this.d[identityHashCode] = (int) (4294967295L & j);
                wb6 wb6Var2 = this;
                if (oo4.a.compareAndSwapLong(wb6Var2, e, j, j2)) {
                    return;
                } else {
                    this = wb6Var2;
                }
            }
        }
    }

    public abstract Object g();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0009, code lost:
    
        r8 = 0;
        r1 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o() {
        int i;
        wb6 wb6Var;
        while (true) {
            long j = this.top;
            if (j == 0) {
                break;
            }
            long j2 = ((j >> 32) & 4294967295L) + 1;
            i = (int) (4294967295L & j);
            if (i == 0) {
                break;
            }
            wb6Var = this;
            if (oo4.a.compareAndSwapLong(wb6Var, e, j, (j2 << 32) | this.d[i])) {
                break;
            }
            this = wb6Var;
        }
        if (i == 0) {
            return null;
        }
        return wb6Var.c.getAndSet(i, null);
    }

    public void p(Object obj) {
        obj.getClass();
    }

    @Override // defpackage.ofd
    public final Object s0() {
        Object e2;
        Object o = o();
        if (o != null && (e2 = e(o)) != null) {
            return e2;
        }
        return g();
    }

    public Object e(Object obj) {
        return obj;
    }
}
