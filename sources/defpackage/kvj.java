package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kvj extends mvj {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kvj(Unsafe unsafe, int i) {
        super(unsafe, 0);
        this.c = i;
    }

    @Override // defpackage.mvj
    public final boolean a(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (nvj.g) {
                    if (nvj.f(j, obj) == 0) {
                        return false;
                    }
                } else if (nvj.g(j, obj) == 0) {
                    return false;
                }
                return true;
            case 1:
                if (nvj.g) {
                    if (nvj.f(j, obj) == 0) {
                        return false;
                    }
                } else if (nvj.g(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                return this.b.getBoolean(obj, j);
        }
    }

    @Override // defpackage.mvj
    public final byte b(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (nvj.g) {
                    return nvj.f(j, obj);
                }
                return nvj.g(j, obj);
            case 1:
                if (nvj.g) {
                    return nvj.f(j, obj);
                }
                return nvj.g(j, obj);
            default:
                return this.b.getByte(obj, j);
        }
    }

    @Override // defpackage.mvj
    public final double c(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            default:
                return this.b.getDouble(obj, j);
        }
    }

    @Override // defpackage.mvj
    public final float d(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            default:
                return this.b.getFloat(obj, j);
        }
    }

    @Override // defpackage.mvj
    public final void e(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (nvj.g) {
                    nvj.m(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    nvj.n(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            case 1:
                if (nvj.g) {
                    nvj.m(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    nvj.n(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                this.b.putBoolean(obj, j, z);
                return;
        }
    }

    @Override // defpackage.mvj
    public final void f(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (nvj.g) {
                    nvj.m(obj, j, b);
                    return;
                } else {
                    nvj.n(obj, j, b);
                    return;
                }
            case 1:
                if (nvj.g) {
                    nvj.m(obj, j, b);
                    return;
                } else {
                    nvj.n(obj, j, b);
                    return;
                }
            default:
                this.b.putByte(obj, j, b);
                return;
        }
    }

    @Override // defpackage.mvj
    public final void g(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            case 1:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                this.b.putDouble(obj, j, d);
                return;
        }
    }

    @Override // defpackage.mvj
    public final void h(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                return;
            case 1:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                this.b.putFloat(obj, j, f);
                return;
        }
    }

    @Override // defpackage.mvj
    public boolean i() {
        switch (this.c) {
            case 2:
                if (!super.i()) {
                    return false;
                }
                try {
                    Class<?> cls = this.b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    nvj.k(th);
                    return false;
                }
            default:
                return super.i();
        }
    }

    @Override // defpackage.mvj
    public final boolean j() {
        switch (this.c) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.b;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (nvj.c() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        nvj.k(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    nvj.k(th2);
                    return false;
                }
        }
    }
}
