package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "", "sessionToken", "", "eventId", "nextModule", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;", "globalConfig", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;)V", "getSessionToken", "()Ljava/lang/String;", "getEventId", "getNextModule", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;", "getGlobalConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ModuleDataResponse {
    public static final int $stable = 8;
    private final String eventId;
    private final GlobalConfig globalConfig;
    private final ModuleResponse nextModule;
    private final String sessionToken;

    public ModuleDataResponse(String str, String str2, ModuleResponse moduleResponse, GlobalConfig globalConfig) {
        this.sessionToken = str;
        this.eventId = str2;
        this.nextModule = moduleResponse;
        this.globalConfig = globalConfig;
    }

    public static /* synthetic */ ModuleDataResponse copy$default(ModuleDataResponse moduleDataResponse, String str, String str2, ModuleResponse moduleResponse, GlobalConfig globalConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleDataResponse.sessionToken;
        }
        if ((i & 2) != 0) {
            str2 = moduleDataResponse.eventId;
        }
        if ((i & 4) != 0) {
            moduleResponse = moduleDataResponse.nextModule;
        }
        if ((i & 8) != 0) {
            globalConfig = moduleDataResponse.globalConfig;
        }
        return moduleDataResponse.copy(str, str2, moduleResponse, globalConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final ModuleResponse getNextModule() {
        return this.nextModule;
    }

    /* renamed from: component4, reason: from getter */
    public final GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public final ModuleDataResponse copy(String sessionToken, String eventId, ModuleResponse nextModule, GlobalConfig globalConfig) {
        return new ModuleDataResponse(sessionToken, eventId, nextModule, globalConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleDataResponse)) {
            return false;
        }
        ModuleDataResponse moduleDataResponse = (ModuleDataResponse) other;
        if (Intrinsics.areEqual(this.sessionToken, moduleDataResponse.sessionToken) && Intrinsics.areEqual(this.eventId, moduleDataResponse.eventId) && Intrinsics.areEqual(this.nextModule, moduleDataResponse.nextModule) && Intrinsics.areEqual(this.globalConfig, moduleDataResponse.globalConfig)) {
            return true;
        }
        return false;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public final ModuleResponse getNextModule() {
        return this.nextModule;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.sessionToken;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.eventId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ModuleResponse moduleResponse = this.nextModule;
        if (moduleResponse == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = moduleResponse.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        GlobalConfig globalConfig = this.globalConfig;
        if (globalConfig != null) {
            i = globalConfig.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.sessionToken;
        String str2 = this.eventId;
        ModuleResponse moduleResponse = this.nextModule;
        GlobalConfig globalConfig = this.globalConfig;
        StringBuilder r = m51.r("ModuleDataResponse(sessionToken=", str, ", eventId=", str2, ", nextModule=");
        r.append(moduleResponse);
        r.append(", globalConfig=");
        r.append(globalConfig);
        r.append(")");
        return r.toString();
    }
}
