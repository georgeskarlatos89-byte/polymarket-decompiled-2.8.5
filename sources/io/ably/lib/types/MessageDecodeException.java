package io.ably.lib.types;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class MessageDecodeException extends AblyException {
    private static final long serialVersionUID = 1;

    private MessageDecodeException(Throwable th, ErrorInfo errorInfo) {
        super(th, errorInfo);
    }

    public static MessageDecodeException fromDescription(String str) {
        return new MessageDecodeException(new Exception(str), new ErrorInfo(str, 40013));
    }

    public static MessageDecodeException fromThrowableAndErrorInfo(Throwable th, ErrorInfo errorInfo) {
        return new MessageDecodeException(th, errorInfo);
    }
}
