package com.socure.docv.capturesdk.common.network.model.stepup;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013¨\u00068"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/ExtractedStepUpData;", "", "issueDate", "", PlaceTypes.ADDRESS, "parsedAddress", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Address;", "type", "firstName", "surName", "dob", "expirationDate", "documentNumber", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIssueDate", "()Ljava/lang/String;", "setIssueDate", "(Ljava/lang/String;)V", "getAddress", "setAddress", "getParsedAddress", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Address;", "setParsedAddress", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/Address;)V", "getType", "getFirstName", "setFirstName", "getSurName", "setSurName", "getDob", "setDob", "getExpirationDate", "setExpirationDate", "getDocumentNumber", "setDocumentNumber", "getFullName", "setFullName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ExtractedStepUpData {
    public static final int $stable = 8;
    private String address;
    private String dob;
    private String documentNumber;
    private String expirationDate;
    private String firstName;
    private String fullName;
    private String issueDate;
    private Address parsedAddress;
    private String surName;
    private final String type;

    public /* synthetic */ ExtractedStepUpData(String str, String str2, Address address, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : address, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & Barcode.FORMAT_UPC_A) != 0 ? null : str9);
    }

    public static /* synthetic */ ExtractedStepUpData copy$default(ExtractedStepUpData extractedStepUpData, String str, String str2, Address address, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extractedStepUpData.issueDate;
        }
        if ((i & 2) != 0) {
            str2 = extractedStepUpData.address;
        }
        if ((i & 4) != 0) {
            address = extractedStepUpData.parsedAddress;
        }
        if ((i & 8) != 0) {
            str3 = extractedStepUpData.type;
        }
        if ((i & 16) != 0) {
            str4 = extractedStepUpData.firstName;
        }
        if ((i & 32) != 0) {
            str5 = extractedStepUpData.surName;
        }
        if ((i & 64) != 0) {
            str6 = extractedStepUpData.dob;
        }
        if ((i & 128) != 0) {
            str7 = extractedStepUpData.expirationDate;
        }
        if ((i & 256) != 0) {
            str8 = extractedStepUpData.documentNumber;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str9 = extractedStepUpData.fullName;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return extractedStepUpData.copy(str, str2, address, str3, str14, str15, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final Address getParsedAddress() {
        return this.parsedAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSurName() {
        return this.surName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* renamed from: component8, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final ExtractedStepUpData copy(String issueDate, String address, Address parsedAddress, String type, String firstName, String surName, String dob, String expirationDate, String documentNumber, String fullName) {
        type.getClass();
        return new ExtractedStepUpData(issueDate, address, parsedAddress, type, firstName, surName, dob, expirationDate, documentNumber, fullName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtractedStepUpData)) {
            return false;
        }
        ExtractedStepUpData extractedStepUpData = (ExtractedStepUpData) other;
        if (Intrinsics.areEqual(this.issueDate, extractedStepUpData.issueDate) && Intrinsics.areEqual(this.address, extractedStepUpData.address) && Intrinsics.areEqual(this.parsedAddress, extractedStepUpData.parsedAddress) && Intrinsics.areEqual(this.type, extractedStepUpData.type) && Intrinsics.areEqual(this.firstName, extractedStepUpData.firstName) && Intrinsics.areEqual(this.surName, extractedStepUpData.surName) && Intrinsics.areEqual(this.dob, extractedStepUpData.dob) && Intrinsics.areEqual(this.expirationDate, extractedStepUpData.expirationDate) && Intrinsics.areEqual(this.documentNumber, extractedStepUpData.documentNumber) && Intrinsics.areEqual(this.fullName, extractedStepUpData.fullName)) {
            return true;
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final Address getParsedAddress() {
        return this.parsedAddress;
    }

    public final String getSurName() {
        return this.surName;
    }

    public final String getType() {
        return this.type;
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
        String str = this.issueDate;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.address;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Address address = this.parsedAddress;
        if (address == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = address.hashCode();
        }
        int a = com.socure.docv.capturesdk.api.a.a(this.type, (i3 + hashCode3) * 31, 31);
        String str3 = this.firstName;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (a + hashCode4) * 31;
        String str4 = this.surName;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str5 = this.dob;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str6 = this.expirationDate;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str7 = this.documentNumber;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str8 = this.fullName;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i8 + i;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDocumentNumber(String str) {
        this.documentNumber = str;
    }

    public final void setExpirationDate(String str) {
        this.expirationDate = str;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setIssueDate(String str) {
        this.issueDate = str;
    }

    public final void setParsedAddress(Address address) {
        this.parsedAddress = address;
    }

    public final void setSurName(String str) {
        this.surName = str;
    }

    public String toString() {
        String str = this.issueDate;
        String str2 = this.address;
        Address address = this.parsedAddress;
        String str3 = this.type;
        String str4 = this.firstName;
        String str5 = this.surName;
        String str6 = this.dob;
        String str7 = this.expirationDate;
        String str8 = this.documentNumber;
        String str9 = this.fullName;
        StringBuilder r = m51.r("ExtractedStepUpData(issueDate=", str, ", address=", str2, ", parsedAddress=");
        r.append(address);
        r.append(", type=");
        r.append(str3);
        r.append(", firstName=");
        k84.q(r, str4, ", surName=", str5, ", dob=");
        k84.q(r, str6, ", expirationDate=", str7, ", documentNumber=");
        return sv6.p(r, str8, ", fullName=", str9, ")");
    }

    public ExtractedStepUpData(String str, String str2, Address address, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        str3.getClass();
        this.issueDate = str;
        this.address = str2;
        this.parsedAddress = address;
        this.type = str3;
        this.firstName = str4;
        this.surName = str5;
        this.dob = str6;
        this.expirationDate = str7;
        this.documentNumber = str8;
        this.fullName = str9;
    }
}
