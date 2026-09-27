package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class JniCommon {
    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
