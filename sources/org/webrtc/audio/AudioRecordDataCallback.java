package org.webrtc.audio;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface AudioRecordDataCallback {
    void onAudioDataRecorded(int i, int i2, int i3, ByteBuffer byteBuffer);
}
