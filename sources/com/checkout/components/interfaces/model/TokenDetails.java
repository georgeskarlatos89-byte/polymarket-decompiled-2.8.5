package com.checkout.components.interfaces.model;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.c8n;
import defpackage.k84;
import defpackage.m51;
import defpackage.woa;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b/\u0010\u001eJÚ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001bJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bS\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bU\u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u0010\u001eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010,R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010.R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b^\u0010>\u001a\u0004\b_\u0010\u001e¨\u0006`"}, d2 = {"Lcom/checkout/components/interfaces/model/TokenDetails;", "", "", "expiryMonth", "expiryYear", "", "last4", "bin", "type", "token", "expiresOn", "scheme", "schemeLocal", "cardType", "cardCategory", "issuer", "issuerCountry", "productId", "productType", "Lcom/checkout/components/interfaces/model/BillingAddress;", "billingAddress", "Lcom/checkout/components/interfaces/model/Phone;", AttributeType.PHONE, Keys.KEY_NAME, "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddress;Lcom/checkout/components/interfaces/model/Phone;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/checkout/components/interfaces/model/BillingAddress;", "component17", "()Lcom/checkout/components/interfaces/model/Phone;", "component18", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddress;Lcom/checkout/components/interfaces/model/Phone;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/TokenDetails;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getExpiryMonth", "b", "getExpiryYear", "c", "Ljava/lang/String;", "getLast4", d.d, "getBin", "e", "getType", "f", "getToken", "g", "getExpiresOn", "h", "getScheme", "i", "getSchemeLocal", "j", "getCardType", "k", "getCardCategory", "l", "getIssuer", "m", "getIssuerCountry", "n", "getProductId", "o", "getProductType", "p", "Lcom/checkout/components/interfaces/model/BillingAddress;", "getBillingAddress", "q", "Lcom/checkout/components/interfaces/model/Phone;", "getPhone", "r", "getName", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TokenDetails {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final int expiryMonth;

    /* renamed from: b, reason: from kotlin metadata */
    private final int expiryYear;

    /* renamed from: c, reason: from kotlin metadata */
    private final String last4;

    /* renamed from: d, reason: from kotlin metadata */
    private final String bin;

    /* renamed from: e, reason: from kotlin metadata */
    private final String type;

    /* renamed from: f, reason: from kotlin metadata */
    private final String token;

    /* renamed from: g, reason: from kotlin metadata */
    private final String expiresOn;

    /* renamed from: h, reason: from kotlin metadata */
    private final String scheme;

    /* renamed from: i, reason: from kotlin metadata */
    private final String schemeLocal;

    /* renamed from: j, reason: from kotlin metadata */
    private final String cardType;

    /* renamed from: k, reason: from kotlin metadata */
    private final String cardCategory;

    /* renamed from: l, reason: from kotlin metadata */
    private final String issuer;

    /* renamed from: m, reason: from kotlin metadata */
    private final String issuerCountry;

    /* renamed from: n, reason: from kotlin metadata */
    private final String productId;

    /* renamed from: o, reason: from kotlin metadata */
    private final String productType;

    /* renamed from: p, reason: from kotlin metadata */
    private final BillingAddress billingAddress;

    /* renamed from: q, reason: from kotlin metadata */
    private final Phone phone;

    /* renamed from: r, reason: from kotlin metadata */
    private final String name;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TokenDetails(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BillingAddress billingAddress, Phone phone, String str14, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, str3, str4, str5, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        BillingAddress billingAddress2;
        Phone phone2;
        String str23;
        if ((i3 & 128) != 0) {
            str15 = null;
        } else {
            str15 = str6;
        }
        if ((i3 & 256) != 0) {
            str16 = null;
        } else {
            str16 = str7;
        }
        if ((i3 & Barcode.FORMAT_UPC_A) != 0) {
            str17 = null;
        } else {
            str17 = str8;
        }
        if ((i3 & Barcode.FORMAT_UPC_E) != 0) {
            str18 = null;
        } else {
            str18 = str9;
        }
        if ((i3 & 2048) != 0) {
            str19 = null;
        } else {
            str19 = str10;
        }
        if ((i3 & 4096) != 0) {
            str20 = null;
        } else {
            str20 = str11;
        }
        if ((i3 & 8192) != 0) {
            str21 = null;
        } else {
            str21 = str12;
        }
        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str22 = null;
        } else {
            str22 = str13;
        }
        if ((32768 & i3) != 0) {
            billingAddress2 = null;
        } else {
            billingAddress2 = billingAddress;
        }
        if ((65536 & i3) != 0) {
            phone2 = null;
        } else {
            phone2 = phone;
        }
        if ((i3 & 131072) != 0) {
            str23 = null;
        } else {
            str23 = str14;
        }
    }

    public static /* synthetic */ TokenDetails copy$default(TokenDetails tokenDetails, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BillingAddress billingAddress, Phone phone, String str14, int i3, Object obj) {
        int i4;
        int i5;
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
        String str25;
        String str26;
        String str27;
        BillingAddress billingAddress2;
        Phone phone2;
        String str28;
        Phone phone3;
        if ((i3 & 1) != 0) {
            i4 = tokenDetails.expiryMonth;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = tokenDetails.expiryYear;
        } else {
            i5 = i2;
        }
        if ((i3 & 4) != 0) {
            str15 = tokenDetails.last4;
        } else {
            str15 = str;
        }
        if ((i3 & 8) != 0) {
            str16 = tokenDetails.bin;
        } else {
            str16 = str2;
        }
        if ((i3 & 16) != 0) {
            str17 = tokenDetails.type;
        } else {
            str17 = str3;
        }
        if ((i3 & 32) != 0) {
            str18 = tokenDetails.token;
        } else {
            str18 = str4;
        }
        if ((i3 & 64) != 0) {
            str19 = tokenDetails.expiresOn;
        } else {
            str19 = str5;
        }
        if ((i3 & 128) != 0) {
            str20 = tokenDetails.scheme;
        } else {
            str20 = str6;
        }
        if ((i3 & 256) != 0) {
            str21 = tokenDetails.schemeLocal;
        } else {
            str21 = str7;
        }
        if ((i3 & Barcode.FORMAT_UPC_A) != 0) {
            str22 = tokenDetails.cardType;
        } else {
            str22 = str8;
        }
        if ((i3 & Barcode.FORMAT_UPC_E) != 0) {
            str23 = tokenDetails.cardCategory;
        } else {
            str23 = str9;
        }
        if ((i3 & 2048) != 0) {
            str24 = tokenDetails.issuer;
        } else {
            str24 = str10;
        }
        if ((i3 & 4096) != 0) {
            str25 = tokenDetails.issuerCountry;
        } else {
            str25 = str11;
        }
        if ((i3 & 8192) != 0) {
            str26 = tokenDetails.productId;
        } else {
            str26 = str12;
        }
        int i6 = i4;
        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str27 = tokenDetails.productType;
        } else {
            str27 = str13;
        }
        if ((i3 & 32768) != 0) {
            billingAddress2 = tokenDetails.billingAddress;
        } else {
            billingAddress2 = billingAddress;
        }
        BillingAddress billingAddress3 = billingAddress2;
        if ((i3 & 65536) != 0) {
            phone2 = tokenDetails.phone;
        } else {
            phone2 = phone;
        }
        if ((i3 & 131072) != 0) {
            phone3 = phone2;
            str28 = tokenDetails.name;
        } else {
            str28 = str14;
            phone3 = phone2;
        }
        return tokenDetails.copy(i6, i5, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, billingAddress3, phone3, str28);
    }

    /* renamed from: component1, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCardCategory() {
        return this.cardCategory;
    }

    /* renamed from: component12, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* renamed from: component13, reason: from getter */
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    /* renamed from: component14, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component15, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component16, reason: from getter */
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component17, reason: from getter */
    public final Phone getPhone() {
        return this.phone;
    }

    /* renamed from: component18, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component7, reason: from getter */
    public final String getExpiresOn() {
        return this.expiresOn;
    }

    /* renamed from: component8, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    public final TokenDetails copy(int expiryMonth, int expiryYear, String last4, String bin, String type, String token, String expiresOn, String scheme, String schemeLocal, String cardType, String cardCategory, String issuer, String issuerCountry, String productId, String productType, BillingAddress billingAddress, Phone phone, String name) {
        last4.getClass();
        bin.getClass();
        type.getClass();
        token.getClass();
        expiresOn.getClass();
        return new TokenDetails(expiryMonth, expiryYear, last4, bin, type, token, expiresOn, scheme, schemeLocal, cardType, cardCategory, issuer, issuerCountry, productId, productType, billingAddress, phone, name);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenDetails)) {
            return false;
        }
        TokenDetails tokenDetails = (TokenDetails) other;
        if (this.expiryMonth == tokenDetails.expiryMonth && this.expiryYear == tokenDetails.expiryYear && Intrinsics.areEqual(this.last4, tokenDetails.last4) && Intrinsics.areEqual(this.bin, tokenDetails.bin) && Intrinsics.areEqual(this.type, tokenDetails.type) && Intrinsics.areEqual(this.token, tokenDetails.token) && Intrinsics.areEqual(this.expiresOn, tokenDetails.expiresOn) && Intrinsics.areEqual(this.scheme, tokenDetails.scheme) && Intrinsics.areEqual(this.schemeLocal, tokenDetails.schemeLocal) && Intrinsics.areEqual(this.cardType, tokenDetails.cardType) && Intrinsics.areEqual(this.cardCategory, tokenDetails.cardCategory) && Intrinsics.areEqual(this.issuer, tokenDetails.issuer) && Intrinsics.areEqual(this.issuerCountry, tokenDetails.issuerCountry) && Intrinsics.areEqual(this.productId, tokenDetails.productId) && Intrinsics.areEqual(this.productType, tokenDetails.productType) && Intrinsics.areEqual(this.billingAddress, tokenDetails.billingAddress) && Intrinsics.areEqual(this.phone, tokenDetails.phone) && Intrinsics.areEqual(this.name, tokenDetails.name)) {
            return true;
        }
        return false;
    }

    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final String getBin() {
        return this.bin;
    }

    public final String getCardCategory() {
        return this.cardCategory;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getExpiresOn() {
        return this.expiresOn;
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
        return this.expiryYear;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getName() {
        return this.name;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
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
        int b = c8n.b(c8n.b(c8n.b(c8n.b(c8n.b(woa.b(this.expiryYear, Integer.hashCode(this.expiryMonth) * 31, 31), this.last4), this.bin), this.type), this.token), this.expiresOn);
        String str = this.scheme;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str2 = this.schemeLocal;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.cardType;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.cardCategory;
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
        String str7 = this.productId;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.productType;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        BillingAddress billingAddress = this.billingAddress;
        if (billingAddress == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = billingAddress.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Phone phone = this.phone;
        if (phone == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = phone.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str9 = this.name;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        int i = this.expiryMonth;
        int i2 = this.expiryYear;
        String str = this.last4;
        String str2 = this.bin;
        String str3 = this.type;
        String str4 = this.token;
        String str5 = this.expiresOn;
        String str6 = this.scheme;
        String str7 = this.schemeLocal;
        String str8 = this.cardType;
        String str9 = this.cardCategory;
        String str10 = this.issuer;
        String str11 = this.issuerCountry;
        String str12 = this.productId;
        String str13 = this.productType;
        BillingAddress billingAddress = this.billingAddress;
        Phone phone = this.phone;
        String str14 = this.name;
        StringBuilder n = m51.n(i, "TokenDetails(expiryMonth=", i2, ", expiryYear=", ", last4=");
        k84.q(n, str, ", bin=", str2, ", type=");
        k84.q(n, str3, ", token=", str4, ", expiresOn=");
        k84.q(n, str5, ", scheme=", str6, ", schemeLocal=");
        k84.q(n, str7, ", cardType=", str8, ", cardCategory=");
        k84.q(n, str9, ", issuer=", str10, ", issuerCountry=");
        k84.q(n, str11, ", productId=", str12, ", productType=");
        n.append(str13);
        n.append(", billingAddress=");
        n.append(billingAddress);
        n.append(", phone=");
        n.append(phone);
        n.append(", name=");
        n.append(str14);
        n.append(")");
        return n.toString();
    }

    public TokenDetails(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BillingAddress billingAddress, Phone phone, String str14) {
        k84.p(str, str2, str3, str4, str5);
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.last4 = str;
        this.bin = str2;
        this.type = str3;
        this.token = str4;
        this.expiresOn = str5;
        this.scheme = str6;
        this.schemeLocal = str7;
        this.cardType = str8;
        this.cardCategory = str9;
        this.issuer = str10;
        this.issuerCountry = str11;
        this.productId = str12;
        this.productType = str13;
        this.billingAddress = billingAddress;
        this.phone = phone;
        this.name = str14;
    }
}
