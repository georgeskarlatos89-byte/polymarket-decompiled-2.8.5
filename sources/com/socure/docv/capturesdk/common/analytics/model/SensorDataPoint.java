package com.socure.docv.capturesdk.common.analytics.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/SensorDataPoint;", "", ApiConstant.KEY_DATA, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "timestamp", "", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getTimestamp", "()Ljava/lang/String;", "setTimestamp", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SensorDataPoint {
    public static final int $stable = 8;
    private ArrayList<Float> data;
    private String timestamp;

    public /* synthetic */ SensorDataPoint(ArrayList arrayList, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SensorDataPoint copy$default(SensorDataPoint sensorDataPoint, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = sensorDataPoint.data;
        }
        if ((i & 2) != 0) {
            str = sensorDataPoint.timestamp;
        }
        return sensorDataPoint.copy(arrayList, str);
    }

    public final ArrayList<Float> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final SensorDataPoint copy(ArrayList<Float> data, String timestamp) {
        return new SensorDataPoint(data, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorDataPoint)) {
            return false;
        }
        SensorDataPoint sensorDataPoint = (SensorDataPoint) other;
        if (Intrinsics.areEqual(this.data, sensorDataPoint.data) && Intrinsics.areEqual(this.timestamp, sensorDataPoint.timestamp)) {
            return true;
        }
        return false;
    }

    public final ArrayList<Float> getData() {
        return this.data;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode;
        ArrayList<Float> arrayList = this.data;
        int i = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.timestamp;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final void setData(ArrayList<Float> arrayList) {
        this.data = arrayList;
    }

    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String toString() {
        return "SensorDataPoint(data=" + this.data + ", timestamp=" + this.timestamp + ")";
    }

    public SensorDataPoint(ArrayList<Float> arrayList, String str) {
        this.data = arrayList;
        this.timestamp = str;
    }

    public SensorDataPoint() {
        this(null, null, 3, null);
    }
}
