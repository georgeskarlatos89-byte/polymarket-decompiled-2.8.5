package defpackage;

import com.appsflyer.internal.l;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i2f extends ts8 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i2f DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile bwd PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i2f i2fVar = new i2f();
        DEFAULT_INSTANCE = i2fVar;
        ts8.j(i2f.class, i2fVar);
    }

    public static i2f n() {
        return DEFAULT_INSTANCE;
    }

    public static g2f v() {
        return (g2f) ((is8) DEFAULT_INSTANCE.c(qs8.NEW_BUILDER));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(f2f f2fVar) {
        this.value_ = f2fVar;
        this.valueCase_ = 6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, bwd] */
    @Override // defpackage.ts8
    public final Object c(qs8 qs8Var) {
        bwd bwdVar;
        switch (a2f.a[qs8Var.ordinal()]) {
            case 1:
                return new i2f();
            case 2:
                return new is8(DEFAULT_INSTANCE);
            case 3:
                return new pnf(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", f2f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                bwd bwdVar2 = PARSER;
                if (bwdVar2 == null) {
                    synchronized (i2f.class) {
                        try {
                            bwd bwdVar3 = PARSER;
                            bwdVar = bwdVar3;
                            if (bwdVar3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                bwdVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return bwdVar;
                }
                return bwdVar2;
            case 6:
                return (byte) 1;
            default:
                l.g();
            case 7:
                return null;
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final dw1 m() {
        if (this.valueCase_ == 8) {
            return (dw1) this.value_;
        }
        return dw1.c;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return ConstantsKt.UNSET;
    }

    public final float p() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final f2f t() {
        if (this.valueCase_ == 6) {
            return (f2f) this.value_;
        }
        return f2f.m();
    }

    public final h2f u() {
        switch (this.valueCase_) {
            case 0:
                return h2f.VALUE_NOT_SET;
            case 1:
                return h2f.BOOLEAN;
            case 2:
                return h2f.FLOAT;
            case 3:
                return h2f.INTEGER;
            case 4:
                return h2f.LONG;
            case 5:
                return h2f.STRING;
            case 6:
                return h2f.STRING_SET;
            case 7:
                return h2f.DOUBLE;
            case 8:
                return h2f.BYTES;
            default:
                return null;
        }
    }

    public final void w(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void x(dw1 dw1Var) {
        this.valueCase_ = 8;
        this.value_ = dw1Var;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }
}
