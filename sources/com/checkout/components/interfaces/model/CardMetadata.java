package com.checkout.components.interfaces.model;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.c8n;
import defpackage.ix2;
import defpackage.k84;
import defpackage.m51;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003JÄ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006?"}, d2 = {"Lcom/checkout/components/interfaces/model/CardMetadata;", "", "scheme", "", "schemeLocal", "cardType", "cardCategory", "currency", "issuer", "issuerCountry", "issuerCountryName", "productId", "subProductId", "productType", "regulatedIndicator", "", "bin", "binMax", "localSchemes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getScheme", "()Ljava/lang/String;", "getSchemeLocal", "getCardType", "getCardCategory", "getCurrency", "getIssuer", "getIssuerCountry", "getIssuerCountryName", "getProductId", "getSubProductId", "getProductType", "getRegulatedIndicator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBin", "getBinMax", "getLocalSchemes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/checkout/components/interfaces/model/CardMetadata;", "equals", "other", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CardMetadata {
    public static final int $stable = 8;
    private final String bin;
    private final String binMax;
    private final String cardCategory;
    private final String cardType;
    private final String currency;
    private final String issuer;
    private final String issuerCountry;
    private final String issuerCountryName;
    private final List<String> localSchemes;
    private final String productId;
    private final String productType;
    private final Boolean regulatedIndicator;
    private final String scheme;
    private final String schemeLocal;
    private final String subProductId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, str12, r17, r18);
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Boolean bool2;
        String str24;
        List list2;
        if ((i & 2) != 0) {
            str14 = null;
        } else {
            str14 = str2;
        }
        if ((i & 4) != 0) {
            str15 = null;
        } else {
            str15 = str3;
        }
        if ((i & 8) != 0) {
            str16 = null;
        } else {
            str16 = str4;
        }
        if ((i & 16) != 0) {
            str17 = null;
        } else {
            str17 = str5;
        }
        if ((i & 32) != 0) {
            str18 = null;
        } else {
            str18 = str6;
        }
        if ((i & 64) != 0) {
            str19 = null;
        } else {
            str19 = str7;
        }
        if ((i & 128) != 0) {
            str20 = null;
        } else {
            str20 = str8;
        }
        if ((i & 256) != 0) {
            str21 = null;
        } else {
            str21 = str9;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str22 = null;
        } else {
            str22 = str10;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str23 = null;
        } else {
            str23 = str11;
        }
        if ((i & 2048) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 8192) != 0) {
            str24 = null;
        } else {
            str24 = str13;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
    }

    public static /* synthetic */ CardMetadata copy$default(CardMetadata cardMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, List list, int i, Object obj) {
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        Boolean bool2;
        String str25;
        String str26;
        List list2;
        if ((i & 1) != 0) {
            str14 = cardMetadata.scheme;
        } else {
            str14 = str;
        }
        if ((i & 2) != 0) {
            str15 = cardMetadata.schemeLocal;
        } else {
            str15 = str2;
        }
        if ((i & 4) != 0) {
            str16 = cardMetadata.cardType;
        } else {
            str16 = str3;
        }
        if ((i & 8) != 0) {
            str17 = cardMetadata.cardCategory;
        } else {
            str17 = str4;
        }
        if ((i & 16) != 0) {
            str18 = cardMetadata.currency;
        } else {
            str18 = str5;
        }
        if ((i & 32) != 0) {
            str19 = cardMetadata.issuer;
        } else {
            str19 = str6;
        }
        if ((i & 64) != 0) {
            str20 = cardMetadata.issuerCountry;
        } else {
            str20 = str7;
        }
        if ((i & 128) != 0) {
            str21 = cardMetadata.issuerCountryName;
        } else {
            str21 = str8;
        }
        if ((i & 256) != 0) {
            str22 = cardMetadata.productId;
        } else {
            str22 = str9;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str23 = cardMetadata.subProductId;
        } else {
            str23 = str10;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str24 = cardMetadata.productType;
        } else {
            str24 = str11;
        }
        if ((i & 2048) != 0) {
            bool2 = cardMetadata.regulatedIndicator;
        } else {
            bool2 = bool;
        }
        if ((i & 4096) != 0) {
            str25 = cardMetadata.bin;
        } else {
            str25 = str12;
        }
        if ((i & 8192) != 0) {
            str26 = cardMetadata.binMax;
        } else {
            str26 = str13;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            list2 = cardMetadata.localSchemes;
        } else {
            list2 = list;
        }
        return cardMetadata.copy(str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, bool2, str25, str26, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSubProductId() {
        return this.subProductId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getRegulatedIndicator() {
        return this.regulatedIndicator;
    }

    /* renamed from: component13, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    /* renamed from: component14, reason: from getter */
    public final String getBinMax() {
        return this.binMax;
    }

    public final List<String> component15() {
        return this.localSchemes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCardCategory() {
        return this.cardCategory;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIssuerCountryName() {
        return this.issuerCountryName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final CardMetadata copy(String scheme, String schemeLocal, String cardType, String cardCategory, String currency, String issuer, String issuerCountry, String issuerCountryName, String productId, String subProductId, String productType, Boolean regulatedIndicator, String bin, String binMax, List<String> localSchemes) {
        scheme.getClass();
        bin.getClass();
        return new CardMetadata(scheme, schemeLocal, cardType, cardCategory, currency, issuer, issuerCountry, issuerCountryName, productId, subProductId, productType, regulatedIndicator, bin, binMax, localSchemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardMetadata)) {
            return false;
        }
        CardMetadata cardMetadata = (CardMetadata) other;
        if (Intrinsics.areEqual(this.scheme, cardMetadata.scheme) && Intrinsics.areEqual(this.schemeLocal, cardMetadata.schemeLocal) && Intrinsics.areEqual(this.cardType, cardMetadata.cardType) && Intrinsics.areEqual(this.cardCategory, cardMetadata.cardCategory) && Intrinsics.areEqual(this.currency, cardMetadata.currency) && Intrinsics.areEqual(this.issuer, cardMetadata.issuer) && Intrinsics.areEqual(this.issuerCountry, cardMetadata.issuerCountry) && Intrinsics.areEqual(this.issuerCountryName, cardMetadata.issuerCountryName) && Intrinsics.areEqual(this.productId, cardMetadata.productId) && Intrinsics.areEqual(this.subProductId, cardMetadata.subProductId) && Intrinsics.areEqual(this.productType, cardMetadata.productType) && Intrinsics.areEqual(this.regulatedIndicator, cardMetadata.regulatedIndicator) && Intrinsics.areEqual(this.bin, cardMetadata.bin) && Intrinsics.areEqual(this.binMax, cardMetadata.binMax) && Intrinsics.areEqual(this.localSchemes, cardMetadata.localSchemes)) {
            return true;
        }
        return false;
    }

    public final String getBin() {
        return this.bin;
    }

    public final String getBinMax() {
        return this.binMax;
    }

    public final String getCardCategory() {
        return this.cardCategory;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    public final String getIssuerCountryName() {
        return this.issuerCountryName;
    }

    public final List<String> getLocalSchemes() {
        return this.localSchemes;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final Boolean getRegulatedIndicator() {
        return this.regulatedIndicator;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    public final String getSubProductId() {
        return this.subProductId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13 = this.scheme.hashCode() * 31;
        String str = this.schemeLocal;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode13 + hashCode) * 31;
        String str2 = this.cardType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.cardCategory;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.currency;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.issuer;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.issuerCountry;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.issuerCountryName;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.productId;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str9 = this.subProductId;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str10 = this.productType;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Boolean bool = this.regulatedIndicator;
        if (bool == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool.hashCode();
        }
        int b = c8n.b((i11 + hashCode11) * 31, this.bin);
        String str11 = this.binMax;
        if (str11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str11.hashCode();
        }
        int i12 = (b + hashCode12) * 31;
        List<String> list = this.localSchemes;
        if (list != null) {
            i = list.hashCode();
        }
        return i12 + i;
    }

    public String toString() {
        String str = this.scheme;
        String str2 = this.schemeLocal;
        String str3 = this.cardType;
        String str4 = this.cardCategory;
        String str5 = this.currency;
        String str6 = this.issuer;
        String str7 = this.issuerCountry;
        String str8 = this.issuerCountryName;
        String str9 = this.productId;
        String str10 = this.subProductId;
        String str11 = this.productType;
        Boolean bool = this.regulatedIndicator;
        String str12 = this.bin;
        String str13 = this.binMax;
        List<String> list = this.localSchemes;
        StringBuilder r = m51.r("CardMetadata(scheme=", str, ", schemeLocal=", str2, ", cardType=");
        k84.q(r, str3, ", cardCategory=", str4, ", currency=");
        k84.q(r, str5, ", issuer=", str6, ", issuerCountry=");
        k84.q(r, str7, ", issuerCountryName=", str8, ", productId=");
        k84.q(r, str9, ", subProductId=", str10, ", productType=");
        r.append(str11);
        r.append(", regulatedIndicator=");
        r.append(bool);
        r.append(", bin=");
        k84.q(r, str12, ", binMax=", str13, ", localSchemes=");
        return ix2.q(r, list, ")");
    }

    public CardMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, List<String> list) {
        str.getClass();
        str12.getClass();
        this.scheme = str;
        this.schemeLocal = str2;
        this.cardType = str3;
        this.cardCategory = str4;
        this.currency = str5;
        this.issuer = str6;
        this.issuerCountry = str7;
        this.issuerCountryName = str8;
        this.productId = str9;
        this.subProductId = str10;
        this.productType = str11;
        this.regulatedIndicator = bool;
        this.bin = str12;
        this.binMax = str13;
        this.localSchemes = list;
    }
}
