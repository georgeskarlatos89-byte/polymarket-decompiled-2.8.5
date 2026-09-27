package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vh9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vh9[] $VALUES;
    public static final vh9 BAD_REQUEST;
    public static final vh9 FAILED;
    public static final vh9 PAYLOAD_TOO_LARGE;
    public static final vh9 SUCCESS;
    public static final vh9 TIMEOUT;
    public static final vh9 TOO_MANY_REQUESTS;
    private final IntRange range;

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    static {
        vh9 vh9Var = new vh9("SUCCESS", 0, (IntRange) new a(200, 299, 1));
        SUCCESS = vh9Var;
        vh9 vh9Var2 = new vh9("BAD_REQUEST", 1, CarouselScreenFragment.CAROUSEL_ANIMATION_MS);
        BAD_REQUEST = vh9Var2;
        vh9 vh9Var3 = new vh9("TIMEOUT", 2, 408);
        TIMEOUT = vh9Var3;
        vh9 vh9Var4 = new vh9("PAYLOAD_TOO_LARGE", 3, 413);
        PAYLOAD_TOO_LARGE = vh9Var4;
        vh9 vh9Var5 = new vh9("TOO_MANY_REQUESTS", 4, 429);
        TOO_MANY_REQUESTS = vh9Var5;
        vh9 vh9Var6 = new vh9("FAILED", 5, (IntRange) new a(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE, 599, 1));
        FAILED = vh9Var6;
        vh9[] vh9VarArr = {vh9Var, vh9Var2, vh9Var3, vh9Var4, vh9Var5, vh9Var6};
        $VALUES = vh9VarArr;
        $ENTRIES = new wg7(vh9VarArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    public vh9(String str, int i, int i2) {
        this(str, i, (IntRange) new a(i2, i2, 1));
    }

    public static vh9 valueOf(String str) {
        return (vh9) Enum.valueOf(vh9.class, str);
    }

    public static vh9[] values() {
        return (vh9[]) $VALUES.clone();
    }

    public final IntRange a() {
        return this.range;
    }

    public final int b() {
        return this.range.a;
    }

    public vh9(String str, int i, IntRange intRange) {
        this.range = intRange;
    }
}
