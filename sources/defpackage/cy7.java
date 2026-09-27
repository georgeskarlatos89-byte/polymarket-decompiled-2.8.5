package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cy7 extends ax8 implements upi, t9, nq8, tt8 {
    public static final nd0 b = new nd0("Fido.FIDO2_API", new b6a(14), new Object());
    public static final nd0 c = new nd0("IdentityCredentials.API", new b6a(0), new Object());
    public static final nd0 d = new nd0("ClientNotification.API", new b6a(4), new Object());
    public static final nd0 e = new nd0("ClientTelemetry.API", new b6a(5), new Object());
    public static final nd0 f = new nd0("ModuleInstall.API", new b6a(3), new Object());
    public static final nd0 g = new nd0("ActivityRecognition.API", new b6a(9), new Object());
    public static final nd0 h = new nd0("LocationServices.API", new b6a(11), new Object());
    public static final nd0 i = new nd0("CloudMessaging.API", new b6a(12), new Object());
    public static int j = 1;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy7(Context context, Activity activity, nd0 nd0Var, ad0 ad0Var, zw8 zw8Var, int i2) {
        super(context, activity, nd0Var, ad0Var, zw8Var);
        this.a = i2;
    }

    public Task c(fld... fldVarArr) {
        boolean z;
        if (fldVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        arn.a("Please provide at least one OptionalModuleApi.", z);
        for (fld fldVar : fldVarArr) {
            arn.i(fldVar, "Requested API must not be null.");
        }
        td0 O = td0.O(Arrays.asList(fldVarArr), false);
        if (O.a.isEmpty()) {
            return Tasks.d(new sjc(true, 0));
        }
        di1 a = dpi.a();
        a.e = new gw7[]{q3l.a};
        a.b = 27301;
        a.c = false;
        a.d = new ubk(10, this, O);
        return doRead(a.a());
    }

    public Task d(ag5 ag5Var, p23 p23Var) {
        if (p23Var != null) {
            arn.a("cancellationToken may not be already canceled", !p23Var.a());
        }
        di1 a = dpi.a();
        a.d = new ubk(15, ag5Var, p23Var);
        a.b = 2415;
        Task doRead = doRead(a.a());
        if (p23Var != null) {
            epi epiVar = new epi(p23Var);
            doRead.h(new zcf(epiVar, 26));
            return epiVar.a;
        }
        return doRead;
    }

    public Task e() {
        di1 a = dpi.a();
        a.d = ulj.c;
        a.b = 2414;
        return doRead(a.a());
    }

    public Task f(tpi tpiVar) {
        di1 a = dpi.a();
        a.e = new gw7[]{w2l.a};
        a.c = false;
        a.d = new nbi(tpiVar, 12);
        return doBestEffortWrite(a.a());
    }

    public synchronized int g() {
        int i2;
        try {
            i2 = j;
            if (i2 == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.e;
                int b2 = googleApiAvailability.b(applicationContext, 12451000);
                if (b2 == 0) {
                    i2 = 4;
                    j = 4;
                } else if (googleApiAvailability.a(null, b2, applicationContext) == null && m57.a(applicationContext, "com.google.android.gms.auth.api.fallback") != 0) {
                    i2 = 3;
                    j = 3;
                } else {
                    i2 = 2;
                    j = 2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i2;
    }

    @Override // defpackage.ax8
    public String getApiFallbackAttributionTag(Context context) {
        switch (this.a) {
            case 6:
                return null;
            default:
                return super.getApiFallbackAttributionTag(context);
        }
    }
}
