package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dgf implements efd {
    public static final Charset e = Charset.forName("UTF-8");
    public static final gy7 f;
    public static final gy7 g;
    public static final rda h;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final egf d = new egf(this, 0);

    static {
        v0h f2 = v0h.f();
        f2.b = 1;
        f = new gy7("key", ix2.u(ix2.t(yff.class, f2.d())));
        v0h f3 = v0h.f();
        f3.b = 2;
        g = new gy7("value", ix2.u(ix2.t(yff.class, f3.d())));
        h = new rda(1);
    }

    public dgf(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int e(gy7 gy7Var) {
        yff yffVar = (yff) gy7Var.b(yff.class);
        if (yffVar != null) {
            return yffVar.tag();
        }
        dmk.z("Field has no @Protobuf config");
        return 0;
    }

    public final void a(gy7 gy7Var, int i, boolean z) {
        if (!z || i != 0) {
            yff yffVar = (yff) gy7Var.b(yff.class);
            if (yffVar != null) {
                int i2 = cgf.a[yffVar.intEncoding().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        f((yffVar.tag() << 3) | 5);
                        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                        return;
                    }
                    f(yffVar.tag() << 3);
                    f((i << 1) ^ (i >> 31));
                    return;
                }
                f(yffVar.tag() << 3);
                f(i);
                return;
            }
            dmk.z("Field has no @Protobuf config");
        }
    }

    @Override // defpackage.efd
    public final efd add(gy7 gy7Var, Object obj) {
        c(gy7Var, obj, true);
        return this;
    }

    public final void b(gy7 gy7Var, long j, boolean z) {
        if (!z || j != 0) {
            yff yffVar = (yff) gy7Var.b(yff.class);
            if (yffVar != null) {
                int i = cgf.a[yffVar.intEncoding().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        f((yffVar.tag() << 3) | 1);
                        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                        return;
                    }
                    f(yffVar.tag() << 3);
                    g((j >> 63) ^ (j << 1));
                    return;
                }
                f(yffVar.tag() << 3);
                g(j);
                return;
            }
            dmk.z("Field has no @Protobuf config");
        }
    }

    public final void c(gy7 gy7Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    f((e(gy7Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(e);
                    f(bytes.length);
                    this.a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(gy7Var, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    d(h, gy7Var, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != ConstantsKt.UNSET) {
                    f((e(gy7Var) << 3) | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    f((e(gy7Var) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                b(gy7Var, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                a(gy7Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                f((e(gy7Var) << 3) | 2);
                f(bArr.length);
                this.a.write(bArr);
                return;
            }
            dfd dfdVar = (dfd) this.b.get(obj.getClass());
            if (dfdVar != null) {
                d(dfdVar, gy7Var, obj, z);
                return;
            }
            n3k n3kVar = (n3k) this.c.get(obj.getClass());
            if (n3kVar != null) {
                egf egfVar = this.d;
                egfVar.b = false;
                egfVar.d = gy7Var;
                egfVar.c = z;
                n3kVar.encode(obj, egfVar);
                return;
            }
            if (obj instanceof pff) {
                a(gy7Var, ((pff) obj).a(), true);
            } else if (obj instanceof Enum) {
                a(gy7Var, ((Enum) obj).ordinal(), true);
            } else {
                d(hym.a, gy7Var, obj, z);
            }
        }
    }

    public final void d(dfd dfdVar, gy7 gy7Var, Object obj, boolean z) {
        a6b a6bVar = new a6b(0);
        a6bVar.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = a6bVar;
            try {
                dfdVar.encode(obj, this);
                this.a = outputStream;
                long j = a6bVar.b;
                a6bVar.close();
                if (z && j == 0) {
                    return;
                }
                f((e(gy7Var) << 3) | 2);
                g(j);
                dfdVar.encode(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                a6bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void f(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    public final void g(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    @Override // defpackage.efd
    public final efd add(gy7 gy7Var, int i) {
        a(gy7Var, i, true);
        return this;
    }

    @Override // defpackage.efd
    public final efd add(gy7 gy7Var, long j) {
        b(gy7Var, j, true);
        return this;
    }
}
