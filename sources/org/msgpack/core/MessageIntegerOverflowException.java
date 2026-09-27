package org.msgpack.core;

import java.math.BigInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessageIntegerOverflowException extends MessageTypeException {
    private final BigInteger bigInteger;

    public MessageIntegerOverflowException(long j) {
        this(BigInteger.valueOf(j));
    }

    public BigInteger getBigInteger() {
        return this.bigInteger;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.bigInteger.toString();
    }

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public MessageIntegerOverflowException(String str, BigInteger bigInteger) {
        super(str);
        this.bigInteger = bigInteger;
    }
}
