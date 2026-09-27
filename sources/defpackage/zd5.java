package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zd5 {
    public static final td5 a = new Object();
    public static final Set b = ArraysKt.l0(new Integer[]{7, 20});
    public static final int c = 1;

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c);
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, Function2 function2, Executor executor, od5 od5Var, CancellationSignal cancellationSignal) {
        bundle.getClass();
        executor.getClass();
        od5Var.getClass();
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        Object invoke = function2.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (!me5.a(cancellationSignal)) {
            executor.execute(new vd5(1, od5Var, invoke));
        }
        return true;
    }
}
