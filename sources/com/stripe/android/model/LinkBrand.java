package com.stripe.android.model;

import defpackage.dmk;
import defpackage.dxg;
import defpackage.exg;
import defpackage.ncb;
import defpackage.ocb;
import defpackage.pcb;
import defpackage.sv6;
import defpackage.ug7;
import defpackage.ww4;
import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = ocb.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u0007j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/LinkBrand;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "brandName", "()Ljava/lang/String;", "baseUrl", "termsUrl", "privacyUrl", "achAuthorizationTermsUrl", "Ljava/lang/String;", "getValue", "Companion", "ocb", "ncb", HttpConstants.Headers.LINK, "Onelink", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkBrand {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ LinkBrand[] $VALUES;
    public static final ncb Companion;

    @dxg(ActionType.LINK)
    public static final LinkBrand Link = new LinkBrand(HttpConstants.Headers.LINK, 0, ActionType.LINK);

    @dxg("onelink")
    public static final LinkBrand Onelink = new LinkBrand("Onelink", 1, "onelink");
    private final String value;

    private static final /* synthetic */ LinkBrand[] $values() {
        return new LinkBrand[]{Link, Onelink};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ncb] */
    static {
        LinkBrand[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private LinkBrand(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static LinkBrand valueOf(String str) {
        return (LinkBrand) Enum.valueOf(LinkBrand.class, str);
    }

    public static LinkBrand[] values() {
        return (LinkBrand[]) $VALUES.clone();
    }

    public final String achAuthorizationTermsUrl() {
        return sv6.m(baseUrl(), "/terms/ach-authorization");
    }

    public final String baseUrl() {
        int i = pcb.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "https://onelink.com";
            }
            dmk.a();
            return null;
        }
        return "https://link.com";
    }

    public final String brandName() {
        int i = pcb.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "Onelink";
            }
            dmk.a();
            return null;
        }
        return HttpConstants.Headers.LINK;
    }

    public final String getValue() {
        return this.value;
    }

    public final String privacyUrl() {
        return sv6.m(baseUrl(), "/privacy");
    }

    public final String termsUrl() {
        return sv6.m(baseUrl(), "/terms");
    }
}
