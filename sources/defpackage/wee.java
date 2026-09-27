package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class wee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wee[] $VALUES;
    public static final wee GooglePay;
    public static final wee Link;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wee] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wee] */
    static {
        ?? r0 = new Enum(HttpConstants.Headers.LINK, 0);
        Link = r0;
        ?? r1 = new Enum("GooglePay", 1);
        GooglePay = r1;
        wee[] weeVarArr = {r0, r1};
        $VALUES = weeVarArr;
        $ENTRIES = new wg7(weeVarArr);
    }

    public static wee valueOf(String str) {
        return (wee) Enum.valueOf(wee.class, str);
    }

    public static wee[] values() {
        return (wee[]) $VALUES.clone();
    }
}
