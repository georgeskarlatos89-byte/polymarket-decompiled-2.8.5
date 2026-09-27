package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.k84;
import defpackage.mda;
import defpackage.sv6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010,J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010O\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010P\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u009c\u0002\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020\u00192\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\u000eHÖ\u0001J\t\u0010Y\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010-\u001a\u0004\b5\u0010,R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010-\u001a\u0004\b6\u0010,R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006Z"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "", "labels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "buttons", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "bodyComponents", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/BodyComponent;", "consentVersion", "", "consentLanguage", "errorMessage", "completedModuleCount", "", "totalModuleCount", "documentTypes", "collectionMethods", "uploadFileTypes", "infoModalText", "useCaseType", ApiConstant.DOCUMENT_TYPE, "currentVerificationCount", "totalVerificationCount", "transitionScreenEnabled", "", "primaryImageConfig", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PrimaryImageConfig;", "multiframeConfig", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeConfig;", "errorLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorLabels;", "<init>", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PrimaryImageConfig;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeConfig;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorLabels;)V", "getLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "getButtons", "()Ljava/util/List;", "getBodyComponents", "getConsentVersion", "()Ljava/lang/String;", "getConsentLanguage", "getErrorMessage", "getCompletedModuleCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalModuleCount", "getDocumentTypes", "getCollectionMethods", "getUploadFileTypes", "getInfoModalText", "getUseCaseType", "getDocumentType", "getCurrentVerificationCount", "getTotalVerificationCount", "getTransitionScreenEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrimaryImageConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PrimaryImageConfig;", "getMultiframeConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeConfig;", "getErrorLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorLabels;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PrimaryImageConfig;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeConfig;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleErrorLabels;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "equals", "other", "hashCode", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ModuleConfig {
    public static final int $stable = 8;
    private final List<BodyComponent> bodyComponents;
    private final List<Button> buttons;
    private final List<String> collectionMethods;
    private final Integer completedModuleCount;
    private final String consentLanguage;
    private final String consentVersion;
    private final Integer currentVerificationCount;
    private final String documentType;
    private final List<String> documentTypes;
    private final ModuleErrorLabels errorLabels;
    private final String errorMessage;
    private final String infoModalText;
    private final Labels labels;
    private final MultiframeConfig multiframeConfig;
    private final PrimaryImageConfig primaryImageConfig;
    private final Integer totalModuleCount;
    private final Integer totalVerificationCount;
    private final Boolean transitionScreenEnabled;
    private final List<String> uploadFileTypes;
    private final String useCaseType;

    public /* synthetic */ ModuleConfig(Labels labels, List list, List list2, String str, String str2, String str3, Integer num, Integer num2, List list3, List list4, List list5, String str4, String str5, String str6, Integer num3, Integer num4, Boolean bool, PrimaryImageConfig primaryImageConfig, MultiframeConfig multiframeConfig, ModuleErrorLabels moduleErrorLabels, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : labels, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : list3, (i & Barcode.FORMAT_UPC_A) != 0 ? null : list4, (i & Barcode.FORMAT_UPC_E) != 0 ? null : list5, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : str6, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num3, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : bool, (i & 131072) != 0 ? null : primaryImageConfig, (i & 262144) != 0 ? null : multiframeConfig, (i & 524288) != 0 ? null : moduleErrorLabels);
    }

    public static /* synthetic */ ModuleConfig copy$default(ModuleConfig moduleConfig, Labels labels, List list, List list2, String str, String str2, String str3, Integer num, Integer num2, List list3, List list4, List list5, String str4, String str5, String str6, Integer num3, Integer num4, Boolean bool, PrimaryImageConfig primaryImageConfig, MultiframeConfig multiframeConfig, ModuleErrorLabels moduleErrorLabels, int i, Object obj) {
        Labels labels2;
        List list6;
        List list7;
        String str7;
        String str8;
        String str9;
        Integer num5;
        Integer num6;
        List list8;
        List list9;
        List list10;
        String str10;
        String str11;
        String str12;
        Integer num7;
        Integer num8;
        Boolean bool2;
        PrimaryImageConfig primaryImageConfig2;
        MultiframeConfig multiframeConfig2;
        ModuleErrorLabels moduleErrorLabels2;
        MultiframeConfig multiframeConfig3;
        if ((i & 1) != 0) {
            labels2 = moduleConfig.labels;
        } else {
            labels2 = labels;
        }
        if ((i & 2) != 0) {
            list6 = moduleConfig.buttons;
        } else {
            list6 = list;
        }
        if ((i & 4) != 0) {
            list7 = moduleConfig.bodyComponents;
        } else {
            list7 = list2;
        }
        if ((i & 8) != 0) {
            str7 = moduleConfig.consentVersion;
        } else {
            str7 = str;
        }
        if ((i & 16) != 0) {
            str8 = moduleConfig.consentLanguage;
        } else {
            str8 = str2;
        }
        if ((i & 32) != 0) {
            str9 = moduleConfig.errorMessage;
        } else {
            str9 = str3;
        }
        if ((i & 64) != 0) {
            num5 = moduleConfig.completedModuleCount;
        } else {
            num5 = num;
        }
        if ((i & 128) != 0) {
            num6 = moduleConfig.totalModuleCount;
        } else {
            num6 = num2;
        }
        if ((i & 256) != 0) {
            list8 = moduleConfig.documentTypes;
        } else {
            list8 = list3;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            list9 = moduleConfig.collectionMethods;
        } else {
            list9 = list4;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            list10 = moduleConfig.uploadFileTypes;
        } else {
            list10 = list5;
        }
        if ((i & 2048) != 0) {
            str10 = moduleConfig.infoModalText;
        } else {
            str10 = str4;
        }
        if ((i & 4096) != 0) {
            str11 = moduleConfig.useCaseType;
        } else {
            str11 = str5;
        }
        if ((i & 8192) != 0) {
            str12 = moduleConfig.documentType;
        } else {
            str12 = str6;
        }
        Labels labels3 = labels2;
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            num7 = moduleConfig.currentVerificationCount;
        } else {
            num7 = num3;
        }
        if ((i & 32768) != 0) {
            num8 = moduleConfig.totalVerificationCount;
        } else {
            num8 = num4;
        }
        Integer num9 = num8;
        if ((i & 65536) != 0) {
            bool2 = moduleConfig.transitionScreenEnabled;
        } else {
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if ((i & 131072) != 0) {
            primaryImageConfig2 = moduleConfig.primaryImageConfig;
        } else {
            primaryImageConfig2 = primaryImageConfig;
        }
        PrimaryImageConfig primaryImageConfig3 = primaryImageConfig2;
        if ((i & 262144) != 0) {
            multiframeConfig2 = moduleConfig.multiframeConfig;
        } else {
            multiframeConfig2 = multiframeConfig;
        }
        if ((i & 524288) != 0) {
            multiframeConfig3 = multiframeConfig2;
            moduleErrorLabels2 = moduleConfig.errorLabels;
        } else {
            moduleErrorLabels2 = moduleErrorLabels;
            multiframeConfig3 = multiframeConfig2;
        }
        return moduleConfig.copy(labels3, list6, list7, str7, str8, str9, num5, num6, list8, list9, list10, str10, str11, str12, num7, num9, bool3, primaryImageConfig3, multiframeConfig3, moduleErrorLabels2);
    }

    /* renamed from: component1, reason: from getter */
    public final Labels getLabels() {
        return this.labels;
    }

    public final List<String> component10() {
        return this.collectionMethods;
    }

    public final List<String> component11() {
        return this.uploadFileTypes;
    }

    /* renamed from: component12, reason: from getter */
    public final String getInfoModalText() {
        return this.infoModalText;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUseCaseType() {
        return this.useCaseType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getTransitionScreenEnabled() {
        return this.transitionScreenEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final PrimaryImageConfig getPrimaryImageConfig() {
        return this.primaryImageConfig;
    }

    /* renamed from: component19, reason: from getter */
    public final MultiframeConfig getMultiframeConfig() {
        return this.multiframeConfig;
    }

    public final List<Button> component2() {
        return this.buttons;
    }

    /* renamed from: component20, reason: from getter */
    public final ModuleErrorLabels getErrorLabels() {
        return this.errorLabels;
    }

    public final List<BodyComponent> component3() {
        return this.bodyComponents;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConsentLanguage() {
        return this.consentLanguage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final List<String> component9() {
        return this.documentTypes;
    }

    public final ModuleConfig copy(Labels labels, List<Button> buttons, List<BodyComponent> bodyComponents, String consentVersion, String consentLanguage, String errorMessage, Integer completedModuleCount, Integer totalModuleCount, List<String> documentTypes, List<String> collectionMethods, List<String> uploadFileTypes, String infoModalText, String useCaseType, String documentType, Integer currentVerificationCount, Integer totalVerificationCount, Boolean transitionScreenEnabled, PrimaryImageConfig primaryImageConfig, MultiframeConfig multiframeConfig, ModuleErrorLabels errorLabels) {
        return new ModuleConfig(labels, buttons, bodyComponents, consentVersion, consentLanguage, errorMessage, completedModuleCount, totalModuleCount, documentTypes, collectionMethods, uploadFileTypes, infoModalText, useCaseType, documentType, currentVerificationCount, totalVerificationCount, transitionScreenEnabled, primaryImageConfig, multiframeConfig, errorLabels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleConfig)) {
            return false;
        }
        ModuleConfig moduleConfig = (ModuleConfig) other;
        if (Intrinsics.areEqual(this.labels, moduleConfig.labels) && Intrinsics.areEqual(this.buttons, moduleConfig.buttons) && Intrinsics.areEqual(this.bodyComponents, moduleConfig.bodyComponents) && Intrinsics.areEqual(this.consentVersion, moduleConfig.consentVersion) && Intrinsics.areEqual(this.consentLanguage, moduleConfig.consentLanguage) && Intrinsics.areEqual(this.errorMessage, moduleConfig.errorMessage) && Intrinsics.areEqual(this.completedModuleCount, moduleConfig.completedModuleCount) && Intrinsics.areEqual(this.totalModuleCount, moduleConfig.totalModuleCount) && Intrinsics.areEqual(this.documentTypes, moduleConfig.documentTypes) && Intrinsics.areEqual(this.collectionMethods, moduleConfig.collectionMethods) && Intrinsics.areEqual(this.uploadFileTypes, moduleConfig.uploadFileTypes) && Intrinsics.areEqual(this.infoModalText, moduleConfig.infoModalText) && Intrinsics.areEqual(this.useCaseType, moduleConfig.useCaseType) && Intrinsics.areEqual(this.documentType, moduleConfig.documentType) && Intrinsics.areEqual(this.currentVerificationCount, moduleConfig.currentVerificationCount) && Intrinsics.areEqual(this.totalVerificationCount, moduleConfig.totalVerificationCount) && Intrinsics.areEqual(this.transitionScreenEnabled, moduleConfig.transitionScreenEnabled) && Intrinsics.areEqual(this.primaryImageConfig, moduleConfig.primaryImageConfig) && Intrinsics.areEqual(this.multiframeConfig, moduleConfig.multiframeConfig) && Intrinsics.areEqual(this.errorLabels, moduleConfig.errorLabels)) {
            return true;
        }
        return false;
    }

    public final List<BodyComponent> getBodyComponents() {
        return this.bodyComponents;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final List<String> getCollectionMethods() {
        return this.collectionMethods;
    }

    public final Integer getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final String getConsentLanguage() {
        return this.consentLanguage;
    }

    public final String getConsentVersion() {
        return this.consentVersion;
    }

    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final List<String> getDocumentTypes() {
        return this.documentTypes;
    }

    public final ModuleErrorLabels getErrorLabels() {
        return this.errorLabels;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getInfoModalText() {
        return this.infoModalText;
    }

    public final Labels getLabels() {
        return this.labels;
    }

    public final MultiframeConfig getMultiframeConfig() {
        return this.multiframeConfig;
    }

    public final PrimaryImageConfig getPrimaryImageConfig() {
        return this.primaryImageConfig;
    }

    public final Integer getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    public final Boolean getTransitionScreenEnabled() {
        return this.transitionScreenEnabled;
    }

    public final List<String> getUploadFileTypes() {
        return this.uploadFileTypes;
    }

    public final String getUseCaseType() {
        return this.useCaseType;
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
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        Labels labels = this.labels;
        int i = 0;
        if (labels == null) {
            hashCode = 0;
        } else {
            hashCode = labels.hashCode();
        }
        int i2 = hashCode * 31;
        List<Button> list = this.buttons;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<BodyComponent> list2 = this.bodyComponents;
        if (list2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.consentVersion;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.consentLanguage;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str3 = this.errorMessage;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Integer num = this.completedModuleCount;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Integer num2 = this.totalModuleCount;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        List<String> list3 = this.documentTypes;
        if (list3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list3.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List<String> list4 = this.collectionMethods;
        if (list4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list4.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        List<String> list5 = this.uploadFileTypes;
        if (list5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list5.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str4 = this.infoModalText;
        if (str4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str4.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        String str5 = this.useCaseType;
        if (str5 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str5.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        String str6 = this.documentType;
        if (str6 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str6.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        Integer num3 = this.currentVerificationCount;
        if (num3 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num3.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        Integer num4 = this.totalVerificationCount;
        if (num4 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num4.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        Boolean bool = this.transitionScreenEnabled;
        if (bool == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = bool.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        PrimaryImageConfig primaryImageConfig = this.primaryImageConfig;
        if (primaryImageConfig == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = primaryImageConfig.hashCode();
        }
        int i19 = (i18 + hashCode18) * 31;
        MultiframeConfig multiframeConfig = this.multiframeConfig;
        if (multiframeConfig == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = multiframeConfig.hashCode();
        }
        int i20 = (i19 + hashCode19) * 31;
        ModuleErrorLabels moduleErrorLabels = this.errorLabels;
        if (moduleErrorLabels != null) {
            i = moduleErrorLabels.hashCode();
        }
        return i20 + i;
    }

    public String toString() {
        Labels labels = this.labels;
        List<Button> list = this.buttons;
        List<BodyComponent> list2 = this.bodyComponents;
        String str = this.consentVersion;
        String str2 = this.consentLanguage;
        String str3 = this.errorMessage;
        Integer num = this.completedModuleCount;
        Integer num2 = this.totalModuleCount;
        List<String> list3 = this.documentTypes;
        List<String> list4 = this.collectionMethods;
        List<String> list5 = this.uploadFileTypes;
        String str4 = this.infoModalText;
        String str5 = this.useCaseType;
        String str6 = this.documentType;
        Integer num3 = this.currentVerificationCount;
        Integer num4 = this.totalVerificationCount;
        Boolean bool = this.transitionScreenEnabled;
        PrimaryImageConfig primaryImageConfig = this.primaryImageConfig;
        MultiframeConfig multiframeConfig = this.multiframeConfig;
        ModuleErrorLabels moduleErrorLabels = this.errorLabels;
        StringBuilder sb = new StringBuilder("ModuleConfig(labels=");
        sb.append(labels);
        sb.append(", buttons=");
        sb.append(list);
        sb.append(", bodyComponents=");
        sb.append(list2);
        sb.append(", consentVersion=");
        sb.append(str);
        sb.append(", consentLanguage=");
        k84.q(sb, str2, ", errorMessage=", str3, ", completedModuleCount=");
        sv6.z(sb, num, ", totalModuleCount=", num2, ", documentTypes=");
        ace.D(sb, list3, ", collectionMethods=", list4, ", uploadFileTypes=");
        sb.append(list5);
        sb.append(", infoModalText=");
        sb.append(str4);
        sb.append(", useCaseType=");
        k84.q(sb, str5, ", documentType=", str6, ", currentVerificationCount=");
        sv6.z(sb, num3, ", totalVerificationCount=", num4, ", transitionScreenEnabled=");
        sb.append(bool);
        sb.append(", primaryImageConfig=");
        sb.append(primaryImageConfig);
        sb.append(", multiframeConfig=");
        sb.append(multiframeConfig);
        sb.append(", errorLabels=");
        sb.append(moduleErrorLabels);
        sb.append(")");
        return sb.toString();
    }

    public ModuleConfig(Labels labels, List<Button> list, List<BodyComponent> list2, String str, String str2, String str3, Integer num, Integer num2, List<String> list3, List<String> list4, List<String> list5, String str4, String str5, String str6, Integer num3, Integer num4, Boolean bool, PrimaryImageConfig primaryImageConfig, MultiframeConfig multiframeConfig, ModuleErrorLabels moduleErrorLabels) {
        this.labels = labels;
        this.buttons = list;
        this.bodyComponents = list2;
        this.consentVersion = str;
        this.consentLanguage = str2;
        this.errorMessage = str3;
        this.completedModuleCount = num;
        this.totalModuleCount = num2;
        this.documentTypes = list3;
        this.collectionMethods = list4;
        this.uploadFileTypes = list5;
        this.infoModalText = str4;
        this.useCaseType = str5;
        this.documentType = str6;
        this.currentVerificationCount = num3;
        this.totalVerificationCount = num4;
        this.transitionScreenEnabled = bool;
        this.primaryImageConfig = primaryImageConfig;
        this.multiframeConfig = multiframeConfig;
        this.errorLabels = moduleErrorLabels;
    }

    public ModuleConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }
}
