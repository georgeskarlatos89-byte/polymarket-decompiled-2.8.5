package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.GlobalConfig;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e {
    public final GlobalConfig a;
    public final String b;

    public e(GlobalConfig globalConfig, String str) {
        this.a = globalConfig;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        GlobalConfig globalConfig = this.a;
        if (globalConfig == null) {
            hashCode = 0;
        } else {
            hashCode = globalConfig.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "GlobalConfigMapperInput(config=" + this.a + ", eventId=" + this.b + ")";
    }
}
