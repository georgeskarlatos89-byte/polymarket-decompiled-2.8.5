package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PrimaryImageConfig;", "", "format", "", "", "<init>", "(Ljava/util/List;)V", "getFormat", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class PrimaryImageConfig {
    public static final int $stable = 8;
    private final List<String> format;

    public /* synthetic */ PrimaryImageConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrimaryImageConfig copy$default(PrimaryImageConfig primaryImageConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = primaryImageConfig.format;
        }
        return primaryImageConfig.copy(list);
    }

    public final List<String> component1() {
        return this.format;
    }

    public final PrimaryImageConfig copy(List<String> format) {
        return new PrimaryImageConfig(format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof PrimaryImageConfig) && Intrinsics.areEqual(this.format, ((PrimaryImageConfig) other).format)) {
            return true;
        }
        return false;
    }

    public final List<String> getFormat() {
        return this.format;
    }

    public int hashCode() {
        List<String> list = this.format;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return hdi.q("PrimaryImageConfig(format=", ")", this.format);
    }

    public PrimaryImageConfig(List<String> list) {
        this.format = list;
    }

    public PrimaryImageConfig() {
        this(null, 1, null);
    }
}
