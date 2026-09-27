package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\t\u00100\u001a\u00020\u0013HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Screens;", "", "picker", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Picker;", "frontId", "Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontId;", "frontCapture", "Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontCapture;", "backId", "Lcom/socure/docv/capturesdk/common/network/model/stepup/BackId;", "backCapture", "Lcom/socure/docv/capturesdk/common/network/model/stepup/BackCapture;", ApiConstant.DOCUMENT_SELFIE, "Lcom/socure/docv/capturesdk/common/network/model/stepup/Selfie;", "selfieCapture", "Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieCapture;", "passport", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Passport;", "common", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Common;", "<init>", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/Picker;Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontId;Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontCapture;Lcom/socure/docv/capturesdk/common/network/model/stepup/BackId;Lcom/socure/docv/capturesdk/common/network/model/stepup/BackCapture;Lcom/socure/docv/capturesdk/common/network/model/stepup/Selfie;Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieCapture;Lcom/socure/docv/capturesdk/common/network/model/stepup/Passport;Lcom/socure/docv/capturesdk/common/network/model/stepup/Common;)V", "getPicker", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Picker;", "getFrontId", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontId;", "getFrontCapture", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontCapture;", "getBackId", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/BackId;", "getBackCapture", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/BackCapture;", "getSelfie", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Selfie;", "getSelfieCapture", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieCapture;", "getPassport", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Passport;", "getCommon", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Common;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Screens {
    public static final int $stable = 0;
    private final BackCapture backCapture;
    private final BackId backId;
    private final Common common;
    private final FrontCapture frontCapture;
    private final FrontId frontId;
    private final Passport passport;
    private final Picker picker;
    private final Selfie selfie;
    private final SelfieCapture selfieCapture;

    public Screens(Picker picker, FrontId frontId, FrontCapture frontCapture, BackId backId, BackCapture backCapture, Selfie selfie, SelfieCapture selfieCapture, Passport passport, Common common) {
        picker.getClass();
        frontId.getClass();
        frontCapture.getClass();
        backId.getClass();
        backCapture.getClass();
        selfie.getClass();
        selfieCapture.getClass();
        passport.getClass();
        common.getClass();
        this.picker = picker;
        this.frontId = frontId;
        this.frontCapture = frontCapture;
        this.backId = backId;
        this.backCapture = backCapture;
        this.selfie = selfie;
        this.selfieCapture = selfieCapture;
        this.passport = passport;
        this.common = common;
    }

    public static /* synthetic */ Screens copy$default(Screens screens, Picker picker, FrontId frontId, FrontCapture frontCapture, BackId backId, BackCapture backCapture, Selfie selfie, SelfieCapture selfieCapture, Passport passport, Common common, int i, Object obj) {
        if ((i & 1) != 0) {
            picker = screens.picker;
        }
        if ((i & 2) != 0) {
            frontId = screens.frontId;
        }
        if ((i & 4) != 0) {
            frontCapture = screens.frontCapture;
        }
        if ((i & 8) != 0) {
            backId = screens.backId;
        }
        if ((i & 16) != 0) {
            backCapture = screens.backCapture;
        }
        if ((i & 32) != 0) {
            selfie = screens.selfie;
        }
        if ((i & 64) != 0) {
            selfieCapture = screens.selfieCapture;
        }
        if ((i & 128) != 0) {
            passport = screens.passport;
        }
        if ((i & 256) != 0) {
            common = screens.common;
        }
        Passport passport2 = passport;
        Common common2 = common;
        Selfie selfie2 = selfie;
        SelfieCapture selfieCapture2 = selfieCapture;
        BackCapture backCapture2 = backCapture;
        FrontCapture frontCapture2 = frontCapture;
        return screens.copy(picker, frontId, frontCapture2, backId, backCapture2, selfie2, selfieCapture2, passport2, common2);
    }

    /* renamed from: component1, reason: from getter */
    public final Picker getPicker() {
        return this.picker;
    }

    /* renamed from: component2, reason: from getter */
    public final FrontId getFrontId() {
        return this.frontId;
    }

    /* renamed from: component3, reason: from getter */
    public final FrontCapture getFrontCapture() {
        return this.frontCapture;
    }

    /* renamed from: component4, reason: from getter */
    public final BackId getBackId() {
        return this.backId;
    }

    /* renamed from: component5, reason: from getter */
    public final BackCapture getBackCapture() {
        return this.backCapture;
    }

    /* renamed from: component6, reason: from getter */
    public final Selfie getSelfie() {
        return this.selfie;
    }

    /* renamed from: component7, reason: from getter */
    public final SelfieCapture getSelfieCapture() {
        return this.selfieCapture;
    }

    /* renamed from: component8, reason: from getter */
    public final Passport getPassport() {
        return this.passport;
    }

    /* renamed from: component9, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    public final Screens copy(Picker picker, FrontId frontId, FrontCapture frontCapture, BackId backId, BackCapture backCapture, Selfie selfie, SelfieCapture selfieCapture, Passport passport, Common common) {
        picker.getClass();
        frontId.getClass();
        frontCapture.getClass();
        backId.getClass();
        backCapture.getClass();
        selfie.getClass();
        selfieCapture.getClass();
        passport.getClass();
        common.getClass();
        return new Screens(picker, frontId, frontCapture, backId, backCapture, selfie, selfieCapture, passport, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Screens)) {
            return false;
        }
        Screens screens = (Screens) other;
        if (Intrinsics.areEqual(this.picker, screens.picker) && Intrinsics.areEqual(this.frontId, screens.frontId) && Intrinsics.areEqual(this.frontCapture, screens.frontCapture) && Intrinsics.areEqual(this.backId, screens.backId) && Intrinsics.areEqual(this.backCapture, screens.backCapture) && Intrinsics.areEqual(this.selfie, screens.selfie) && Intrinsics.areEqual(this.selfieCapture, screens.selfieCapture) && Intrinsics.areEqual(this.passport, screens.passport) && Intrinsics.areEqual(this.common, screens.common)) {
            return true;
        }
        return false;
    }

    public final BackCapture getBackCapture() {
        return this.backCapture;
    }

    public final BackId getBackId() {
        return this.backId;
    }

    public final Common getCommon() {
        return this.common;
    }

    public final FrontCapture getFrontCapture() {
        return this.frontCapture;
    }

    public final FrontId getFrontId() {
        return this.frontId;
    }

    public final Passport getPassport() {
        return this.passport;
    }

    public final Picker getPicker() {
        return this.picker;
    }

    public final Selfie getSelfie() {
        return this.selfie;
    }

    public final SelfieCapture getSelfieCapture() {
        return this.selfieCapture;
    }

    public int hashCode() {
        return this.common.hashCode() + ((this.passport.hashCode() + ((this.selfieCapture.hashCode() + ((this.selfie.hashCode() + ((this.backCapture.hashCode() + ((this.backId.hashCode() + ((this.frontCapture.hashCode() + ((this.frontId.hashCode() + (this.picker.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Screens(picker=" + this.picker + ", frontId=" + this.frontId + ", frontCapture=" + this.frontCapture + ", backId=" + this.backId + ", backCapture=" + this.backCapture + ", selfie=" + this.selfie + ", selfieCapture=" + this.selfieCapture + ", passport=" + this.passport + ", common=" + this.common + ")";
    }
}
