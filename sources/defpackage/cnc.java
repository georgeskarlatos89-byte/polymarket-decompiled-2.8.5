package defpackage;

import android.os.RemoteException;
import io.sentry.android.core.m0;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cnc extends i8a {
    public final /* synthetic */ enc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnc(enc encVar, String[] strArr) {
        super(strArr);
        this.b = encVar;
    }

    @Override // defpackage.i8a
    public final void a(Set set) {
        set.getClass();
        enc encVar = this.b;
        if (!encVar.e.get()) {
            try {
                tj9 tj9Var = encVar.g;
                if (tj9Var != null) {
                    tj9Var.v(encVar.f, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e) {
                m0.q("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }
}
