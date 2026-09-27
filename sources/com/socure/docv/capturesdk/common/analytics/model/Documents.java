package com.socure.docv.capturesdk.common.analytics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Documents;", "", "documentBack", "Lcom/socure/docv/capturesdk/common/analytics/model/Document;", "documentFront", "selfPortrait", "<init>", "(Lcom/socure/docv/capturesdk/common/analytics/model/Document;Lcom/socure/docv/capturesdk/common/analytics/model/Document;Lcom/socure/docv/capturesdk/common/analytics/model/Document;)V", "getDocumentBack", "()Lcom/socure/docv/capturesdk/common/analytics/model/Document;", "setDocumentBack", "(Lcom/socure/docv/capturesdk/common/analytics/model/Document;)V", "getDocumentFront", "setDocumentFront", "getSelfPortrait", "setSelfPortrait", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Documents {
    public static final int $stable = 8;
    private Document documentBack;
    private Document documentFront;
    private Document selfPortrait;

    public /* synthetic */ Documents(Document document, Document document2, Document document3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : document, (i & 2) != 0 ? null : document2, (i & 4) != 0 ? null : document3);
    }

    public static /* synthetic */ Documents copy$default(Documents documents, Document document, Document document2, Document document3, int i, Object obj) {
        if ((i & 1) != 0) {
            document = documents.documentBack;
        }
        if ((i & 2) != 0) {
            document2 = documents.documentFront;
        }
        if ((i & 4) != 0) {
            document3 = documents.selfPortrait;
        }
        return documents.copy(document, document2, document3);
    }

    /* renamed from: component1, reason: from getter */
    public final Document getDocumentBack() {
        return this.documentBack;
    }

    /* renamed from: component2, reason: from getter */
    public final Document getDocumentFront() {
        return this.documentFront;
    }

    /* renamed from: component3, reason: from getter */
    public final Document getSelfPortrait() {
        return this.selfPortrait;
    }

    public final Documents copy(Document documentBack, Document documentFront, Document selfPortrait) {
        return new Documents(documentBack, documentFront, selfPortrait);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Documents)) {
            return false;
        }
        Documents documents = (Documents) other;
        if (Intrinsics.areEqual(this.documentBack, documents.documentBack) && Intrinsics.areEqual(this.documentFront, documents.documentFront) && Intrinsics.areEqual(this.selfPortrait, documents.selfPortrait)) {
            return true;
        }
        return false;
    }

    public final Document getDocumentBack() {
        return this.documentBack;
    }

    public final Document getDocumentFront() {
        return this.documentFront;
    }

    public final Document getSelfPortrait() {
        return this.selfPortrait;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Document document = this.documentBack;
        int i = 0;
        if (document == null) {
            hashCode = 0;
        } else {
            hashCode = document.hashCode();
        }
        int i2 = hashCode * 31;
        Document document2 = this.documentFront;
        if (document2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = document2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Document document3 = this.selfPortrait;
        if (document3 != null) {
            i = document3.hashCode();
        }
        return i3 + i;
    }

    public final void setDocumentBack(Document document) {
        this.documentBack = document;
    }

    public final void setDocumentFront(Document document) {
        this.documentFront = document;
    }

    public final void setSelfPortrait(Document document) {
        this.selfPortrait = document;
    }

    public String toString() {
        return "Documents(documentBack=" + this.documentBack + ", documentFront=" + this.documentFront + ", selfPortrait=" + this.selfPortrait + ")";
    }

    public Documents(Document document, Document document2, Document document3) {
        this.documentBack = document;
        this.documentFront = document2;
        this.selfPortrait = document3;
    }

    public Documents() {
        this(null, null, null, 7, null);
    }
}
