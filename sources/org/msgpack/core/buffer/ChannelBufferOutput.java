package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.msgpack.core.Preconditions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ChannelBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private WritableByteChannel channel;

    public ChannelBufferOutput(WritableByteChannel writableByteChannel, int i) {
        this.channel = (WritableByteChannel) Preconditions.checkNotNull(writableByteChannel, "output channel is null");
        this.buffer = MessageBuffer.allocate(i);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.channel.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i) {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public WritableByteChannel reset(WritableByteChannel writableByteChannel) {
        WritableByteChannel writableByteChannel2 = this.channel;
        this.channel = writableByteChannel;
        return writableByteChannel2;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            this.channel.write(wrap);
        }
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i) {
        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer(0, i);
        while (sliceAsByteBuffer.hasRemaining()) {
            this.channel.write(sliceAsByteBuffer);
        }
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public ChannelBufferOutput(WritableByteChannel writableByteChannel) {
        this(writableByteChannel, 8192);
    }
}
