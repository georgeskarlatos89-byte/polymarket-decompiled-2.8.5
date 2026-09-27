package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f14 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f14[] $VALUES;
    public static final f14 ACCEPTED;
    public static final f14 NOT_ACCEPTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f14] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f14] */
    static {
        ?? r0 = new Enum("ACCEPTED", 0);
        ACCEPTED = r0;
        ?? r1 = new Enum("NOT_ACCEPTED", 1);
        NOT_ACCEPTED = r1;
        f14[] f14VarArr = {r0, r1};
        $VALUES = f14VarArr;
        $ENTRIES = new wg7(f14VarArr);
    }

    public static f14 valueOf(String str) {
        return (f14) Enum.valueOf(f14.class, str);
    }

    public static f14[] values() {
        return (f14[]) $VALUES.clone();
    }
}
