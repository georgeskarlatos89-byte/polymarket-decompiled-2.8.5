package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSettingsRequest;", "", "primaryLanguage", "", "preferredLanguages", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPrimaryLanguage", "()Ljava/lang/String;", "getPreferredLanguages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class DeviceSettingsRequest {
    public static final int $stable = 8;
    private final List<String> preferredLanguages;
    private final String primaryLanguage;

    public DeviceSettingsRequest(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.primaryLanguage = str;
        this.preferredLanguages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceSettingsRequest copy$default(DeviceSettingsRequest deviceSettingsRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSettingsRequest.primaryLanguage;
        }
        if ((i & 2) != 0) {
            list = deviceSettingsRequest.preferredLanguages;
        }
        return deviceSettingsRequest.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryLanguage() {
        return this.primaryLanguage;
    }

    public final List<String> component2() {
        return this.preferredLanguages;
    }

    public final DeviceSettingsRequest copy(String primaryLanguage, List<String> preferredLanguages) {
        primaryLanguage.getClass();
        preferredLanguages.getClass();
        return new DeviceSettingsRequest(primaryLanguage, preferredLanguages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceSettingsRequest)) {
            return false;
        }
        DeviceSettingsRequest deviceSettingsRequest = (DeviceSettingsRequest) other;
        if (Intrinsics.areEqual(this.primaryLanguage, deviceSettingsRequest.primaryLanguage) && Intrinsics.areEqual(this.preferredLanguages, deviceSettingsRequest.preferredLanguages)) {
            return true;
        }
        return false;
    }

    public final List<String> getPreferredLanguages() {
        return this.preferredLanguages;
    }

    public final String getPrimaryLanguage() {
        return this.primaryLanguage;
    }

    public int hashCode() {
        return this.preferredLanguages.hashCode() + (this.primaryLanguage.hashCode() * 31);
    }

    public String toString() {
        return "DeviceSettingsRequest(primaryLanguage=" + this.primaryLanguage + ", preferredLanguages=" + this.preferredLanguages + ")";
    }
}
