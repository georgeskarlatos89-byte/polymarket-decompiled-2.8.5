package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/DocumentUploadCounter;", "", "documentUploadCounter", "", "<init>", "(Ljava/lang/String;)V", "getDocumentUploadCounter", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class DocumentUploadCounter {
    public static final int $stable = 0;
    private final String documentUploadCounter;

    public DocumentUploadCounter(String str) {
        this.documentUploadCounter = str;
    }

    public static /* synthetic */ DocumentUploadCounter copy$default(DocumentUploadCounter documentUploadCounter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = documentUploadCounter.documentUploadCounter;
        }
        return documentUploadCounter.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentUploadCounter() {
        return this.documentUploadCounter;
    }

    public final DocumentUploadCounter copy(String documentUploadCounter) {
        return new DocumentUploadCounter(documentUploadCounter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof DocumentUploadCounter) && Intrinsics.areEqual(this.documentUploadCounter, ((DocumentUploadCounter) other).documentUploadCounter)) {
            return true;
        }
        return false;
    }

    public final String getDocumentUploadCounter() {
        return this.documentUploadCounter;
    }

    public int hashCode() {
        String str = this.documentUploadCounter;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return sv6.n("DocumentUploadCounter(documentUploadCounter=", this.documentUploadCounter, ")");
    }
}
