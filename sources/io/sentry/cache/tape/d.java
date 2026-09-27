package io.sentry.cache.tape;

import defpackage.at7;
import defpackage.dmk;
import defpackage.qp7;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d extends f {
    public final i a;
    public final at7 b = new at7();
    public final e c;

    public d(i iVar, e eVar) {
        this.a = iVar;
        this.c = eVar;
    }

    @Override // io.sentry.cache.tape.f
    public final void clear() {
        this.a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this, new h(this.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r8 >= r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r8 = r8 + r6;
        r6 = r6 << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r8 < r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        r3.a.setLength(r6);
        r3.a.getChannel().force(true);
        r4 = r3.x1((r3.f.a + r26) + r4.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r4 > r3.e.a) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r8 = r3.a.getChannel();
        r8.position(r3.c);
        r21 = r4 - r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        if (r8.transferTo(32, r21, r8) != r21) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        defpackage.dmk.i("Copied insufficient number of bytes!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        r9 = r3.f.a;
        r4 = r3.e.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        if (r9 >= r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        r9 = (r3.c + r9) - r16;
        r5 = r6;
        r3.y1(r3.d, r5, r4, r9);
        r3.f = new io.sentry.cache.tape.g(r9, r3.f.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        r3.c = r5;
        r6 = r16;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
    
        if (r4 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        r8 = (int) java.lang.Math.min(r4, 4096L);
        r3.w1(r6, r8, io.sentry.cache.tape.i.l);
        r8 = r8;
        r4 = r4 - r8;
        r6 = r6 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        r5 = r6;
        r3.y1(r3.d, r5, r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        r21 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        if (r3.d != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0113, code lost:
    
        if (r12 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:
    
        r13 = new io.sentry.cache.tape.g(r9, r1);
        io.sentry.cache.tape.i.z1(r0, 0, r1);
        r3.w1(r9, 4, r0);
        r3.w1(r9 + r26, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0138, code lost:
    
        if (r12 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0141, code lost:
    
        r3.y1(r3.d + 1, r3.c, r7, r9);
        r3.f = r13;
        r3.d++;
        r3.h++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0156, code lost:
    
        if (r12 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0158, code lost:
    
        r3.e = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
    
        r7 = r3.e.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
    
        r9 = r3.x1((r3.f.a + r26) + r4.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        r12 = false;
     */
    @Override // io.sentry.cache.tape.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(Comparable comparable) {
        long j;
        long j2;
        long j3;
        at7 at7Var = this.b;
        at7Var.reset();
        this.c.e(comparable, at7Var);
        i iVar = this.a;
        byte[] bArr = iVar.g;
        byte[] e = at7Var.e();
        int size = at7Var.size();
        if (e != null) {
            if (size >= 0 && size <= e.length) {
                if (!iVar.k) {
                    int i = iVar.i;
                    if (i != -1 && iVar.d == i) {
                        iVar.t1(1);
                    }
                    long j4 = size + 4;
                    long j5 = iVar.c;
                    if (iVar.d == 0) {
                        j = 4;
                        j3 = 32;
                        j2 = 32;
                    } else {
                        g gVar = iVar.f;
                        long j6 = gVar.a;
                        j = 4;
                        long j7 = iVar.e.a;
                        int i2 = gVar.b;
                        if (j6 >= j7) {
                            j3 = (j6 - j7) + 4 + i2 + 32;
                            j2 = 32;
                        } else {
                            j2 = 32;
                            j3 = (((j6 + 4) + i2) + j5) - j7;
                        }
                    }
                    long j8 = j5 - j3;
                } else {
                    dmk.n(MetricTracker.Action.CLOSED);
                }
            } else {
                qp7.f();
            }
        } else {
            dmk.s("data == null");
        }
    }

    @Override // io.sentry.cache.tape.f
    public final void q1(int i) {
        this.a.t1(i);
    }

    @Override // io.sentry.cache.tape.f
    public final void r1() {
        i iVar = this.a;
        if (!iVar.j) {
            iVar.a.getChannel().force(false);
        }
    }

    @Override // io.sentry.cache.tape.f
    public final int size() {
        return this.a.d;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.a + '}';
    }
}
