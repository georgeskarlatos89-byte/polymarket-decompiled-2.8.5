package defpackage;

import com.google.android.gms.common.api.Status;
import io.ably.lib.http.HttpConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class u1m {
    public static final yo5 b;
    public static final yo5 c;
    public final /* synthetic */ int a = 2;

    static {
        Boolean bool = Boolean.FALSE;
        b = new yo5(bool);
        c = new yo5(bool);
    }

    public static void a(Status status, Object obj, epi epiVar) {
        if (status.O()) {
            epiVar.b(obj);
        } else {
            epiVar.a(hen.e(status));
        }
    }

    public static void b(Status status, Object obj, epi epiVar) {
        if (status.O()) {
            epiVar.a.r(obj);
        } else {
            epiVar.c(hen.e(status));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                if (Intrinsics.areEqual(this, ig9.d)) {
                    return HttpConstants.Methods.GET;
                }
                if (Intrinsics.areEqual(this, hg9.f)) {
                    return HttpConstants.Methods.POST;
                }
                if (Intrinsics.areEqual(this, hg9.e)) {
                    return HttpConstants.Methods.PATCH;
                }
                if (Intrinsics.areEqual(this, hg9.d)) {
                    return HttpConstants.Methods.DELETE;
                }
                dmk.a();
                return null;
            default:
                return super.toString();
        }
    }
}
