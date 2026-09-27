package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class po2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ po2[] $VALUES;
    public static final po2 Floating;
    public static final po2 Inline;

    /* JADX WARN: Type inference failed for: r0v0, types: [po2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [po2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Inline", 0);
        Inline = r0;
        ?? r1 = new Enum("Floating", 1);
        Floating = r1;
        po2[] po2VarArr = {r0, r1};
        $VALUES = po2VarArr;
        $ENTRIES = new wg7(po2VarArr);
    }

    public static po2 valueOf(String str) {
        return (po2) Enum.valueOf(po2.class, str);
    }

    public static po2[] values() {
        return (po2[]) $VALUES.clone();
    }
}
