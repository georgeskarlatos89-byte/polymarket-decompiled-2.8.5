package org.msgpack.core.buffer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import org.msgpack.core.Preconditions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class InputStreamBufferInput implements MessageBufferInput {
    private final byte[] buffer;
    private InputStream in;

    public InputStreamBufferInput(InputStream inputStream, int i) {
        this.in = (InputStream) Preconditions.checkNotNull(inputStream, "input is null");
        this.buffer = new byte[i];
    }

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        FileChannel channel;
        Preconditions.checkNotNull(inputStream, "InputStream is null");
        if ((inputStream instanceof FileInputStream) && (channel = ((FileInputStream) inputStream).getChannel()) != null) {
            return new ChannelBufferInput(channel);
        }
        return new InputStreamBufferInput(inputStream);
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        int read = this.in.read(this.buffer);
        if (read == -1) {
            return null;
        }
        return MessageBuffer.wrap(this.buffer, 0, read);
    }

    public InputStream reset(InputStream inputStream) {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        return inputStream2;
    }

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }
}
