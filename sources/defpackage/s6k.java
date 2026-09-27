package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class s6k {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ s6k[] $VALUES;
    public static final s6k Automatic;
    public static final s6k Instant;
    public static final s6k InstantOrSkip;
    public static final s6k Microdeposits;
    public static final s6k Skip;
    private final String value;

    static {
        s6k s6kVar = new s6k("Automatic", 0, MetricTracker.CarouselSource.AUTOMATIC);
        Automatic = s6kVar;
        s6k s6kVar2 = new s6k("Skip", 1, ActionType.SKIP);
        Skip = s6kVar2;
        s6k s6kVar3 = new s6k("Microdeposits", 2, "microdeposits");
        Microdeposits = s6kVar3;
        s6k s6kVar4 = new s6k("Instant", 3, "instant");
        Instant = s6kVar4;
        s6k s6kVar5 = new s6k("InstantOrSkip", 4, "instant_or_skip");
        InstantOrSkip = s6kVar5;
        s6k[] s6kVarArr = {s6kVar, s6kVar2, s6kVar3, s6kVar4, s6kVar5};
        $VALUES = s6kVarArr;
        $ENTRIES = new wg7(s6kVarArr);
    }

    public s6k(String str, int i, String str2) {
        this.value = str2;
    }

    public static s6k valueOf(String str) {
        return (s6k) Enum.valueOf(s6k.class, str);
    }

    public static s6k[] values() {
        return (s6k[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
