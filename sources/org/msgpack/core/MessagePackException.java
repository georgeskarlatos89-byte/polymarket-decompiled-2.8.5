package org.msgpack.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessagePackException extends RuntimeException {
    public static final IllegalStateException UNREACHABLE = new IllegalStateException("Cannot reach here");

    public MessagePackException() {
    }

    public static UnsupportedOperationException UNSUPPORTED(String str) {
        return new UnsupportedOperationException(str);
    }

    public MessagePackException(String str) {
        super(str);
    }

    public MessagePackException(String str, Throwable th) {
        super(str, th);
    }

    public MessagePackException(Throwable th) {
        super(th);
    }
}
