package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class q12 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q12[] $VALUES;
    public static final q12 Inline;
    public static final q12 Stacked;

    /* JADX WARN: Type inference failed for: r0v0, types: [q12, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q12, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Inline", 0);
        Inline = r0;
        ?? r1 = new Enum("Stacked", 1);
        Stacked = r1;
        q12[] q12VarArr = {r0, r1};
        $VALUES = q12VarArr;
        $ENTRIES = new wg7(q12VarArr);
    }

    public static q12 valueOf(String str) {
        return (q12) Enum.valueOf(q12.class, str);
    }

    public static q12[] values() {
        return (q12[]) $VALUES.clone();
    }
}
