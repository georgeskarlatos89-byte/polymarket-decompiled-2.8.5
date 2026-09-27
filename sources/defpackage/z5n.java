package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class z5n extends mvj {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5n(Unsafe unsafe, int i) {
        super(unsafe, 3);
        this.c = i;
    }

    @Override // defpackage.mvj
    public final double k(long j, Object obj) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                return Double.longBitsToDouble(unsafe.getLong(obj, j));
            default:
                return Double.longBitsToDouble(unsafe.getLong(obj, j));
        }
    }

    @Override // defpackage.mvj
    public final float m(long j, Object obj) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                return Float.intBitsToFloat(unsafe.getInt(obj, j));
            default:
                return Float.intBitsToFloat(unsafe.getInt(obj, j));
        }
    }

    @Override // defpackage.mvj
    public final void o(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (m6n.g) {
                    m6n.c(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    m6n.d(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (m6n.g) {
                    m6n.c(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    m6n.d(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.mvj
    public final void q(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (m6n.g) {
                    m6n.c(obj, j, b);
                    return;
                } else {
                    m6n.d(obj, j, b);
                    return;
                }
            default:
                if (m6n.g) {
                    m6n.c(obj, j, b);
                    return;
                } else {
                    m6n.d(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.mvj
    public final void r(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.mvj
    public final void u(Object obj, long j, float f) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.mvj
    public final boolean w(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (m6n.g) {
                    return m6n.j(j, obj);
                }
                return m6n.k(j, obj);
            default:
                if (m6n.g) {
                    return m6n.j(j, obj);
                }
                return m6n.k(j, obj);
        }
    }
}
