package com.socure.docv.capturesdk.common.network.model.stepup;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bq\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\u0097\u0002\u0010s\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00032\b\b\u0003\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\u0013\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010w\u001a\u00020xHÖ\u0001J\t\u0010y\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010#R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010!\"\u0004\bM\u0010#R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010!\"\u0004\bO\u0010#R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010!\"\u0004\bQ\u0010#R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010!\"\u0004\bS\u0010#R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#¨\u0006z"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Accessibility;", "", "holdPhoneFront", "", "alignFaceFrame", "movePhoneRight", "movePhoneLeft", "movePhoneUp", "movePhoneDown", "noCardDetected", "noPassportDetected", "idLookingGood", "faceIsSmall", "movePhoneFrontLowEndDevice", "focusCameraId", "flipIdBarcode", "focusCameraPassport", "movePhoneFront", "frontBackTryPhotoManually", "passportTryPhotoManually", "validatingImage", "idealFace", "initialisingSdk", "processingConsent", "manualBtnContDes", "closeBtnContDes", "helpBtnContDes", "backBtnContDes", "selectCheckBox", "unselectCheckBox", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHoldPhoneFront", "()Ljava/lang/String;", "setHoldPhoneFront", "(Ljava/lang/String;)V", "getAlignFaceFrame", "setAlignFaceFrame", "getMovePhoneRight", "setMovePhoneRight", "getMovePhoneLeft", "setMovePhoneLeft", "getMovePhoneUp", "setMovePhoneUp", "getMovePhoneDown", "setMovePhoneDown", "getNoCardDetected", "setNoCardDetected", "getNoPassportDetected", "setNoPassportDetected", "getIdLookingGood", "setIdLookingGood", "getFaceIsSmall", "setFaceIsSmall", "getMovePhoneFrontLowEndDevice", "setMovePhoneFrontLowEndDevice", "getFocusCameraId", "setFocusCameraId", "getFlipIdBarcode", "setFlipIdBarcode", "getFocusCameraPassport", "setFocusCameraPassport", "getMovePhoneFront", "setMovePhoneFront", "getFrontBackTryPhotoManually", "setFrontBackTryPhotoManually", "getPassportTryPhotoManually", "setPassportTryPhotoManually", "getValidatingImage", "setValidatingImage", "getIdealFace", "setIdealFace", "getInitialisingSdk", "setInitialisingSdk", "getProcessingConsent", "setProcessingConsent", "getManualBtnContDes", "setManualBtnContDes", "getCloseBtnContDes", "setCloseBtnContDes", "getHelpBtnContDes", "setHelpBtnContDes", "getBackBtnContDes", "setBackBtnContDes", "getSelectCheckBox", "setSelectCheckBox", "getUnselectCheckBox", "setUnselectCheckBox", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Accessibility {
    public static final int $stable = 8;
    private String alignFaceFrame;
    private String backBtnContDes;
    private String closeBtnContDes;
    private String faceIsSmall;
    private String flipIdBarcode;
    private String focusCameraId;
    private String focusCameraPassport;
    private String frontBackTryPhotoManually;
    private String helpBtnContDes;
    private String holdPhoneFront;
    private String idLookingGood;
    private String idealFace;
    private String initialisingSdk;
    private String manualBtnContDes;
    private String movePhoneDown;
    private String movePhoneFront;
    private String movePhoneFrontLowEndDevice;
    private String movePhoneLeft;
    private String movePhoneRight;
    private String movePhoneUp;
    private String noCardDetected;
    private String noPassportDetected;
    private String passportTryPhotoManually;
    private String processingConsent;
    private String selectCheckBox;
    private String unselectCheckBox;
    private String validatingImage;

    public Accessibility(@zca(name = "holdPhoneFront") String str, @zca(name = "alignFaceFrame") String str2, @zca(name = "movePhoneRight") String str3, @zca(name = "movePhoneLeft") String str4, @zca(name = "movePhoneUp") String str5, @zca(name = "movePhoneDown") String str6, @zca(name = "noCardDetected") String str7, @zca(name = "noPassportDetected") String str8, @zca(name = "idLookingGood") String str9, @zca(name = "faceIsSmall") String str10, @zca(name = "movePhoneFrontLowEndDevice") String str11, @zca(name = "focusCameraId") String str12, @zca(name = "flipIdBarcode") String str13, @zca(name = "focusCameraPassport") String str14, @zca(name = "movePhoneFront") String str15, @zca(name = "frontBackTryPhotoManually") String str16, @zca(name = "passportTryPhotoManually") String str17, @zca(name = "validatingImage") String str18, @zca(name = "idealFace") String str19, @zca(name = "initialisingSdk") String str20, @zca(name = "processingConsent") String str21, @zca(name = "manualBtnContDes") String str22, @zca(name = "closeBtnContDes") String str23, @zca(name = "helpBtnContDes") String str24, @zca(name = "backBtnContDes") String str25, @zca(name = "selectCheckBox") String str26, @zca(name = "unselectCheckBox") String str27) {
        k84.p(str, str2, str3, str4, str5);
        k84.p(str6, str7, str8, str9, str10);
        k84.p(str11, str12, str13, str14, str15);
        k84.p(str16, str17, str18, str19, str20);
        k84.p(str21, str22, str23, str24, str25);
        str26.getClass();
        str27.getClass();
        this.holdPhoneFront = str;
        this.alignFaceFrame = str2;
        this.movePhoneRight = str3;
        this.movePhoneLeft = str4;
        this.movePhoneUp = str5;
        this.movePhoneDown = str6;
        this.noCardDetected = str7;
        this.noPassportDetected = str8;
        this.idLookingGood = str9;
        this.faceIsSmall = str10;
        this.movePhoneFrontLowEndDevice = str11;
        this.focusCameraId = str12;
        this.flipIdBarcode = str13;
        this.focusCameraPassport = str14;
        this.movePhoneFront = str15;
        this.frontBackTryPhotoManually = str16;
        this.passportTryPhotoManually = str17;
        this.validatingImage = str18;
        this.idealFace = str19;
        this.initialisingSdk = str20;
        this.processingConsent = str21;
        this.manualBtnContDes = str22;
        this.closeBtnContDes = str23;
        this.helpBtnContDes = str24;
        this.backBtnContDes = str25;
        this.selectCheckBox = str26;
        this.unselectCheckBox = str27;
    }

    public static /* synthetic */ Accessibility copy$default(Accessibility accessibility, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i, Object obj) {
        String str28;
        String str29;
        String str30 = (i & 1) != 0 ? accessibility.holdPhoneFront : str;
        String str31 = (i & 2) != 0 ? accessibility.alignFaceFrame : str2;
        String str32 = (i & 4) != 0 ? accessibility.movePhoneRight : str3;
        String str33 = (i & 8) != 0 ? accessibility.movePhoneLeft : str4;
        String str34 = (i & 16) != 0 ? accessibility.movePhoneUp : str5;
        String str35 = (i & 32) != 0 ? accessibility.movePhoneDown : str6;
        String str36 = (i & 64) != 0 ? accessibility.noCardDetected : str7;
        String str37 = (i & 128) != 0 ? accessibility.noPassportDetected : str8;
        String str38 = (i & 256) != 0 ? accessibility.idLookingGood : str9;
        String str39 = (i & Barcode.FORMAT_UPC_A) != 0 ? accessibility.faceIsSmall : str10;
        String str40 = (i & Barcode.FORMAT_UPC_E) != 0 ? accessibility.movePhoneFrontLowEndDevice : str11;
        String str41 = (i & 2048) != 0 ? accessibility.focusCameraId : str12;
        String str42 = (i & 4096) != 0 ? accessibility.flipIdBarcode : str13;
        String str43 = (i & 8192) != 0 ? accessibility.focusCameraPassport : str14;
        String str44 = str30;
        String str45 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? accessibility.movePhoneFront : str15;
        String str46 = (i & 32768) != 0 ? accessibility.frontBackTryPhotoManually : str16;
        String str47 = (i & 65536) != 0 ? accessibility.passportTryPhotoManually : str17;
        String str48 = (i & 131072) != 0 ? accessibility.validatingImage : str18;
        String str49 = (i & 262144) != 0 ? accessibility.idealFace : str19;
        String str50 = (i & 524288) != 0 ? accessibility.initialisingSdk : str20;
        String str51 = (i & 1048576) != 0 ? accessibility.processingConsent : str21;
        String str52 = (i & 2097152) != 0 ? accessibility.manualBtnContDes : str22;
        String str53 = (i & 4194304) != 0 ? accessibility.closeBtnContDes : str23;
        String str54 = (i & 8388608) != 0 ? accessibility.helpBtnContDes : str24;
        String str55 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? accessibility.backBtnContDes : str25;
        String str56 = (i & 33554432) != 0 ? accessibility.selectCheckBox : str26;
        if ((i & 67108864) != 0) {
            str29 = str56;
            str28 = accessibility.unselectCheckBox;
        } else {
            str28 = str27;
            str29 = str56;
        }
        return accessibility.copy(str44, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str29, str28);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHoldPhoneFront() {
        return this.holdPhoneFront;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFaceIsSmall() {
        return this.faceIsSmall;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMovePhoneFrontLowEndDevice() {
        return this.movePhoneFrontLowEndDevice;
    }

    /* renamed from: component12, reason: from getter */
    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    /* renamed from: component15, reason: from getter */
    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    /* renamed from: component16, reason: from getter */
    public final String getFrontBackTryPhotoManually() {
        return this.frontBackTryPhotoManually;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPassportTryPhotoManually() {
        return this.passportTryPhotoManually;
    }

    /* renamed from: component18, reason: from getter */
    public final String getValidatingImage() {
        return this.validatingImage;
    }

    /* renamed from: component19, reason: from getter */
    public final String getIdealFace() {
        return this.idealFace;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    /* renamed from: component20, reason: from getter */
    public final String getInitialisingSdk() {
        return this.initialisingSdk;
    }

    /* renamed from: component21, reason: from getter */
    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    /* renamed from: component22, reason: from getter */
    public final String getManualBtnContDes() {
        return this.manualBtnContDes;
    }

    /* renamed from: component23, reason: from getter */
    public final String getCloseBtnContDes() {
        return this.closeBtnContDes;
    }

    /* renamed from: component24, reason: from getter */
    public final String getHelpBtnContDes() {
        return this.helpBtnContDes;
    }

    /* renamed from: component25, reason: from getter */
    public final String getBackBtnContDes() {
        return this.backBtnContDes;
    }

    /* renamed from: component26, reason: from getter */
    public final String getSelectCheckBox() {
        return this.selectCheckBox;
    }

    /* renamed from: component27, reason: from getter */
    public final String getUnselectCheckBox() {
        return this.unselectCheckBox;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNoCardDetected() {
        return this.noCardDetected;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    public final Accessibility copy(@zca(name = "holdPhoneFront") String holdPhoneFront, @zca(name = "alignFaceFrame") String alignFaceFrame, @zca(name = "movePhoneRight") String movePhoneRight, @zca(name = "movePhoneLeft") String movePhoneLeft, @zca(name = "movePhoneUp") String movePhoneUp, @zca(name = "movePhoneDown") String movePhoneDown, @zca(name = "noCardDetected") String noCardDetected, @zca(name = "noPassportDetected") String noPassportDetected, @zca(name = "idLookingGood") String idLookingGood, @zca(name = "faceIsSmall") String faceIsSmall, @zca(name = "movePhoneFrontLowEndDevice") String movePhoneFrontLowEndDevice, @zca(name = "focusCameraId") String focusCameraId, @zca(name = "flipIdBarcode") String flipIdBarcode, @zca(name = "focusCameraPassport") String focusCameraPassport, @zca(name = "movePhoneFront") String movePhoneFront, @zca(name = "frontBackTryPhotoManually") String frontBackTryPhotoManually, @zca(name = "passportTryPhotoManually") String passportTryPhotoManually, @zca(name = "validatingImage") String validatingImage, @zca(name = "idealFace") String idealFace, @zca(name = "initialisingSdk") String initialisingSdk, @zca(name = "processingConsent") String processingConsent, @zca(name = "manualBtnContDes") String manualBtnContDes, @zca(name = "closeBtnContDes") String closeBtnContDes, @zca(name = "helpBtnContDes") String helpBtnContDes, @zca(name = "backBtnContDes") String backBtnContDes, @zca(name = "selectCheckBox") String selectCheckBox, @zca(name = "unselectCheckBox") String unselectCheckBox) {
        k84.p(holdPhoneFront, alignFaceFrame, movePhoneRight, movePhoneLeft, movePhoneUp);
        k84.p(movePhoneDown, noCardDetected, noPassportDetected, idLookingGood, faceIsSmall);
        k84.p(movePhoneFrontLowEndDevice, focusCameraId, flipIdBarcode, focusCameraPassport, movePhoneFront);
        k84.p(frontBackTryPhotoManually, passportTryPhotoManually, validatingImage, idealFace, initialisingSdk);
        k84.p(processingConsent, manualBtnContDes, closeBtnContDes, helpBtnContDes, backBtnContDes);
        selectCheckBox.getClass();
        unselectCheckBox.getClass();
        return new Accessibility(holdPhoneFront, alignFaceFrame, movePhoneRight, movePhoneLeft, movePhoneUp, movePhoneDown, noCardDetected, noPassportDetected, idLookingGood, faceIsSmall, movePhoneFrontLowEndDevice, focusCameraId, flipIdBarcode, focusCameraPassport, movePhoneFront, frontBackTryPhotoManually, passportTryPhotoManually, validatingImage, idealFace, initialisingSdk, processingConsent, manualBtnContDes, closeBtnContDes, helpBtnContDes, backBtnContDes, selectCheckBox, unselectCheckBox);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Accessibility)) {
            return false;
        }
        Accessibility accessibility = (Accessibility) other;
        if (Intrinsics.areEqual(this.holdPhoneFront, accessibility.holdPhoneFront) && Intrinsics.areEqual(this.alignFaceFrame, accessibility.alignFaceFrame) && Intrinsics.areEqual(this.movePhoneRight, accessibility.movePhoneRight) && Intrinsics.areEqual(this.movePhoneLeft, accessibility.movePhoneLeft) && Intrinsics.areEqual(this.movePhoneUp, accessibility.movePhoneUp) && Intrinsics.areEqual(this.movePhoneDown, accessibility.movePhoneDown) && Intrinsics.areEqual(this.noCardDetected, accessibility.noCardDetected) && Intrinsics.areEqual(this.noPassportDetected, accessibility.noPassportDetected) && Intrinsics.areEqual(this.idLookingGood, accessibility.idLookingGood) && Intrinsics.areEqual(this.faceIsSmall, accessibility.faceIsSmall) && Intrinsics.areEqual(this.movePhoneFrontLowEndDevice, accessibility.movePhoneFrontLowEndDevice) && Intrinsics.areEqual(this.focusCameraId, accessibility.focusCameraId) && Intrinsics.areEqual(this.flipIdBarcode, accessibility.flipIdBarcode) && Intrinsics.areEqual(this.focusCameraPassport, accessibility.focusCameraPassport) && Intrinsics.areEqual(this.movePhoneFront, accessibility.movePhoneFront) && Intrinsics.areEqual(this.frontBackTryPhotoManually, accessibility.frontBackTryPhotoManually) && Intrinsics.areEqual(this.passportTryPhotoManually, accessibility.passportTryPhotoManually) && Intrinsics.areEqual(this.validatingImage, accessibility.validatingImage) && Intrinsics.areEqual(this.idealFace, accessibility.idealFace) && Intrinsics.areEqual(this.initialisingSdk, accessibility.initialisingSdk) && Intrinsics.areEqual(this.processingConsent, accessibility.processingConsent) && Intrinsics.areEqual(this.manualBtnContDes, accessibility.manualBtnContDes) && Intrinsics.areEqual(this.closeBtnContDes, accessibility.closeBtnContDes) && Intrinsics.areEqual(this.helpBtnContDes, accessibility.helpBtnContDes) && Intrinsics.areEqual(this.backBtnContDes, accessibility.backBtnContDes) && Intrinsics.areEqual(this.selectCheckBox, accessibility.selectCheckBox) && Intrinsics.areEqual(this.unselectCheckBox, accessibility.unselectCheckBox)) {
            return true;
        }
        return false;
    }

    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    public final String getBackBtnContDes() {
        return this.backBtnContDes;
    }

    public final String getCloseBtnContDes() {
        return this.closeBtnContDes;
    }

    public final String getFaceIsSmall() {
        return this.faceIsSmall;
    }

    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    public final String getFrontBackTryPhotoManually() {
        return this.frontBackTryPhotoManually;
    }

    public final String getHelpBtnContDes() {
        return this.helpBtnContDes;
    }

    public final String getHoldPhoneFront() {
        return this.holdPhoneFront;
    }

    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    public final String getIdealFace() {
        return this.idealFace;
    }

    public final String getInitialisingSdk() {
        return this.initialisingSdk;
    }

    public final String getManualBtnContDes() {
        return this.manualBtnContDes;
    }

    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    public final String getMovePhoneFrontLowEndDevice() {
        return this.movePhoneFrontLowEndDevice;
    }

    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    public final String getNoCardDetected() {
        return this.noCardDetected;
    }

    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    public final String getPassportTryPhotoManually() {
        return this.passportTryPhotoManually;
    }

    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    public final String getSelectCheckBox() {
        return this.selectCheckBox;
    }

    public final String getUnselectCheckBox() {
        return this.unselectCheckBox;
    }

    public final String getValidatingImage() {
        return this.validatingImage;
    }

    public int hashCode() {
        return this.unselectCheckBox.hashCode() + com.socure.docv.capturesdk.api.a.a(this.selectCheckBox, com.socure.docv.capturesdk.api.a.a(this.backBtnContDes, com.socure.docv.capturesdk.api.a.a(this.helpBtnContDes, com.socure.docv.capturesdk.api.a.a(this.closeBtnContDes, com.socure.docv.capturesdk.api.a.a(this.manualBtnContDes, com.socure.docv.capturesdk.api.a.a(this.processingConsent, com.socure.docv.capturesdk.api.a.a(this.initialisingSdk, com.socure.docv.capturesdk.api.a.a(this.idealFace, com.socure.docv.capturesdk.api.a.a(this.validatingImage, com.socure.docv.capturesdk.api.a.a(this.passportTryPhotoManually, com.socure.docv.capturesdk.api.a.a(this.frontBackTryPhotoManually, com.socure.docv.capturesdk.api.a.a(this.movePhoneFront, com.socure.docv.capturesdk.api.a.a(this.focusCameraPassport, com.socure.docv.capturesdk.api.a.a(this.flipIdBarcode, com.socure.docv.capturesdk.api.a.a(this.focusCameraId, com.socure.docv.capturesdk.api.a.a(this.movePhoneFrontLowEndDevice, com.socure.docv.capturesdk.api.a.a(this.faceIsSmall, com.socure.docv.capturesdk.api.a.a(this.idLookingGood, com.socure.docv.capturesdk.api.a.a(this.noPassportDetected, com.socure.docv.capturesdk.api.a.a(this.noCardDetected, com.socure.docv.capturesdk.api.a.a(this.movePhoneDown, com.socure.docv.capturesdk.api.a.a(this.movePhoneUp, com.socure.docv.capturesdk.api.a.a(this.movePhoneLeft, com.socure.docv.capturesdk.api.a.a(this.movePhoneRight, com.socure.docv.capturesdk.api.a.a(this.alignFaceFrame, this.holdPhoneFront.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAlignFaceFrame(String str) {
        str.getClass();
        this.alignFaceFrame = str;
    }

    public final void setBackBtnContDes(String str) {
        str.getClass();
        this.backBtnContDes = str;
    }

    public final void setCloseBtnContDes(String str) {
        str.getClass();
        this.closeBtnContDes = str;
    }

    public final void setFaceIsSmall(String str) {
        str.getClass();
        this.faceIsSmall = str;
    }

    public final void setFlipIdBarcode(String str) {
        str.getClass();
        this.flipIdBarcode = str;
    }

    public final void setFocusCameraId(String str) {
        str.getClass();
        this.focusCameraId = str;
    }

    public final void setFocusCameraPassport(String str) {
        str.getClass();
        this.focusCameraPassport = str;
    }

    public final void setFrontBackTryPhotoManually(String str) {
        str.getClass();
        this.frontBackTryPhotoManually = str;
    }

    public final void setHelpBtnContDes(String str) {
        str.getClass();
        this.helpBtnContDes = str;
    }

    public final void setHoldPhoneFront(String str) {
        str.getClass();
        this.holdPhoneFront = str;
    }

    public final void setIdLookingGood(String str) {
        str.getClass();
        this.idLookingGood = str;
    }

    public final void setIdealFace(String str) {
        str.getClass();
        this.idealFace = str;
    }

    public final void setInitialisingSdk(String str) {
        str.getClass();
        this.initialisingSdk = str;
    }

    public final void setManualBtnContDes(String str) {
        str.getClass();
        this.manualBtnContDes = str;
    }

    public final void setMovePhoneDown(String str) {
        str.getClass();
        this.movePhoneDown = str;
    }

    public final void setMovePhoneFront(String str) {
        str.getClass();
        this.movePhoneFront = str;
    }

    public final void setMovePhoneFrontLowEndDevice(String str) {
        str.getClass();
        this.movePhoneFrontLowEndDevice = str;
    }

    public final void setMovePhoneLeft(String str) {
        str.getClass();
        this.movePhoneLeft = str;
    }

    public final void setMovePhoneRight(String str) {
        str.getClass();
        this.movePhoneRight = str;
    }

    public final void setMovePhoneUp(String str) {
        str.getClass();
        this.movePhoneUp = str;
    }

    public final void setNoCardDetected(String str) {
        str.getClass();
        this.noCardDetected = str;
    }

    public final void setNoPassportDetected(String str) {
        str.getClass();
        this.noPassportDetected = str;
    }

    public final void setPassportTryPhotoManually(String str) {
        str.getClass();
        this.passportTryPhotoManually = str;
    }

    public final void setProcessingConsent(String str) {
        str.getClass();
        this.processingConsent = str;
    }

    public final void setSelectCheckBox(String str) {
        str.getClass();
        this.selectCheckBox = str;
    }

    public final void setUnselectCheckBox(String str) {
        str.getClass();
        this.unselectCheckBox = str;
    }

    public final void setValidatingImage(String str) {
        str.getClass();
        this.validatingImage = str;
    }

    public String toString() {
        String str = this.holdPhoneFront;
        String str2 = this.alignFaceFrame;
        String str3 = this.movePhoneRight;
        String str4 = this.movePhoneLeft;
        String str5 = this.movePhoneUp;
        String str6 = this.movePhoneDown;
        String str7 = this.noCardDetected;
        String str8 = this.noPassportDetected;
        String str9 = this.idLookingGood;
        String str10 = this.faceIsSmall;
        String str11 = this.movePhoneFrontLowEndDevice;
        String str12 = this.focusCameraId;
        String str13 = this.flipIdBarcode;
        String str14 = this.focusCameraPassport;
        String str15 = this.movePhoneFront;
        String str16 = this.frontBackTryPhotoManually;
        String str17 = this.passportTryPhotoManually;
        String str18 = this.validatingImage;
        String str19 = this.idealFace;
        String str20 = this.initialisingSdk;
        String str21 = this.processingConsent;
        String str22 = this.manualBtnContDes;
        String str23 = this.closeBtnContDes;
        String str24 = this.helpBtnContDes;
        String str25 = this.backBtnContDes;
        String str26 = this.selectCheckBox;
        String str27 = this.unselectCheckBox;
        StringBuilder r = m51.r("Accessibility(holdPhoneFront=", str, ", alignFaceFrame=", str2, ", movePhoneRight=");
        k84.q(r, str3, ", movePhoneLeft=", str4, ", movePhoneUp=");
        k84.q(r, str5, ", movePhoneDown=", str6, ", noCardDetected=");
        k84.q(r, str7, ", noPassportDetected=", str8, ", idLookingGood=");
        k84.q(r, str9, ", faceIsSmall=", str10, ", movePhoneFrontLowEndDevice=");
        k84.q(r, str11, ", focusCameraId=", str12, ", flipIdBarcode=");
        k84.q(r, str13, ", focusCameraPassport=", str14, ", movePhoneFront=");
        k84.q(r, str15, ", frontBackTryPhotoManually=", str16, ", passportTryPhotoManually=");
        k84.q(r, str17, ", validatingImage=", str18, ", idealFace=");
        k84.q(r, str19, ", initialisingSdk=", str20, ", processingConsent=");
        k84.q(r, str21, ", manualBtnContDes=", str22, ", closeBtnContDes=");
        k84.q(r, str23, ", helpBtnContDes=", str24, ", backBtnContDes=");
        k84.q(r, str25, ", selectCheckBox=", str26, ", unselectCheckBox=");
        return woa.r(r, str27, ")");
    }
}
