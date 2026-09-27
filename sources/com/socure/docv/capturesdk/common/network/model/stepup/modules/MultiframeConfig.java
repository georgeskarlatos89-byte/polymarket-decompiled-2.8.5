package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJz\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeConfig;", "", "enabled", "", "numFrames", "", "framePeriodMs", "maxDimension", "allowedFormats", "", "", "maxTotalUploadSize", "nonces", "imageQuality", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Float;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNumFrames", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFramePeriodMs", "getMaxDimension", "getAllowedFormats", "()Ljava/util/List;", "getMaxTotalUploadSize", "getNonces", "getImageQuality", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Float;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeConfig;", "equals", "other", "hashCode", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class MultiframeConfig {
    public static final int $stable = 8;
    private final List<String> allowedFormats;
    private final Boolean enabled;
    private final Integer framePeriodMs;
    private final Float imageQuality;
    private final Integer maxDimension;
    private final Integer maxTotalUploadSize;
    private final List<String> nonces;
    private final Integer numFrames;

    public /* synthetic */ MultiframeConfig(Boolean bool, Integer num, Integer num2, Integer num3, List list, Integer num4, List list2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : f);
    }

    public static /* synthetic */ MultiframeConfig copy$default(MultiframeConfig multiframeConfig, Boolean bool, Integer num, Integer num2, Integer num3, List list, Integer num4, List list2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = multiframeConfig.enabled;
        }
        if ((i & 2) != 0) {
            num = multiframeConfig.numFrames;
        }
        if ((i & 4) != 0) {
            num2 = multiframeConfig.framePeriodMs;
        }
        if ((i & 8) != 0) {
            num3 = multiframeConfig.maxDimension;
        }
        if ((i & 16) != 0) {
            list = multiframeConfig.allowedFormats;
        }
        if ((i & 32) != 0) {
            num4 = multiframeConfig.maxTotalUploadSize;
        }
        if ((i & 64) != 0) {
            list2 = multiframeConfig.nonces;
        }
        if ((i & 128) != 0) {
            f = multiframeConfig.imageQuality;
        }
        List list3 = list2;
        Float f2 = f;
        List list4 = list;
        Integer num5 = num4;
        return multiframeConfig.copy(bool, num, num2, num3, list4, num5, list3, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getNumFrames() {
        return this.numFrames;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getFramePeriodMs() {
        return this.framePeriodMs;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxDimension() {
        return this.maxDimension;
    }

    public final List<String> component5() {
        return this.allowedFormats;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMaxTotalUploadSize() {
        return this.maxTotalUploadSize;
    }

    public final List<String> component7() {
        return this.nonces;
    }

    /* renamed from: component8, reason: from getter */
    public final Float getImageQuality() {
        return this.imageQuality;
    }

    public final MultiframeConfig copy(Boolean enabled, Integer numFrames, Integer framePeriodMs, Integer maxDimension, List<String> allowedFormats, Integer maxTotalUploadSize, List<String> nonces, Float imageQuality) {
        return new MultiframeConfig(enabled, numFrames, framePeriodMs, maxDimension, allowedFormats, maxTotalUploadSize, nonces, imageQuality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiframeConfig)) {
            return false;
        }
        MultiframeConfig multiframeConfig = (MultiframeConfig) other;
        if (Intrinsics.areEqual(this.enabled, multiframeConfig.enabled) && Intrinsics.areEqual(this.numFrames, multiframeConfig.numFrames) && Intrinsics.areEqual(this.framePeriodMs, multiframeConfig.framePeriodMs) && Intrinsics.areEqual(this.maxDimension, multiframeConfig.maxDimension) && Intrinsics.areEqual(this.allowedFormats, multiframeConfig.allowedFormats) && Intrinsics.areEqual(this.maxTotalUploadSize, multiframeConfig.maxTotalUploadSize) && Intrinsics.areEqual(this.nonces, multiframeConfig.nonces) && Intrinsics.areEqual(this.imageQuality, multiframeConfig.imageQuality)) {
            return true;
        }
        return false;
    }

    public final List<String> getAllowedFormats() {
        return this.allowedFormats;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getFramePeriodMs() {
        return this.framePeriodMs;
    }

    public final Float getImageQuality() {
        return this.imageQuality;
    }

    public final Integer getMaxDimension() {
        return this.maxDimension;
    }

    public final Integer getMaxTotalUploadSize() {
        return this.maxTotalUploadSize;
    }

    public final List<String> getNonces() {
        return this.nonces;
    }

    public final Integer getNumFrames() {
        return this.numFrames;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        Boolean bool = this.enabled;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.numFrames;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.framePeriodMs;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num3 = this.maxDimension;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List<String> list = this.allowedFormats;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num4 = this.maxTotalUploadSize;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List<String> list2 = this.nonces;
        if (list2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Float f = this.imageQuality;
        if (f != null) {
            i = f.hashCode();
        }
        return i8 + i;
    }

    public String toString() {
        Boolean bool = this.enabled;
        Integer num = this.numFrames;
        Integer num2 = this.framePeriodMs;
        Integer num3 = this.maxDimension;
        List<String> list = this.allowedFormats;
        Integer num4 = this.maxTotalUploadSize;
        List<String> list2 = this.nonces;
        Float f = this.imageQuality;
        StringBuilder sb = new StringBuilder("MultiframeConfig(enabled=");
        sb.append(bool);
        sb.append(", numFrames=");
        sb.append(num);
        sb.append(", framePeriodMs=");
        sv6.z(sb, num2, ", maxDimension=", num3, ", allowedFormats=");
        sb.append(list);
        sb.append(", maxTotalUploadSize=");
        sb.append(num4);
        sb.append(", nonces=");
        sb.append(list2);
        sb.append(", imageQuality=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    public MultiframeConfig(Boolean bool, Integer num, Integer num2, Integer num3, List<String> list, Integer num4, List<String> list2, Float f) {
        this.enabled = bool;
        this.numFrames = num;
        this.framePeriodMs = num2;
        this.maxDimension = num3;
        this.allowedFormats = list;
        this.maxTotalUploadSize = num4;
        this.nonces = list2;
        this.imageQuality = f;
    }

    public MultiframeConfig() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
