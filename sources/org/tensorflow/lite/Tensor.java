package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface Tensor {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class QuantizationParams {
        private final float scale;
        private final int zeroPoint;

        public QuantizationParams(float f, int i) {
            this.scale = f;
            this.zeroPoint = i;
        }

        public float getScale() {
            return this.scale;
        }

        public int getZeroPoint() {
            return this.zeroPoint;
        }
    }

    ByteBuffer asReadOnlyBuffer();

    DataType dataType();

    int index();

    String name();

    int numBytes();

    int numDimensions();

    int numElements();

    QuantizationParams quantizationParams();

    int[] shape();

    int[] shapeSignature();
}
