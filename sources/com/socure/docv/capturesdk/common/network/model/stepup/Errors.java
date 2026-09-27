package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Errors;", "", "ivs", "", "", "<init>", "(Ljava/util/Map;)V", "getIvs", "()Ljava/util/Map;", "setIvs", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Errors {
    public static final int $stable = 8;
    private Map<String, String> ivs;

    public Errors(@zca(name = "ivs") Map<String, String> map) {
        map.getClass();
        this.ivs = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Errors copy$default(Errors errors, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = errors.ivs;
        }
        return errors.copy(map);
    }

    public final Map<String, String> component1() {
        return this.ivs;
    }

    public final Errors copy(@zca(name = "ivs") Map<String, String> ivs) {
        ivs.getClass();
        return new Errors(ivs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof Errors) && Intrinsics.areEqual(this.ivs, ((Errors) other).ivs)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getIvs() {
        return this.ivs;
    }

    public int hashCode() {
        return this.ivs.hashCode();
    }

    public final void setIvs(Map<String, String> map) {
        map.getClass();
        this.ivs = map;
    }

    public String toString() {
        return "Errors(ivs=" + this.ivs + ")";
    }
}
