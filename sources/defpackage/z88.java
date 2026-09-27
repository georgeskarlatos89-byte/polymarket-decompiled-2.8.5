package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class z88 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ z88[] $VALUES;
    public static final z88 Profile;
    public static final z88 Standard;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z88] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z88] */
    static {
        ?? r0 = new Enum("Standard", 0);
        Standard = r0;
        ?? r1 = new Enum("Profile", 1);
        Profile = r1;
        z88[] z88VarArr = {r0, r1};
        $VALUES = z88VarArr;
        $ENTRIES = new wg7(z88VarArr);
    }

    public static z88 valueOf(String str) {
        return (z88) Enum.valueOf(z88.class, str);
    }

    public static z88[] values() {
        return (z88[]) $VALUES.clone();
    }
}
