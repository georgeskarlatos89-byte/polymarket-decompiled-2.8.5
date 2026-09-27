package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gnc extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public gnc(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((rj9) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
