package defpackage;

import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yq9 extends x2 implements odd {
    public final double a;

    public yq9(double d) {
        this.a = d;
    }

    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h3k) {
                h3k h3kVar = (h3k) obj;
                x3k valueType = ((x2) h3kVar).getValueType();
                valueType.getClass();
                if (valueType == x3k.FLOAT) {
                    if (this.a == h3kVar.l().a) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        messagePacker.packDouble(this.a);
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.FLOAT;
    }

    @Override // defpackage.h3k
    public final String h() {
        double d = this.a;
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return Double.toString(d);
        }
        return "null";
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return Double.toString(this.a);
    }

    @Override // defpackage.x2, defpackage.h3k
    public final yq9 l() {
        return this;
    }

    @Override // defpackage.x2
    public final yq9 w() {
        return this;
    }
}
