package org.webrtc;

import android.graphics.ImageFormat;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.py2;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(960, 540), new Size(960, 640), new Size(Barcode.FORMAT_UPC_E, 576), new Size(Barcode.FORMAT_UPC_E, 600), new Size(ConstantsKt.MIN_FRONT_CAMERA_WIDTH, ConstantsKt.MIN_FRONT_CAMERA_HEIGHT), new Size(ConstantsKt.MIN_FRONT_CAMERA_WIDTH, Barcode.FORMAT_UPC_E), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)));
    private static final String TAG = "CameraEnumerationAndroid";

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: org.webrtc.CameraEnumerationAndroid.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            private int progressivePenalty(int i2, int i3, int i4, int i5) {
                if (i2 < i3) {
                    return i2 * i4;
                }
                return ((i2 - i3) * i5) + (i4 * i3);
            }

            /* renamed from: diff, reason: avoid collision after fix types in other method */
            public int diff2(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, MIN_FPS_THRESHOLD, 1, 4) + progressivePenalty(Math.abs((i * 1000) - framerateRange.max), MAX_FPS_DIFF_THRESHOLD, 1, 3);
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public /* bridge */ /* synthetic */ int diff(CaptureFormat.FramerateRange framerateRange) {
                return diff2(framerateRange);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i, final int i2) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: org.webrtc.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: diff, reason: avoid collision after fix types in other method */
            public int diff2(Size size) {
                return Math.abs(i2 - size.height) + Math.abs(i - size.width);
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public /* bridge */ /* synthetic */ int diff(Size size) {
                return diff2(size);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static abstract class ClosestComparator<T> implements Comparator<T> {
        public /* synthetic */ ClosestComparator(int i) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return diff(t) - diff(t2);
        }

        public abstract int diff(T t);

        private ClosestComparator() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes6.dex */
        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                if (this.min != framerateRange.min || this.max != framerateRange.max) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return "[" + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return (ImageFormat.getBitsPerPixel(i3) * (i * i2)) / 8;
            }
            py2.f("Don't know how to calculate the frame size of non-NV21 image formats.");
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            if (this.width != captureFormat.width || this.height != captureFormat.height || !this.framerate.equals(captureFormat.framerate)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.framerate.hashCode() + (((this.width * 65497) + this.height) * 251) + 1;
        }

        public String toString() {
            return this.width + "x" + this.height + "@" + this.framerate;
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }
    }
}
