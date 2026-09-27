package io.ably.lib.network;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface WebSocketListener {
    void onClose(int i, String str);

    void onError(Throwable th);

    void onMessage(String str);

    void onMessage(ByteBuffer byteBuffer);

    void onOldJavaVersionDetected(Throwable th);

    void onOpen();

    void onWebsocketPing();
}
