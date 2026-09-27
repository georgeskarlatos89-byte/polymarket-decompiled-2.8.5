package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class iq2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ iq2[] $VALUES;
    public static final iq2 Contained;
    public static final iq2 Simple;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, iq2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, iq2] */
    static {
        ?? r0 = new Enum("Simple", 0);
        Simple = r0;
        ?? r1 = new Enum("Contained", 1);
        Contained = r1;
        iq2[] iq2VarArr = {r0, r1};
        $VALUES = iq2VarArr;
        $ENTRIES = new wg7(iq2VarArr);
    }

    public static iq2 valueOf(String str) {
        return (iq2) Enum.valueOf(iq2.class, str);
    }

    public static iq2[] values() {
        return (iq2[]) $VALUES.clone();
    }
}
