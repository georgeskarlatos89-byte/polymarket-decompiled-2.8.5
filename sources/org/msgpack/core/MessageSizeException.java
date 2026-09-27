package org.msgpack.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessageSizeException extends MessagePackException {
    private final long size;

    public MessageSizeException(long j) {
        this.size = j;
    }

    public long getSize() {
        return this.size;
    }

    public MessageSizeException(String str, long j) {
        super(str);
        this.size = j;
    }
}
