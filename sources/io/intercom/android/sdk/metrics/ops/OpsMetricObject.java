package io.intercom.android.sdk.metrics.ops;

import defpackage.hdi;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class OpsMetricObject {
    private final String id;
    private final String name;
    private final String type;
    private final long value;

    public OpsMetricObject(String str, String str2, long j, String str3) {
        this.type = str;
        this.name = str2;
        this.value = j;
        this.id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsMetricObject opsMetricObject = (OpsMetricObject) obj;
        if (this.value != opsMetricObject.value || !this.type.equals(opsMetricObject.type) || !this.name.equals(opsMetricObject.name)) {
            return false;
        }
        return this.id.equals(opsMetricObject.id);
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        int e = hdi.e(this.type.hashCode() * 31, 31, this.name);
        long j = this.value;
        return this.id.hashCode() + ((e + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpsMetricObject{type='");
        sb.append(this.type);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', value=");
        sb.append(this.value);
        sb.append(", id='");
        return woa.r(sb, this.id, "'}");
    }
}
