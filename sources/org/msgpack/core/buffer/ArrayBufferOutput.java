package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ArrayBufferOutput implements MessageBufferOutput {
    private final int bufferSize;
    private MessageBuffer lastBuffer;
    private final List<MessageBuffer> list;

    public ArrayBufferOutput(int i) {
        this.bufferSize = i;
        this.list = new ArrayList();
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i, int i2) {
        this.list.add(MessageBuffer.wrap(bArr, i, i2));
    }

    public void clear() {
        this.list.clear();
    }

    public int getSize() {
        Iterator<MessageBuffer> it = this.list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().size();
        }
        return i;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i) {
        MessageBuffer messageBuffer = this.lastBuffer;
        if (messageBuffer != null && messageBuffer.size() > i) {
            return this.lastBuffer;
        }
        MessageBuffer allocate = MessageBuffer.allocate(Math.max(this.bufferSize, i));
        this.lastBuffer = allocate;
        return allocate;
    }

    public List<MessageBuffer> toBufferList() {
        return new ArrayList(this.list);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSize()];
        int i = 0;
        for (MessageBuffer messageBuffer : this.list) {
            messageBuffer.getBytes(0, bArr, i, messageBuffer.size());
            i += messageBuffer.size();
        }
        return bArr;
    }

    public MessageBuffer toMessageBuffer() {
        int size = this.list.size();
        List<MessageBuffer> list = this.list;
        if (size == 1) {
            return list.get(0);
        }
        if (list.isEmpty()) {
            return MessageBuffer.allocate(0);
        }
        return MessageBuffer.wrap(toByteArray());
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i, int i2) {
        MessageBuffer allocate = MessageBuffer.allocate(i2);
        allocate.putBytes(0, bArr, i, i2);
        this.list.add(allocate);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i) {
        this.list.add(this.lastBuffer.slice(0, i));
        if (this.lastBuffer.size() - i > this.bufferSize / 4) {
            MessageBuffer messageBuffer = this.lastBuffer;
            this.lastBuffer = messageBuffer.slice(i, messageBuffer.size() - i);
        } else {
            this.lastBuffer = null;
        }
    }

    public ArrayBufferOutput() {
        this(8192);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }
}
