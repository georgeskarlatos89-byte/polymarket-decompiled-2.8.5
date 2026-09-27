package skip.lib;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lskip/lib/FloatingPointRoundingRule;", "", "<init>", "(Ljava/lang/String;I)V", "toNearestOrAwayFromZero", "toNearestOrEven", "up", "down", "towardZero", "awayFromZero", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FloatingPointRoundingRule {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FloatingPointRoundingRule[] $VALUES;
    public static final FloatingPointRoundingRule toNearestOrAwayFromZero = new FloatingPointRoundingRule("toNearestOrAwayFromZero", 0);
    public static final FloatingPointRoundingRule toNearestOrEven = new FloatingPointRoundingRule("toNearestOrEven", 1);
    public static final FloatingPointRoundingRule up = new FloatingPointRoundingRule("up", 2);
    public static final FloatingPointRoundingRule down = new FloatingPointRoundingRule("down", 3);
    public static final FloatingPointRoundingRule towardZero = new FloatingPointRoundingRule("towardZero", 4);
    public static final FloatingPointRoundingRule awayFromZero = new FloatingPointRoundingRule("awayFromZero", 5);

    private static final /* synthetic */ FloatingPointRoundingRule[] $values() {
        return new FloatingPointRoundingRule[]{toNearestOrAwayFromZero, toNearestOrEven, up, down, towardZero, awayFromZero};
    }

    static {
        FloatingPointRoundingRule[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private FloatingPointRoundingRule(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static FloatingPointRoundingRule valueOf(String str) {
        return (FloatingPointRoundingRule) Enum.valueOf(FloatingPointRoundingRule.class, str);
    }

    public static FloatingPointRoundingRule[] values() {
        return (FloatingPointRoundingRule[]) $VALUES.clone();
    }
}
