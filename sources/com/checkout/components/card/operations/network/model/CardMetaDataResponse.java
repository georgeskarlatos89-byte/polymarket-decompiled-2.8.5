package com.checkout.components.card.operations.network.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.mda;
import defpackage.zca;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b,\b\u0001\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u0012\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u0012\u0004\b$\u0010\u001b\u001a\u0004\b#\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0017\u0012\u0004\b'\u0010\u001b\u001a\u0004\b&\u0010\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0017\u0012\u0004\b*\u0010\u001b\u001a\u0004\b)\u0010\u0019R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0017\u0012\u0004\b-\u0010\u001b\u001a\u0004\b,\u0010\u0019R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\u0017\u0012\u0004\b0\u0010\u001b\u001a\u0004\b/\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010\u001b\u001a\u0004\b3\u00104R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u0017\u0012\u0004\b8\u0010\u001b\u001a\u0004\b7\u0010\u0019R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\u001b\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "", "", "scheme", "schemeLocal", "cardType", "cardCategory", "currency", "issuer", "issuerCountry", "issuerCountryName", "productId", "subProductId", "productType", "", "regulatedIndicator", "bin", "binMax", "", "localSchemes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "b", "Ljava/lang/String;", "getSchemeLocal", "()Ljava/lang/String;", "getSchemeLocal$annotations", "()V", "c", "getCardType", "getCardType$annotations", d.d, "getCardCategory", "getCardCategory$annotations", "g", "getIssuerCountry", "getIssuerCountry$annotations", "h", "getIssuerCountryName", "getIssuerCountryName$annotations", "i", "getProductId", "getProductId$annotations", "j", "getSubProductId", "getSubProductId$annotations", "k", "getProductType", "getProductType$annotations", "l", "Ljava/lang/Boolean;", "getRegulatedIndicator", "()Ljava/lang/Boolean;", "getRegulatedIndicator$annotations", "n", "getBinMax", "getBinMax$annotations", "o", "Ljava/util/List;", "getLocalSchemes", "()Ljava/util/List;", "getLocalSchemes$annotations", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final class CardMetaDataResponse {
    public final String a;

    /* renamed from: b, reason: from kotlin metadata */
    public final String schemeLocal;

    /* renamed from: c, reason: from kotlin metadata */
    public final String cardType;

    /* renamed from: d, reason: from kotlin metadata */
    public final String cardCategory;
    public final String e;
    public final String f;

    /* renamed from: g, reason: from kotlin metadata */
    public final String issuerCountry;

    /* renamed from: h, reason: from kotlin metadata */
    public final String issuerCountryName;

    /* renamed from: i, reason: from kotlin metadata */
    public final String productId;

    /* renamed from: j, reason: from kotlin metadata */
    public final String subProductId;

    /* renamed from: k, reason: from kotlin metadata */
    public final String productType;

    /* renamed from: l, reason: from kotlin metadata */
    public final Boolean regulatedIndicator;
    public final String m;

    /* renamed from: n, reason: from kotlin metadata */
    public final String binMax;

    /* renamed from: o, reason: from kotlin metadata */
    public final List localSchemes;

    public CardMetaDataResponse(String str, @zca(name = "scheme_local") String str2, @zca(name = "card_type") String str3, @zca(name = "card_category") String str4, String str5, String str6, @zca(name = "issuer_country") String str7, @zca(name = "issuer_country_name") String str8, @zca(name = "product_id") String str9, @zca(name = "sub_product_id") String str10, @zca(name = "product_type") String str11, @zca(name = "regulated_indicator") Boolean bool, String str12, @zca(name = "bin_max") String str13, @zca(name = "local_schemes") List<String> list) {
        str.getClass();
        str12.getClass();
        this.a = str;
        this.schemeLocal = str2;
        this.cardType = str3;
        this.cardCategory = str4;
        this.e = str5;
        this.f = str6;
        this.issuerCountry = str7;
        this.issuerCountryName = str8;
        this.productId = str9;
        this.subProductId = str10;
        this.productType = str11;
        this.regulatedIndicator = bool;
        this.m = str12;
        this.binMax = str13;
        this.localSchemes = list;
    }

    @zca(name = "bin_max")
    public static /* synthetic */ void getBinMax$annotations() {
    }

    @zca(name = "card_category")
    public static /* synthetic */ void getCardCategory$annotations() {
    }

    @zca(name = "card_type")
    public static /* synthetic */ void getCardType$annotations() {
    }

    @zca(name = "issuer_country")
    public static /* synthetic */ void getIssuerCountry$annotations() {
    }

    @zca(name = "issuer_country_name")
    public static /* synthetic */ void getIssuerCountryName$annotations() {
    }

    @zca(name = "local_schemes")
    public static /* synthetic */ void getLocalSchemes$annotations() {
    }

    @zca(name = "product_id")
    public static /* synthetic */ void getProductId$annotations() {
    }

    @zca(name = "product_type")
    public static /* synthetic */ void getProductType$annotations() {
    }

    @zca(name = "regulated_indicator")
    public static /* synthetic */ void getRegulatedIndicator$annotations() {
    }

    @zca(name = "scheme_local")
    public static /* synthetic */ void getSchemeLocal$annotations() {
    }

    @zca(name = "sub_product_id")
    public static /* synthetic */ void getSubProductId$annotations() {
    }
}
