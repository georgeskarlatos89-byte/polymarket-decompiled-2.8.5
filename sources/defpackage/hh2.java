package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hh2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hh2[] $VALUES;
    public static final hh2 Evenly;
    public static final hh2 Proportional;

    /* JADX WARN: Type inference failed for: r0v0, types: [hh2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hh2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Proportional", 0);
        Proportional = r0;
        ?? r1 = new Enum("Evenly", 1);
        Evenly = r1;
        hh2[] hh2VarArr = {r0, r1};
        $VALUES = hh2VarArr;
        $ENTRIES = new wg7(hh2VarArr);
    }

    public static hh2 valueOf(String str) {
        return (hh2) Enum.valueOf(hh2.class, str);
    }

    public static hh2[] values() {
        return (hh2[]) $VALUES.clone();
    }
}
