package org.msgpack.core.buffer;

import org.msgpack.core.Preconditions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ArrayBufferInput implements MessageBufferInput {
    private MessageBuffer buffer;
    private boolean isEmpty;

    public ArrayBufferInput(byte[] bArr, int i, int i2) {
        this(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null"), i, i2));
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.buffer = null;
        this.isEmpty = true;
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isEmpty) {
            return null;
        }
        this.isEmpty = true;
        return this.buffer;
    }

    public void reset(byte[] bArr) {
        reset(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null")));
    }

    public ArrayBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public MessageBuffer reset(MessageBuffer messageBuffer) {
        MessageBuffer messageBuffer2 = this.buffer;
        this.buffer = messageBuffer;
        if (messageBuffer == null) {
            this.isEmpty = true;
            return messageBuffer2;
        }
        this.isEmpty = false;
        return messageBuffer2;
    }

    public ArrayBufferInput(MessageBuffer messageBuffer) {
        this.buffer = messageBuffer;
        if (messageBuffer == null) {
            this.isEmpty = true;
        } else {
            this.isEmpty = false;
        }
    }

    public void reset(byte[] bArr, int i, int i2) {
        reset(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null"), i, i2));
    }
}
