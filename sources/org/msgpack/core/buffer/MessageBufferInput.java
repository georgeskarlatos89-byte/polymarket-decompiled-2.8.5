package org.msgpack.core.buffer;

import java.io.Closeable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface MessageBufferInput extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    MessageBuffer next();
}
