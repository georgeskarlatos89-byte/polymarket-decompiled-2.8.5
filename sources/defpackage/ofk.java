package defpackage;

import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.models.carousel.ActionType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ofk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ofk[] $VALUES;
    public static final nfk Companion;
    public static final ofk GooglePay;
    public static final ofk Link;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [nfk, java.lang.Object] */
    static {
        ofk ofkVar = new ofk("GooglePay", 0, "google_pay");
        GooglePay = ofkVar;
        ofk ofkVar2 = new ofk(HttpConstants.Headers.LINK, 1, ActionType.LINK);
        Link = ofkVar2;
        ofk[] ofkVarArr = {ofkVar, ofkVar2};
        $VALUES = ofkVarArr;
        $ENTRIES = new wg7(ofkVarArr);
        Companion = new Object();
    }

    public ofk(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static ofk valueOf(String str) {
        return (ofk) Enum.valueOf(ofk.class, str);
    }

    public static ofk[] values() {
        return (ofk[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
