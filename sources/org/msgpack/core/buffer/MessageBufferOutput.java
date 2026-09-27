package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface MessageBufferOutput extends Closeable, Flushable {
    void add(byte[] bArr, int i, int i2);

    MessageBuffer next(int i);

    void write(byte[] bArr, int i, int i2);

    void writeBuffer(int i);
}
