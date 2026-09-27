package io.sentry.cache.tape;

import defpackage.dmk;
import defpackage.f27;
import defpackage.py2;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h implements Iterator {
    public int a = 0;
    public long b;
    public int c;
    public final /* synthetic */ i d;

    public h(i iVar) {
        this.d = iVar;
        this.b = iVar.e.a;
        this.c = iVar.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i iVar = this.d;
        if (!iVar.k) {
            if (iVar.h == this.c) {
                if (this.a == iVar.d) {
                    return false;
                }
                return true;
            }
            f27.g();
            return false;
        }
        dmk.n(MetricTracker.Action.CLOSED);
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte[] bArr = i.l;
        i iVar = this.d;
        if (!iVar.k) {
            if (iVar.h == this.c) {
                int i = iVar.d;
                if (i != 0) {
                    if (this.a < i) {
                        try {
                            g p1 = iVar.p1(this.b);
                            int i2 = p1.b;
                            long j = p1.a;
                            byte[] bArr2 = new byte[i2];
                            long j2 = j + 4;
                            long x1 = iVar.x1(j2);
                            this.b = x1;
                            if (!iVar.v1(x1, i2, bArr2)) {
                                this.a = iVar.d;
                                return bArr;
                            }
                            this.b = iVar.x1(j2 + i2);
                            this.a++;
                            return bArr2;
                        } catch (IOException e) {
                            throw e;
                        } catch (OutOfMemoryError unused) {
                            iVar.u1();
                            this.a = iVar.d;
                            return bArr;
                        }
                    }
                    dmk.t();
                    return null;
                }
                dmk.t();
                return null;
            }
            f27.g();
            return null;
        }
        dmk.n(MetricTracker.Action.CLOSED);
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        i iVar = this.d;
        if (iVar.h == this.c) {
            if (iVar.d != 0) {
                if (this.a == 1) {
                    iVar.t1(1);
                    this.c = iVar.h;
                    this.a--;
                    return;
                }
                py2.f("Removal is only permitted from the head.");
                return;
            }
            dmk.t();
            return;
        }
        f27.g();
    }
}
