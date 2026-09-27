package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.fingerprintjs.android.fpjs_pro.g;
import com.socure.docv.capturesdk.api.a;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleSubmissionRequest;", "", "moduleType", "", "moduleVersion", "moduleId", "moduleData", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;)V", "getModuleType", "()Ljava/lang/String;", "getModuleVersion", "getModuleId", "getModuleData", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ModuleSubmissionRequest {
    public static final int $stable = 0;
    private final ModuleData moduleData;
    private final String moduleId;
    private final String moduleType;
    private final String moduleVersion;

    public ModuleSubmissionRequest(String str, String str2, String str3, ModuleData moduleData) {
        g.x(str, str2, str3);
        this.moduleType = str;
        this.moduleVersion = str2;
        this.moduleId = str3;
        this.moduleData = moduleData;
    }

    public static /* synthetic */ ModuleSubmissionRequest copy$default(ModuleSubmissionRequest moduleSubmissionRequest, String str, String str2, String str3, ModuleData moduleData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleSubmissionRequest.moduleType;
        }
        if ((i & 2) != 0) {
            str2 = moduleSubmissionRequest.moduleVersion;
        }
        if ((i & 4) != 0) {
            str3 = moduleSubmissionRequest.moduleId;
        }
        if ((i & 8) != 0) {
            moduleData = moduleSubmissionRequest.moduleData;
        }
        return moduleSubmissionRequest.copy(str, str2, str3, moduleData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getModuleVersion() {
        return this.moduleVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* renamed from: component4, reason: from getter */
    public final ModuleData getModuleData() {
        return this.moduleData;
    }

    public final ModuleSubmissionRequest copy(String moduleType, String moduleVersion, String moduleId, ModuleData moduleData) {
        moduleType.getClass();
        moduleVersion.getClass();
        moduleId.getClass();
        return new ModuleSubmissionRequest(moduleType, moduleVersion, moduleId, moduleData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleSubmissionRequest)) {
            return false;
        }
        ModuleSubmissionRequest moduleSubmissionRequest = (ModuleSubmissionRequest) other;
        if (Intrinsics.areEqual(this.moduleType, moduleSubmissionRequest.moduleType) && Intrinsics.areEqual(this.moduleVersion, moduleSubmissionRequest.moduleVersion) && Intrinsics.areEqual(this.moduleId, moduleSubmissionRequest.moduleId) && Intrinsics.areEqual(this.moduleData, moduleSubmissionRequest.moduleData)) {
            return true;
        }
        return false;
    }

    public final ModuleData getModuleData() {
        return this.moduleData;
    }

    public final String getModuleId() {
        return this.moduleId;
    }

    public final String getModuleType() {
        return this.moduleType;
    }

    public final String getModuleVersion() {
        return this.moduleVersion;
    }

    public int hashCode() {
        int hashCode;
        int a = a.a(this.moduleId, a.a(this.moduleVersion, this.moduleType.hashCode() * 31, 31), 31);
        ModuleData moduleData = this.moduleData;
        if (moduleData == null) {
            hashCode = 0;
        } else {
            hashCode = moduleData.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        String str = this.moduleType;
        String str2 = this.moduleVersion;
        String str3 = this.moduleId;
        ModuleData moduleData = this.moduleData;
        StringBuilder r = m51.r("ModuleSubmissionRequest(moduleType=", str, ", moduleVersion=", str2, ", moduleId=");
        r.append(str3);
        r.append(", moduleData=");
        r.append(moduleData);
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ ModuleSubmissionRequest(String str, String str2, String str3, ModuleData moduleData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : moduleData);
    }
}
