package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.msgpack.core.Preconditions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ChannelBufferInput implements MessageBufferInput {
    private final MessageBuffer buffer;
    private ReadableByteChannel channel;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        boolean z;
        this.channel = (ReadableByteChannel) Preconditions.checkNotNull(readableByteChannel, "input channel is null");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "buffer size must be > 0: " + i);
        this.buffer = MessageBuffer.allocate(i);
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.channel.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer();
        if (this.channel.read(sliceAsByteBuffer) == -1) {
            return null;
        }
        sliceAsByteBuffer.flip();
        return this.buffer.slice(0, sliceAsByteBuffer.limit());
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        return readableByteChannel2;
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }
}
