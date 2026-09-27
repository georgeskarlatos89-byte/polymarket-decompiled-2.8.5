package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class s4 extends gnf {
    @Override // defpackage.gnf
    public final int a(int i) {
        return (h().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.gnf
    public final float b() {
        return h().nextFloat();
    }

    @Override // defpackage.gnf
    public final int c() {
        return h().nextInt();
    }

    @Override // defpackage.gnf
    public final int d(int i) {
        return h().nextInt(i);
    }

    @Override // defpackage.gnf
    public final long f() {
        return h().nextLong();
    }

    public abstract Random h();
}
