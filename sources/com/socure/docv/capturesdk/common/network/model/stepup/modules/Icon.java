package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Icon;", "", "successColor", "", "errorColor", "errorFillColor", "infoColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuccessColor", "()Ljava/lang/String;", "getErrorColor", "getErrorFillColor", "getInfoColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Icon {
    public static final int $stable = 0;
    private final String errorColor;
    private final String errorFillColor;
    private final String infoColor;
    private final String successColor;

    public Icon(String str, String str2, String str3, String str4) {
        this.successColor = str;
        this.errorColor = str2;
        this.errorFillColor = str3;
        this.infoColor = str4;
    }

    public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = icon.successColor;
        }
        if ((i & 2) != 0) {
            str2 = icon.errorColor;
        }
        if ((i & 4) != 0) {
            str3 = icon.errorFillColor;
        }
        if ((i & 8) != 0) {
            str4 = icon.infoColor;
        }
        return icon.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSuccessColor() {
        return this.successColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorColor() {
        return this.errorColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorFillColor() {
        return this.errorFillColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInfoColor() {
        return this.infoColor;
    }

    public final Icon copy(String successColor, String errorColor, String errorFillColor, String infoColor) {
        return new Icon(successColor, errorColor, errorFillColor, infoColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) other;
        if (Intrinsics.areEqual(this.successColor, icon.successColor) && Intrinsics.areEqual(this.errorColor, icon.errorColor) && Intrinsics.areEqual(this.errorFillColor, icon.errorFillColor) && Intrinsics.areEqual(this.infoColor, icon.infoColor)) {
            return true;
        }
        return false;
    }

    public final String getErrorColor() {
        return this.errorColor;
    }

    public final String getErrorFillColor() {
        return this.errorFillColor;
    }

    public final String getInfoColor() {
        return this.infoColor;
    }

    public final String getSuccessColor() {
        return this.successColor;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.successColor;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.errorColor;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.errorFillColor;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.infoColor;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.successColor;
        String str2 = this.errorColor;
        return sv6.p(m51.r("Icon(successColor=", str, ", errorColor=", str2, ", errorFillColor="), this.errorFillColor, ", infoColor=", this.infoColor, ")");
    }
}
