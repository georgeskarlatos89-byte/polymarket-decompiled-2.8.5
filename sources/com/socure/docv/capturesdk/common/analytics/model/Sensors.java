package com.socure.docv.capturesdk.common.analytics.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003Jm\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;", "", "version", "", "acc", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/SensorDataPoint;", "Lkotlin/collections/ArrayList;", "gyro", "mag", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getVersion", "()Ljava/lang/String;", "getAcc", "()Ljava/util/ArrayList;", "getGyro", "getMag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Sensors {
    public static final int $stable = 8;
    private final ArrayList<SensorDataPoint> acc;
    private final ArrayList<SensorDataPoint> gyro;
    private final ArrayList<SensorDataPoint> mag;
    private final String version;

    public /* synthetic */ Sensors(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : arrayList2, (i & 8) != 0 ? null : arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sensors copy$default(Sensors sensors, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sensors.version;
        }
        if ((i & 2) != 0) {
            arrayList = sensors.acc;
        }
        if ((i & 4) != 0) {
            arrayList2 = sensors.gyro;
        }
        if ((i & 8) != 0) {
            arrayList3 = sensors.mag;
        }
        return sensors.copy(str, arrayList, arrayList2, arrayList3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final ArrayList<SensorDataPoint> component2() {
        return this.acc;
    }

    public final ArrayList<SensorDataPoint> component3() {
        return this.gyro;
    }

    public final ArrayList<SensorDataPoint> component4() {
        return this.mag;
    }

    public final Sensors copy(String version, ArrayList<SensorDataPoint> acc, ArrayList<SensorDataPoint> gyro, ArrayList<SensorDataPoint> mag) {
        version.getClass();
        return new Sensors(version, acc, gyro, mag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sensors)) {
            return false;
        }
        Sensors sensors = (Sensors) other;
        if (Intrinsics.areEqual(this.version, sensors.version) && Intrinsics.areEqual(this.acc, sensors.acc) && Intrinsics.areEqual(this.gyro, sensors.gyro) && Intrinsics.areEqual(this.mag, sensors.mag)) {
            return true;
        }
        return false;
    }

    public final ArrayList<SensorDataPoint> getAcc() {
        return this.acc;
    }

    public final ArrayList<SensorDataPoint> getGyro() {
        return this.gyro;
    }

    public final ArrayList<SensorDataPoint> getMag() {
        return this.mag;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.version.hashCode() * 31;
        ArrayList<SensorDataPoint> arrayList = this.acc;
        int i = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        ArrayList<SensorDataPoint> arrayList2 = this.gyro;
        if (arrayList2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arrayList2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ArrayList<SensorDataPoint> arrayList3 = this.mag;
        if (arrayList3 != null) {
            i = arrayList3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "Sensors(version=" + this.version + ", acc=" + this.acc + ", gyro=" + this.gyro + ", mag=" + this.mag + ")";
    }

    public Sensors(String str, ArrayList<SensorDataPoint> arrayList, ArrayList<SensorDataPoint> arrayList2, ArrayList<SensorDataPoint> arrayList3) {
        str.getClass();
        this.version = str;
        this.acc = arrayList;
        this.gyro = arrayList2;
        this.mag = arrayList3;
    }
}
