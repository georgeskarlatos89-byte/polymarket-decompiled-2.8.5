package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wpk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wpk[] $VALUES;
    public static final wpk EVENT;
    public static final wpk FLUSH;

    /* JADX WARN: Type inference failed for: r0v0, types: [wpk, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [wpk, java.lang.Enum] */
    static {
        ?? r0 = new Enum("EVENT", 0);
        EVENT = r0;
        ?? r1 = new Enum("FLUSH", 1);
        FLUSH = r1;
        wpk[] wpkVarArr = {r0, r1};
        $VALUES = wpkVarArr;
        $ENTRIES = new wg7(wpkVarArr);
    }

    public static wpk valueOf(String str) {
        return (wpk) Enum.valueOf(wpk.class, str);
    }

    public static wpk[] values() {
        return (wpk[]) $VALUES.clone();
    }
}
