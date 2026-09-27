package org.msgpack.core.buffer;

import java.io.OutputStream;
import org.msgpack.core.Preconditions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class OutputStreamBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private OutputStream out;

    public OutputStreamBufferOutput(OutputStream outputStream, int i) {
        this.out = (OutputStream) Preconditions.checkNotNull(outputStream, "output is null");
        this.buffer = MessageBuffer.allocate(i);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i) {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public OutputStream reset(OutputStream outputStream) {
        OutputStream outputStream2 = this.out;
        this.out = outputStream;
        return outputStream2;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i) {
        write(this.buffer.array(), this.buffer.arrayOffset(), i);
    }

    public OutputStreamBufferOutput(OutputStream outputStream) {
        this(outputStream, 8192);
    }
}
