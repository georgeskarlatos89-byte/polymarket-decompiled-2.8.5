package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;", "", "moduleType", "", "moduleId", "moduleConfig", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;)V", "getModuleType", "()Ljava/lang/String;", "getModuleId", "getModuleConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ModuleResponse {
    public static final int $stable = 8;
    private final ModuleConfig moduleConfig;
    private final String moduleId;
    private final String moduleType;

    public ModuleResponse(String str, String str2, ModuleConfig moduleConfig) {
        this.moduleType = str;
        this.moduleId = str2;
        this.moduleConfig = moduleConfig;
    }

    public static /* synthetic */ ModuleResponse copy$default(ModuleResponse moduleResponse, String str, String str2, ModuleConfig moduleConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleResponse.moduleType;
        }
        if ((i & 2) != 0) {
            str2 = moduleResponse.moduleId;
        }
        if ((i & 4) != 0) {
            moduleConfig = moduleResponse.moduleConfig;
        }
        return moduleResponse.copy(str, str2, moduleConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* renamed from: component3, reason: from getter */
    public final ModuleConfig getModuleConfig() {
        return this.moduleConfig;
    }

    public final ModuleResponse copy(String moduleType, String moduleId, ModuleConfig moduleConfig) {
        return new ModuleResponse(moduleType, moduleId, moduleConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleResponse)) {
            return false;
        }
        ModuleResponse moduleResponse = (ModuleResponse) other;
        if (Intrinsics.areEqual(this.moduleType, moduleResponse.moduleType) && Intrinsics.areEqual(this.moduleId, moduleResponse.moduleId) && Intrinsics.areEqual(this.moduleConfig, moduleResponse.moduleConfig)) {
            return true;
        }
        return false;
    }

    public final ModuleConfig getModuleConfig() {
        return this.moduleConfig;
    }

    public final String getModuleId() {
        return this.moduleId;
    }

    public final String getModuleType() {
        return this.moduleType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.moduleType;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.moduleId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ModuleConfig moduleConfig = this.moduleConfig;
        if (moduleConfig != null) {
            i = moduleConfig.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.moduleType;
        String str2 = this.moduleId;
        ModuleConfig moduleConfig = this.moduleConfig;
        StringBuilder r = m51.r("ModuleResponse(moduleType=", str, ", moduleId=", str2, ", moduleConfig=");
        r.append(moduleConfig);
        r.append(")");
        return r.toString();
    }
}
