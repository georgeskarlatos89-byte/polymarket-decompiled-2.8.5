package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d49 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ d49[] $VALUES;
    public static final d49 Failed;
    public static final d49 Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d49] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d49] */
    static {
        ?? r0 = new Enum("Success", 0);
        Success = r0;
        ?? r1 = new Enum("Failed", 1);
        Failed = r1;
        d49[] d49VarArr = {r0, r1};
        $VALUES = d49VarArr;
        $ENTRIES = new wg7(d49VarArr);
    }

    public static d49 valueOf(String str) {
        return (d49) Enum.valueOf(d49.class, str);
    }

    public static d49[] values() {
        return (d49[]) $VALUES.clone();
    }
}
