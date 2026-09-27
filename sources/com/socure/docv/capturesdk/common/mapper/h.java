package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfig;
import defpackage.sv6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h {
    public final ModuleConfig a;
    public final String b;
    public final String c;
    public final String d;

    public h(ModuleConfig moduleConfig, String str, String str2, String str3) {
        str.getClass();
        this.a = moduleConfig;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (!Intrinsics.areEqual(this.a, hVar.a) || !Intrinsics.areEqual(this.b, hVar.b) || !Intrinsics.areEqual(this.c, hVar.c) || !Intrinsics.areEqual(this.d, hVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = com.socure.docv.capturesdk.api.a.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + ((a + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModuleMapperInput(config=");
        sb.append(this.a);
        sb.append(", moduleId=");
        sb.append(this.b);
        sb.append(", sessionToken=");
        return sv6.p(sb, this.c, ", moduleType=", this.d, ")");
    }
}
