package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ryj {
    private static final /* synthetic */ ryj[] $VALUES;
    public static final ryj IMAGE_ANALYSIS;
    public static final ryj IMAGE_CAPTURE;
    public static final ryj METERING_REPEATING;
    public static final ryj PREVIEW;
    public static final ryj STREAM_SHARING;
    public static final ryj VIDEO_CAPTURE;

    /* JADX WARN: Type inference failed for: r0v0, types: [ryj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ryj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ryj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ryj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ryj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ryj, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IMAGE_CAPTURE", 0);
        IMAGE_CAPTURE = r0;
        ?? r1 = new Enum("PREVIEW", 1);
        PREVIEW = r1;
        ?? r2 = new Enum("IMAGE_ANALYSIS", 2);
        IMAGE_ANALYSIS = r2;
        ?? r3 = new Enum("VIDEO_CAPTURE", 3);
        VIDEO_CAPTURE = r3;
        ?? r4 = new Enum("STREAM_SHARING", 4);
        STREAM_SHARING = r4;
        ?? r5 = new Enum("METERING_REPEATING", 5);
        METERING_REPEATING = r5;
        $VALUES = new ryj[]{r0, r1, r2, r3, r4, r5};
    }

    public static ryj valueOf(String str) {
        return (ryj) Enum.valueOf(ryj.class, str);
    }

    public static ryj[] values() {
        return (ryj[]) $VALUES.clone();
    }
}
