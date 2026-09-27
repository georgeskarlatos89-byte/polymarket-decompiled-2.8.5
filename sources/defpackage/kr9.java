package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kr9 extends x2 implements cr9 {
    public final long a;

    public kr9(long j) {
        this.a = j;
    }

    @Override // defpackage.cr9
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h3k) {
                h3k h3kVar = (h3k) obj;
                x3k valueType = ((x2) h3kVar).getValueType();
                valueType.getClass();
                if (valueType == x3k.INTEGER) {
                    cr9 d = h3kVar.d();
                    if (d.c() && this.a == d.i()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        messagePacker.packLong(this.a);
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.INTEGER;
    }

    @Override // defpackage.h3k
    public final String h() {
        return Long.toString(this.a);
    }

    public final int hashCode() {
        long j = this.a;
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        return (int) ((j >>> 32) ^ j);
    }

    @Override // defpackage.odd
    public final long i() {
        return this.a;
    }

    @Override // defpackage.odd
    public final BigInteger j() {
        return BigInteger.valueOf(this.a);
    }

    @Override // defpackage.cr9
    public final long k() {
        return this.a;
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // defpackage.x2, defpackage.h3k
    public final cr9 d() {
        return this;
    }

    @Override // defpackage.x2
    public final cr9 x() {
        return this;
    }
}
