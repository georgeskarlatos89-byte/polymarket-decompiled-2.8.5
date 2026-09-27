package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tae {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tae[] $VALUES;
    public static final tae AddCard;
    public static final tae GooglePay;
    public static final tae Link;
    public static final tae SavedPaymentMethod;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tae] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tae] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tae] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, tae] */
    static {
        ?? r0 = new Enum("SavedPaymentMethod", 0);
        SavedPaymentMethod = r0;
        ?? r1 = new Enum("AddCard", 1);
        AddCard = r1;
        ?? r2 = new Enum("GooglePay", 2);
        GooglePay = r2;
        ?? r3 = new Enum(HttpConstants.Headers.LINK, 3);
        Link = r3;
        tae[] taeVarArr = {r0, r1, r2, r3};
        $VALUES = taeVarArr;
        $ENTRIES = new wg7(taeVarArr);
    }

    public static tae valueOf(String str) {
        return (tae) Enum.valueOf(tae.class, str);
    }

    public static tae[] values() {
        return (tae[]) $VALUES.clone();
    }
}
