package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e4k {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ e4k[] $VALUES;
    public static final e4k INVARIANT;
    public static final e4k IN_VARIANCE;
    public static final e4k OUT_VARIANCE;
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    static {
        e4k e4kVar = new e4k("INVARIANT", 0, "", true, true, 0);
        INVARIANT = e4kVar;
        e4k e4kVar2 = new e4k("IN_VARIANCE", 1, "in", true, false, -1);
        IN_VARIANCE = e4kVar2;
        e4k e4kVar3 = new e4k("OUT_VARIANCE", 2, "out", false, true, 1);
        OUT_VARIANCE = e4kVar3;
        e4k[] e4kVarArr = {e4kVar, e4kVar2, e4kVar3};
        $VALUES = e4kVarArr;
        $ENTRIES = new wg7(e4kVarArr);
    }

    public e4k(String str, int i, String str2, boolean z, boolean z2, int i2) {
        this.label = str2;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i2;
    }

    public static e4k valueOf(String str) {
        return (e4k) Enum.valueOf(e4k.class, str);
    }

    public static e4k[] values() {
        return (e4k[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.allowsOutPosition;
    }

    public final String b() {
        return this.label;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.label;
    }
}
