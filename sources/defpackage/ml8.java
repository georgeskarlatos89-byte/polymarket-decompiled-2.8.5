package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ml8 implements to9 {
    public final to9 b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public ml8(to9 to9Var) {
        this.b = to9Var;
    }

    @Override // defpackage.to9
    public bo9 P0() {
        return this.b.P0();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ll8) it.next()).a(this);
        }
    }

    public final void e(ll8 ll8Var) {
        synchronized (this.a) {
            this.c.add(ll8Var);
        }
    }

    @Override // defpackage.to9
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // defpackage.to9
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.to9
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // defpackage.to9
    public so9[] h0() {
        return this.b.h0();
    }

    @Override // defpackage.to9
    public final Image n() {
        return this.b.n();
    }
}
