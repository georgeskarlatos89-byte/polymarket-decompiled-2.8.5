package com.socure.docv.capturesdk.common.analytics.model;

import defpackage.woa;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/MetricData;", "", "documents", "Lcom/socure/docv/capturesdk/common/analytics/model/Documents;", "devices", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/CameraDevice;", "Lkotlin/collections/ArrayList;", "userAgent", "", "<init>", "(Lcom/socure/docv/capturesdk/common/analytics/model/Documents;Ljava/util/ArrayList;Ljava/lang/String;)V", "getDocuments", "()Lcom/socure/docv/capturesdk/common/analytics/model/Documents;", "setDocuments", "(Lcom/socure/docv/capturesdk/common/analytics/model/Documents;)V", "getDevices", "()Ljava/util/ArrayList;", "setDevices", "(Ljava/util/ArrayList;)V", "getUserAgent", "()Ljava/lang/String;", "setUserAgent", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricData {
    public static final int $stable = 8;
    private ArrayList<CameraDevice> devices;
    private Documents documents;
    private String userAgent;

    public /* synthetic */ MetricData(Documents documents, ArrayList arrayList, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : documents, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MetricData copy$default(MetricData metricData, Documents documents, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            documents = metricData.documents;
        }
        if ((i & 2) != 0) {
            arrayList = metricData.devices;
        }
        if ((i & 4) != 0) {
            str = metricData.userAgent;
        }
        return metricData.copy(documents, arrayList, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Documents getDocuments() {
        return this.documents;
    }

    public final ArrayList<CameraDevice> component2() {
        return this.devices;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    public final MetricData copy(Documents documents, ArrayList<CameraDevice> devices, String userAgent) {
        devices.getClass();
        return new MetricData(documents, devices, userAgent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricData)) {
            return false;
        }
        MetricData metricData = (MetricData) other;
        if (Intrinsics.areEqual(this.documents, metricData.documents) && Intrinsics.areEqual(this.devices, metricData.devices) && Intrinsics.areEqual(this.userAgent, metricData.userAgent)) {
            return true;
        }
        return false;
    }

    public final ArrayList<CameraDevice> getDevices() {
        return this.devices;
    }

    public final Documents getDocuments() {
        return this.documents;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int hashCode;
        Documents documents = this.documents;
        int i = 0;
        if (documents == null) {
            hashCode = 0;
        } else {
            hashCode = documents.hashCode();
        }
        int hashCode2 = (this.devices.hashCode() + (hashCode * 31)) * 31;
        String str = this.userAgent;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setDevices(ArrayList<CameraDevice> arrayList) {
        arrayList.getClass();
        this.devices = arrayList;
    }

    public final void setDocuments(Documents documents) {
        this.documents = documents;
    }

    public final void setUserAgent(String str) {
        this.userAgent = str;
    }

    public String toString() {
        Documents documents = this.documents;
        ArrayList<CameraDevice> arrayList = this.devices;
        String str = this.userAgent;
        StringBuilder sb = new StringBuilder("MetricData(documents=");
        sb.append(documents);
        sb.append(", devices=");
        sb.append(arrayList);
        sb.append(", userAgent=");
        return woa.r(sb, str, ")");
    }

    public MetricData(Documents documents, ArrayList<CameraDevice> arrayList, String str) {
        arrayList.getClass();
        this.documents = documents;
        this.devices = arrayList;
        this.userAgent = str;
    }

    public MetricData() {
        this(null, null, null, 7, null);
    }
}
