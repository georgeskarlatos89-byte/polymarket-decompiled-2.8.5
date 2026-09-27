package com.socure.docv.capturesdk.common.network.model;

import com.socure.docv.capturesdk.api.SocureDocVError;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/SocureApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "socureDocVError", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "<init>", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;)V", "getSocureDocVError", "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SocureApiError extends Exception {
    public static final int $stable = 0;
    private final SocureDocVError socureDocVError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocureApiError(SocureDocVError socureDocVError) {
        super("SocureApiError: " + socureDocVError);
        socureDocVError.getClass();
        this.socureDocVError = socureDocVError;
    }

    public static /* synthetic */ SocureApiError copy$default(SocureApiError socureApiError, SocureDocVError socureDocVError, int i, Object obj) {
        if ((i & 1) != 0) {
            socureDocVError = socureApiError.socureDocVError;
        }
        return socureApiError.copy(socureDocVError);
    }

    /* renamed from: component1, reason: from getter */
    public final SocureDocVError getSocureDocVError() {
        return this.socureDocVError;
    }

    public final SocureApiError copy(SocureDocVError socureDocVError) {
        socureDocVError.getClass();
        return new SocureApiError(socureDocVError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof SocureApiError) && this.socureDocVError == ((SocureApiError) other).socureDocVError) {
            return true;
        }
        return false;
    }

    public final SocureDocVError getSocureDocVError() {
        return this.socureDocVError;
    }

    public int hashCode() {
        return this.socureDocVError.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SocureApiError(socureDocVError=" + this.socureDocVError + ")";
    }
}
