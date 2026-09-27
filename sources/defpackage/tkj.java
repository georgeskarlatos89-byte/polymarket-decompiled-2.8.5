package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tkj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tkj[] $VALUES;
    public static final tkj AllowlistedOnly;
    public static final tkj Open;

    /* JADX WARN: Type inference failed for: r0v0, types: [tkj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tkj, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Open", 0);
        Open = r0;
        ?? r1 = new Enum("AllowlistedOnly", 1);
        AllowlistedOnly = r1;
        tkj[] tkjVarArr = {r0, r1};
        $VALUES = tkjVarArr;
        $ENTRIES = new wg7(tkjVarArr);
    }

    public static tkj valueOf(String str) {
        return (tkj) Enum.valueOf(tkj.class, str);
    }

    public static tkj[] values() {
        return (tkj[]) $VALUES.clone();
    }
}
