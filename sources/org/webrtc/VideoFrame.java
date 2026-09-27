package org.webrtc;

import android.graphics.Matrix;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import defpackage.dmk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        default int getBufferType() {
            return 0;
        }

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        I420Buffer toI420();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface I420Buffer extends Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        default int getBufferType() {
            return 1;
        }

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface TextureBuffer extends Buffer {

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes6.dex */
        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        default TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2) {
            throw new UnsupportedOperationException("Not implemented");
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                return;
            }
            dmk.v("rotation must be a multiple of 90");
            throw null;
        }
        dmk.v("buffer not allowed to be null");
        throw null;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        int i = this.rotation % BlurConstants.H_BD;
        Buffer buffer = this.buffer;
        if (i == 0) {
            return buffer.getHeight();
        }
        return buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % BlurConstants.H_BD;
        Buffer buffer = this.buffer;
        if (i == 0) {
            return buffer.getWidth();
        }
        return buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}
