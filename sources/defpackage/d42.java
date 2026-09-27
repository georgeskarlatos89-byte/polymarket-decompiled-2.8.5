package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class d42 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ d42[] $VALUES;
    public static final d42 AccentOnGradient;
    public static final d42 Themed;

    /* JADX WARN: Type inference failed for: r0v0, types: [d42, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d42, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Themed", 0);
        Themed = r0;
        ?? r1 = new Enum("AccentOnGradient", 1);
        AccentOnGradient = r1;
        d42[] d42VarArr = {r0, r1};
        $VALUES = d42VarArr;
        $ENTRIES = new wg7(d42VarArr);
    }

    public static d42 valueOf(String str) {
        return (d42) Enum.valueOf(d42.class, str);
    }

    public static d42[] values() {
        return (d42[]) $VALUES.clone();
    }
}
