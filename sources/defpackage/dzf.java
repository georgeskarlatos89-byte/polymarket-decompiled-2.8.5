package defpackage;

import io.radar.sdk.RadarUtils;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dzf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public dzf(String str, String str2, String str3, String str4, String str5, String str6) {
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dzf) {
                dzf dzfVar = (dzf) obj;
                if (!Intrinsics.areEqual("com.checkout.risk", "com.checkout.risk") || !Intrinsics.areEqual("1.0.1", "1.0.1") || !Intrinsics.areEqual(this.a, dzfVar.a) || !Intrinsics.areEqual(this.b, dzfVar.b) || !Intrinsics.areEqual(this.c, dzfVar.c) || !Intrinsics.areEqual(this.d, dzfVar.d) || !Intrinsics.areEqual(this.e, dzfVar.e) || !Intrinsics.areEqual(RadarUtils.deviceType, RadarUtils.deviceType) || !Intrinsics.areEqual(this.f, dzfVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (((1691629770 * 31) + 46670518) * 31)) * 31)) * 31)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.f.hashCode() + ((((this.e.hashCode() + ((hashCode + i) * 31)) * 31) + 803262031) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteProcessorMetadata(productIdentifier=com.checkout.risk, productVersion=1.0.1, environment=");
        sb.append(this.a);
        sb.append(", appPackageName=");
        sb.append(this.b);
        sb.append(", appPackageVersion=");
        sb.append(this.c);
        sb.append(", appInstallId=");
        sb.append(this.d);
        sb.append(", deviceName=");
        sb.append(this.e);
        sb.append(", platform=Android, osVersion=");
        return woa.r(sb, this.f, ")");
    }
}
