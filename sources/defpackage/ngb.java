package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ngb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ngb[] $VALUES;
    public static final ngb BankAccount;
    public static final ngb Card;
    public static final ngb Generic;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ngb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ngb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ngb] */
    static {
        ?? r0 = new Enum("Card", 0);
        Card = r0;
        ?? r1 = new Enum("BankAccount", 1);
        BankAccount = r1;
        ?? r2 = new Enum("Generic", 2);
        Generic = r2;
        ngb[] ngbVarArr = {r0, r1, r2};
        $VALUES = ngbVarArr;
        $ENTRIES = new wg7(ngbVarArr);
    }

    public static ngb valueOf(String str) {
        return (ngb) Enum.valueOf(ngb.class, str);
    }

    public static ngb[] values() {
        return (ngb[]) $VALUES.clone();
    }
}
