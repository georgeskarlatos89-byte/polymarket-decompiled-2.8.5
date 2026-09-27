package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import defpackage.bd0;
import defpackage.omf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: org.webrtc.RendererCommon$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$org$webrtc$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface GlDrawer {
        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6);

        void release();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i, int i2, int i3);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static /* bridge */ /* synthetic */ float a(ScalingType scalingType) {
        return convertScalingTypeToVisibleFraction(scalingType);
    }

    private static void adjustOrigin(float[] fArr) {
        float f = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f;
        float f2 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f2;
        fArr[12] = f + 0.5f;
        fArr[13] = f2 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i = AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return BALANCED_VISIBLE_FRACTION;
                }
                omf.a();
                return 0.0f;
            }
            return 0.0f;
        }
        return 1.0f;
    }

    public static Point getDisplaySize(float f, float f2, int i, int i2) {
        if (f != 0.0f && f2 != 0.0f) {
            return new Point(Math.min(i, Math.round((i2 / f) * f2)), Math.min(i2, Math.round((i / f) / f2)));
        }
        return new Point(i, i2);
    }

    public static float[] getLayoutMatrix(boolean z, float f, float f2) {
        float f3;
        float f4;
        if (f2 > f) {
            f4 = f / f2;
            f3 = 1.0f;
        } else {
            f3 = f2 / f;
            f4 = 1.0f;
        }
        if (z) {
            f3 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f3, f4, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.a(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.a(scalingType);
        }

        public Point measure(int i, int i2, int i3, int i4) {
            boolean z;
            float f;
            int defaultSize = View.getDefaultSize(bd0.API_PRIORITY_OTHER, i);
            int defaultSize2 = View.getDefaultSize(bd0.API_PRIORITY_OTHER, i2);
            if (i3 != 0 && i4 != 0 && defaultSize != 0 && defaultSize2 != 0) {
                float f2 = i3 / i4;
                float f3 = defaultSize / defaultSize2;
                boolean z2 = false;
                if (f2 > 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (f3 > 1.0f) {
                    z2 = true;
                }
                if (z == z2) {
                    f = this.visibleFractionMatchOrientation;
                } else {
                    f = this.visibleFractionMismatchOrientation;
                }
                Point displaySize = RendererCommon.getDisplaySize(f, f2, defaultSize, defaultSize2);
                if (View.MeasureSpec.getMode(i) == 1073741824) {
                    displaySize.x = defaultSize;
                }
                if (View.MeasureSpec.getMode(i2) == 1073741824) {
                    displaySize.y = defaultSize2;
                }
                return displaySize;
            }
            return new Point(defaultSize, defaultSize2);
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.a(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.a(scalingType2);
        }

        public void setVisibleFraction(float f, float f2) {
            this.visibleFractionMatchOrientation = f;
            this.visibleFractionMismatchOrientation = f2;
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }
    }

    public static Point getDisplaySize(ScalingType scalingType, float f, int i, int i2) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f, i, i2);
    }
}
