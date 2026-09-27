package kotlin.reflect.jvm.internal;

import defpackage.sv6;
import defpackage.tja;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/ErrorTypeParameter;", "Ltja;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ErrorTypeParameter implements tja {
    private final int id;

    public ErrorTypeParameter(int i) {
        this.id = i;
    }

    public String toString() {
        return sv6.o(new StringBuilder("[Error type parameter "), this.id, ']');
    }
}
