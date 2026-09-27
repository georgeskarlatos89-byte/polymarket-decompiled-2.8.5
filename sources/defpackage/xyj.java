package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xyj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xyj[] $VALUES;
    public static final vyj Companion;
    public static final xyj IMAGE_CAPTURE;
    public static final xyj PREVIEW;
    public static final xyj STREAM_SHARING;
    public static final xyj UNDEFINED;
    public static final xyj VIDEO_CAPTURE;
    private final int defaultImageFormat;
    private final Class<?> surfaceClass;

    /* JADX WARN: Type inference failed for: r0v2, types: [vyj, java.lang.Object] */
    static {
        xyj xyjVar = new xyj("PREVIEW", 0, SurfaceHolder.class, 34);
        PREVIEW = xyjVar;
        xyj xyjVar2 = new xyj("IMAGE_CAPTURE", 1, null, 256);
        IMAGE_CAPTURE = xyjVar2;
        xyj xyjVar3 = new xyj("VIDEO_CAPTURE", 2, MediaCodec.class, 34);
        VIDEO_CAPTURE = xyjVar3;
        xyj xyjVar4 = new xyj("STREAM_SHARING", 3, SurfaceTexture.class, 34);
        STREAM_SHARING = xyjVar4;
        xyj xyjVar5 = new xyj("UNDEFINED", 4, null, 34);
        UNDEFINED = xyjVar5;
        xyj[] xyjVarArr = {xyjVar, xyjVar2, xyjVar3, xyjVar4, xyjVar5};
        $VALUES = xyjVarArr;
        $ENTRIES = new wg7(xyjVarArr);
        Companion = new Object();
    }

    public xyj(String str, int i, Class cls, int i2) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i2;
    }

    public static xyj valueOf(String str) {
        return (xyj) Enum.valueOf(xyj.class, str);
    }

    public static xyj[] values() {
        return (xyj[]) $VALUES.clone();
    }

    public final Class a() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = wyj.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "Undefined";
                        }
                        dmk.a();
                        return null;
                    }
                    return "StreamSharing";
                }
                return "VideoCapture";
            }
            return "ImageCapture";
        }
        return "Preview";
    }
}
