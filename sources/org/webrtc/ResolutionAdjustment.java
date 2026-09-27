package org.webrtc;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/webrtc/ResolutionAdjustment;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "MULTIPLE_OF_2", "MULTIPLE_OF_4", "MULTIPLE_OF_8", "MULTIPLE_OF_16", "stream-webrtc-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResolutionAdjustment {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ResolutionAdjustment[] $VALUES;
    private final int value;
    public static final ResolutionAdjustment NONE = new ResolutionAdjustment("NONE", 0, 1);
    public static final ResolutionAdjustment MULTIPLE_OF_2 = new ResolutionAdjustment("MULTIPLE_OF_2", 1, 2);
    public static final ResolutionAdjustment MULTIPLE_OF_4 = new ResolutionAdjustment("MULTIPLE_OF_4", 2, 4);
    public static final ResolutionAdjustment MULTIPLE_OF_8 = new ResolutionAdjustment("MULTIPLE_OF_8", 3, 8);
    public static final ResolutionAdjustment MULTIPLE_OF_16 = new ResolutionAdjustment("MULTIPLE_OF_16", 4, 16);

    private static final /* synthetic */ ResolutionAdjustment[] $values() {
        return new ResolutionAdjustment[]{NONE, MULTIPLE_OF_2, MULTIPLE_OF_4, MULTIPLE_OF_8, MULTIPLE_OF_16};
    }

    static {
        ResolutionAdjustment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private ResolutionAdjustment(String str, int i, int i2) {
        this.value = i2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ResolutionAdjustment valueOf(String str) {
        return (ResolutionAdjustment) Enum.valueOf(ResolutionAdjustment.class, str);
    }

    public static ResolutionAdjustment[] values() {
        return (ResolutionAdjustment[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
