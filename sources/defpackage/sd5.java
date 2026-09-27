package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface sd5 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, kb5 kb5Var, CancellationSignal cancellationSignal, Executor executor, od5 od5Var);

    void onGetCredential(Context context, ju8 ju8Var, CancellationSignal cancellationSignal, Executor executor, od5 od5Var);
}
