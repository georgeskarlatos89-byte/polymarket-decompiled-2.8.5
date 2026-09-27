package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sq9 extends x2 implements cr9 {
    public static final BigInteger b;
    public static final BigInteger c;
    public static final BigInteger d;
    public static final BigInteger e;
    public final BigInteger a;

    static {
        BigInteger.valueOf(-128L);
        BigInteger.valueOf(127L);
        BigInteger.valueOf(-32768L);
        BigInteger.valueOf(32767L);
        b = BigInteger.valueOf(-2147483648L);
        c = BigInteger.valueOf(2147483647L);
        d = BigInteger.valueOf(Long.MIN_VALUE);
        e = BigInteger.valueOf(Long.MAX_VALUE);
    }

    public sq9(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.cr9
    public final boolean c() {
        BigInteger bigInteger = d;
        BigInteger bigInteger2 = this.a;
        if (bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(e) <= 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h3k)) {
            return false;
        }
        h3k h3kVar = (h3k) obj;
        x3k valueType = ((x2) h3kVar).getValueType();
        valueType.getClass();
        if (valueType != x3k.INTEGER) {
            return false;
        }
        return this.a.equals(h3kVar.d().j());
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        messagePacker.packBigInteger(this.a);
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.INTEGER;
    }

    @Override // defpackage.h3k
    public final String h() {
        return this.a.toString();
    }

    public final int hashCode() {
        long j;
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(c) <= 0) {
            j = bigInteger2.longValue();
        } else if (d.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(e) <= 0) {
            long longValue = bigInteger2.longValue();
            j = longValue ^ (longValue >>> 32);
        } else {
            return bigInteger2.hashCode();
        }
        return (int) j;
    }

    @Override // defpackage.odd
    public final long i() {
        return this.a.longValue();
    }

    @Override // defpackage.odd
    public final BigInteger j() {
        return this.a;
    }

    @Override // defpackage.cr9
    public final long k() {
        boolean c2 = c();
        BigInteger bigInteger = this.a;
        if (c2) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
    }

    public final String toString() {
        return this.a.toString();
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
