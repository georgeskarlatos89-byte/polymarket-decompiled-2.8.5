package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleData;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0000\u001a*\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0000\u001a\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0000\u001a*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0000\u001a*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0000\u001a*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0000\u001a\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"CAPTURE_DELTA", "", "CAPTURE_ENGINE", "createSelfieModuleRequest", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleSubmissionRequest;", "moduleId", "moduleVersion", "multiframeImages", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeImage;", "createSelfieAutoCaptureModuleRequest", "createConsentModuleRequest", "consentStatus", "createIdTypeSelectionModuleRequest", "cardType", "createFrontModuleRequest", "createPassportModuleRequest", "createBackModuleRequest", "createUnstructuredDocModuleRequest", "createSecondaryDocModuleRequest", "collectionMethod", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModuleRequestExtKt {
    public static final String CAPTURE_DELTA = "1";
    public static final String CAPTURE_ENGINE = "100";

    public static final ModuleSubmissionRequest createBackModuleRequest(String str, String str2, List<MultiframeImage> list) {
        str.getClass();
        str2.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_BACK, str2, str, new ModuleData.Scan(CAPTURE_DELTA, CAPTURE_ENGINE, list));
    }

    public static /* synthetic */ ModuleSubmissionRequest createBackModuleRequest$default(String str, String str2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createBackModuleRequest(str, str2, list);
    }

    public static final ModuleSubmissionRequest createConsentModuleRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_CONSENT, str2, str, new ModuleData.Consent(str3));
    }

    public static /* synthetic */ ModuleSubmissionRequest createConsentModuleRequest$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createConsentModuleRequest(str, str2, str3);
    }

    public static final ModuleSubmissionRequest createFrontModuleRequest(String str, String str2, List<MultiframeImage> list) {
        str.getClass();
        str2.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_FRONT, str2, str, new ModuleData.Scan(CAPTURE_DELTA, CAPTURE_ENGINE, list));
    }

    public static /* synthetic */ ModuleSubmissionRequest createFrontModuleRequest$default(String str, String str2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createFrontModuleRequest(str, str2, list);
    }

    public static final ModuleSubmissionRequest createIdTypeSelectionModuleRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_ID_TYPE_SELECTION, str2, str, new ModuleData.IDSelection(str3));
    }

    public static /* synthetic */ ModuleSubmissionRequest createIdTypeSelectionModuleRequest$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createIdTypeSelectionModuleRequest(str, str2, str3);
    }

    public static final ModuleSubmissionRequest createPassportModuleRequest(String str, String str2, List<MultiframeImage> list) {
        str.getClass();
        str2.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_PASSPORT, str2, str, new ModuleData.Scan(CAPTURE_DELTA, CAPTURE_ENGINE, list));
    }

    public static /* synthetic */ ModuleSubmissionRequest createPassportModuleRequest$default(String str, String str2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createPassportModuleRequest(str, str2, list);
    }

    public static final ModuleSubmissionRequest createSecondaryDocModuleRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new ModuleSubmissionRequest("SecondaryDocumentUpload", str2, str, new ModuleData.CollectionMethod(str3));
    }

    public static /* synthetic */ ModuleSubmissionRequest createSecondaryDocModuleRequest$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createSecondaryDocModuleRequest(str, str2, str3);
    }

    public static final ModuleSubmissionRequest createSelfieAutoCaptureModuleRequest(String str, String str2, List<MultiframeImage> list) {
        str.getClass();
        str2.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_SELFIE_AUTOCAPTURE, str2, str, new ModuleData.Scan(CAPTURE_DELTA, CAPTURE_ENGINE, list));
    }

    public static /* synthetic */ ModuleSubmissionRequest createSelfieAutoCaptureModuleRequest$default(String str, String str2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createSelfieAutoCaptureModuleRequest(str, str2, list);
    }

    public static final ModuleSubmissionRequest createSelfieModuleRequest(String str, String str2, List<MultiframeImage> list) {
        str.getClass();
        str2.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_SELFIE, str2, str, new ModuleData.Scan(CAPTURE_DELTA, CAPTURE_ENGINE, list));
    }

    public static /* synthetic */ ModuleSubmissionRequest createSelfieModuleRequest$default(String str, String str2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createSelfieModuleRequest(str, str2, list);
    }

    public static final ModuleSubmissionRequest createUnstructuredDocModuleRequest(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_UNSTRUCTURED, str2, str, null, 8, null);
    }

    public static /* synthetic */ ModuleSubmissionRequest createUnstructuredDocModuleRequest$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ApiConstant.DEFAULT_MODULE_VERSION;
        }
        return createUnstructuredDocModuleRequest(str, str2);
    }
}
