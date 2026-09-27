package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ehb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ehb[] $VALUES;
    public static final ehb Email;
    public static final ehb Name;
    public static final ehb Phone;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ehb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ehb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ehb] */
    static {
        ?? r0 = new Enum("Email", 0);
        Email = r0;
        ?? r1 = new Enum("Phone", 1);
        Phone = r1;
        ?? r2 = new Enum("Name", 2);
        Name = r2;
        ehb[] ehbVarArr = {r0, r1, r2};
        $VALUES = ehbVarArr;
        $ENTRIES = new wg7(ehbVarArr);
    }

    public static ehb valueOf(String str) {
        return (ehb) Enum.valueOf(ehb.class, str);
    }

    public static ehb[] values() {
        return (ehb[]) $VALUES.clone();
    }
}
