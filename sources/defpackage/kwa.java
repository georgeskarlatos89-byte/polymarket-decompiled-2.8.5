package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kwa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kwa[] $VALUES;
    public static final kwa Compact;
    public static final kwa FullScreen;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kwa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kwa] */
    static {
        ?? r0 = new Enum("FullScreen", 0);
        FullScreen = r0;
        ?? r1 = new Enum("Compact", 1);
        Compact = r1;
        kwa[] kwaVarArr = {r0, r1};
        $VALUES = kwaVarArr;
        $ENTRIES = new wg7(kwaVarArr);
    }

    public static kwa valueOf(String str) {
        return (kwa) Enum.valueOf(kwa.class, str);
    }

    public static kwa[] values() {
        return (kwa[]) $VALUES.clone();
    }
}
