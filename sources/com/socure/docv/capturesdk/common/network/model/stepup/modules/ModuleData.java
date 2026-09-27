package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.api.a;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ix2;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "", "<init>", "()V", "IDSelection", ApiConstant.MODULE_TYPE_CONSENT, "Scan", "CollectionMethod", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$CollectionMethod;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Consent;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$IDSelection;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Scan;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ModuleData {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$CollectionMethod;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "collectionMethod", "", "<init>", "(Ljava/lang/String;)V", "getCollectionMethod", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
    /* loaded from: classes5.dex */
    public static final /* data */ class CollectionMethod extends ModuleData {
        public static final int $stable = 0;
        private final String collectionMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionMethod(String str) {
            super(null);
            str.getClass();
            this.collectionMethod = str;
        }

        public static /* synthetic */ CollectionMethod copy$default(CollectionMethod collectionMethod, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = collectionMethod.collectionMethod;
            }
            return collectionMethod.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCollectionMethod() {
            return this.collectionMethod;
        }

        public final CollectionMethod copy(String collectionMethod) {
            collectionMethod.getClass();
            return new CollectionMethod(collectionMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof CollectionMethod) && Intrinsics.areEqual(this.collectionMethod, ((CollectionMethod) other).collectionMethod)) {
                return true;
            }
            return false;
        }

        public final String getCollectionMethod() {
            return this.collectionMethod;
        }

        public int hashCode() {
            return this.collectionMethod.hashCode();
        }

        public String toString() {
            return sv6.n("CollectionMethod(collectionMethod=", this.collectionMethod, ")");
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Consent;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "consentStatus", "", "<init>", "(Ljava/lang/String;)V", "getConsentStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
    /* loaded from: classes5.dex */
    public static final /* data */ class Consent extends ModuleData {
        public static final int $stable = 0;
        private final String consentStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Consent(String str) {
            super(null);
            str.getClass();
            this.consentStatus = str;
        }

        public static /* synthetic */ Consent copy$default(Consent consent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = consent.consentStatus;
            }
            return consent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final Consent copy(String consentStatus) {
            consentStatus.getClass();
            return new Consent(consentStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Consent) && Intrinsics.areEqual(this.consentStatus, ((Consent) other).consentStatus)) {
                return true;
            }
            return false;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public int hashCode() {
            return this.consentStatus.hashCode();
        }

        public String toString() {
            return sv6.n("Consent(consentStatus=", this.consentStatus, ")");
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$IDSelection;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "idType", "", "<init>", "(Ljava/lang/String;)V", "getIdType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
    /* loaded from: classes5.dex */
    public static final /* data */ class IDSelection extends ModuleData {
        public static final int $stable = 0;
        private final String idType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IDSelection(String str) {
            super(null);
            str.getClass();
            this.idType = str;
        }

        public static /* synthetic */ IDSelection copy$default(IDSelection iDSelection, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iDSelection.idType;
            }
            return iDSelection.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdType() {
            return this.idType;
        }

        public final IDSelection copy(String idType) {
            idType.getClass();
            return new IDSelection(idType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof IDSelection) && Intrinsics.areEqual(this.idType, ((IDSelection) other).idType)) {
                return true;
            }
            return false;
        }

        public final String getIdType() {
            return this.idType;
        }

        public int hashCode() {
            return this.idType.hashCode();
        }

        public String toString() {
            return sv6.n("IDSelection(idType=", this.idType, ")");
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData$Scan;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "captureDelta", "", "captureEngine", "multiframeImages", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeImage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCaptureDelta", "()Ljava/lang/String;", "getCaptureEngine", "getMultiframeImages", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
    /* loaded from: classes5.dex */
    public static final /* data */ class Scan extends ModuleData {
        public static final int $stable = 8;
        private final String captureDelta;
        private final String captureEngine;
        private final List<MultiframeImage> multiframeImages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Scan(String str, String str2, List<MultiframeImage> list) {
            super(null);
            str.getClass();
            str2.getClass();
            this.captureDelta = str;
            this.captureEngine = str2;
            this.multiframeImages = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Scan copy$default(Scan scan, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scan.captureDelta;
            }
            if ((i & 2) != 0) {
                str2 = scan.captureEngine;
            }
            if ((i & 4) != 0) {
                list = scan.multiframeImages;
            }
            return scan.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCaptureDelta() {
            return this.captureDelta;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCaptureEngine() {
            return this.captureEngine;
        }

        public final List<MultiframeImage> component3() {
            return this.multiframeImages;
        }

        public final Scan copy(String captureDelta, String captureEngine, List<MultiframeImage> multiframeImages) {
            captureDelta.getClass();
            captureEngine.getClass();
            return new Scan(captureDelta, captureEngine, multiframeImages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Scan)) {
                return false;
            }
            Scan scan = (Scan) other;
            if (Intrinsics.areEqual(this.captureDelta, scan.captureDelta) && Intrinsics.areEqual(this.captureEngine, scan.captureEngine) && Intrinsics.areEqual(this.multiframeImages, scan.multiframeImages)) {
                return true;
            }
            return false;
        }

        public final String getCaptureDelta() {
            return this.captureDelta;
        }

        public final String getCaptureEngine() {
            return this.captureEngine;
        }

        public final List<MultiframeImage> getMultiframeImages() {
            return this.multiframeImages;
        }

        public int hashCode() {
            int hashCode;
            int a = a.a(this.captureEngine, this.captureDelta.hashCode() * 31, 31);
            List<MultiframeImage> list = this.multiframeImages;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return a + hashCode;
        }

        public String toString() {
            String str = this.captureDelta;
            String str2 = this.captureEngine;
            return ix2.q(m51.r("Scan(captureDelta=", str, ", captureEngine=", str2, ", multiframeImages="), this.multiframeImages, ")");
        }
    }

    public /* synthetic */ ModuleData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ModuleData() {
    }
}
